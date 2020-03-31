package htmap.pjmanage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
@TableName("t_menu")
public class Menu extends Model<Menu> {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String code;

    private String name;

    /**
     * 父级id
     */
    private Integer pId;

    private Integer disabled;

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


    public static final String ID = "id";

    public static final String CODE = "code";

    public static final String NAME = "name";

    public static final String P_ID = "p_id";

    public static final String DISABLED = "disabled";

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
