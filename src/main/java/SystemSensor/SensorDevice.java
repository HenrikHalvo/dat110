package SystemSensor;

import RPC.RPCServer;
import SystemController.Common;


public class SensorDevice {
	
	public static void main(String[] args) {

		System.out.println("Sensor server starting ...");
		
		RPCServer sensorserver = new RPCServer(Common.SENSORPORT);

		SensorImpl sensor = new SensorImpl((byte)Common.READ_RPCID,sensorserver);
		
		sensorserver.run();
		
		sensorserver.stop();
		
		System.out.println("Sensor server stopping ...");
		
	}

}
