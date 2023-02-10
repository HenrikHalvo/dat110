package SystemDisplay;

import RPC.RPCServer;
import SystemController.Common;

public class DisplayDevice {
	
public static void main(String[] args) {
		
		System.out.println("Display server starting ...");
		
		// TODO - START
		// implement the operation of the display RPC server
		// see how this is done for the sensor RPC server in SensorDevice
				
		RPCServer displayserver = new RPCServer(Common.DISPLAYPORT);
		
		DisplayImpl display = new DisplayImpl((byte)Common.WRITE_RPCID, displayserver);
		
		displayserver.run();
		displayserver.stop();

		
		// TODO - END
		
		System.out.println("Display server stopping ...");
		
	}

}
