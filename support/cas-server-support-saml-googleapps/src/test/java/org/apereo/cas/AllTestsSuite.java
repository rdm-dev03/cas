package org.apereo.cas;

import org.apereo.cas.support.saml.authentication.GoogleAppsSamlAuthenticationRequestTests;
import org.apereo.cas.support.saml.authentication.GoogleSaml20ObjectBuilderTests;
import org.apereo.cas.support.saml.authentication.principal.GoogleAccountsServiceFactoryTests;
import org.apereo.cas.support.saml.authentication.principal.GoogleAccountsServiceTests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
 * Test suite to run all SAML tests.
 *
 * @author Misagh Moayyed
 * @since 4.2.0
 */
@SelectClasses({
    GoogleAppsSamlAuthenticationRequestTests.class,
    GoogleAccountsServiceTests.class,
    GoogleAccountsServiceFactoryTests.class,
    GoogleSaml20ObjectBuilderTests.class
})
@RunWith(JUnitPlatform.class)
public class AllTestsSuite {
}
