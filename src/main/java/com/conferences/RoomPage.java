package com.conferences;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class RoomPage extends WebPage{
	
	private EnterRoomPanel enterRoomPanel;
	private Component roomPanel;
	

	
	public RoomPage(PageParameters parameters) {
	 
		String roomName = parameters.get("roomName").toString();
		
 
		add(enterRoomPanel = new EnterRoomPanel("enterRoom", roomName));
	 
		add(roomPanel = new RoomPanel("room",  enterRoomPanel.getSelectedRoom()));
	 
		
		/*if(parameters.isEmpty()) {
			roomPanel.setVisible(false);
		}*/
	}
	
 

}
