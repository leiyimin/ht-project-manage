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
@TableName("t_menu")
public class Menu implements Serializable {

    private static final long serialVersionUID=1L;

      private String code;

    private String name;

    private String pCode;

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

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "Menu{" +
        "code=" + code +
        ", name=" + name +
        ", pCode=" + pCode +
        ", disabled=" + disabled +
        "}";
    }
}
