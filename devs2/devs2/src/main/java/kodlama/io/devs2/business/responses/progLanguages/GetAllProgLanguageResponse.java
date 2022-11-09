package kodlama.io.devs2.business.responses.progLanguages;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgLanguageResponse {
	private int id;
	private String name;
}