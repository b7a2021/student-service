package telran.b7a.student.model;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@EqualsAndHashCode(of = "id")
public class Student {
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
