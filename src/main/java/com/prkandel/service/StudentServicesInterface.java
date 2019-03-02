package com.prkandel.service;

import com.prkandel.exception.DataException;
import com.prkandel.exception.ValidatorException;
import com.prkandel.model.Student;

import java.util.List;

/**
 * Created by leapfrog on 1/29/16.
 */
public interface StudentServicesInterface {
  void addNew(Student student) throws DataException, ValidatorException;

  List<Student> fetch(int limit, int offset) throws DataException;

  int fetchTotal() throws DataException;

  Student fetchById(int id) throws DataException;

  void update(Student student) throws DataException, ValidatorException;

  void delete(int id) throws DataException;
}
