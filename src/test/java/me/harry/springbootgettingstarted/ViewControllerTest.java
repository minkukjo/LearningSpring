package me.harry.springbootgettingstarted;

import me.harry.springbootgettingstarted.controller.ViewController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ViewController.class)
public class ViewControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void viewTest() throws Exception {

        // 요청 "/"
        // 응답
        // - 모델 name : harry
        // - 뷰 이름 : main

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(view().name("main"))
                .andExpect(model().attribute("name",is("harry")));

    }
}
