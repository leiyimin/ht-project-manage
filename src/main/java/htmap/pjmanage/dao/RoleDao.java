package htmap.pjmanage.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import htmap.pjmanage.entity.Role;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author helihuo
 * @since 2020-03-31
 */
public interface RoleDao extends BaseMapper<Role> {

    List<Role> selectByUserId(Integer userId);
}
