import java.util.Date;

import javax.xml.bind.annotation.XmlType;

public class TansactionDetail {

	private Date transactionTimestamp;
	private Integer applicationID;
	
	public Date getTransactionTimestamp() {
		return transactionTimestamp;
	}
	public void setTransactionTimestamp(Date transactionTimestamp) {
		this.transactionTimestamp = transactionTimestamp;
	}
	public Integer getApplicationID() {
		return applicationID;
	}
	public void setApplicationID(Integer applicationID) {
		this.applicationID = applicationID;
	}
	
}
