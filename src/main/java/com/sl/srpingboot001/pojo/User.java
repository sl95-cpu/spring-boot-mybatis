package com.sl.srpingboot001.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  private long id;
  private String username;
  private String password;
  private String name;
}
