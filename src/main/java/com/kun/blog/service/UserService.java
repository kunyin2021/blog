package com.kun.blog.service;

import com.kun.blog.po.User;

public interface UserService {
     User checkUser(String username, String password);
}
