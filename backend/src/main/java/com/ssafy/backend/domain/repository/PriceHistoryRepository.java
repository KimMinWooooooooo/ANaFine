package com.ssafy.backend.domain.repository;

import com.ssafy.backend.domain.entity.PriceHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PriceHistoryRepository extends JpaRepository<PriceHistory, Long> {

    List<PriceHistory> findByHospitalTreatmentId(Long hospitalTreatmentId);

//    @Query(value = "SELECT ph FROM PriceHistory ph WHERE ph.ho")
//    PriceHistory findLatestPrice(Long hospitalTreatmentId)
}
