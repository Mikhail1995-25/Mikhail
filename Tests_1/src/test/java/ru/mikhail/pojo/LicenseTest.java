package ru.mikhail.pojo;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class LicenseTest {

    @Test
    public void eqName() {
        License product = new License();
        product.setCode("audio");
        License product1 = new License();
        product1.setCode("audio");
        assertThat(product, is(product1));
    }
}
