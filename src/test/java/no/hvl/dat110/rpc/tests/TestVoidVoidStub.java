package no.hvl.dat110.rpc.tests;

import RPC.*;

public class TestVoidVoidStub extends RPCLocalStub {

	public TestVoidVoidStub (RPCClient rpcclient) {
		super(rpcclient);
	}
	
	public void m() {
		
		byte[] request = RPCUtils.marshallVoid();
		
		byte[] reply = rpcclient.call((byte)1,request);
		
		RPCUtils.unmarshallVoid(reply);
		
	}
}
