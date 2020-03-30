import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class DBTest {

    private String[] tables = new String[]{
            "t_user", "t_role", "t_menu", "t_role_menu", "t_role_user"
    };

    @Test
    public void testGenerator() {
        //1、全局配置
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(false)//开启AR模式
                .setAuthor("helihuo")//设置作者
                //生成路径(一般都是生成在此项目的src/main/java下面)
                .setOutputDir("E:\\IdeaApps\\ht-project-manage\\src\\main\\java")
                .setFileOverride(false)//第二次生成会把第一次生成的覆盖掉
                .setIdType(IdType.AUTO)//主键策略
                .setServiceName("%sService")//生成的service接口名字首字母是否为I，这样设置就没有I
                .setBaseResultMap(true)//生成resultMap
                .setBaseColumnList(true);//在xml中生成基础列
        //2、数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)//数据库类型
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://106.12.93.226:3306/ht_project_manage?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8")
                .setUsername("helihuo")
                .setPassword("123456");
        //3、策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setCapitalMode(true)//开启全局大写命名
                .setDbColumnUnderline(false)//表名字段名使用下划线
                .setNaming(NamingStrategy.underline_to_camel)//下划线到驼峰的命名方式
                .setTablePrefix("t_")//表名前缀
                .setEntityLombokModel(false)//使用lombok
                .setInclude(tables);//逆向工程使用的表
        //4、包名策略配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("htmap.pjmanage")
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setEntity("entity");
        //5、整合配置
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig);
        //6、执行
        autoGenerator.execute();
    }
}
