package test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.expediaOffers.utils.RestCall;
import com.expediaOffers.utils.UrlBuilder;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContextTest.xml" })
public class AutowirTest {

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * Test the Autowired for rest template
	 * 
	 */
	@Test
	public void restTemplateAuto() {
		assertThat(restTemplate, is(notNullValue()));
	}

	@Autowired
	private RestCall restCall;

	/**
	 * Test the Autowired for rest call
	 * 
	 */
	@Test
	public void restCallAuto() {
		assertThat(restCall, is(notNullValue()));
	}

	@Autowired
	private UrlBuilder urlBuilder;

	/**
	 * Test the Autowired for url builder
	 * 
	 */
	@Test
	public void urlBuilderAuto() {
		assertThat(urlBuilder, is(notNullValue()));
	}
}
