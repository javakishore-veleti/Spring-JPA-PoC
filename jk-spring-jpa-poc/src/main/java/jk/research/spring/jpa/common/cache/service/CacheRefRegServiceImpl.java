package jk.research.spring.jpa.common.cache.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import jk.research.spring.jpa.common.cache.TargetApplication;
import jk.research.spring.jpa.common.cache.dao.CacheRefreshRegistrationDao;
import jk.research.spring.jpa.common.cache.model.CacheRefreshRegistration;
import jk.research.spring.jpa.common.cache.model.CacheRefreshRegistrationId;

@Service
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
public class CacheRefRegServiceImpl implements CacheRefRegService {

	@Autowired
	CacheRefreshRegistrationDao dao;

	@Override
	public Optional<CacheRefreshRegistration> findAllCacheRegistryById(CacheRefreshRegistrationId refRegId) {
		return dao.findById(refRegId);
	}

	@Override
	public long deleteByIdTargetApplication(TargetApplication targetApplication) {

		return dao.deleteByIdTargetApplication(targetApplication);
	}

	@Override
	public long count() {

		return dao.count();
	}

	@Override
	public void save(CacheRefreshRegistration cacheReg) {
		dao.save(cacheReg);
	}

}
