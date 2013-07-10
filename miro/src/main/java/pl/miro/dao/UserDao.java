package pl.miro.dao;

import java.util.List;

import pl.miro.entity.User;

public interface UserDao extends AbstractDao<User, Integer> {
    
    User findUser(String userName);
    List<User> findUsers(String userName);

}
