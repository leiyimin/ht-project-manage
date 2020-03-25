package htmap.pjmanage.controller;

import htmap.pjmanage.common.BaseController;
import htmap.pjmanage.common.ResponseData;
import htmap.pjmanage.dao.UserDao;
import htmap.pjmanage.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("user")
public class UserController extends BaseController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("getUsers")
    public ResponseData getUsers() {
        try {
            List<User> users = userDao.getUsers();
            System.out.println(users.get(0).getName());
            return ResponseData.success(users);
        } catch (Exception e) {
            return ResponseData.fail(e.getMessage());
        }
    }
}
