package htmap.pjmanage.dao;

import htmap.pjmanage.entity.User;

import java.util.List;

public interface UserDao{

    List<User> getAll();

    User getOne(Integer id);

    Integer delete(Integer id);

    Integer deleteMore(List<Integer> ids);

    Integer add(User user);
}
