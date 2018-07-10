package com.tengxh;

import com.tengxh.bean.User;
import com.tengxh.mapper.UserMapper;
import com.tengxh.sqlSession.MySqlsession;

public class TestMybatis {
	
    public static void main(String[] args) {  
        MySqlsession sqlsession=new MySqlsession();  
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);  
        User user = mapper.getUserById("2");
        System.out.println(user);
    }
}
