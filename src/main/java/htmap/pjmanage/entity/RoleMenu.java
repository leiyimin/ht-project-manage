package htmap.pjmanage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author helihuo
 * @since 2020-03-30
 */
@TableName("t_role_menu")
@ApiModel(value="RoleMenu对象", description="")
public class RoleMenu implements Serializable {

    private static final long serialVersionUID=1L;

    private String roleCode;

    private String menuCode;

      private String rolemenuCode;


    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getRolemenuCode() {
        return rolemenuCode;
    }

    public void setRolemenuCode(String rolemenuCode) {
        this.rolemenuCode = rolemenuCode;
    }

    @Override
    public String toString() {
        return "RoleMenu{" +
        "roleCode=" + roleCode +
        ", menuCode=" + menuCode +
        ", rolemenuCode=" + rolemenuCode +
        "}";
    }
}
