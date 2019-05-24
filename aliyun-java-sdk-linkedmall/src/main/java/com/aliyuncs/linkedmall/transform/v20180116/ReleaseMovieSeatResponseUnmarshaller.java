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

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.ReleaseMovieSeatResponse;
import com.aliyuncs.linkedmall.model.v20180116.ReleaseMovieSeatResponse.ActionResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReleaseMovieSeatResponseUnmarshaller {

	public static ReleaseMovieSeatResponse unmarshall(ReleaseMovieSeatResponse releaseMovieSeatResponse, UnmarshallerContext context) {
		
		releaseMovieSeatResponse.setRequestId(context.stringValue("ReleaseMovieSeatResponse.RequestId"));
		releaseMovieSeatResponse.setCode(context.stringValue("ReleaseMovieSeatResponse.Code"));
		releaseMovieSeatResponse.setMessage(context.stringValue("ReleaseMovieSeatResponse.Message"));
		releaseMovieSeatResponse.setSubCode(context.stringValue("ReleaseMovieSeatResponse.SubCode"));
		releaseMovieSeatResponse.setSubMessage(context.stringValue("ReleaseMovieSeatResponse.SubMessage"));
		releaseMovieSeatResponse.setLogsId(context.stringValue("ReleaseMovieSeatResponse.LogsId"));
		releaseMovieSeatResponse.setSuccess(context.booleanValue("ReleaseMovieSeatResponse.Success"));

		ActionResult actionResult = new ActionResult();
		actionResult.setReturnCode(context.stringValue("ReleaseMovieSeatResponse.ActionResult.ReturnCode"));
		actionResult.setReturnValue(context.stringValue("ReleaseMovieSeatResponse.ActionResult.ReturnValue"));
		actionResult.setReturnMessage(context.stringValue("ReleaseMovieSeatResponse.ActionResult.ReturnMessage"));
		releaseMovieSeatResponse.setActionResult(actionResult);
	 
	 	return releaseMovieSeatResponse;
	}
}