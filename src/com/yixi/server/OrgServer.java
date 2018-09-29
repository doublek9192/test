package com.yixi.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import com.sun.net.httpserver.HttpServer;
public class OrgServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetSocketAddress address = new InetSocketAddress("0.0.0.0", 10002);
		HttpServer server = null;
		try {
			server = HttpServer.create(address, 10);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (server == null) {
			System.out.println("server error");
		}
		server.createContext("/", new Handlers());
		server.setExecutor(Executors.newCachedThreadPool());
		server.start();
		System.out.println("agent_server is listening on port 10002"); 
	}

}
