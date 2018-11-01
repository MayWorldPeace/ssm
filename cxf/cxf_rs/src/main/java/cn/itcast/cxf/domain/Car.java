package cn.itcast.cxf.domain;

import lombok.Data;
import javax.xml.bind.annotation.XmlRootElement;
@Data
@XmlRootElement(name = "Car")
public class Car {
	private Integer id;
	private String carName;
	private Double price;

	@Override
	public String toString() {
		return "Car [id=" + id + ", carName=" + carName + ", price=" + price + "]";
	}

}
