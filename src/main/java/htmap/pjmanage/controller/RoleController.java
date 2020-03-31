package htmap.pjmanage.controller;


import htmap.pjmanage.common.BaseController;
import htmap.pjmanage.common.ResponseData;
import htmap.pjmanage.entity.Role;
import htmap.pjmanage.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author helihuo
 * @since 2020-03-31
 */
@RestController
@RequestMapping("/role")
public class RoleController extends BaseController {

    @Autowired
    IRoleService service;

    @RequestMapping("getAll")
    public ResponseData getUser() {
        List<Role> roles = service.list();
        return ResponseData.success(roles);
    }
}

