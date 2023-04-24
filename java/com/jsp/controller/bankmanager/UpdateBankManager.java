package com.jsp.controller.bankmanager;

import com.jsp.dto.BankManager;
import com.jsp.service.BankManagerService;

public class UpdateBankManager {

	public static void main(String[] args) {
		BankManager bankManager = new BankManager();
		bankManager.setName("kajol");
		bankManager.setEmail("kajol@gmail.com");
		bankManager.setPassword("kajol");
		bankManager.setStatus("Approved");

		BankManagerService bankManagerService = new BankManagerService();
		bankManagerService.updateBankManager(bankManager, 3);
	}

}
