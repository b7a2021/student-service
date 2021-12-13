package telran.b7a.student.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@EqualsAndHashCode(of = "id")
@Document(collection = "tipesh")
public class Student {
	@Id
	int id;
	@Setter
	String name;
	@Setter
	String password;
	Map<String, Integer> scores;
	
	public Student() {
		scores = new HashMap<>();
	}
	
	public Student(int id, String name, String password) {
		this();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public boolean addScore(String exam, int score) {
		return scores.put(exam, score) == null;
	}

	
}
