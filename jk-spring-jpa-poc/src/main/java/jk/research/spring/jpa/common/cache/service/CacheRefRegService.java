package jk.research.spring.jpa.common.cache.service;

import java.util.Optional;

import jk.research.spring.jpa.common.cache.model.CacheRefreshRegistration;
import jk.research.spring.jpa.common.cache.model.CacheRefreshRegistrationId;

public interface CacheRefRegService {

	Optional<CacheRefreshRegistration> findAllCacheRegistryById(CacheRefreshRegistrationId refRegId);

	Integer deleteByIdTargetApplication(String targetApplication);

	void save(CacheRefreshRegistration cacheReg);

	long count();

}
