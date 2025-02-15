package com.dingtalk.api.request;

import com.dingtalk.api.DingTalkConstants;
import com.dingtalk.api.response.OapiProcessInstanceExecuteResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;

import java.util.Map;

/**
 * TOP DingTalk-API: dingtalk.oapi.processinstance.execute request
 * 
 * @author top auto create
 * @since 1.0, 2020.03.09
 */
public class OapiProcessInstanceExecuteRequest extends BaseTaobaoRequest<OapiProcessInstanceExecuteResponse> {
	
	

	/** 
	* 操作人id，通过dingtalk.smartwork.bpms.processinstance.get这个接口可以获取
	 */
	private String actionerUserid;

	/** 
	* 审批实例id
	 */
	private String processInstanceId;

	/** 
	* 操作评论，可为空
	 */
	private String remark;

	/** 
	* 审批操作，同意-agree，拒绝-refuse
	 */
	private String result;

	/** 
	* 任务节点id，dingtalk.smartwork.bpms.processinstance.get接口可获取
	 */
	private Long taskId;

	public void setActionerUserid(String actionerUserid) {
		this.actionerUserid = actionerUserid;
	}

	public String getActionerUserid() {
		return this.actionerUserid;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResult() {
		return this.result;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.processinstance.execute";
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
		txtParams.put("actioner_userid", this.actionerUserid);
		txtParams.put("process_instance_id", this.processInstanceId);
		txtParams.put("remark", this.remark);
		txtParams.put("result", this.result);
		txtParams.put("task_id", this.taskId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiProcessInstanceExecuteResponse> getResponseClass() {
		return OapiProcessInstanceExecuteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(actionerUserid, "actionerUserid");
		RequestCheckUtils.checkNotEmpty(processInstanceId, "processInstanceId");
		RequestCheckUtils.checkMaxLength(remark, 2000, "remark");
		RequestCheckUtils.checkNotEmpty(result, "result");
		RequestCheckUtils.checkNotEmpty(taskId, "taskId");
	}
	

}
