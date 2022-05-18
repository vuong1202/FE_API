package tacos;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Taco {
	private Long id;
	private String name;
	private Date createdAt;
	private List<String> ingredients;
}
