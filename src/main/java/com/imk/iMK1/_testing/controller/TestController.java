package com.imk.iMK1._testing.controller;

import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imk.iMK1._testing.helper.ZXingHelper;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public String getHome() {
		return "Home";
	}
	@RequestMapping("/admin")
	 public String getAdminForCustomerDetails() {
		 return "Admin";
	 }
	@RequestMapping("/customer/{customer-no}")
	 public void getCustomerDetails(@PathVariable("customer-no") String CustomerMobile, HttpServletResponse response) throws Exception {
		response.setContentType("image/png");
		OutputStream outputStream = response.getOutputStream();
		outputStream.write(ZXingHelper.getQRCodeImage(CustomerMobile, 400, 400));
		outputStream.flush();
		outputStream.close();
	 }
}
