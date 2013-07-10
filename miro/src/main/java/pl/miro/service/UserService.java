package pl.miro.service;

import java.util.List;

import pl.miro.entity.User;

public interface UserService {
    
    User findByUserName(String userName);
    void saveUser(User user);
    void deleteUser(String userName);
    List<User> findUsers(String user);

}
