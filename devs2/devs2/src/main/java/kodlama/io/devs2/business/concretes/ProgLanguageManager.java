package kodlama.io.devs2.business.concretes;

import kodlama.io.devs2.business.abstracts.ProgLanguageService;
import kodlama.io.devs2.business.requests.progLanguages.CreateProgLanguageRequest;
import kodlama.io.devs2.business.requests.progLanguages.DeleteProgLanguageRequest;
import kodlama.io.devs2.business.requests.progLanguages.UpdateProgLanguageRequest;
import kodlama.io.devs2.business.responses.progLanguages.GetAllProgLanguageResponse;
import kodlama.io.devs2.business.responses.progLanguages.GetByIdProgLanguageResponse;
import kodlama.io.devs2.dataAccess.abstracts.ProgLanguageRepository;
import kodlama.io.devs2.entities.concretes.ProgLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service // Bu sinif bir business nesnesidir
public class ProgLanguageManager implements ProgLanguageService {
	private ProgLanguageRepository progLanguageRepository;

	@Autowired
	public ProgLanguageManager(ProgLanguageRepository progLanguageRepository) {
		super();
		this.progLanguageRepository = progLanguageRepository;
	}


	@Override
	public List<GetAllProgLanguageResponse> getAll() {
		List<ProgLanguage> progLanguages = progLanguageRepository.findAll();
				List<GetAllProgLanguageResponse> languagesResponse = new ArrayList<GetAllProgLanguageResponse>();
				for (ProgLanguage language : progLanguages) {
					GetAllProgLanguageResponse responseItem = new GetAllProgLanguageResponse();
					responseItem.setId(language.getId());
					responseItem.setName(language.getName());
					languagesResponse.add(responseItem);
				}
				return languagesResponse;
	}

	@Override
	public GetByIdProgLanguageResponse getById(int id) {
		Optional<ProgLanguage> progLanguage = progLanguageRepository.findById(id);
				GetByIdProgLanguageResponse responseItem = new GetByIdProgLanguageResponse();
				responseItem.setName(progLanguage.get().getName());
				return responseItem;

	}

	@Override
	public void add(CreateProgLanguageRequest createProgLanguageRequest) throws Exception {
		ProgLanguage progLanguage = new ProgLanguage();
				progLanguage.setName(createProgLanguageRequest.getName());
				this.progLanguageRepository.save(progLanguage);
	}

	@Override
	public void update(UpdateProgLanguageRequest updateProgLanguageRequest) throws Exception {
		ProgLanguage progLanguage = progLanguageRepository
						.findById(updateProgLanguageRequest.getId()).get();
				progLanguage.setId(updateProgLanguageRequest.getId());
				progLanguage.setName(updateProgLanguageRequest.getName());
				progLanguageRepository.save(progLanguage);

	}

	@Override
	public void delete(DeleteProgLanguageRequest deleteProgLanguageRequest) throws Exception {


		ProgLanguage progLanguage = progLanguageRepository
						.findById(deleteProgLanguageRequest.getId()).get();
				progLanguageRepository.delete(progLanguage);

	}
}