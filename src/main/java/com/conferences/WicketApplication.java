package com.conferences;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.resource.CompositeJavaScriptCompressor;
import org.apache.wicket.resource.CssUrlReplacer;

/**
 * Application object for your web application.
 * If you want to run this application without deploying, run the Start class.
 * 
 * @see com.avaca.conferences.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{
  
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return RoomPage.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init()
	{
		super.init();

	    mountPage("/#{roomName}", RoomPage.class); 
	    getResourceSettings().setCssCompressor(new CssUrlReplacer());
	    getResourceSettings().setJavaScriptCompressor(new CompositeJavaScriptCompressor());

	}
 
 
}
