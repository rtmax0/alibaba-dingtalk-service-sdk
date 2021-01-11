package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.catering.coopcontact.get.beta response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCateringCoopcontactGetBetaResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5783535121229956484L;

	/** 
	 * 错误代码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 号码过期时间戳(毫秒)
	 */
	@ApiField("expiration")
	private Long expiration;

	/** 
	 * 临时隐私号
	 */
	@ApiField("pri_mobile")
	private String priMobile;

	/** 
	 * 是否成功
	 */
	@ApiField("success")
	private Boolean success;


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

	public void setExpiration(Long expiration) {
		this.expiration = expiration;
	}
	public Long getExpiration( ) {
		return this.expiration;
	}

	public void setPriMobile(String priMobile) {
		this.priMobile = priMobile;
	}
	public String getPriMobile( ) {
		return this.priMobile;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	


}
