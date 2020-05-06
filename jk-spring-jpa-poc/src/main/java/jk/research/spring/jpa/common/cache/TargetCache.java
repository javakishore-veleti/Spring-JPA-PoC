package jk.research.spring.jpa.common.cache;

public enum TargetCache {

	CACHE_TYPE_LOW, CACHE_TYPE_MEDIUM, CACHE_TYPE_HIGH, CACHE_TYPE_STATIC, CACHE_TYPE_QUICK_TRANSIENT;

	public static TargetCache getRandom() {
		return values()[(int) (Math.random() * values().length)];
	}

}
