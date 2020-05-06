package jk.research.spring.jpa.common.cache.service;

import java.util.Optional;

import jk.research.spring.jpa.common.cache.TargetApplication;
import jk.research.spring.jpa.common.cache.model.CacheRefreshRegistration;
import jk.research.spring.jpa.common.cache.model.CacheRefreshRegistrationId;

public interface CacheRefRegService {

	Optional<CacheRefreshRegistration> findAllCacheRegistryById(CacheRefreshRegistrationId refRegId);

	Integer deleteByIdTargetApplication(TargetApplication targetApplication);

	void save(CacheRefreshRegistration cacheReg);

	long count();

}
