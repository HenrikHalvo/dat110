package no.hvl.dat110.rpc.tests;

import RPC.*;

public class TestStringStringStub extends RPCLocalStub {

	public TestStringStringStub(RPCClient rpcclient) {
		super(rpcclient);
	}
	
	public String m(String str) {
		
		byte[] request = RPCUtils.marshallString(str);
		
		byte[] reply = rpcclient.call((byte)2,request);
		
		String strres = RPCUtils.unmarshallString(reply);
		
		return strres;
	}
}
