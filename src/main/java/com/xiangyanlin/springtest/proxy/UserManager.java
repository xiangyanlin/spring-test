package com.xiangyanlin.springtest.proxy;

/**
 * @author XiangYanLin.
 * @date 2021/1/6
 * 用户管理，测试JDK动态代理
 */
public interface UserManager {
    /**
     * 新增用户抽象方法
     * @param userName
     * @param password
     */
    void addUser(String userName,String password);

    /**
     * 删除用户抽象方法
     * @param userName
     */
    void delUser(String userName);
}
