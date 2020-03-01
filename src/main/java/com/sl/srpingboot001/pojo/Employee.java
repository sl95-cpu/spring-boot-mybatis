package com.sl.srpingboot001.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

  private int id;
  private String lasName;
  private String email;
  private int gender;
  private int departmentId;
  private Date birth;

}
