package kodlama.io.devs2.webApi.controllers;


import kodlama.io.devs2.business.abstracts.ProgLanguageCategoryService;
import kodlama.io.devs2.business.requests.progLanguagesCategory.CreateProgLanguageCateogryRequest;
import kodlama.io.devs2.business.requests.progLanguagesCategory.DeleteProgLanguageCateogryRequest;
import kodlama.io.devs2.business.requests.progLanguagesCategory.UpdateProgLanguageCateogryRequest;
import kodlama.io.devs2.business.responses.progLanguagesCategory.GetAllProgLanguageCateogryResponse;
import kodlama.io.devs2.business.responses.progLanguagesCategory.GetByIdProgLanguageCategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/proglcategory")
public class ProgLanguagesCategoryController {
    private ProgLanguageCategoryService progLanguageCategoryService;

    public ProgLanguagesCategoryController(ProgLanguageCategoryService progLanguageCategoryService) {
        this.progLanguageCategoryService = progLanguageCategoryService;
    }
    public  ProgLanguagesCategoryController(){}

    @GetMapping("/getall")
    public List<GetAllProgLanguageCateogryResponse> getAll() {
        return progLanguageCategoryService.getAll();
    }

    @GetMapping("/getbyid")
    public GetByIdProgLanguageCategoryResponse getById(int id) {
        return progLanguageCategoryService.getById(id);
    }

    @PostMapping("/add")
    public void add(CreateProgLanguageCateogryRequest createProgLanguageCateogryRequest) throws Exception {
        this.progLanguageCategoryService.add(createProgLanguageCateogryRequest);
    }

    @PostMapping("/update")
    public void update(UpdateProgLanguageCateogryRequest updateProgLanguageCateogryRequest) throws Exception {
        this.progLanguageCategoryService.update(updateProgLanguageCateogryRequest);
    }

    @PostMapping("/delete")
    public void delete(DeleteProgLanguageCateogryRequest deleteProgLanguageCateogryRequest) throws Exception {
        this.progLanguageCategoryService.delete(deleteProgLanguageCateogryRequest);
    }
}