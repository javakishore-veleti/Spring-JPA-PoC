package jk.research.spring.jpa.common.cache.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import jk.research.spring.jpa.common.cache.ApplicationInfoEnum;
import jk.research.spring.jpa.common.cache.dao.CacheRefRegDAO;
import jk.research.spring.jpa.common.cache.model.CacheRefRegId;
import jk.research.spring.jpa.common.cache.model.CacheRegistry;

@Service
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
public class CacheRefRegServiceImpl implements CacheRefRegService {

	@Autowired
	CacheRefRegDAO dao;

	@Override
	public List<CacheRegistry> findAllCacheRegistryById(CacheRefRegId refRegId) {
		return dao.findAllCacheRegistryById(refRegId);
	}

	@Override
	public Long deleteByIdAppInfo(ApplicationInfoEnum applicationInfo) {
		return dao.deleteByIdAppInfo(applicationInfo);
	}

	@Override
	public void save(CacheRegistry cacheReg) {
		dao.save(cacheReg);
	}

}
