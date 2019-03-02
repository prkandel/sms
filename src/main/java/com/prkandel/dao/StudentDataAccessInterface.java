package com.prkandel.dao;

import com.prkandel.exception.DataException;
import com.prkandel.model.Student;

import java.util.List;

/**
 * Created by leapfrog on 1/29/16.
 */
public interface StudentDataAccessInterface {
  void addNew(Student student) throws DataException;

  List<Student> fetch(int limit, int offset) throws DataException;

  int fetchTotal() throws DataException;

  Student fetchById(int id) throws DataException;

  void update(Student student) throws DataException;

  void delete(int id) throws DataException;
}
