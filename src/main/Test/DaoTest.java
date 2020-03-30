import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class DaoTest {

//    @Autowired
//    UserDao userDao;
//
//    @Test
//    public void UserDaoTest() {
//        List<User> users = userDao.selectList(null);
//        for (User user : users){
//            System.out.print(user);
//        }
//    }
}
