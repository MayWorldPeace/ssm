package cn.itcast.cxf.domain;

import lombok.Data;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
@Data
@XmlRootElement(name = "User")
public class User {
	private Integer id;
	private String username;
	private String city;

	private List<Car> cars = new ArrayList<Car>();

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", city=" + city + ", cars=" + cars + "]";
	}

}
