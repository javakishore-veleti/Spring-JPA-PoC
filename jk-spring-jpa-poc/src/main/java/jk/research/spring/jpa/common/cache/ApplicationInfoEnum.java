package jk.research.spring.jpa.common.cache;

public enum ApplicationInfoEnum {

	FOREX_RISK, FOREX_INTEREST_RATES, FOREX_HEDGING, ENTERPRISE_ENTITLEMENTS;

	public static ApplicationInfoEnum getRandom() {
		return values()[(int) (Math.random() * values().length)];
	}

}
