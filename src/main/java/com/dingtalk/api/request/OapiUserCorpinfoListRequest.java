package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiUserCorpinfoListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.user.corpinfo.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.01.20
 */
public class OapiUserCorpinfoListRequest extends BaseTaobaoRequest<OapiUserCorpinfoListResponse> {
	
	

	/** 
	* 企业全称
	 */
	private String corpName;

	/** 
	* 用户手机号
	 */
	private String mobile;

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getCorpName() {
		return this.corpName;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobile() {
		return this.mobile;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.user.corpinfo.list";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("corp_name", this.corpName);
		txtParams.put("mobile", this.mobile);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiUserCorpinfoListResponse> getResponseClass() {
		return OapiUserCorpinfoListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(corpName, "corpName");
		RequestCheckUtils.checkNotEmpty(mobile, "mobile");
	}
	

}