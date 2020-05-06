package jk.research.spring.jpa.common.cache.dao;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import jk.research.spring.jpa.common.cache.TargetApplication;
import jk.research.spring.jpa.common.cache.TargetCache;
import jk.research.spring.jpa.common.cache.model.CacheRefreshRegistration;
import jk.research.spring.jpa.common.cache.model.CacheRefreshRegistrationId;

@ContextConfiguration(locations = "classpath:application-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CacheRefreshRegistrationDaoTest {

	@BeforeClass
	public static void setup() {
	}

	@Autowired
	private CacheRefreshRegistrationDao cacheRefreshRegistrationDao;

	@Test
	public void saveTest() {

		CacheRefreshRegistration cacheReg = null;
		for (int aRowIndex = 1; aRowIndex <= 10; aRowIndex++) {

			cacheReg = new CacheRefreshRegistration(
					new CacheRefreshRegistrationId(TargetApplication.getRandom(), TargetCache.getRandom()), new Date());

			cacheRefreshRegistrationDao.save(cacheReg);
		}

	}

	@Test
	public void deleteTest() {

		System.out.println("Delete ENTER");

		for (int aRowIndex = 1; aRowIndex <= 3; aRowIndex++) {

			System.out.println("Delete FOR LOOP 1 " + aRowIndex);

			cacheRefreshRegistrationDao.deleteByIdTargetApplication(TargetApplication.getRandom().toString());

			System.out.println("Delete FOR LOOP 2 " + aRowIndex);
		}

		System.out.println("Delete EXIT");

	}
}
