package Transformation;

import cucumber.api.Transformer;

public class EmailConvert extends Transformer<String> {

    @Override
    public String transform(String Username) {
        return Username.concat("@gmail.com");

    }
}
