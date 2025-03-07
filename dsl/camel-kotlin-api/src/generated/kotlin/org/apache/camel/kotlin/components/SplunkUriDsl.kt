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
package org.apache.camel.kotlin.components

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import org.apache.camel.kotlin.CamelDslMarker
import org.apache.camel.kotlin.UriDsl

public fun UriDsl.splunk(i: SplunkUriDsl.() -> Unit) {
  SplunkUriDsl(this).apply(i)
}

@CamelDslMarker
public class SplunkUriDsl(
  it: UriDsl,
) {
  private val it: UriDsl

  init {
    this.it = it
    this.it.component("splunk")
  }

  private var name: String = ""

  public fun name(name: String) {
    this.name = name
    it.url("$name")
  }

  public fun app(app: String) {
    it.property("app", app)
  }

  public fun connectionTimeout(connectionTimeout: String) {
    it.property("connectionTimeout", connectionTimeout)
  }

  public fun connectionTimeout(connectionTimeout: Int) {
    it.property("connectionTimeout", connectionTimeout.toString())
  }

  public fun host(host: String) {
    it.property("host", host)
  }

  public fun owner(owner: String) {
    it.property("owner", owner)
  }

  public fun port(port: String) {
    it.property("port", port)
  }

  public fun port(port: Int) {
    it.property("port", port.toString())
  }

  public fun scheme(scheme: String) {
    it.property("scheme", scheme)
  }

  public fun count(count: String) {
    it.property("count", count)
  }

  public fun count(count: Int) {
    it.property("count", count.toString())
  }

  public fun earliestTime(earliestTime: String) {
    it.property("earliestTime", earliestTime)
  }

  public fun initEarliestTime(initEarliestTime: String) {
    it.property("initEarliestTime", initEarliestTime)
  }

  public fun latestTime(latestTime: String) {
    it.property("latestTime", latestTime)
  }

  public fun savedSearch(savedSearch: String) {
    it.property("savedSearch", savedSearch)
  }

  public fun search(search: String) {
    it.property("search", search)
  }

  public fun sendEmptyMessageWhenIdle(sendEmptyMessageWhenIdle: String) {
    it.property("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle)
  }

  public fun sendEmptyMessageWhenIdle(sendEmptyMessageWhenIdle: Boolean) {
    it.property("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle.toString())
  }

  public fun streaming(streaming: String) {
    it.property("streaming", streaming)
  }

  public fun streaming(streaming: Boolean) {
    it.property("streaming", streaming.toString())
  }

  public fun bridgeErrorHandler(bridgeErrorHandler: String) {
    it.property("bridgeErrorHandler", bridgeErrorHandler)
  }

  public fun bridgeErrorHandler(bridgeErrorHandler: Boolean) {
    it.property("bridgeErrorHandler", bridgeErrorHandler.toString())
  }

  public fun exceptionHandler(exceptionHandler: String) {
    it.property("exceptionHandler", exceptionHandler)
  }

  public fun exchangePattern(exchangePattern: String) {
    it.property("exchangePattern", exchangePattern)
  }

  public fun pollStrategy(pollStrategy: String) {
    it.property("pollStrategy", pollStrategy)
  }

  public fun eventHost(eventHost: String) {
    it.property("eventHost", eventHost)
  }

  public fun index(index: String) {
    it.property("index", index)
  }

  public fun raw(raw: String) {
    it.property("raw", raw)
  }

  public fun raw(raw: Boolean) {
    it.property("raw", raw.toString())
  }

  public fun source(source: String) {
    it.property("source", source)
  }

  public fun sourceType(sourceType: String) {
    it.property("sourceType", sourceType)
  }

  public fun tcpReceiverLocalPort(tcpReceiverLocalPort: String) {
    it.property("tcpReceiverLocalPort", tcpReceiverLocalPort)
  }

  public fun tcpReceiverLocalPort(tcpReceiverLocalPort: Int) {
    it.property("tcpReceiverLocalPort", tcpReceiverLocalPort.toString())
  }

  public fun tcpReceiverPort(tcpReceiverPort: String) {
    it.property("tcpReceiverPort", tcpReceiverPort)
  }

  public fun tcpReceiverPort(tcpReceiverPort: Int) {
    it.property("tcpReceiverPort", tcpReceiverPort.toString())
  }

  public fun lazyStartProducer(lazyStartProducer: String) {
    it.property("lazyStartProducer", lazyStartProducer)
  }

  public fun lazyStartProducer(lazyStartProducer: Boolean) {
    it.property("lazyStartProducer", lazyStartProducer.toString())
  }

  public fun backoffErrorThreshold(backoffErrorThreshold: String) {
    it.property("backoffErrorThreshold", backoffErrorThreshold)
  }

  public fun backoffErrorThreshold(backoffErrorThreshold: Int) {
    it.property("backoffErrorThreshold", backoffErrorThreshold.toString())
  }

  public fun backoffIdleThreshold(backoffIdleThreshold: String) {
    it.property("backoffIdleThreshold", backoffIdleThreshold)
  }

  public fun backoffIdleThreshold(backoffIdleThreshold: Int) {
    it.property("backoffIdleThreshold", backoffIdleThreshold.toString())
  }

  public fun backoffMultiplier(backoffMultiplier: String) {
    it.property("backoffMultiplier", backoffMultiplier)
  }

  public fun backoffMultiplier(backoffMultiplier: Int) {
    it.property("backoffMultiplier", backoffMultiplier.toString())
  }

  public fun delay(delay: String) {
    it.property("delay", delay)
  }

  public fun delay(delay: Int) {
    it.property("delay", delay.toString())
  }

  public fun greedy(greedy: String) {
    it.property("greedy", greedy)
  }

  public fun greedy(greedy: Boolean) {
    it.property("greedy", greedy.toString())
  }

  public fun initialDelay(initialDelay: String) {
    it.property("initialDelay", initialDelay)
  }

  public fun initialDelay(initialDelay: Int) {
    it.property("initialDelay", initialDelay.toString())
  }

  public fun repeatCount(repeatCount: String) {
    it.property("repeatCount", repeatCount)
  }

  public fun repeatCount(repeatCount: Int) {
    it.property("repeatCount", repeatCount.toString())
  }

  public fun runLoggingLevel(runLoggingLevel: String) {
    it.property("runLoggingLevel", runLoggingLevel)
  }

  public fun scheduledExecutorService(scheduledExecutorService: String) {
    it.property("scheduledExecutorService", scheduledExecutorService)
  }

  public fun scheduler(scheduler: String) {
    it.property("scheduler", scheduler)
  }

  public fun schedulerProperties(schedulerProperties: String) {
    it.property("schedulerProperties", schedulerProperties)
  }

  public fun startScheduler(startScheduler: String) {
    it.property("startScheduler", startScheduler)
  }

  public fun startScheduler(startScheduler: Boolean) {
    it.property("startScheduler", startScheduler.toString())
  }

  public fun timeUnit(timeUnit: String) {
    it.property("timeUnit", timeUnit)
  }

  public fun useFixedDelay(useFixedDelay: String) {
    it.property("useFixedDelay", useFixedDelay)
  }

  public fun useFixedDelay(useFixedDelay: Boolean) {
    it.property("useFixedDelay", useFixedDelay.toString())
  }

  public fun password(password: String) {
    it.property("password", password)
  }

  public fun sslProtocol(sslProtocol: String) {
    it.property("sslProtocol", sslProtocol)
  }

  public fun token(token: String) {
    it.property("token", token)
  }

  public fun username(username: String) {
    it.property("username", username)
  }

  public fun useSunHttpsHandler(useSunHttpsHandler: String) {
    it.property("useSunHttpsHandler", useSunHttpsHandler)
  }

  public fun useSunHttpsHandler(useSunHttpsHandler: Boolean) {
    it.property("useSunHttpsHandler", useSunHttpsHandler.toString())
  }
}
