/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

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

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.opensearch.indices.get_data_stream;

import jakarta.json.stream.JsonGenerator;
import org.opensearch.clients.json.DelegatingDeserializer;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ToJsonp;
import org.opensearch.clients.util.ObjectBuilder;

import java.util.Objects;

// typedef: indices.get_data_stream.IndicesGetDataStreamItemIndex
public final class IndicesGetDataStreamItemIndex implements ToJsonp {
	private final String indexName;

	private final String indexUuid;

	// ---------------------------------------------------------------------------------------------

	protected IndicesGetDataStreamItemIndex(Builder builder) {

		this.indexName = Objects.requireNonNull(builder.indexName, "index_name");
		this.indexUuid = Objects.requireNonNull(builder.indexUuid, "index_uuid");

	}

	/**
	 * API name: {@code index_name}
	 */
	public String indexName() {
		return this.indexName;
	}

	/**
	 * API name: {@code index_uuid}
	 */
	public String indexUuid() {
		return this.indexUuid;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("index_name");
		generator.write(this.indexName);

		generator.writeKey("index_uuid");
		generator.write(this.indexUuid);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndicesGetDataStreamItemIndex}.
	 */
	public static class Builder implements ObjectBuilder<IndicesGetDataStreamItemIndex> {
		private String indexName;

		private String indexUuid;

		/**
		 * API name: {@code index_name}
		 */
		public Builder indexName(String value) {
			this.indexName = value;
			return this;
		}

		/**
		 * API name: {@code index_uuid}
		 */
		public Builder indexUuid(String value) {
			this.indexUuid = value;
			return this;
		}

		/**
		 * Builds a {@link IndicesGetDataStreamItemIndex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndicesGetDataStreamItemIndex build() {

			return new IndicesGetDataStreamItemIndex(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndicesGetDataStreamItemIndex
	 */
	public static final JsonpDeserializer<IndicesGetDataStreamItemIndex> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new,
					IndicesGetDataStreamItemIndex::setupIndicesGetDataStreamItemIndexDeserializer);

	protected static void setupIndicesGetDataStreamItemIndexDeserializer(
			DelegatingDeserializer<IndicesGetDataStreamItemIndex.Builder> op) {

		op.add(Builder::indexName, JsonpDeserializer.stringDeserializer(), "index_name");
		op.add(Builder::indexUuid, JsonpDeserializer.stringDeserializer(), "index_uuid");

	}

}