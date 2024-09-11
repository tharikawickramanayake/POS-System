package io.java.springbootstarter.DTO;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentDTO {

	    private Long id;
	    private BigDecimal amount;
	    private String paymentMethod;
	    private String paymentStatus;
	    private LocalDateTime paymentDate;
	    private Long orderId;

	    // Constructors
	    public PaymentDTO() {}

	    public PaymentDTO(Long id, BigDecimal amount, String paymentMethod, String paymentStatus, LocalDateTime paymentDate, Long orderId) {
	        this.id = id;
	        this.amount = amount;
	        this.paymentMethod = paymentMethod;
	        this.paymentStatus = paymentStatus;
	        this.paymentDate = paymentDate;
	        this.orderId = orderId;
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public BigDecimal getAmount() {
			return amount;
		}

		public void setAmount(BigDecimal amount) {
			this.amount = amount;
		}

		public String getPaymentMethod() {
			return paymentMethod;
		}

		public void setPaymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
		}

		public String getPaymentStatus() {
			return paymentStatus;
		}

		public void setPaymentStatus(String paymentStatus) {
			this.paymentStatus = paymentStatus;
		}

		public LocalDateTime getPaymentDate() {
			return paymentDate;
		}

		public void setPaymentDate(LocalDateTime paymentDate) {
			this.paymentDate = paymentDate;
		}

		public Long getOrderId() {
			return orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

	     
	}

