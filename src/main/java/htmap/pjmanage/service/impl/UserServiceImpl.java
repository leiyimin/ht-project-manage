package htmap.pjmanage.service.impl;

import htmap.pjmanage.entity.User;
import htmap.pjmanage.dao.UserDao;
import htmap.pjmanage.entity.UserWhole;
import htmap.pjmanage.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author helihuo
 * @since 2020-03-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

    @Autowired
    UserDao dao;

    @Override
    public UserWhole selectById(Integer id) {
        return dao.selectById(id);
    }
}
