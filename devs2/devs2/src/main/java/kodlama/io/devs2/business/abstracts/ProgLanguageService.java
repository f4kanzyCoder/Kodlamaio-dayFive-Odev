package kodlama.io.devs2.business.abstracts;

import kodlama.io.devs2.business.requests.progLanguages.CreateProgLanguageRequest;
import kodlama.io.devs2.business.requests.progLanguages.DeleteProgLanguageRequest;
import kodlama.io.devs2.business.requests.progLanguages.UpdateProgLanguageRequest;
import kodlama.io.devs2.business.responses.progLanguages.GetAllProgLanguageResponse;
import kodlama.io.devs2.business.responses.progLanguages.GetByIdProgLanguageResponse;

import java.util.List;

public interface ProgLanguageService {
	List<GetAllProgLanguageResponse> getAll();

		GetByIdProgLanguageResponse getById(int id);

		void add(CreateProgLanguageRequest createProgLanguageRequest) throws Exception;

		void update(UpdateProgLanguageRequest updateProgLanguageRequest) throws Exception;

		void delete(DeleteProgLanguageRequest deleteProgLanguageRequest) throws Exception;
}
