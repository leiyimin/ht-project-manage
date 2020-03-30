import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import htmap.pjmanage.common.BaseController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MybatisPlusGenerator {

    private String[] tables = new String[]{
            "t_user", "t_role", "t_menu", "t_role_menu", "t_role_user"
    };

    @Test
    public void execute() {
        //1、全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setAuthor("helihuo");
        globalConfig.setOpen(false)//打开目标文件夹
                .setFileOverride(false)//覆盖模式
                .setEnableCache(true)//xml开启二级缓存
                .setSwagger2(true)
                .setBaseResultMap(true)//生成resultMap
                .setBaseColumnList(true);//在xml中生成基础列;

        //2、数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)//数据库类型
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://106.12.93.226:3306/ht_project_manage?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8")
                .setUsername("helihuo")
                .setPassword("123456");
        //3、包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("htmap.pjmanage")
                .setMapper("dao")
                .setService("service")
                .setServiceImpl("service.impl")
                .setController("controller")
                .setEntity("entity")
                .setXml("mapper");
        //4、策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(false)//开启全局大写命名
                .setNaming(NamingStrategy.underline_to_camel)//下划线到驼峰的命名方式
                .setTablePrefix("t_")        //表名前缀
                .setEntityLombokModel(false)//使用lombok
                .setExclude(null);//排除的表，String数组
//                .setInclude(tables);//逆向工程使用的表
        strategyConfig.setSuperControllerClass(BaseController.class);//controller父类
        strategyConfig.setRestControllerStyle(true);//生成RestController
        strategyConfig.setControllerMappingHyphenStyle(true);//驼峰转连接
        strategyConfig.setLogicDeleteFieldName("logic_flag");//逻辑删除字段名
        //5、整合配置
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(globalConfig)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig);
        //6、执行
        autoGenerator.execute();
    }
}
