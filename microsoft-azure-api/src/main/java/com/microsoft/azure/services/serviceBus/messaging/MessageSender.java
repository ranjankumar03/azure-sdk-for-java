package com.microsoft.azure.services.serviceBus.messaging;

import com.microsoft.azure.ServiceException;
import com.microsoft.azure.services.serviceBus.Message;


public interface MessageSender {
	void sendMessage(Message message) throws ServiceException;
	void sendMessage(Message message, SendMessageOptions options) throws ServiceException;
}
