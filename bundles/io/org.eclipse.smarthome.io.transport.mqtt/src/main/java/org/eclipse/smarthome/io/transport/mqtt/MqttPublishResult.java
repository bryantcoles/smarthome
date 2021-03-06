/**
 * Copyright (c) 2014,2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.io.transport.mqtt;

/**
 * Represents a publish result asynchronously provided by the {@link MqttPublishCallback}
 * after a call to {@link MqttBrokerConnection}.publish().
 *
 * @author David Graeff - Initial contribution
 */
public class MqttPublishResult {
    final int messageID;
    String topic;

    /**
     * Package local and only to be used by {@link MqttBrokerConnection}.publish() and tests.
     *
     * @param messageID
     * @param topic
     */
    MqttPublishResult(int messageID, String topic) {
        this.messageID = messageID;
        this.topic = topic;
    }

    /**
     * Return the topic, that the publish was targeted on.
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Return the messageID that was used to send the message to the broker.
     */
    public int getMessageID() {
        return messageID;
    }
}
