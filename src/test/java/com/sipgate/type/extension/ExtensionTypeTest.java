package com.sipgate.type.extension;

import org.junit.Test;

import static java.text.MessageFormat.format;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ExtensionTypeTest
{

	@Test
	public void testEnumToExtensionMapping()
	{
		for (final ExtensionType type : ExtensionType.values())
		{
			assertThat(format("Checking type mapping for type {0}:", type), type.buildExtension("1234567", "1").getClass().getSimpleName(), is(type.toString()));
		}
	}

	@Test
	public void testToString()
	{
		for (final ExtensionType type : ExtensionType.values())
		{
			assertThat(format("Checking toString for type {0}:", type), type.buildExtension("1234567", "1").toString(), is(format("1234567{0}1", type.toString().toLowerCase())));
		}
	}
}
