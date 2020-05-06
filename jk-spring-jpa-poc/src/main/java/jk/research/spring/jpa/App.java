package jk.research.spring.jpa;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import jk.research.spring.jpa.common.cache.ApplicationCacheEnum;
import jk.research.spring.jpa.common.cache.ApplicationInfoEnum;
import jk.research.spring.jpa.common.cache.dao.CacheRefRegDAO;
import jk.research.spring.jpa.common.cache.model.CacheRefRegId;
import jk.research.spring.jpa.common.cache.model.CacheRegistry;
import jk.research.spring.jpa.common.cache.service.CacheRefRegService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");

		CacheRefRegService serviceRef = ctx.getBean(CacheRefRegService.class);

		populateCacheRegistryTable(serviceRef);
		deleteCacheRegistryTable(serviceRef);

		System.exit(0);
	}

	private static void populateCacheRegistryTable(CacheRefRegService serviceRef) throws Exception {

		CacheRegistry cacheReg = null;
		for (int aRowIndex = 1; aRowIndex <= 10; aRowIndex++) {

			cacheReg = new CacheRegistry(
					new CacheRefRegId(ApplicationInfoEnum.getRandom(), ApplicationCacheEnum.getRandom()), new Date());

			serviceRef.save(cacheReg);
		}
	}

	private static void deleteCacheRegistryTable(CacheRefRegService serviceRef) throws Exception {

		for (int aRowIndex = 1; aRowIndex <= 10; aRowIndex++) {

			serviceRef.deleteByIdAppInfo(ApplicationInfoEnum.getRandom());
		}

	}
}
