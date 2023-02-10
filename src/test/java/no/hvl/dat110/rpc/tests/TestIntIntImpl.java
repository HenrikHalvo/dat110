package no.hvl.dat110.rpc.tests;

import RPC.*;

public class TestIntIntImpl extends RPCRemoteImpl {

	public TestIntIntImpl(byte rpcid, RPCServer rpcserver) {
		super(rpcid,rpcserver);
	}
	
	public byte[] invoke(byte[] request) {
		
		int x = RPCUtils.unmarshallInteger(request);
		
		int resx = m(x);
		
		byte[] reply = RPCUtils.marshallInteger(resx);
		
		return reply;
	}
	
	public int m(int x) {
		System.out.println("int m("+x+") executed");
		return x;
	} 
}
