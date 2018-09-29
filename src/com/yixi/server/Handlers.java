package com.yixi.server;

import java.io.IOException;

import org.json.JSONObject;

import com.yixi.info.ResultInfo;
import com.yixi.serverinterface.*;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class Handlers implements HttpHandler,Organization{

	@Override
	public void handle(HttpExchange arg0) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ResultInfo addOrg(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

}
