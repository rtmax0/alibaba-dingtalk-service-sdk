package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.grade.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduGradeCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6631154935352617418L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果
	 */
	@ApiField("result")
	private OpenGradeCreateResponse result;

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

	public void setResult(OpenGradeCreateResponse result) {
		this.result = result;
	}
	public OpenGradeCreateResponse getResult( ) {
		return this.result;
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
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OpenGradeCreateResponse extends TaobaoObject {
		private static final long serialVersionUID = 2333788579131787654L;
		/**
		 * 年级id
		 */
		@ApiField("dept_id")
		private Long deptId;
	
		public Long getDeptId() {
			return this.deptId;
		}
		public void setDeptId(Long deptId) {
			this.deptId = deptId;
		}
	}
	


}
