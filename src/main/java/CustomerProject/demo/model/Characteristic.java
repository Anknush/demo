package CustomerProject.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Characteristic {
	 public String name;
	 public String value;
	 public String valueType;
	 public String description;
	 public Characteristic() {
		 
	 }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValueType() {
		return valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
