/*
 * Copyright 2004 - 2012 Mirko Nasato and contributors
 *           2016 - 2018 Simon Braconnier and contributors
 *
 * This file is part of JODConverter - Java OpenDocument Converter.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jodconverter.office;

/**
 * Helper class used to creates ExternalOfficeManager instances.
 *
 * @deprecated Use {@link ExternalOfficeManager#builder()} instead.
 */
@Deprecated
public class ExternalOfficeManagerBuilder {

  private OfficeConnectionProtocol connectionProtocol = OfficeConnectionProtocol.SOCKET;
  private int portNumber = 2002;
  private String pipeName = "office";
  private boolean connectOnStart = true;
  private long connectTimeout = 120000L;

  /**
   * Builds a new {@link ExternalOfficeManager}.
   *
   * @return The created {@link ExternalOfficeManager}.
   */
  public OfficeManager build() {

    return ExternalOfficeManager.builder()
        .connectionProtocol(connectionProtocol)
        .portNumber(portNumber)
        .pipeName(pipeName)
        .connectOnStart(connectOnStart)
        .connectTimeout(connectTimeout)
        .build();
  }

  /**
   * Sets the connection protocol.
   *
   * @param connectionProtocol The new protocol to set.
   * @return The updated configuration.
   */
  public ExternalOfficeManagerBuilder setConnectionProtocol(
      final OfficeConnectionProtocol connectionProtocol) {

    this.connectionProtocol = connectionProtocol;
    return this;
  }

  /**
   * Sets whether a connection is attempted on start.
   *
   * @param connectOnStart {@code true} if a connection should be attempted on start, {@code false}
   *     otherwise.
   * @return The updated configuration.
   */
  public ExternalOfficeManagerBuilder setConnectOnStart(final boolean connectOnStart) {

    this.connectOnStart = connectOnStart;
    return this;
  }

  /**
   * Sets the timeout after which a connection attempt will fail.
   *
   * @param connectTimeout The timeout to use.
   * @return The updated configuration.
   */
  public ExternalOfficeManagerBuilder setConnectTimeout(final long connectTimeout) {

    this.connectTimeout = connectTimeout;
    return this;
  }

  /**
   * Sets the pipe name that will be use to communicate with office.
   *
   * @param pipeName The pipe name to use.
   * @return The updated configuration.
   */
  public ExternalOfficeManagerBuilder setPipeName(final String pipeName) {

    this.pipeName = pipeName;
    return this;
  }

  /**
   * Sets the port number that will be use to communicate with office.
   *
   * @param portNumber The port number to use.
   * @return The updated configuration.
   */
  public ExternalOfficeManagerBuilder setPortNumber(final int portNumber) {

    this.portNumber = portNumber;
    return this;
  }
}
