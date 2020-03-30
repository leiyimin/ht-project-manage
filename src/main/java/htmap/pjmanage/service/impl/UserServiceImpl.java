package htmap.pjmanage.service.impl;

import htmap.pjmanage.entity.User;
import htmap.pjmanage.dao.UserMapper;
import htmap.pjmanage.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author helihuo
 * @since 2020-03-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
