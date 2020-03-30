package htmap.pjmanage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author helihuo
 * @since 2020-03-30
 */
@TableName("t_role")
public class Role implements Serializable {

    private static final long serialVersionUID=1L;

      private String code;

    private String name;

    private String description;

    private Integer disabled;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "Role{" +
        "code=" + code +
        ", name=" + name +
        ", description=" + description +
        ", disabled=" + disabled +
        "}";
    }
}
