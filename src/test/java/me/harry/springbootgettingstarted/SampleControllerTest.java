package me.harry.springbootgettingstarted;

import me.harry.springbootgettingstarted.Sample.SampleService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleControllerTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    @MockBean
    SampleService mockSampleService;

    @DisplayName("컨트롤러 테스트")
    @Test
    public void hell() {
        when(mockSampleService.getName()).thenReturn("Harry");

        String result = testRestTemplate.getForObject("/hello", String.class);
        assertThat(result).isEqualTo("Hello Harry");
    }

}
