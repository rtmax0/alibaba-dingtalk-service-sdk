package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.smartwork.hrm.roster.meta.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiSmartworkHrmRosterMetaGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8235918935769485975L;

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
	 * 花名册分组定义
	 */
	@ApiListField("result")
	@ApiField("group_meta_info")
	private List<GroupMetaInfo> result;

	/** 
	 * 服务调用成功
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

	public void setResult(List<GroupMetaInfo> result) {
		this.result = result;
	}
	public List<GroupMetaInfo> getResult( ) {
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
	 * 花名册分组内字段定义
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class FieldMetaInfo extends TaobaoObject {
		private static final long serialVersionUID = 1279854515555654475L;
		/**
		 * 是否衍生字段(比如司龄、年龄等系统计算的字段)
		 */
		@ApiField("derived")
		private Boolean derived;
		/**
		 * 字段标识
		 */
		@ApiField("field_code")
		private String fieldCode;
		/**
		 * 字段名称
		 */
		@ApiField("field_name")
		private String fieldName;
	
		public Boolean getDerived() {
			return this.derived;
		}
		public void setDerived(Boolean derived) {
			this.derived = derived;
		}
		public String getFieldCode() {
			return this.fieldCode;
		}
		public void setFieldCode(String fieldCode) {
			this.fieldCode = fieldCode;
		}
		public String getFieldName() {
			return this.fieldName;
		}
		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}
	}
	
	/**
	 * 花名册分组定义
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class GroupMetaInfo extends TaobaoObject {
		private static final long serialVersionUID = 5379266392893359579L;
		/**
		 * 分组是否支持明细
		 */
		@ApiField("detail")
		private Boolean detail;
		/**
		 * 花名册分组内字段定义
		 */
		@ApiListField("field_meta_info_list")
		@ApiField("field_meta_info")
		private List<FieldMetaInfo> fieldMetaInfoList;
		/**
		 * 分组标识
		 */
		@ApiField("group_id")
		private String groupId;
		/**
		 * 分组名称
		 */
		@ApiField("group_name")
		private String groupName;
	
		public Boolean getDetail() {
			return this.detail;
		}
		public void setDetail(Boolean detail) {
			this.detail = detail;
		}
		public List<FieldMetaInfo> getFieldMetaInfoList() {
			return this.fieldMetaInfoList;
		}
		public void setFieldMetaInfoList(List<FieldMetaInfo> fieldMetaInfoList) {
			this.fieldMetaInfoList = fieldMetaInfoList;
		}
		public String getGroupId() {
			return this.groupId;
		}
		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}
		public String getGroupName() {
			return this.groupName;
		}
		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
	}
	


}
