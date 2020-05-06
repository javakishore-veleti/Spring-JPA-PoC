package jk.research.spring.jpa.common.cache.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import jk.research.spring.jpa.common.cache.ApplicationCache;
import jk.research.spring.jpa.common.cache.ApplicationInfo;

@Embeddable
public class CacheRefRegId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Enumerated(EnumType.STRING)
	private ApplicationInfo appInfo;

	@Enumerated(EnumType.STRING)
	private ApplicationCache appCache;

	public CacheRefRegId() {
		super();
	}

	public CacheRefRegId(ApplicationInfo appInfo, ApplicationCache appCache) {
		super();
		this.appInfo = appInfo;
		this.appCache = appCache;
	}

	public ApplicationInfo getAppInfo() {
		return appInfo;
	}

	public void setAppInfo(ApplicationInfo appInfo) {
		this.appInfo = appInfo;
	}

	public ApplicationCache getAppCache() {
		return appCache;
	}

	public void setAppCache(ApplicationCache appCache) {
		this.appCache = appCache;
	}

	@Override
	public String toString() {
		return "CachRefRegId [appInfo=" + appInfo + ", appCache=" + appCache + "]";
	}

}
