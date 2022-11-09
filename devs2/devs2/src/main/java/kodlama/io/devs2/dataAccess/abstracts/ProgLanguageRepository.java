package kodlama.io.devs2.dataAccess.abstracts;

import kodlama.io.devs2.entities.concretes.ProgLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgLanguageRepository extends JpaRepository<ProgLanguage,Integer> {
}
