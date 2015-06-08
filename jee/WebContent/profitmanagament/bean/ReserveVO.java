package nailro.com.profitmanagament.bean;

import java.util.Date;


class ReserveVO{
	private String reserveNum ; // 예매번호
	private Date date ; // 예매일
	private String startDate ; // 출발일시
	private String destinationDate ; // 도착일시
    //출발역 도착역
    private String  start_station;
    private String  end_station;
	//결제
	private int pay ; // 결제금액
	private String payType ; // 결제종류
	private String accountNum ; // 계좌번호
	//수익관리
	private int amount;
	private int use_count;
	
	
	public String getReserveNum() {
		return reserveNum;
	}
	public void setReserveNum(String reserveNum) {
		this.reserveNum = reserveNum;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getDestinationDate() {
		return destinationDate;
	}
	public void setDestinationDate(String destinationDate) {
		this.destinationDate = destinationDate;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
}