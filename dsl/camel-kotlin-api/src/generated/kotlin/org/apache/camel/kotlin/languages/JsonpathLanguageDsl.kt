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
package org.apache.camel.kotlin.languages

import java.lang.Class
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import org.apache.camel.kotlin.CamelDslMarker
import org.apache.camel.model.language.JsonPathExpression

public fun jsonpath(jsonpath: String, i: JsonpathLanguageDsl.() -> Unit = {}): JsonPathExpression {
  val def = JsonPathExpression(jsonpath)
  JsonpathLanguageDsl(def).apply(i)
  return def
}

@CamelDslMarker
public class JsonpathLanguageDsl(
  def: JsonPathExpression,
) {
  public val def: JsonPathExpression

  init {
    this.def = def
  }

  public fun id(id: String) {
    def.id = id
  }

  public fun suppressExceptions(suppressExceptions: Boolean) {
    def.suppressExceptions = suppressExceptions.toString()
  }

  public fun suppressExceptions(suppressExceptions: String) {
    def.suppressExceptions = suppressExceptions
  }

  public fun allowSimple(allowSimple: Boolean) {
    def.allowSimple = allowSimple.toString()
  }

  public fun allowSimple(allowSimple: String) {
    def.allowSimple = allowSimple
  }

  public fun allowEasyPredicate(allowEasyPredicate: Boolean) {
    def.allowEasyPredicate = allowEasyPredicate.toString()
  }

  public fun allowEasyPredicate(allowEasyPredicate: String) {
    def.allowEasyPredicate = allowEasyPredicate
  }

  public fun writeAsString(writeAsString: Boolean) {
    def.writeAsString = writeAsString.toString()
  }

  public fun writeAsString(writeAsString: String) {
    def.writeAsString = writeAsString
  }

  public fun unpackArray(unpackArray: Boolean) {
    def.unpackArray = unpackArray.toString()
  }

  public fun unpackArray(unpackArray: String) {
    def.unpackArray = unpackArray
  }

  public fun option(option: String) {
    def.option = option
  }

  public fun source(source: String) {
    def.source = source
  }

  public fun resultType(resultType: Class<out Any>) {
    def.resultType = resultType
  }

  public fun trim(trim: Boolean) {
    def.trim = trim.toString()
  }

  public fun trim(trim: String) {
    def.trim = trim
  }
}
