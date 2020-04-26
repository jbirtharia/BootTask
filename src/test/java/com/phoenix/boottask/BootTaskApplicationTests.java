package com.phoenix.boottask;

import com.phoenix.boottask.controllers.TrackerController;
import com.phoenix.boottask.service.ApplicationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(TrackerController.class)
class BootTaskApplicationTests {

	@Autowired
	MockMvc mvc;

	@MockBean
	ApplicationService applicationService;

	@Test
	void contextLoads() {
	}

}
