package com.wry.messaging;

import com.wry.types.AuditMessage;

public interface AuditMessageProducer {
    void send(AuditMessage message);
}
