/*
 * Copyright (c) 2014 Baidu.com, Inc. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package cn.datai.gift.utils.baidu.ocr.idcard.free;

/**
 * Represents the communication protocol to use when sending requests to BCE.
 *
 * <p>
 * Communication over HTTPS is the default, and is more secure than HTTP, which is why BCE recommends using HTTPS. HTTPS
 * connections can use more system resources because of the extra work to encrypt network traffic, so the option to use
 * HTTP is available in case users need it.
 */
public enum Protocol {

    /**
     * HTTP Protocol - Using the HTTP protocol is less secure than HTTPS, but can slightly reduce the system resources
     * used when communicating with BCE.
     */
    HTTP("http", 80),

    /**
     * HTTPS Protocol - Using the HTTPS protocol is more secure than using the HTTP protocol, but may use slightly more
     * system resources. BCE recommends using HTTPS for maximize security.
     */
    HTTPS("https", 443);

    /**
     * The protocol name.
     */
    private String protocol;

    private int defaultPort;

    private Protocol(String protocol, int defaultPort) {
        this.protocol = protocol;
        this.defaultPort = defaultPort;
    }

    public int getDefaultPort() {
        return this.defaultPort;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return this.protocol;
    }
}
