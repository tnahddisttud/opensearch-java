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
import java.util.Objects;

// typedef: _types.mapping.DoubleRangeProperty
@JsonpDeserializable
public final class DoubleRangeProperty extends RangePropertyBase implements PropertyVariant {
	// ---------------------------------------------------------------------------------------------

	public DoubleRangeProperty(Builder builder) {
		super(builder);

	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "double_range";
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "double_range");
		super.serializeInternal(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DoubleRangeProperty}.
	 */
	public static class Builder extends RangePropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DoubleRangeProperty> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DoubleRangeProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DoubleRangeProperty build() {

			return new DoubleRangeProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DoubleRangeProperty}
	 */
	public static final JsonpDeserializer<DoubleRangeProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DoubleRangeProperty::setupDoubleRangePropertyDeserializer, Builder::build);

	protected static void setupDoubleRangePropertyDeserializer(DelegatingDeserializer<DoubleRangeProperty.Builder> op) {
		RangePropertyBase.setupRangePropertyBaseDeserializer(op);

		op.ignore("type");
	}

}