package Transformation;

import cucumber.api.Transformer;

public class AmounttodigitConvert extends Transformer<Integer> {

    @Override
    public Integer transform(String salary) {
        return salary.length();

    }
}
