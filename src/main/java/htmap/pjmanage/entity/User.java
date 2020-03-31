package htmap.pjmanage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
@TableName(value = "t_user", resultMap = "BaseResultMap")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String userName;

    private String name;

    private String passWord;

    private String gender;

    private Integer deptId;

    private String email;

    private Integer creator;

    private Date createTime;

    /**
     * 最后操作用户id
     */
    private Integer lastEditor;

    private Date updateTime;

    /**
     * 逻辑删除符
     */
    @TableLogic
    private Integer isDelete;

    private List<Role> roles;

    private Dept dept;

    public static final String ID = "id";

    public static final String USER_NAME = "user_name";

    public static final String NAME = "name";

    public static final String PASS_WORD = "pass_word";

    public static final String GENDER = "gender";

    public static final String DEPT_ID = "dept_id";

    public static final String EMAIL = "email";

    public static final String CREATOR = "creator";

    public static final String CREATE_TIME = "create_time";

    public static final String LAST_EDITOR = "last_editor";

    public static final String UPDATE_TIME = "update_time";

    public static final String IS_DELETE = "is_delete";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
