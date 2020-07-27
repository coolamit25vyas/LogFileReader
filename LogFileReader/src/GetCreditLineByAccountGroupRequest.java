import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement  
public class GetCreditLineByAccountGroupRequest {
	
	private TansactionDetail tansactionDetail;
	private RequestContext requestContext;
	private FinancialContext financialContext;
	private InfoTypes infoTypes;
	public TansactionDetail getTansactionDetail() {
		return tansactionDetail;
	}
	public void setTansactionDetail(TansactionDetail tansactionDetail) {
		this.tansactionDetail = tansactionDetail;
	}
	public RequestContext getRequestContext() {
		return requestContext;
	}
	public void setRequestContext(RequestContext requestContext) {
		this.requestContext = requestContext;
	}
	public FinancialContext getFinancialContext() {
		return financialContext;
	}
	public void setFinancialContext(FinancialContext financialContext) {
		this.financialContext = financialContext;
	}
	public InfoTypes getInfoTypes() {
		return infoTypes;
	}
	public void setInfoTypes(InfoTypes infoTypes) {
		this.infoTypes = infoTypes;
	}
	
	
}