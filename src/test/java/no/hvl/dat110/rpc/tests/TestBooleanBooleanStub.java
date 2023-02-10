package no.hvl.dat110.rpc.tests;

import RPC.*;

public class TestBooleanBooleanStub extends RPCLocalStub {
	
	public TestBooleanBooleanStub(RPCClient rpcclient) {
		super(rpcclient);
	}
	
	public boolean m(boolean b) {
		
		byte[] request = RPCUtils.marshallBoolean(b);
		
		byte[] reply = rpcclient.call((byte)4,request);
		
		boolean bres = RPCUtils.unmarshallBoolean(reply);
		
		return bres;
	}
	
}
