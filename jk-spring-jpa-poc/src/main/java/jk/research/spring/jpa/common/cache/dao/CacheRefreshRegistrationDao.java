package jk.research.spring.jpa.common.cache.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jk.research.spring.jpa.common.cache.TargetApplication;
import jk.research.spring.jpa.common.cache.model.CacheRefreshRegistration;
import jk.research.spring.jpa.common.cache.model.CacheRefreshRegistrationId;

@Repository
public interface CacheRefreshRegistrationDao
		extends JpaRepository<CacheRefreshRegistration, CacheRefreshRegistrationId> {

	Optional<CacheRefreshRegistration> findById(CacheRefreshRegistrationId refRegId);

	@Transactional
	@Modifying // to mark delete or update query
	@Query(value = "DELETE FROM CacheRefreshRegistration  WHERE targetApplication = :targetApplication", nativeQuery = true)
	Integer deleteByIdTargetApplication(@Param("targetApplication") String targetApplication);

}
