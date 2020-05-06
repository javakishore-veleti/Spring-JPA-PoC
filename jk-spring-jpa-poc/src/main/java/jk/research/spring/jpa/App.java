package jk.research.spring.jpa;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import jk.research.spring.jpa.common.cache.TargetCache;
import jk.research.spring.jpa.common.cache.TargetApplication;
import jk.research.spring.jpa.common.cache.model.CacheRefreshRegistrationId;
import jk.research.spring.jpa.common.cache.model.CacheRefreshRegistration;
import jk.research.spring.jpa.common.cache.service.CacheRefRegService;

public class App {

	public static final Integer NO_OF_ROWS_TO_INSERT = 10;

	public static final Integer NO_OF_ROWS_TO_DELETE = 2;

	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext ctx = null;

		try {
			ctx = new ClassPathXmlApplicationContext("application-context.xml");

			CacheRefRegService serviceRef = ctx.getBean(CacheRefRegService.class);

			populateCacheRegistryTable(serviceRef);
			deleteCacheRegistryTable(serviceRef);

		} finally {

			if (ctx != null) {
				ctx.close();
			}

			System.exit(0);
		}

	}

	private static void populateCacheRegistryTable(CacheRefRegService serviceRef) throws Exception {

		CacheRefreshRegistration cacheReg = null;
		for (int aRowIndex = 1; aRowIndex <= NO_OF_ROWS_TO_INSERT; aRowIndex++) {

			cacheReg = new CacheRefreshRegistration(
					new CacheRefreshRegistrationId(TargetApplication.getRandom(), TargetCache.getRandom()), new Date());

			serviceRef.save(cacheReg);
		}
	}

	private static void deleteCacheRegistryTable(CacheRefRegService serviceRef) throws Exception {

		long returnValue = 0;
		for (int aRowIndex = 1; aRowIndex <= NO_OF_ROWS_TO_DELETE; aRowIndex++) {

			returnValue = serviceRef.deleteByIdTargetApplication(TargetApplication.getRandom());
			System.out.println("returnValue " + returnValue);
		}

	}
}
