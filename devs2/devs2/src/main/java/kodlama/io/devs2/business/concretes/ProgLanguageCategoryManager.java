package kodlama.io.devs2.business.concretes;

import kodlama.io.devs2.business.abstracts.ProgLanguageCategoryService;
import kodlama.io.devs2.business.requests.progLanguagesCategory.CreateProgLanguageCateogryRequest;
import kodlama.io.devs2.business.requests.progLanguagesCategory.DeleteProgLanguageCateogryRequest;
import kodlama.io.devs2.business.requests.progLanguagesCategory.UpdateProgLanguageCateogryRequest;
import kodlama.io.devs2.business.responses.progLanguagesCategory.GetAllProgLanguageCateogryResponse;
import kodlama.io.devs2.business.responses.progLanguagesCategory.GetByIdProgLanguageCategoryResponse;
import kodlama.io.devs2.dataAccess.abstracts.ProgLanguageCategoryRepository;
import kodlama.io.devs2.dataAccess.abstracts.ProgLanguageRepository;
import kodlama.io.devs2.entities.concretes.ProgLanguage;
import kodlama.io.devs2.entities.concretes.ProgLanguageCategory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProgLanguageCategoryManager implements ProgLanguageCategoryService {
    ProgLanguageCategoryRepository progLanguageCategoryRepository ;
    ProgLanguageRepository progLanguageRepository;
    @Autowired
    public ProgLanguageCategoryManager(ProgLanguageCategoryRepository progLanguageCategoryRepository, ProgLanguageRepository progLanguageRepository) {
        this.progLanguageCategoryRepository = progLanguageCategoryRepository;
        this.progLanguageRepository = progLanguageRepository;
    }

    @Override
    public List<GetAllProgLanguageCateogryResponse> getAll() {
        List<ProgLanguageCategory> progLanguageCategories = progLanguageCategoryRepository.findAll();
		List<GetAllProgLanguageCateogryResponse> getAllProgLanguageCateogryResponses = new ArrayList<GetAllProgLanguageCateogryResponse>();
		for (ProgLanguageCategory progLanguageCategory : progLanguageCategories) {
            GetAllProgLanguageCateogryResponse responseItem = new GetAllProgLanguageCateogryResponse();
			responseItem.setProgLanguageId(progLanguageCategory.getProgLanguage().getId());
			responseItem.setProgLanguageName(progLanguageCategory.getProgLanguage().getName());
			responseItem.setId(progLanguageCategory.getId());
			responseItem.setName(progLanguageCategory.getName());
            getAllProgLanguageCateogryResponses.add(responseItem);
		}
		return getAllProgLanguageCateogryResponses;
    }

    @Override
    public GetByIdProgLanguageCategoryResponse getById(int id) {
        Optional<ProgLanguageCategory> progLanguageCategory = progLanguageCategoryRepository.findById(id);
        		GetByIdProgLanguageCategoryResponse responseItem = new GetByIdProgLanguageCategoryResponse();
        		responseItem.setName(progLanguageCategory.get().getName());
        		return responseItem;
    }

    @Override
    public void add(CreateProgLanguageCateogryRequest createProgLanguageCateogryRequest) throws Exception {
        ProgLanguage progLanguage = progLanguageRepository
        				.findById(createProgLanguageCateogryRequest.getProgLanguageId()).get();
        ProgLanguageCategory progLanguageCategory = new ProgLanguageCategory();
        progLanguageCategory.setProgLanguage(progLanguage);
        progLanguageCategory.setName(createProgLanguageCateogryRequest.getName());
        progLanguageCategoryRepository.save(progLanguageCategory);
    }

    @Override
    public void update(UpdateProgLanguageCateogryRequest updateProgLanguageCateogryRequest) throws Exception {
        ProgLanguage progLanguage = progLanguageRepository.findById(updateProgLanguageCateogryRequest.getProgLanguageId()).get();
        ProgLanguageCategory progLanguageCategory = progLanguageCategoryRepository.findById(updateProgLanguageCateogryRequest.getId()).get();
        		progLanguageCategory.setName(updateProgLanguageCateogryRequest.getName());
        progLanguageCategory.setProgLanguage(progLanguage);
        progLanguageCategoryRepository.save(progLanguageCategory);
    }

    @Override
    public void delete(DeleteProgLanguageCateogryRequest deleteProgLanguageCateogryRequest) throws Exception {
        ProgLanguageCategory progLanguageCategory = progLanguageCategoryRepository.findById(deleteProgLanguageCateogryRequest.getId()).get();
        progLanguageCategoryRepository.delete(progLanguageCategory);
    }
}
