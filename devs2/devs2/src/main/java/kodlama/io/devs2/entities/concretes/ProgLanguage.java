package kodlama.io.devs2.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table(name = "proglanguage")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProgLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id otomatik arttirmaya yariyor
    @Column(name = "id")//buradaki id veritabanindaki id kolonu demek
    private int id;
    @Column(name = "name")//buradaki name veritabanindaki name kolonu  demek
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "progLanguage")
    	private List<ProgLanguageCategory> progLanguageCategory ;
}

