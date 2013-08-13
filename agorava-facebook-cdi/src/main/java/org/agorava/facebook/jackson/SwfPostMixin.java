/*
 * Copyright 2013 Agorava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.agorava.facebook.jackson;

import org.agorava.facebook.model.Reference;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;

/**
 * Annotated mixin to add Jackson annotations to FlashPost.
 *
 * @author Craig Walls
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class SwfPostMixin extends PostMixin {

    @JsonCreator
    SwfPostMixin(@JsonProperty("id") String id, @JsonProperty("from") Reference from,
                 @JsonProperty("created_time") Date createdTime, @JsonProperty("updated_time") Date updatedTime) {
        super(id, from, createdTime, updatedTime);
    }

    @JsonProperty("source")
    String source;

}
