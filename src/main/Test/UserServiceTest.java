import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import htmap.pjmanage.entity.User;
import htmap.pjmanage.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceTest {
    @Autowired
    IUserService service;

    @Test
    public void queryTest() {
//        List<User> users = service.list();
//        for (User user : users) {
//            System.out.print(user);
//        }

        List<Map<String, Object>> users2 = service.listMaps(null);
        for (Map<String,Object> user : users2) {
            System.out.print(user);
        }
    }

    @Test
    public void pageQuery(){
        Page<User> page=new Page<>(1,2);
        service.page(page);
        System.out.println(page.getTotal());
    }

}
