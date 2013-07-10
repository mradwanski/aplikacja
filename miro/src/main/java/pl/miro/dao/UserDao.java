package pl.miro.dao;

import java.util.List;

import pl.miro.entity.User;

public interface UserDao extends AbstractDao<User, Integer> {
    
    List<User> findUsers(String userName);

}
