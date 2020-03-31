package htmap.pjmanage.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import htmap.pjmanage.entity.User;
import htmap.pjmanage.entity.UserWhole;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author helihuo
 * @since 2020-03-31
 */
public interface UserDao extends BaseMapper<User> {

    UserWhole selectById(Integer id);
}
