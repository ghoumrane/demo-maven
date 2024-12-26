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
package org.apache.maven.api.services;

import java.io.Serial;

/**
 * Exceptions thrown by the {@link SuperPomProvider} service.
 *
 * @since 4.0.0
 */
public class SuperPomProviderException extends MavenException {

    @Serial
    private static final long serialVersionUID = -8659892034004509331L;

    public SuperPomProviderException() {
        super();
    }

    public SuperPomProviderException(String message) {
        super(message);
    }

    public SuperPomProviderException(String message, Throwable cause) {
        super(message, cause);
    }

    public SuperPomProviderException(Throwable cause) {
        super(cause);
    }
}