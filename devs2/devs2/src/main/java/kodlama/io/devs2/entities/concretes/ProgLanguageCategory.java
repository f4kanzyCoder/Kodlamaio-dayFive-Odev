package kodlama.io.devs2.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Table(name = "progLanguageCategory")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProgLanguageCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Id otomatik artan
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "progLanguageId")
	private ProgLanguage progLanguage;
}