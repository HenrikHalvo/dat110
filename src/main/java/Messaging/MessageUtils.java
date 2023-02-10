package Messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class MessageUtils {

	public static final int SEGMENTSIZE = 128;

	public static int MESSAGINGPORT = 8080;
	public static String MESSAGINGHOST = "localhost";

	public static byte[] encapsulate(Message message) {
		
		byte[] segment = null;
		byte[] data;
		
		// encapulate/encode the payload data of the message and form a segment
		// according to the segment format for the messaging layer
		
		segment = new byte[SEGMENTSIZE];
		
		segment[0] = (byte) message.getData().length;
		for (int i = 0; i < message.getData().length; i++) {
			segment[i+1] = message.getData()[i];
		}
		
		return segment;
		
	}

	public static Message decapsulate(byte[] segment) {

		Message message = null;
		int length = segment[0];
		byte[] payload = new byte[length];
		
		for (int i = 0; i < length; i++) {
			payload[i] = segment[i+1];
		}
		message = new Message(payload);
		

		// decapsulate segment and put received payload data into a message

		
		return message;
		
}
}
	
