package RPC;


public abstract class RPCRemoteImpl {

	public RPCRemoteImpl(byte rpcid, RPCServer rpcserver) {
		rpcserver.register(rpcid, this);
	}

	// method that will be invoked by the server
	// params
	public abstract byte[] invoke(byte[] params);
}
