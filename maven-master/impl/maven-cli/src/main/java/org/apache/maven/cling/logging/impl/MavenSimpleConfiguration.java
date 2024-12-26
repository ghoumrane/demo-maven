/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.maven.cling.logging.impl;

import org.apache.maven.cling.logging.BaseSlf4jConfiguration;
import org.apache.maven.slf4j.MavenLoggerFactory;
import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;

/**
 * Configuration for slf4j-simple.
 *
 * @since 3.1.0
 */
public class MavenSimpleConfiguration extends BaseSlf4jConfiguration {
    @Override
    public void setRootLoggerLevel(Level level) {
        String value =
                switch (level) {
                    case DEBUG -> "debug";
                    case INFO -> "info";
                    default -> "error";
                };
        System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", value);
    }

    @Override
    public void activate() {
        ILoggerFactory lf = LoggerFactory.getILoggerFactory();
        if (lf instanceof MavenLoggerFactory mlf) {
            mlf.reconfigure();
        }
    }
}
