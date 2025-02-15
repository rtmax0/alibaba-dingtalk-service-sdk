package com.dingtalk.api.request;

import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiCrmObjectmetaContactDescribeResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.crm.objectmeta.contact.describe request
 * 
 * @author top auto create
 * @since 1.0, 2020.06.04
 */
public class OapiCrmObjectmetaContactDescribeRequest extends BaseTaobaoRequest<OapiCrmObjectmetaContactDescribeResponse> {
	
	

	public String getApiMethodName() {
		return "dingtalk.oapi.crm.objectmeta.contact.describe";
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
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiCrmObjectmetaContactDescribeResponse> getResponseClass() {
		return OapiCrmObjectmetaContactDescribeResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}