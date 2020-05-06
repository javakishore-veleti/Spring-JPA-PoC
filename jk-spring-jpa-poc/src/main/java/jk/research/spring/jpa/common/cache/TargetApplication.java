package jk.research.spring.jpa.common.cache;

public enum TargetApplication {

	FOREX_RISK, FOREX_INTEREST_RATES, FOREX_HEDGING, ENTERPRISE_ENTITLEMENTS;

	public static TargetApplication getRandom() {
		return values()[(int) (Math.random() * values().length)];
	}

}
