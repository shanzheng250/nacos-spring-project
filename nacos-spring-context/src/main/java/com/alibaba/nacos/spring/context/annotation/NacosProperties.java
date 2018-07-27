/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.nacos.spring.context.annotation;

import com.alibaba.nacos.api.PropertyKeyConst;

import java.lang.annotation.*;

/**
 * An annotation for Nacos Properties
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @see PropertyKeyConst
 * @since 0.1.0
 */
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NacosProperties {

    String endpoint() default "${nacos.endpoint}";

    String namespace() default "${nacos.namespace}";

    String accessKey() default "${nacos.accessKey}";

    String secretKey() default "${nacos.secretKey}";

    String serverAddr() default "${nacos.serverAddr}";

    String contextPath() default "${nacos.contextPath}";

    String clusterName() default "${nacos.clusterName}";

    String encode() default "${nacos.encode}";

}