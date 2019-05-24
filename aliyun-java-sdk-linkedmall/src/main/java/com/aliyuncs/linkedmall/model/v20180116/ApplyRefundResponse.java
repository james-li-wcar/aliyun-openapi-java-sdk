/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.ApplyRefundResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ApplyRefundResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private RefundApplicationData refundApplicationData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public RefundApplicationData getRefundApplicationData() {
		return this.refundApplicationData;
	}

	public void setRefundApplicationData(RefundApplicationData refundApplicationData) {
		this.refundApplicationData = refundApplicationData;
	}

	public static class RefundApplicationData {

		private String subLmOrderId;

		private Integer disputeStatus;

		private Integer disputeType;

		public String getSubLmOrderId() {
			return this.subLmOrderId;
		}

		public void setSubLmOrderId(String subLmOrderId) {
			this.subLmOrderId = subLmOrderId;
		}

		public Integer getDisputeStatus() {
			return this.disputeStatus;
		}

		public void setDisputeStatus(Integer disputeStatus) {
			this.disputeStatus = disputeStatus;
		}

		public Integer getDisputeType() {
			return this.disputeType;
		}

		public void setDisputeType(Integer disputeType) {
			this.disputeType = disputeType;
		}
	}

	@Override
	public ApplyRefundResponse getInstance(UnmarshallerContext context) {
		return	ApplyRefundResponseUnmarshaller.unmarshall(this, context);
	}
}
