package com.teampraxis.models.data;

import com.teampraxis.models.PracticeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticeRepository extends JpaRepository<PracticeModel, Long> {
}
