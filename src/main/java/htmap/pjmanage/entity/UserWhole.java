package htmap.pjmanage.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@Data
@TableName(value = "t_user", resultMap = "WholeResultMap")
public class UserWhole extends User{

    private List<Role> roles;
    private Dept dept;
}
