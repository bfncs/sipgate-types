package com.sipgate.type.extension;

import com.sipgate.type.user.MasterSipid;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isA;
import static org.junit.Assert.assertThat;

public class ExtensionTest
{

	@Test
	public void testParseExtensionHandlesInvalidInput()
	{
		assertThat(Extension.parse("1234567").isPresent(), is(false));
		assertThat(Extension.parse("1234567v").isPresent(), is(false));
		assertThat(Extension.parse("1234567a0").isPresent(), is(true));
		assertThat(Extension.parse("12345678a0").isPresent(), is(false));
	}

	@Test
	public void testParseExtensionHandlesValidInput()
	{
		assertThat((W) Extension.parse("1234567w0").get(), isA(W.class));
		assertThat((V) Extension.parse("1234567v0").get(), isA(V.class));
	}

	@Test
	public void testApiUsage() throws Exception
	{
//		final Extension build = Extension.build("1000000", ExtensionType.V, "2");
		final Extension build = Extension.parse("1234567w12").get();

		System.out.println(Extension.buildV(MasterSipid.of("1000000"), "321"));

		System.out.println(build);
	}
}
