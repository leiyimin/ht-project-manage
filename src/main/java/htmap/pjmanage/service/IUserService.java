package htmap.pjmanage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import htmap.pjmanage.entity.User;
import htmap.pjmanage.entity.UserWhole;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author helihuo
 * @since 2020-03-31
 */
public interface IUserService extends IService<User> {

    UserWhole selectById(Integer id);

}
