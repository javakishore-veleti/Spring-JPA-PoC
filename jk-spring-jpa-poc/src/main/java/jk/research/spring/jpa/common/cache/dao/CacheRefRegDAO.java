package jk.research.spring.jpa.common.cache.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jk.research.spring.jpa.common.cache.ApplicationInfo;
import jk.research.spring.jpa.common.cache.model.CacheRefRegId;
import jk.research.spring.jpa.common.cache.model.CacheRegistry;

@Repository
public interface CacheRefRegDAO extends JpaRepository<CacheRegistry, CacheRefRegId> {

	List<CacheRegistry> findAllCacheRegistryById(CacheRefRegId refRegId);

	Long deleteAppInfoByAppId(ApplicationInfo applicationInfo);

}
