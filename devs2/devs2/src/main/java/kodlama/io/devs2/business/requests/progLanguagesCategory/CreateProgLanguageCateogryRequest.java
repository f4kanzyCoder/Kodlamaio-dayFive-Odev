package kodlama.io.devs2.business.requests.progLanguagesCategory;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProgLanguageCateogryRequest {
	private int progLanguageId;
	private String name;
}