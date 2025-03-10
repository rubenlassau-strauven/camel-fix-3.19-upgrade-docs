/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.aws2.bedrock;

public enum BedrockModels {

    TITAN_TEXT_EXPRESS_V1("amazon.titan-text-express-v1"),
    TITAN_TEXT_LITE_V1("amazon.titan-text-lite-v1"),
    TITAN_IMAGE_GENERATOR_V1("amazon.titan-image-generator-v1"),
    TITAN_EMBEDDINGS_G1("amazon.titan-embed-text-v1"),
    JURASSIC2_ULTRA("ai21.j2-ultra-v1"),
    JURASSIC2_MID("ai21.j2-mid-v1");

    public final String model;

    private BedrockModels(String model) {
        this.model = model;
    }
}
