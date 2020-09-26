package kz.iitu.recommendation.repository;

import kz.iitu.recommendation.model.entity.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {

//    List<Recommendation> getAllByRatingOrderByRating();

}
