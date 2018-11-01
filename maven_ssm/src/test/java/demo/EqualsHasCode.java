package demo;

import dd.ssm.po.User;

/**
 * @author ZhongChaoYuan
 * @create 2018-09-18 16:21
 **/
public class EqualsHasCode {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1);
        user1.setUsername("窑子");
        User user2 = new User();
        user2.setId(1);
        user2.setUsername("窑子");
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.equals(user2));
    }
}
