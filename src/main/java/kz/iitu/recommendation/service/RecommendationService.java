package kz.iitu.recommendation.service;

import kz.iitu.recommendation.model.entity.Movie;
import kz.iitu.recommendation.model.entity.Recommendation;
import kz.iitu.recommendation.repository.RecommendationRepository;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.ExceptionUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class RecommendationService {

    private final RecommendationRepository recommendationRepository;
    private final RestTemplate restTemplate;

    public Recommendation createRecommendation(Recommendation recommendation){

        Movie movie = restTemplate.getForObject("http://localhost:8081/movie/" + recommendation.getMovie().getId(), Movie.class);




        recommendation.setRating(movie.getRating());
        recommendation.setName(movie.getName());

        return recommendationRepository.save(recommendation);

    }

}
