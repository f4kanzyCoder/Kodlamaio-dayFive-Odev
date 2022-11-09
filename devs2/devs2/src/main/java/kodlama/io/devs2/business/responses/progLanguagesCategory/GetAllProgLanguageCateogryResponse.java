package kodlama.io.devs2.business.responses.progLanguagesCategory;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgLanguageCateogryResponse {
	private int id;
	private String name;
	private int progLanguageId;
	private String progLanguageName;
}