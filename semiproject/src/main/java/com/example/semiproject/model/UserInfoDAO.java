package com.example.semiproject.model;

import com.example.semiproject.dto.UserInfoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoDAO {
    int userInfor(UserInfoDTO userInfoDTO, int userCode);

    int studentInfo(List<String> names, int userCode);
}
