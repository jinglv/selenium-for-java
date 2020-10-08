package testframwork;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * @author jingLv
 * @date 2020-06-18 5:52 下午
 */
public class BasePage {

    public UiAuto load(String path) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        UiAuto uiAuto = null;
        try {
            uiAuto = mapper.readValue(
                    BasePage.class.getResource(path),
                    UiAuto.class
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        return uiAuto;
    }

    @Test
    public void test() throws JsonProcessingException {
        BasePage page = new BasePage();
        UiAuto uiAuto = page.load("/testframwork/uiauto.yaml");
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(uiAuto));
    }
}
