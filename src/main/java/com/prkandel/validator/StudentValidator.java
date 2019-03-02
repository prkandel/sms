package com.prkandel.validator;

import com.prkandel.controller.CommonConstants;
import com.prkandel.model.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Prajjwal Raj Kandel <prajjwalkandel@lftechnology.com> on 1/25/16.
 */
public class StudentValidator implements Validator<Student> {

  @Override
  public Map<String,String> validate(Student student){
      Map<String,String> errors = new HashMap<>();

      if(student.getName() == null || "".equals(student.getName().trim()))
        errors.put("name","Invalid Name");
      if(student.getAddress() == null || "".equals(student.getAddress().trim()))
        errors.put("address","Invalid Address");
      if(student.getRoll()<= CommonConstants.LOWER_LIMIT_FOR_ROLL || student.getRoll() >= CommonConstants.UPPER_LIMIT_FOR_ROLL)
        errors.put("roll","Invalid Roll");
      return errors;
    }

}
