package RPC;

import java.nio.ByteBuffer;
import java.util.Arrays;
import no.hvl.dat110.TODO;

public class RPCUtils {
	
	public static byte[] encapsulate(byte rpcid, byte[] payload) {
		
		byte[] rpcmsg = new byte[payload.length + 1];
		
		rpcmsg[0] = rpcid;
		for (int i = 0; i < payload.length; i ++){
			rpcmsg[i +1] = payload[i];
		}
		
		// Encapsulate the rpcid and payload in a byte array according to the RPC message syntax / format
		
		return rpcmsg;
	}
	
	public static byte[] decapsulate(byte[] rpcmsg) {
		
		byte[] payload = new byte[rpcmsg.length - 1];
		
		// Decapsulate the rpcid and payload in a byte array according to the RPC message syntax
		
		for (int i = 0; i < rpcmsg.length -1; i++) {
			payload[i] = rpcmsg[i+1];
		}
		
		return payload;
		
	}

	// convert String to byte array
	public static byte[] marshallString(String str) {
		
		byte[] encoded = new byte[str.getBytes().length];
		
		encoded = str.getBytes();
		System.out.println(new String(encoded));
		
		return encoded;
	}

	// convert byte array to a String
	public static String unmarshallString(byte[] data) {
		
		String decoded = null;
		
		decoded = new String(data);
		
		return decoded;
	}
	
	public static byte[] marshallVoid() {
		
		byte[] encoded = new byte[1];
		
		return encoded;
		
	}
	
	public static void unmarshallVoid(byte[] data) {
		
			
		
	}

	// convert boolean to a byte array representation
	public static byte[] marshallBoolean(boolean b) {
		
		byte[] encoded = new byte[1];
				
		if (b) {
			encoded[0] = 1;
		} else
		{
			encoded[0] = 0;
		}
		
		return encoded;
	}

	// convert byte array to a boolean representation
	public static boolean unmarshallBoolean(byte[] data) {
		
		return (data[0] > 0);
		
	}

	// integer to byte array representation
	public static byte[] marshallInteger(int x) {
		
		byte[] encoded = ByteBuffer.allocate(4).putInt(x).array();
		
		return encoded;
	}
	
	// byte array representation to integer
	public static int unmarshallInteger(byte[] data) {
		
		int decoded = ByteBuffer.wrap(data).getInt();
		
		return decoded;
		
	}
}