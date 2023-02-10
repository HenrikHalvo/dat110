package SystemSensor;

import RPC.RPCRemoteImpl;
import RPC.RPCServer;
import RPC.RPCUtils;

public class SensorImpl extends RPCRemoteImpl {
	
	static final int RANGE = 20;

	public SensorImpl(byte rpcid, RPCServer rpcserver) {
		super(rpcid,rpcserver);
	}

	// implementation of the RPC method
	public int read() {

		long seconds = System.currentTimeMillis();

		double temp = RANGE * Math.sin(seconds / 1000);

		System.out.println("READ:" + temp);
		
		return (int) Math.ceil(temp);
	}

	// called by RPC server on rpc identifier corresponding to read
	public byte[] invoke(byte[] param) {
				
		RPCUtils.unmarshallVoid(param);
		
		int temp = read();
				
		byte[] returnval = RPCUtils.marshallInteger(temp); 
		
		return returnval;
	}

}
