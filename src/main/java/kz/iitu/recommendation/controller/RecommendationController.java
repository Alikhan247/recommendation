package kz.iitu.recommendation.controller;

import kz.iitu.recommendation.model.entity.Recommendation;
import kz.iitu.recommendation.repository.RecommendationRepository;
import kz.iitu.recommendation.service.RecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RecommendationController {

    private final RecommendationService recommendationService;
    private final RecommendationRepository recommendationRepository;



    @PostMapping("/recommendation")
    public ResponseEntity<Recommendation> createRecommendation(@RequestBody Recommendation reservation){
        return new ResponseEntity<>(recommendationService.createRecommendation(reservation), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<Recommendation>> getRecommendation(){
        return new ResponseEntity<>(recommendationRepository.findAll(), HttpStatus.OK);
    }

}
