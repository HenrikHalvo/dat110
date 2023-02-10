package SystemController;

import RPC.RPCClient;
import RPC.RPCLocalStub;
import RPC.RPCUtils;


public class SensorStub extends RPCLocalStub {
	

	public SensorStub(RPCClient rpcclient) {
		super(rpcclient);
	}

	public int read() {

		// marshall parameter to read call (void parameter)
		byte[] request = RPCUtils.marshallVoid();

		// make remote procedure call for read
		byte[] response = rpcclient.call((byte)Common.READ_RPCID, request);

		// unmarshall the return value from the call (an integer)
		int temp = RPCUtils.unmarshallInteger(response);

		return temp;
	}

}
