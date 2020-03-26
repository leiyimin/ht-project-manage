package htmap.pjmanage.controller;

import htmap.pjmanage.common.BaseController;
import htmap.pjmanage.common.ResponseData;
import htmap.pjmanage.dao.BaseDao;
import htmap.pjmanage.dao.UserDao;
import htmap.pjmanage.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RestController
@RequestMapping("user")
public class UserController extends BaseController {

    @Autowired
    private UserDao userDao;
    @Autowired
    private BaseDao baseDao;

    private final String table = "t_user";

    @GetMapping("getAll")
    public ResponseData getAllUsers() {
        try {
            List<Map<String, Object>> users = baseDao.query(table, null,null, null, "id");
            return ResponseData.success(users);
        } catch (Exception e) {
            return ResponseData.fail(e.getMessage());
        }
    }

    @PostMapping("query")
    public ResponseData query(@RequestBody Map<String, Object> where) {
        try {
            Map<String, Object> equalWhere = null;
            Map<String, Object> likeWhere = null;
            Map<String, Object> scopeWhere = null;
            for (String key : where.keySet()) {
                switch (key) {
                    case "userName":
                        if (likeWhere == null) {
                            likeWhere = new HashMap<>();
                        }
                        likeWhere.put(key, where.get(key).toString());
                        break;
                    default:
                        break;
                }
            }
            List<Map<String, Object>> users = baseDao.query(table, equalWhere, likeWhere, scopeWhere, "id");
            return ResponseData.success(users);
        } catch (Exception e) {
            return ResponseData.fail(e.getMessage());
        }
    }

    @PostMapping("add")
    public ResponseData addUser(@RequestBody Map<String, Object> user) {
        try {
            Integer count = userDao.add(user);
            if (count == 1) {
                return ResponseData.success(user.get("id"));
            } else {
                return ResponseData.fail("插入失败");
            }
        } catch (Exception e) {
            return ResponseData.fail(e.getMessage());
        }
    }

    @DeleteMapping("delete")
    public ResponseData deleteUser(@RequestParam Integer id) {
        try {
            Integer count = baseDao.deleteById(table, id);
            if (count == 1) {
                return ResponseData.success();
            } else {
                return ResponseData.fail();
            }
        } catch (Exception e) {
            return ResponseData.fail(e.getMessage());
        }
    }
}
