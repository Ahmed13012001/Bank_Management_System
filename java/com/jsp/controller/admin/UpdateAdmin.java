package com.jsp.controller.admin;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class UpdateAdmin {

	public static void main(String[] args) {

		Admin admin = new Admin();
		admin.setName("osama");
		admin.setEmail("osama@gmail.com");
		admin.setPassword("osama786");

		AdminService adminService = new AdminService();
		adminService.updateAdmin(admin, 2);

	}

}
