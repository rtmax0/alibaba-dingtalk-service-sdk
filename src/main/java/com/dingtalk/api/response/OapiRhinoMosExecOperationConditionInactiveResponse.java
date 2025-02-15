package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.operation.condition.inactive response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosExecOperationConditionInactiveResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1476688389472771325L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 错误信息
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * 返回结果
	 */
	@ApiField("model")
	private Boolean model;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setExternalMsgInfo(String externalMsgInfo) {
		this.externalMsgInfo = externalMsgInfo;
	}
	public String getExternalMsgInfo( ) {
		return this.externalMsgInfo;
	}

	public void setModel(Boolean model) {
		this.model = model;
	}
	public Boolean getModel( ) {
		return this.model;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
