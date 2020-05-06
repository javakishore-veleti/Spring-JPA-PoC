package jk.research.spring.jpa.common.cache.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import jk.research.spring.jpa.common.cache.TargetCache;
import jk.research.spring.jpa.common.cache.TargetApplication;

@Embeddable
public class CacheRefreshRegistrationId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Enumerated(EnumType.STRING)
	@Column(length = 50)
	private TargetApplication targetApplication;

	@Enumerated(EnumType.STRING)
	@Column(length = 50)
	private TargetCache targetCache;

	public CacheRefreshRegistrationId() {
		super();
	}

	public CacheRefreshRegistrationId(TargetApplication targetApplication, TargetCache targetCache) {
		super();
		this.targetApplication = targetApplication;
		this.targetCache = targetCache;
	}

	public TargetApplication getTargetApplication() {
		return targetApplication;
	}

	public void setTargetApplication(TargetApplication targetApplication) {
		this.targetApplication = targetApplication;
	}

	public TargetCache getTargetCache() {
		return targetCache;
	}

	public void setTargetCache(TargetCache targetCache) {
		this.targetCache = targetCache;
	}

	@Override
	public String toString() {
		return "CacheRefreshRegistrationId [targetApplication=" + targetApplication + ", targetCache=" + targetCache
				+ "]";
	}

}
