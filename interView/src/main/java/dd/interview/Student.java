package dd.interview;

import lombok.Data;

/**
 * @author ZhongChaoYuan
 * @create 2018-10-21 10:48
 **/
@Data
public class Student {

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
}
