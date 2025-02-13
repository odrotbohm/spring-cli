/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cli.runtime.engine.actions;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.lang.Nullable;

/**
 * @author Mark Pollack
 */
public class Inject {

	@Nullable
	private final String before;

	@Nullable
	private final String after;

	private final String to;

	private final String skip;

	private final String text;

	@Nullable
	public String getBefore() {
		return before;
	}

	@Nullable
	public String getAfter() {
		return after;
	}

	public String getTo() {
		return to;
	}

	public String getSkip() {
		return skip;
	}

	public String getText() {
		return text;
	}

	@JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
	Inject(@JsonProperty("text") String text, @JsonProperty("to") String to,
			@JsonProperty("skip") String skip, @JsonProperty("before") String before,
			@JsonProperty("after") String after) {
		this.text = text;
		this.to = Objects.requireNonNull(to);
		this.skip = skip;
		this.before = before;
		this.after = after;
	}

	@Override
	public String toString() {
		return "Inject{" +
				"before='" + before + '\'' +
				", after='" + after + '\'' +
				", to='" + to + '\'' +
				", skip='" + skip + '\'' +
				", text='" + text + '\'' +
				'}';
	}
}
