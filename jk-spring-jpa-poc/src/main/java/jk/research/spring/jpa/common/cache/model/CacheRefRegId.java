package jk.research.spring.jpa.common.cache.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import jk.research.spring.jpa.common.cache.ApplicationCacheEnum;
import jk.research.spring.jpa.common.cache.ApplicationInfoEnum;

@Embeddable
public class CacheRefRegId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Enumerated(EnumType.STRING)
	private ApplicationInfoEnum appInfo;

	@Enumerated(EnumType.STRING)
	private ApplicationCacheEnum appCache;

	public CacheRefRegId() {
		super();
	}

	public CacheRefRegId(ApplicationInfoEnum appInfo, ApplicationCacheEnum appCache) {
		super();
		this.appInfo = appInfo;
		this.appCache = appCache;
	}

	public ApplicationInfoEnum getAppInfo() {
		return appInfo;
	}

	public void setAppInfo(ApplicationInfoEnum appInfo) {
		this.appInfo = appInfo;
	}

	public ApplicationCacheEnum getAppCache() {
		return appCache;
	}

	public void setAppCache(ApplicationCacheEnum appCache) {
		this.appCache = appCache;
	}

	@Override
	public String toString() {
		return "CachRefRegId [appInfo=" + appInfo + ", appCache=" + appCache + "]";
	}

}
