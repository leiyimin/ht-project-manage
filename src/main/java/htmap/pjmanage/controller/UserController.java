package htmap.pjmanage.controller;


import htmap.pjmanage.common.ResponseData;
import htmap.pjmanage.entity.User;
import htmap.pjmanage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import htmap.pjmanage.common.BaseController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author helihuo
 * @since 2020-03-31
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    IUserService service;

    @RequestMapping("getAll")
    public ResponseData getUser() {
        List<User> users = service.list();
        return ResponseData.success(users);
    }
}