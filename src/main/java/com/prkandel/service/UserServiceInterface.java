package com.prkandel.service;

import com.prkandel.exception.DataException;
import com.prkandel.model.User;

/**
 * Created by leapfrog on 1/29/16.
 */
public interface UserServiceInterface {
  public User fetch(String name, String password) throws DataException;
}
