package kodlama.io.devs2.business.abstracts;

import kodlama.io.devs2.business.requests.progLanguagesCategory.CreateProgLanguageCateogryRequest;
import kodlama.io.devs2.business.requests.progLanguagesCategory.DeleteProgLanguageCateogryRequest;
import kodlama.io.devs2.business.requests.progLanguagesCategory.UpdateProgLanguageCateogryRequest;
import kodlama.io.devs2.business.responses.progLanguagesCategory.GetAllProgLanguageCateogryResponse;
import kodlama.io.devs2.business.responses.progLanguagesCategory.GetByIdProgLanguageCategoryResponse;

import java.util.List;

public interface ProgLanguageCategoryService {
    	List<GetAllProgLanguageCateogryResponse> getAll();

    	GetByIdProgLanguageCategoryResponse getById(int id);

    	void add(CreateProgLanguageCateogryRequest createProgLanguageCateogryRequest) throws Exception;

    	void update(UpdateProgLanguageCateogryRequest updateProgLanguageCateogryRequest) throws Exception;

    	void delete(DeleteProgLanguageCateogryRequest deleteProgLanguageCateogryRequest) throws Exception;
}
