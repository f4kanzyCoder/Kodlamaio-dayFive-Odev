package kodlama.io.devs2.business.requests.progLanguages;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProgLanguageRequest {
	private int id;
	private String name;
}