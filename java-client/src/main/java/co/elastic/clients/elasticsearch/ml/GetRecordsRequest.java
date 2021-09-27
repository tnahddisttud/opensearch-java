/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.get_records.Request
@JsonpDeserializable
public final class GetRecordsRequest extends RequestBase implements JsonpSerializable {
	private final String jobId;

	@Nullable
	private final Integer from;

	@Nullable
	private final Integer size;

	@Nullable
	private final Boolean desc;

	@Nullable
	private final Boolean excludeInterim;

	@Nullable
	private final Page page;

	@Nullable
	private final Double recordScore;

	@Nullable
	private final String sort;

	@Nullable
	private final String start;

	@Nullable
	private final String end;

	// ---------------------------------------------------------------------------------------------

	public GetRecordsRequest(Builder builder) {

		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.from = builder.from;
		this.size = builder.size;
		this.desc = builder.desc;
		this.excludeInterim = builder.excludeInterim;
		this.page = builder.page;
		this.recordScore = builder.recordScore;
		this.sort = builder.sort;
		this.start = builder.start;
		this.end = builder.end;

	}

	/**
	 * The ID of the job
	 * <p>
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * skips a number of records
	 * <p>
	 * API name: {@code from}
	 */
	@Nullable
	public Integer from() {
		return this.from;
	}

	/**
	 * specifies a max number of records to get
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public Integer size() {
		return this.size;
	}

	/**
	 * API name: {@code desc}
	 */
	@Nullable
	public Boolean desc() {
		return this.desc;
	}

	/**
	 * API name: {@code exclude_interim}
	 */
	@Nullable
	public Boolean excludeInterim() {
		return this.excludeInterim;
	}

	/**
	 * API name: {@code page}
	 */
	@Nullable
	public Page page() {
		return this.page;
	}

	/**
	 * API name: {@code record_score}
	 */
	@Nullable
	public Double recordScore() {
		return this.recordScore;
	}

	/**
	 * API name: {@code sort}
	 */
	@Nullable
	public String sort() {
		return this.sort;
	}

	/**
	 * API name: {@code start}
	 */
	@Nullable
	public String start() {
		return this.start;
	}

	/**
	 * API name: {@code end}
	 */
	@Nullable
	public String end() {
		return this.end;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.desc != null) {

			generator.writeKey("desc");
			generator.write(this.desc);

		}
		if (this.excludeInterim != null) {

			generator.writeKey("exclude_interim");
			generator.write(this.excludeInterim);

		}
		if (this.page != null) {

			generator.writeKey("page");
			this.page.serialize(generator, mapper);

		}
		if (this.recordScore != null) {

			generator.writeKey("record_score");
			generator.write(this.recordScore);

		}
		if (this.sort != null) {

			generator.writeKey("sort");
			generator.write(this.sort);

		}
		if (this.start != null) {

			generator.writeKey("start");
			generator.write(this.start);

		}
		if (this.end != null) {

			generator.writeKey("end");
			generator.write(this.end);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetRecordsRequest}.
	 */
	public static class Builder implements ObjectBuilder<GetRecordsRequest> {
		private String jobId;

		@Nullable
		private Integer from;

		@Nullable
		private Integer size;

		@Nullable
		private Boolean desc;

		@Nullable
		private Boolean excludeInterim;

		@Nullable
		private Page page;

		@Nullable
		private Double recordScore;

		@Nullable
		private String sort;

		@Nullable
		private String start;

		@Nullable
		private String end;

		/**
		 * The ID of the job
		 * <p>
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * skips a number of records
		 * <p>
		 * API name: {@code from}
		 */
		public Builder from(@Nullable Integer value) {
			this.from = value;
			return this;
		}

		/**
		 * specifies a max number of records to get
		 * <p>
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Integer value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code desc}
		 */
		public Builder desc(@Nullable Boolean value) {
			this.desc = value;
			return this;
		}

		/**
		 * API name: {@code exclude_interim}
		 */
		public Builder excludeInterim(@Nullable Boolean value) {
			this.excludeInterim = value;
			return this;
		}

		/**
		 * API name: {@code page}
		 */
		public Builder page(@Nullable Page value) {
			this.page = value;
			return this;
		}

		/**
		 * API name: {@code page}
		 */
		public Builder page(Function<Page.Builder, ObjectBuilder<Page>> fn) {
			return this.page(fn.apply(new Page.Builder()).build());
		}

		/**
		 * API name: {@code record_score}
		 */
		public Builder recordScore(@Nullable Double value) {
			this.recordScore = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(@Nullable String value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code start}
		 */
		public Builder start(@Nullable String value) {
			this.start = value;
			return this;
		}

		/**
		 * API name: {@code end}
		 */
		public Builder end(@Nullable String value) {
			this.end = value;
			return this;
		}

		/**
		 * Builds a {@link GetRecordsRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetRecordsRequest build() {

			return new GetRecordsRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetRecordsRequest}
	 */
	public static final JsonpDeserializer<GetRecordsRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetRecordsRequest::setupGetRecordsRequestDeserializer, Builder::build);

	protected static void setupGetRecordsRequestDeserializer(DelegatingDeserializer<GetRecordsRequest.Builder> op) {

		op.add(Builder::desc, JsonpDeserializer.booleanDeserializer(), "desc");
		op.add(Builder::excludeInterim, JsonpDeserializer.booleanDeserializer(), "exclude_interim");
		op.add(Builder::page, Page._DESERIALIZER, "page");
		op.add(Builder::recordScore, JsonpDeserializer.doubleDeserializer(), "record_score");
		op.add(Builder::sort, JsonpDeserializer.stringDeserializer(), "sort");
		op.add(Builder::start, JsonpDeserializer.stringDeserializer(), "start");
		op.add(Builder::end, JsonpDeserializer.stringDeserializer(), "end");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ml.get_records}".
	 */
	public static final Endpoint<GetRecordsRequest, GetRecordsResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _jobId = 1 << 0;

				int propsSet = 0;

				propsSet |= _jobId;

				if (propsSet == (_jobId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ml");
					buf.append("/anomaly_detectors");
					buf.append("/");
					buf.append(request.jobId);
					buf.append("/results");
					buf.append("/records");
					return buf.toString();
				}
				throw Endpoint.Simple.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.from != null) {
					params.put("from", String.valueOf(request.from));
				}
				if (request.size != null) {
					params.put("size", String.valueOf(request.size));
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, GetRecordsResponse._DESERIALIZER);
}