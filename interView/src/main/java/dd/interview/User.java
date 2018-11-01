package dd.interview;

import lombok.Data;

/**
 * @author ZhongChaoYuan
 * @create 2018-10-15 19:49
 **/
@Data
public class User implements Comparable<User>{

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private Integer age;

    public int compareTo(User o) {
        //int i = this.getAge() - o.getAge();
        int i = o.getAge() - this.getAge();
        return i;
    }
}
