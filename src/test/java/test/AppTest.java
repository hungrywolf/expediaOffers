package test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.expediaOffers.utils.RestCall;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContextTest.xml" })
public class AppTest {

	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void restTemplateAuto() {
		assertThat(restTemplate, is(notNullValue()));
	}
	
	@Autowired
	private RestCall restCall;

	@Test
	public void restCallAuto() {
		assertThat(restCall, is(notNullValue()));
	}
}
