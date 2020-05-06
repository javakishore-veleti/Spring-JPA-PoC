package jk.research.spring.jpa;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import jk.research.spring.jpa.common.cache.ApplicationCacheEnum;
import jk.research.spring.jpa.common.cache.ApplicationInfoEnum;
import jk.research.spring.jpa.common.cache.model.CacheRefRegId;
import jk.research.spring.jpa.common.cache.model.CacheRegistry;
import jk.research.spring.jpa.common.cache.service.CacheRefRegService;

public class App {

	public static final Integer NO_OF_ROWS_TO_INSERT = 10;

	public static final Integer NO_OF_ROWS_TO_DELETE = NO_OF_ROWS_TO_INSERT - 1;

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

		CacheRegistry cacheReg = null;
		for (int aRowIndex = 1; aRowIndex <= NO_OF_ROWS_TO_INSERT; aRowIndex++) {

			cacheReg = new CacheRegistry(
					new CacheRefRegId(ApplicationInfoEnum.getRandom(), ApplicationCacheEnum.getRandom()), new Date());

			serviceRef.save(cacheReg);
		}
	}

	private static void deleteCacheRegistryTable(CacheRefRegService serviceRef) throws Exception {

		for (int aRowIndex = 1; aRowIndex <= NO_OF_ROWS_TO_DELETE; aRowIndex++) {

			serviceRef.deleteByIdAppInfo(ApplicationInfoEnum.getRandom());
		}

	}
}
