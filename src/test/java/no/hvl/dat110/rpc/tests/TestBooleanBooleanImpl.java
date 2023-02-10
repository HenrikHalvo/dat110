package no.hvl.dat110.rpc.tests;

import RPC.*;

public class TestBooleanBooleanImpl extends RPCRemoteImpl {

	public TestBooleanBooleanImpl(byte rpcid, RPCServer rpcserver) {
		super(rpcid,rpcserver);
	}
	
	public byte[] invoke(byte[] request) {

		boolean b = RPCUtils.unmarshallBoolean(request);

		boolean resb = m(b);

		byte[] reply = RPCUtils.marshallBoolean(resb);

		return reply;
	}

	public boolean m(boolean b) {
		System.out.println("boolean m(" + b + ") executed");
		return (!b);
	}
}
