package no.hvl.dat110.rpc.tests;

import RPC.*;

public class TestIntIntStub extends RPCLocalStub {
	
	public TestIntIntStub(RPCClient rpcclient) {
		super(rpcclient);
	}
	
	public int m(int x) {
				
		byte[] request = RPCUtils.marshallInteger(x);
		
		byte[] reply = rpcclient.call((byte)3,request);
		
		int xres = RPCUtils.unmarshallInteger(reply);
		
		return xres;
	}
}
