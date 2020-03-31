package htmap.pjmanage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author helihuo
 * @since 2020-03-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user_role")
public class UserRole extends Model<UserRole> {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private Integer roleId;

    private Integer creator;

    private Date createTime;

    /**
     * 最后操作用户id
     */
    private Integer lastEditor;

    private Date updateTime;

    public static final String ID = "id";

    public static final String USER_ID = "user_id";

    public static final String ROLE_ID = "role_id";

    public static final String CREATOR = "creator";

    public static final String CREATE_TIME = "create_time";

    public static final String LAST_EDITOR = "last_editor";

    public static final String UPDATE_TIME = "update_time";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
