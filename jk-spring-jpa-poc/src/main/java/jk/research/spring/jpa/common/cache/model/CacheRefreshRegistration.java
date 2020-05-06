package jk.research.spring.jpa.common.cache.model;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class CacheRefreshRegistration {

	@EmbeddedId
	private CacheRefreshRegistrationId id;

	private Date creationDate;

	public CacheRefreshRegistration() {
	}

	public CacheRefreshRegistration(CacheRefreshRegistrationId id, Date creationDate) {
		super();
		this.id = id;
		this.creationDate = creationDate;
	}

	public CacheRefreshRegistrationId getId() {
		return id;
	}

	public void setId(CacheRefreshRegistrationId id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "CacheRegistry [id=" + id + ", creationDate=" + creationDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CacheRefreshRegistration other = (CacheRefreshRegistration) obj;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
