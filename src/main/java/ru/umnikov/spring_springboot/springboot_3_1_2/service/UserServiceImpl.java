package ru.umnikov.spring_springboot.springboot_3_1_2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.umnikov.spring_springboot.springboot_3_1_2.dao.UserDao;
import ru.umnikov.spring_springboot.springboot_3_1_2.model.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Transactional(readOnly = true)
    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Transactional
    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

    @Transactional
    @Override
    public void update(User user, int id) {
        userDao.update(user, id);
    }
}
