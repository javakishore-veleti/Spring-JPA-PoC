package jk.research.spring.jpa.common.cache.service;

import java.util.List;

import jk.research.spring.jpa.common.cache.ApplicationInfoEnum;
import jk.research.spring.jpa.common.cache.model.CacheRefRegId;
import jk.research.spring.jpa.common.cache.model.CacheRegistry;

public interface CacheRefRegService {

	List<CacheRegistry> findAllCacheRegistryById(CacheRefRegId refRegId);

	Long deleteByIdAppInfo(ApplicationInfoEnum applicationInfo);

	void save(CacheRegistry cacheReg);
}
