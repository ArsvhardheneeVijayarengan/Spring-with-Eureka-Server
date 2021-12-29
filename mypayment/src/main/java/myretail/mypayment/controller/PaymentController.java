package myretail.mypayment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import myretail.mypayment.pojo.PaymentPojo;


@RestController
@RequestMapping("/api/payment")
public class PaymentController {

	@GetMapping(value = "/getpaymentdetail")
	public PaymentPojo getPaymentDetail() {

		PaymentPojo paymentPojo = new PaymentPojo();
		paymentPojo.setPaymentId(23);
		paymentPojo.setPaymentAmount(2500);
		paymentPojo.setPaymentType("Netbanking");

		return paymentPojo;
	}

}
