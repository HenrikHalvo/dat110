package SystemDisplay;

import no.hvl.dat110.TODO;
import RPC.RPCRemoteImpl;
import RPC.RPCServer;

public class DisplayImpl extends RPCRemoteImpl {

	public DisplayImpl(byte rpcid, RPCServer rpcserver) {
		super(rpcid,rpcserver);
	}

	public void write(String message) {
		System.out.println("DISPLAY:" + message);
	}
	
	public byte[] invoke(byte[] param) {
		
		byte[] returnval = null;
		
		// TODO - START: 
		// implement unmarshalling, call, and marshall for write RPC method
		// look at how this is done in the SensorImpl class for the read method
		
		if (true)
			throw new UnsupportedOperationException(TODO.method());
		
		// TODO - END
		
		return returnval;
	}

}
