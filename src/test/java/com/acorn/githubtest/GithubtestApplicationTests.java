package com.acorn.githubtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class GithubtestApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() throws Exception {

		this.mockMvc.perform(get("/api/content")).andDo(print()).andExpect(status().isOk());
	}

	@Test
	void contextDoesNotLoad() throws Exception {

		this.mockMvc.perform(get("/api/content/0")).andDo(print()).andExpect(status().is4xxClientError());
	}

}
