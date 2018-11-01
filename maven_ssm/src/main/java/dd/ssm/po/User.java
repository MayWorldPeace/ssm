package dd.ssm.po;

import java.util.Date;
import java.util.Objects;

public class User {
    private Integer id;

    private String username;

    private Date birthday;

    private String sex;

    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(getId(), user.getId()) &&
                Objects.equals(getUsername(), user.getUsername()) &&
                Objects.equals(getBirthday(), user.getBirthday()) &&
                Objects.equals(getSex(), user.getSex()) &&
                Objects.equals(getAddress(), user.getAddress());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getUsername(), getBirthday(), getSex(), getAddress());
    }
}