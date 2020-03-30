package htmap.pjmanage.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import htmap.pjmanage.common.BaseController;
import htmap.pjmanage.common.ResponseData;
import htmap.pjmanage.entity.User;
import htmap.pjmanage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author helihuo
 * @since 2020-03-30
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    IUserService service;

    @RequestMapping("getAll")
    public ResponseData getAll() {
        List<User> users = service.list();
        return ResponseData.success(users);
    }

    @RequestMapping("byPage")
    public ResponseData getAllByPage(@RequestParam Integer pageIndex, @RequestParam Integer pageSize) {
        Page<User> page = new Page<>(pageIndex, pageSize == null ? pageSize : 10);
        service.page(page);
        return ResponseData.success(page);
    }
}

