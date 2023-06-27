package com.Test;

import com.Test.dao.impl.UserDaoImpl;
import com.Test.entity.User;

public class Test {
    public static void main(String[] args) {
        UserDaoImpl impl=new UserDaoImpl();
        User zhangsan = impl.findUserByUsernameAndPassword("zhangsan", "123456");
        System.out.println(zhangsan);
    }
}
