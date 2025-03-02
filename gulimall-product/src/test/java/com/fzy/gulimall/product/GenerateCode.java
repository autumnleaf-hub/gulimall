package com.fzy.gulimall.product;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.IColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;
import com.baomidou.mybatisplus.generator.model.ClassAnnotationAttributes;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;

import java.util.Collections;

/**
 * 这个生成模块无需依赖 springboot 启动
 */

public class GenerateCode {
    String url = "jdbc:mysql://192.168.113.130:3306/gulimall_pms?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai";
    String username = "root";
    String password = "root";

    final String author = "fzy";                   // 作者名
    String[] tables = {".ms_.*"};                  // 额外添加表
    String[] tablePrefix = new String[]{"pms_"};       // 过滤表前缀
    String tableSuffix = "";                       // 过滤表后缀
    IdType entityIdType = IdType.AUTO;        // 生成实体映射的主键填充方式
    String optimisticLockFieldName = "version";    // 乐观锁字段
    String logicDeleteFieldName = "status";        // 逻辑删除字段
    Column[] tableFills = new Column[]{             // 给需要自动填充的字段打上注解（需要保证字段存在）
            //new Column("createTime", FieldFill.INSERT),
            //new Column("updateTime", FieldFill.INSERT_UPDATE),
            //new Column("status", FieldFill.INSERT),
            //new Column("position", FieldFill.INSERT)
    };

    final String parentPackage = this.getClass().getPackageName();      // 自动获取所在包名
    final String outputDir = ".\\src\\main\\java";        // 生成代码的输出目录

    @Test
    void testGenerate() {
        FastAutoGenerator.create(url, username, password)
                .dataSourceConfig(builder -> {
                    builder.typeConvertHandler(((globalConfig, typeRegistry, metaInfo) -> {   // 自定义类型转换
                        IColumnType columnType = typeRegistry.getColumnType(metaInfo);
                        if (DbColumnType.BYTE.equals(columnType)) {  // 将 TINYINT 转换为 INTEGER
                            return DbColumnType.INTEGER;
                        }
                        return columnType;
                    }));
                })
                .globalConfig(builder -> {
                    builder.author(author) // 设置作者
                            .disableOpenDir() // 关闭运行成功后自动跳出的任务管理器窗口
                            //.enableSwagger()  // 开启 Swagger 模式
                            .outputDir(outputDir); // 输出目录
                })
                .packageConfig(builder -> {
                    builder.parent(parentPackage) // 设置父包名
                            //.moduleName("springboot002") // 设置模块名
                            .entity("bean") // 设置实体类包名
                            .mapper("mapper") // 设置 Mapper 接口包名
                            .service("service") // 设置 Service 接口包名
                            .serviceImpl("service.impl") // 设置 Service 实现类包名
                            .controller("controller") // 设置 Controller 包名
                            .xml("mapper") // 设置 Mapper XML 文件包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, ".\\src\\main\\resources\\mapper"))
                    ;
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tables) // 设置需要生成的表名
                            .addTablePrefix(tablePrefix) // 增加过滤表前缀
                            .addFieldSuffix(tableSuffix) // 增加过滤字段后缀

                            .entityBuilder()
                            .enableFileOverride() // 开启文件覆盖
                            //.enableActiveRecord() // 开启 ActiveRecord 模式
                            .idType(entityIdType) // 设置主键类型
                            .versionColumnName(optimisticLockFieldName) // 设置乐观锁字段名
                            .logicDeleteColumnName(logicDeleteFieldName) // 设置逻辑删除字段名
                            .addTableFills(tableFills)
                            //.enableLombok() // 启用 Lombok
                            .enableLombok(new ClassAnnotationAttributes("@Data","lombok.Data"))     //3.5.10+ 后可使用自选lombok注解，如Data
                            .enableTableFieldAnnotation() // 启用字段注解
                            .enableRemoveIsPrefix()     // 开启 Boolean 类型字段移除 is 前缀
                            .toString(true)         // 生成 toString

                            .controllerBuilder()
                            //.enableFileOverride() // 开启文件覆盖
                            .enableRestStyle() // 自动生成 @RestController 控制器

                            .serviceBuilder()
                            //.enableFileOverride()
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImp")

                            .mapperBuilder()
                            //.enableFileOverride()
                            .mapperAnnotation(Mapper.class)  // 开启 @Mapper 注解
                    ;
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用 Freemarker 模板引擎
                .execute(); // 执行生成
    }
}