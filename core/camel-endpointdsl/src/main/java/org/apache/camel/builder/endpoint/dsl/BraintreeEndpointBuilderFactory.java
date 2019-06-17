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
package org.apache.camel.builder.endpoint.dsl;

import java.util.logging.Level;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The braintree component is used for integrating with the Braintree Payment
 * System.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface BraintreeEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Braintree component.
     */
    public interface BraintreeEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedBraintreeEndpointConsumerBuilder advanced() {
            return (AdvancedBraintreeEndpointConsumerBuilder) this;
        }
        /**
         * What kind of operation to perform.
         * The option is a
         * <code>org.apache.camel.component.braintree.internal.BraintreeApiName</code> type.
         * @group common
         */
        default BraintreeEndpointConsumerBuilder apiName(
                BraintreeApiName apiName) {
            setProperty("apiName", apiName);
            return this;
        }
        /**
         * What kind of operation to perform.
         * The option will be converted to a
         * <code>org.apache.camel.component.braintree.internal.BraintreeApiName</code> type.
         * @group common
         */
        default BraintreeEndpointConsumerBuilder apiName(String apiName) {
            setProperty("apiName", apiName);
            return this;
        }
        /**
         * What sub operation to use for the selected operation.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointConsumerBuilder methodName(String methodName) {
            setProperty("methodName", methodName);
            return this;
        }
        /**
         * The environment Either SANDBOX or PRODUCTION.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointConsumerBuilder environment(String environment) {
            setProperty("environment", environment);
            return this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointConsumerBuilder inBody(String inBody) {
            setProperty("inBody", inBody);
            return this;
        }
        /**
         * The merchant id provided by Braintree.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointConsumerBuilder merchantId(String merchantId) {
            setProperty("merchantId", merchantId);
            return this;
        }
        /**
         * The private key provided by Braintree.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointConsumerBuilder privateKey(String privateKey) {
            setProperty("privateKey", privateKey);
            return this;
        }
        /**
         * The public key provided by Braintree.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointConsumerBuilder publicKey(String publicKey) {
            setProperty("publicKey", publicKey);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default BraintreeEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default BraintreeEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The proxy host.
         * The option is a <code>java.lang.String</code> type.
         * @group proxy
         */
        default BraintreeEndpointConsumerBuilder proxyHost(String proxyHost) {
            setProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * The proxy port.
         * The option is a <code>java.lang.Integer</code> type.
         * @group proxy
         */
        default BraintreeEndpointConsumerBuilder proxyPort(Integer proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The proxy port.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group proxy
         */
        default BraintreeEndpointConsumerBuilder proxyPort(String proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Braintree component.
     */
    public interface AdvancedBraintreeEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default BraintreeEndpointConsumerBuilder basic() {
            return (BraintreeEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option is a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * @group consumer (advanced)
         */
        default AdvancedBraintreeEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * @group consumer (advanced)
         */
        default AdvancedBraintreeEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedBraintreeEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedBraintreeEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * The access token granted by a merchant to another in order to process
         * transactions on their behalf. Used in place of environment, merchant
         * id, public key and private key fields.
         * The option is a <code>java.lang.String</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointConsumerBuilder accessToken(
                String accessToken) {
            setProperty("accessToken", accessToken);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Set read timeout for http calls.
         * The option is a <code>java.lang.Integer</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointConsumerBuilder httpReadTimeout(
                Integer httpReadTimeout) {
            setProperty("httpReadTimeout", httpReadTimeout);
            return this;
        }
        /**
         * Set read timeout for http calls.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointConsumerBuilder httpReadTimeout(
                String httpReadTimeout) {
            setProperty("httpReadTimeout", httpReadTimeout);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Set logging level for http calls, see java.util.logging.Level.
         * The option is a <code>java.util.logging.Level</code> type.
         * @group logging
         */
        default AdvancedBraintreeEndpointConsumerBuilder httpLogLevel(
                Level httpLogLevel) {
            setProperty("httpLogLevel", httpLogLevel);
            return this;
        }
        /**
         * Set logging level for http calls, see java.util.logging.Level.
         * The option will be converted to a
         * <code>java.util.logging.Level</code> type.
         * @group logging
         */
        default AdvancedBraintreeEndpointConsumerBuilder httpLogLevel(
                String httpLogLevel) {
            setProperty("httpLogLevel", httpLogLevel);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Braintree component.
     */
    public interface BraintreeEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedBraintreeEndpointProducerBuilder advanced() {
            return (AdvancedBraintreeEndpointProducerBuilder) this;
        }
        /**
         * What kind of operation to perform.
         * The option is a
         * <code>org.apache.camel.component.braintree.internal.BraintreeApiName</code> type.
         * @group common
         */
        default BraintreeEndpointProducerBuilder apiName(
                BraintreeApiName apiName) {
            setProperty("apiName", apiName);
            return this;
        }
        /**
         * What kind of operation to perform.
         * The option will be converted to a
         * <code>org.apache.camel.component.braintree.internal.BraintreeApiName</code> type.
         * @group common
         */
        default BraintreeEndpointProducerBuilder apiName(String apiName) {
            setProperty("apiName", apiName);
            return this;
        }
        /**
         * What sub operation to use for the selected operation.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointProducerBuilder methodName(String methodName) {
            setProperty("methodName", methodName);
            return this;
        }
        /**
         * The environment Either SANDBOX or PRODUCTION.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointProducerBuilder environment(String environment) {
            setProperty("environment", environment);
            return this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointProducerBuilder inBody(String inBody) {
            setProperty("inBody", inBody);
            return this;
        }
        /**
         * The merchant id provided by Braintree.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointProducerBuilder merchantId(String merchantId) {
            setProperty("merchantId", merchantId);
            return this;
        }
        /**
         * The private key provided by Braintree.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointProducerBuilder privateKey(String privateKey) {
            setProperty("privateKey", privateKey);
            return this;
        }
        /**
         * The public key provided by Braintree.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointProducerBuilder publicKey(String publicKey) {
            setProperty("publicKey", publicKey);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default BraintreeEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default BraintreeEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The proxy host.
         * The option is a <code>java.lang.String</code> type.
         * @group proxy
         */
        default BraintreeEndpointProducerBuilder proxyHost(String proxyHost) {
            setProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * The proxy port.
         * The option is a <code>java.lang.Integer</code> type.
         * @group proxy
         */
        default BraintreeEndpointProducerBuilder proxyPort(Integer proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The proxy port.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group proxy
         */
        default BraintreeEndpointProducerBuilder proxyPort(String proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Braintree component.
     */
    public interface AdvancedBraintreeEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default BraintreeEndpointProducerBuilder basic() {
            return (BraintreeEndpointProducerBuilder) this;
        }
        /**
         * The access token granted by a merchant to another in order to process
         * transactions on their behalf. Used in place of environment, merchant
         * id, public key and private key fields.
         * The option is a <code>java.lang.String</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointProducerBuilder accessToken(
                String accessToken) {
            setProperty("accessToken", accessToken);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Set read timeout for http calls.
         * The option is a <code>java.lang.Integer</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointProducerBuilder httpReadTimeout(
                Integer httpReadTimeout) {
            setProperty("httpReadTimeout", httpReadTimeout);
            return this;
        }
        /**
         * Set read timeout for http calls.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointProducerBuilder httpReadTimeout(
                String httpReadTimeout) {
            setProperty("httpReadTimeout", httpReadTimeout);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointProducerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Set logging level for http calls, see java.util.logging.Level.
         * The option is a <code>java.util.logging.Level</code> type.
         * @group logging
         */
        default AdvancedBraintreeEndpointProducerBuilder httpLogLevel(
                Level httpLogLevel) {
            setProperty("httpLogLevel", httpLogLevel);
            return this;
        }
        /**
         * Set logging level for http calls, see java.util.logging.Level.
         * The option will be converted to a
         * <code>java.util.logging.Level</code> type.
         * @group logging
         */
        default AdvancedBraintreeEndpointProducerBuilder httpLogLevel(
                String httpLogLevel) {
            setProperty("httpLogLevel", httpLogLevel);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Braintree component.
     */
    public interface BraintreeEndpointBuilder
            extends
                BraintreeEndpointConsumerBuilder, BraintreeEndpointProducerBuilder {
        default AdvancedBraintreeEndpointBuilder advanced() {
            return (AdvancedBraintreeEndpointBuilder) this;
        }
        /**
         * What kind of operation to perform.
         * The option is a
         * <code>org.apache.camel.component.braintree.internal.BraintreeApiName</code> type.
         * @group common
         */
        default BraintreeEndpointBuilder apiName(BraintreeApiName apiName) {
            setProperty("apiName", apiName);
            return this;
        }
        /**
         * What kind of operation to perform.
         * The option will be converted to a
         * <code>org.apache.camel.component.braintree.internal.BraintreeApiName</code> type.
         * @group common
         */
        default BraintreeEndpointBuilder apiName(String apiName) {
            setProperty("apiName", apiName);
            return this;
        }
        /**
         * What sub operation to use for the selected operation.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointBuilder methodName(String methodName) {
            setProperty("methodName", methodName);
            return this;
        }
        /**
         * The environment Either SANDBOX or PRODUCTION.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointBuilder environment(String environment) {
            setProperty("environment", environment);
            return this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointBuilder inBody(String inBody) {
            setProperty("inBody", inBody);
            return this;
        }
        /**
         * The merchant id provided by Braintree.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointBuilder merchantId(String merchantId) {
            setProperty("merchantId", merchantId);
            return this;
        }
        /**
         * The private key provided by Braintree.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointBuilder privateKey(String privateKey) {
            setProperty("privateKey", privateKey);
            return this;
        }
        /**
         * The public key provided by Braintree.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default BraintreeEndpointBuilder publicKey(String publicKey) {
            setProperty("publicKey", publicKey);
            return this;
        }
        /**
         * The proxy host.
         * The option is a <code>java.lang.String</code> type.
         * @group proxy
         */
        default BraintreeEndpointBuilder proxyHost(String proxyHost) {
            setProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * The proxy port.
         * The option is a <code>java.lang.Integer</code> type.
         * @group proxy
         */
        default BraintreeEndpointBuilder proxyPort(Integer proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The proxy port.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group proxy
         */
        default BraintreeEndpointBuilder proxyPort(String proxyPort) {
            setProperty("proxyPort", proxyPort);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Braintree component.
     */
    public interface AdvancedBraintreeEndpointBuilder
            extends
                AdvancedBraintreeEndpointConsumerBuilder, AdvancedBraintreeEndpointProducerBuilder {
        default BraintreeEndpointBuilder basic() {
            return (BraintreeEndpointBuilder) this;
        }
        /**
         * The access token granted by a merchant to another in order to process
         * transactions on their behalf. Used in place of environment, merchant
         * id, public key and private key fields.
         * The option is a <code>java.lang.String</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointBuilder accessToken(String accessToken) {
            setProperty("accessToken", accessToken);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Set read timeout for http calls.
         * The option is a <code>java.lang.Integer</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointBuilder httpReadTimeout(
                Integer httpReadTimeout) {
            setProperty("httpReadTimeout", httpReadTimeout);
            return this;
        }
        /**
         * Set read timeout for http calls.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointBuilder httpReadTimeout(
                String httpReadTimeout) {
            setProperty("httpReadTimeout", httpReadTimeout);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedBraintreeEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Set logging level for http calls, see java.util.logging.Level.
         * The option is a <code>java.util.logging.Level</code> type.
         * @group logging
         */
        default AdvancedBraintreeEndpointBuilder httpLogLevel(Level httpLogLevel) {
            setProperty("httpLogLevel", httpLogLevel);
            return this;
        }
        /**
         * Set logging level for http calls, see java.util.logging.Level.
         * The option will be converted to a
         * <code>java.util.logging.Level</code> type.
         * @group logging
         */
        default AdvancedBraintreeEndpointBuilder httpLogLevel(
                String httpLogLevel) {
            setProperty("httpLogLevel", httpLogLevel);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.braintree.internal.BraintreeApiName</code> enum.
     */
    enum BraintreeApiName {
        ADDON,
        ADDRESS,
        CLIENTTOKEN,
        CREDITCARDVERIFICATION,
        CUSTOMER,
        DISCOUNT,
        DISPUTE,
        DOCUMENTUPLOAD,
        MERCHANTACCOUNT,
        PAYMENTMETHOD,
        PAYMENTMETHODNONCE,
        PLAN,
        REPORT,
        SETTLEMENTBATCHSUMMARY,
        SUBSCRIPTION,
        TRANSACTION,
        WEBHOOKNOTIFICATION;
    }
    /**
     * The braintree component is used for integrating with the Braintree
     * Payment System. Creates a builder to build endpoints for the Braintree
     * component.
     */
    default BraintreeEndpointBuilder braintree(String path) {
        class BraintreeEndpointBuilderImpl extends AbstractEndpointBuilder implements BraintreeEndpointBuilder, AdvancedBraintreeEndpointBuilder {
            public BraintreeEndpointBuilderImpl(String path) {
                super("braintree", path);
            }
        }
        return new BraintreeEndpointBuilderImpl(path);
    }
}