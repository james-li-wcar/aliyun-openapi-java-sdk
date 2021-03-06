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

package com.aliyuncs.datav_outer.model.v20190402;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.datav_outer.transform.v20190402.BatchGetTemplateDataSourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchGetTemplateDataSourcesResponse extends AcsResponse {

	private String requestId;

	private List<TemplateInstance> templates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TemplateInstance> getTemplates() {
		return this.templates;
	}

	public void setTemplates(List<TemplateInstance> templates) {
		this.templates = templates;
	}

	public static class TemplateInstance {

		private String iD;

		private List<DataSourceItem> dataSource;

		public String getID() {
			return this.iD;
		}

		public void setID(String iD) {
			this.iD = iD;
		}

		public List<DataSourceItem> getDataSource() {
			return this.dataSource;
		}

		public void setDataSource(List<DataSourceItem> dataSource) {
			this.dataSource = dataSource;
		}

		public static class DataSourceItem {

			private String name;

			private String type;

			private String config;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getConfig() {
				return this.config;
			}

			public void setConfig(String config) {
				this.config = config;
			}
		}
	}

	@Override
	public BatchGetTemplateDataSourcesResponse getInstance(UnmarshallerContext context) {
		return	BatchGetTemplateDataSourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
