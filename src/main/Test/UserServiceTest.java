import htmap.pjmanage.dao.RoleDao;
import htmap.pjmanage.entity.UserWhole;
import htmap.pjmanage.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceTest {

    @Autowired
    IUserService service;

    @Autowired
    RoleDao roleDao;

    @Test
    public void test(){
//        List<User> users = service.list();
//        for(User u:users){
//            System.out.println(u.getName());
//        }
        UserWhole user = service.selectById(1);
//        roleDao.selectByUserId(1);
        System.out.println(user.getDept());
    }
}
