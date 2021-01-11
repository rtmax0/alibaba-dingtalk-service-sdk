package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.classconversation.asyncsend response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiEduClassconversationAsyncsendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5811559614617776368L;

	/** 
	 * result
	 */
	@ApiField("result")
	private DingOpenResult result;


	public void setResult(DingOpenResult result) {
		this.result = result;
	}
	public DingOpenResult getResult( ) {
		return this.result;
	}

	
	
	/**
	 * response
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class TopSendConversationMsgResponse extends TaobaoObject {
		private static final long serialVersionUID = 2579778513894351289L;
		/**
		 * 异步任务id
		 */
		@ApiField("task_id")
		private String taskId;
	
		public String getTaskId() {
			return this.taskId;
		}
		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}
	
	/**
	 * result
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DingOpenResult extends TaobaoObject {
		private static final long serialVersionUID = 7796742928847584641L;
		/**
		 * 错误码
		 */
		@ApiField("errcode")
		private Long errcode;
		/**
		 * 系统错误
		 */
		@ApiField("errmsg")
		private String errmsg;
		/**
		 * response
		 */
		@ApiField("response")
		private TopSendConversationMsgResponse response;
		/**
		 * 调用是否成功
		 */
		@ApiField("success")
		private Boolean success;
	
		public Long getErrcode() {
			return this.errcode;
		}
		public void setErrcode(Long errcode) {
			this.errcode = errcode;
		}
		public String getErrmsg() {
			return this.errmsg;
		}
		public void setErrmsg(String errmsg) {
			this.errmsg = errmsg;
		}
		public TopSendConversationMsgResponse getResponse() {
			return this.response;
		}
		public void setResponse(TopSendConversationMsgResponse response) {
			this.response = response;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}
	


}
