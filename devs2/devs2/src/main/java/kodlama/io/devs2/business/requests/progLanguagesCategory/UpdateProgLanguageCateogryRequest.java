package kodlama.io.devs2.business.requests.progLanguagesCategory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProgLanguageCateogryRequest {
	private int id;
	private int progLanguageId;
	private String name;
}