package jk.research.spring.jpa.common.cache.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jk.research.spring.jpa.common.cache.TargetApplication;
import jk.research.spring.jpa.common.cache.model.CacheRefreshRegistration;
import jk.research.spring.jpa.common.cache.model.CacheRefreshRegistrationId;

@Repository
public interface CacheRefreshRegistrationDao
		extends JpaRepository<CacheRefreshRegistration, CacheRefreshRegistrationId> {

	Optional<CacheRefreshRegistration> findById(CacheRefreshRegistrationId refRegId);

	Long deleteByIdTargetApplication(TargetApplication targetApplication);

}
