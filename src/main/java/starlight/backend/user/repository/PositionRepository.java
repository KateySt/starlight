package starlight.backend.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import starlight.backend.user.model.entity.PositionEntity;

@Repository
public interface PositionRepository extends JpaRepository<PositionEntity, Long> {
    boolean existsByPositionIgnoreCase(String position);

    PositionEntity findByPosition(String position);
}