package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.catering.allowance.capacity.get.beta response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiCateringAllowanceCapacityGetBetaResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4275271188976971163L;

	/** 
	 * errcode
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * errmsg
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 餐补结果
	 */
	@ApiField("result")
	private CateringOpenGetDeductCapacityResponse result;


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

	public void setResult(CateringOpenGetDeductCapacityResponse result) {
		this.result = result;
	}
	public CateringOpenGetDeductCapacityResponse getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 餐补结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CateringOpenGetDeductCapacityResponse extends TaobaoObject {
		private static final long serialVersionUID = 3847317291137426917L;
		/**
		 * 可抵扣金额，单位为分
		 */
		@ApiField("deduct_capacity")
		private Long deductCapacity;
	
		public Long getDeductCapacity() {
			return this.deductCapacity;
		}
		public void setDeductCapacity(Long deductCapacity) {
			this.deductCapacity = deductCapacity;
		}
	}
	


}
