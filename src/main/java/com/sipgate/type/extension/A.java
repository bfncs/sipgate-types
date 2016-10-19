package com.sipgate.type.extension;

import com.sipgate.type.user.MasterSipid;

import static com.sipgate.type.extension.ExtensionType.A;

public final class A extends Extension
{
	static final String DESCRIPTION = "Application Extension For CallAPID";

	A(MasterSipid masterSipid, String id)
	{
		super(masterSipid, A, id);
	}

	@Override
	public String getDescription()
	{
		return DESCRIPTION;
	}
}