package test;

import static com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.given;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import static org.hamcrest.CoreMatchers.*;

import com.expediaOffers.beans.Hotel;
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
		RestAssuredMockMvc.mockMvc = MockMvcBuilders.webAppContextSetup(ctx)
				.build();
	}

	@Test
	public void getAllHotelsTest() {
		given().when().get("/offers.html").then()
				.statusCode(HttpServletResponse.SC_OK);
	}

	@Test
	public void indexTest() {
		given().when().get("/index.html").then()
				.statusCode(HttpServletResponse.SC_OK);
	}
}
