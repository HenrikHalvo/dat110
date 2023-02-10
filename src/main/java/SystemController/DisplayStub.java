package SystemController;

import RPC.RPCClient;
import RPC.RPCLocalStub;
import RPC.RPCUtils;

public class DisplayStub extends RPCLocalStub {
	
	private byte RPCIDDISPLAY = 2;
	

	public DisplayStub(RPCClient rpcclient) {
		super(rpcclient);
	}
	
	public void write (String message) {
		
		
		// implement marshalling, call and unmarshalling for write RPC method
		byte[] request = RPCUtils.marshallString(message);
		byte[] reply = rpcclient.call(RPCIDDISPLAY,request);
		RPCUtils.unmarshallVoid(reply);
		
		
	}

}
