package test;

import static com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.given;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;

import com.expediaOffers.beans.Hotel;
import com.expediaOffers.formbeans.OffersForm;
import com.expediaOffers.utils.UrlBuilder;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContextTest.xml" })
@WebAppConfiguration
public class AppTest {

	@Autowired
	private WebApplicationContext ctx;

	@Before
	public void setup() {
		RestAssuredMockMvc.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
	}

	/**
	 * Test the offers Controller.
	 * 
	 * Controller will return 200 it its working fine,
	 * 
	 */
	@Test
	public void getAllHotelsTest() {
		given().when().post("/offers").then().statusCode(HttpServletResponse.SC_OK);
	}

	/**
	 * Test the index Controller.
	 * 
	 * Controller will return 200 it its working fine,
	 * 
	 */
	@Test
	public void indexTest() {
		given().when().get("/index").then().statusCode(HttpServletResponse.SC_OK);
	}

	/**
	 * Test the url builder.
	 * 
	 * build the url using UrlBuilder,
	 * 
	 */
	@Test
	public void UrlBuilderTest() {
		OffersForm offersForm = new OffersForm();
		offersForm.setDaterange("test");
		offersForm.setDaterange("06/22/2017 - 06/22/2017");
		offersForm.setGuestRating(new String[] { "1", "2", "3", "4", "5" });
		offersForm.setStarRating(new String[] { "1", "2", "3", "4", "5" });
		UrlBuilder url = new UrlBuilder();
		assertEquals(url.getURi(offersForm),
				"https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel&minTripStartDate=06/22/2017%20&maxTripStartDate=%2006/22/2017&minStarRating=1&maxStarRating=5&minGuestRating=1&maxGuestRating=5");
	}
}
