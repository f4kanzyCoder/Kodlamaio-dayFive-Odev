package kodlama.io.devs2.webApi.controllers;


import kodlama.io.devs2.business.abstracts.ProgLanguageService;
import kodlama.io.devs2.business.requests.progLanguages.CreateProgLanguageRequest;
import kodlama.io.devs2.business.requests.progLanguages.DeleteProgLanguageRequest;
import kodlama.io.devs2.business.requests.progLanguages.UpdateProgLanguageRequest;
import kodlama.io.devs2.business.responses.progLanguages.GetAllProgLanguageResponse;
import kodlama.io.devs2.business.responses.progLanguages.GetByIdProgLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/progLanguages")
public class ProgLanguagesController {
    private ProgLanguageService progLanguageService;

    @Autowired
    public ProgLanguagesController(ProgLanguageService progLanguageService) {
        this.progLanguageService = progLanguageService;
    }


    @GetMapping("/getall")
    public List<GetAllProgLanguageResponse> getAll() {
        return progLanguageService.getAll();
    }

    @GetMapping("/getbyid")
    public GetByIdProgLanguageResponse getById(int id) {
        return progLanguageService.getById(id);
    }

    @PostMapping("/add")
    public void add(CreateProgLanguageRequest createProgLanguageRequest) throws Exception {
        this.progLanguageService.add(createProgLanguageRequest);//
    }

    @PostMapping("/update")
    public void update(UpdateProgLanguageRequest updateProgLanguageRequest) throws Exception {
        this.progLanguageService.update(updateProgLanguageRequest);
    }

    @PostMapping("/delete")
    public void delete(DeleteProgLanguageRequest deleteProgLanguageRequest) throws Exception {
        this.progLanguageService.delete(deleteProgLanguageRequest);
    }
}