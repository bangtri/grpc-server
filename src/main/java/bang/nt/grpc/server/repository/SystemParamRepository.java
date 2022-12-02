package bang.nt.grpc.server.repository;

import bang.nt.grpc.server.domain.SystemParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SystemParamRepository extends JpaRepository<SystemParam, Long> {

    @Query(value = "SELECT * FROM system_parameter ORDER BY id DESC , modified_date DESC", nativeQuery = true)
    Page<SystemParam> findAllParam(Pageable pageable);

    @Query(value = "SELECT * FROM system_parameter WHERE code = ?1", nativeQuery = true)
    Optional<SystemParam> findParamByCode(String code);

}
