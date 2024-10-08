package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

// lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("UserInfoV2")
// User 상속
public class UserV2 extends User{
    private String grade;
    
}
