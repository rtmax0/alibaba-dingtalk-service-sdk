package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.join response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduCourseJoinResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7848288565819966541L;

	/** 
	 * dingOpenErrcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private JoinCourseResponse result;

	/** 
	 * success
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

	public void setResult(JoinCourseResponse result) {
		this.result = result;
	}
	public JoinCourseResponse getResult( ) {
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
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class JoinCourseResponse extends TaobaoObject {
		private static final long serialVersionUID = 8623343166419416335L;
		/**
		 * 加入链接
		 */
		@ApiField("join_url")
		private String joinUrl;
		/**
		 * 是否可加入
		 */
		@ApiField("joinable")
		private Boolean joinable;
	
		public String getJoinUrl() {
			return this.joinUrl;
		}
		public void setJoinUrl(String joinUrl) {
			this.joinUrl = joinUrl;
		}
		public Boolean getJoinable() {
			return this.joinable;
		}
		public void setJoinable(Boolean joinable) {
			this.joinable = joinable;
		}
	}
	


}
