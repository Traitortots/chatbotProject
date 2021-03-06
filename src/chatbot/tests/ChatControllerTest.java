package chatbot.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import chatbot.controller.ChatbotController;
import chatbot.view.*;;


public class ChatControllerTest
{
	private ChatbotController testController;

	@Before
	public void setUp() throws Exception
	{
		testController = new ChatbotController();
	}

	@After
	public void tearDown() throws Exception
	{
		testController = null;
	}

	@Test
	public void testChatController()
	{
		assertNotNull("Data member not initialized", testController.getMyBot());
		assertNotNull("Data member not initialized", testController.getChatView());
		assertTrue("Wrong display type", (testController.getChatView() instanceof ChatView));
		assertTrue("Wrong Frame type",(testController.getBaseFrame() instanceof ChatFrame));
		assertSame("Wrong controller", testController, testController.getBaseFrame().getBaseController());
	}
	
	
	

}
