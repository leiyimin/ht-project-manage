import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {

//    @Autowired
//    UserMapper userMapper;

    @Test
    public void UserMapperTest(){
//        User user = userMapper.selectById(1);
//        System.out.print(user);
    }
}
