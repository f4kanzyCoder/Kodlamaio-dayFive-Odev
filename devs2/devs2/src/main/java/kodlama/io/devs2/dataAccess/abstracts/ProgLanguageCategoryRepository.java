package kodlama.io.devs2.dataAccess.abstracts;

import kodlama.io.devs2.entities.concretes.ProgLanguageCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgLanguageCategoryRepository extends JpaRepository<ProgLanguageCategory , Integer> {
}
