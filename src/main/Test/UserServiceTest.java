import htmap.pjmanage.entity.User;
import htmap.pjmanage.service.IUserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceTest {
    @Autowired
    IUserService userService;

    public void queryTest() {
        List<User> users = userService.list();
        for (User user : users) {
            System.out.print(user);
        }
    }
}
