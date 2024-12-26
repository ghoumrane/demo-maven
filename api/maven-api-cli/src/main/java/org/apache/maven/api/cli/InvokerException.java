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
package org.apache.maven.api.cli;

import org.apache.maven.api.annotations.Experimental;
import org.apache.maven.api.annotations.Nullable;
import org.apache.maven.api.services.MavenException;

/**
 * Represents an exception that occurs during the invocation of a Maven build or command.
 * This exception is typically thrown when there are errors during the execution of a Maven
 * process, such as build failures, plugin errors, or other runtime issues.
 *
 * @since 4.0.0
 */
@Experimental
public class InvokerException extends MavenException {
    /**
     * Constructs a new {@code InvokerException} with the specified detail message.
     *
     * @param message the detail message explaining the cause of the exception
     */
    public InvokerException(@Nullable String message) {
        super(message);
    }

    /**
     * Constructs a new {@code InvokerException} with the specified detail message and cause.
     *
     * @param message the detail message explaining the cause of the exception
     * @param cause the underlying cause of the exception
     */
    public InvokerException(@Nullable String message, @Nullable Throwable cause) {
        super(message, cause);
    }

    /**
     * Exception for intentional exit: No message or anything will be displayed, just the
     * carried exit code will be returned from invoker {@link Invoker#invoke(InvokerRequest)} method.
     */
    public static final class ExitException extends InvokerException {
        private final int exitCode;

        public ExitException(int exitCode) {
            super("EXIT");
            this.exitCode = exitCode;
        }

        public int getExitCode() {
            return exitCode;
        }
    }
}
