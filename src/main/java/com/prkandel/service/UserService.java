package com.prkandel.service;

import com.prkandel.dao.UserDao;
import com.prkandel.exception.DataException;
import com.prkandel.model.User;
import com.prkandel.utils.Utilities;

/**
 * Created by leapfrog on 1/27/16.
 */
public class UserService implements UserServiceInterface {
  private UserDao userDao = new UserDao();

  public User fetch(String name, String password) throws DataException {
    return userDao.fetch(name, Utilities.getMD5(password));
  }
}
