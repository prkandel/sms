package com.prkandel.dao;

import com.prkandel.exception.DataException;
import com.prkandel.model.User;

/**
 * Created by leapfrog on 1/29/16.
 */
public interface UserDaoInterface {
  public User fetch(String name,String password) throws DataException;
}
