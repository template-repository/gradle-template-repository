package com.github.romankh3.gradlerepositorytemplate;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit-level testing for {@link JavaRepositoryTemplateMain} object.
 */
public class JavaRepositoryTemplateMainTest {

    @Test
    public void shouldCreateJavaRepositoryTemplateMain() {
        JavaRepositoryTemplateMain main = new JavaRepositoryTemplateMain();
        Assert.assertNotNull(main);
    }

}
