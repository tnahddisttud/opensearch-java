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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.mapping.HistogramProperty
@JsonpDeserializable
public final class HistogramProperty extends PropertyBase implements PropertyVariant {
	@Nullable
	private final Boolean ignoreMalformed;

	// ---------------------------------------------------------------------------------------------

	public HistogramProperty(Builder builder) {
		super(builder);

		this.ignoreMalformed = builder.ignoreMalformed;

	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "histogram";
	}

	/**
	 * API name: {@code ignore_malformed}
	 */
	@Nullable
	public Boolean ignoreMalformed() {
		return this.ignoreMalformed;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "histogram");
		super.serializeInternal(generator, mapper);
		if (this.ignoreMalformed != null) {

			generator.writeKey("ignore_malformed");
			generator.write(this.ignoreMalformed);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HistogramProperty}.
	 */
	public static class Builder extends PropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<HistogramProperty> {
		@Nullable
		private Boolean ignoreMalformed;

		/**
		 * API name: {@code ignore_malformed}
		 */
		public Builder ignoreMalformed(@Nullable Boolean value) {
			this.ignoreMalformed = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link HistogramProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HistogramProperty build() {

			return new HistogramProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link HistogramProperty}
	 */
	public static final JsonpDeserializer<HistogramProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, HistogramProperty::setupHistogramPropertyDeserializer, Builder::build);

	protected static void setupHistogramPropertyDeserializer(DelegatingDeserializer<HistogramProperty.Builder> op) {
		PropertyBase.setupPropertyBaseDeserializer(op);
		op.add(Builder::ignoreMalformed, JsonpDeserializer.booleanDeserializer(), "ignore_malformed");

		op.ignore("type");
	}

}