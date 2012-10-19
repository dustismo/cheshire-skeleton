/**
 * 
 */
package com.trendrr.cheshire.controllers.api;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.trendrr.cheshire.CheshireApi;
import com.trendrr.cheshire.CheshireApiController;
import com.trendrr.oss.DynMap;


/*//
 * 
 * @description Simple ping
 * 
 */
@CheshireApi(
	route = "/ping",
	authenticate = false
)
public class PingController extends CheshireApiController {

	protected static Log log = LogFactory.getLog(PingController.class);
	
	public void handleGET(DynMap params) throws Exception {
		this.setData("PONG");
	}
}
