package com.wry.messaging;

import com.wry.types.AuditMessage;
import org.springframework.stereotype.Repository;

/**
 * @author wry
 */
@Repository
public class AuditMessageProducerImpl implements AuditMessageProducer {
    @Override
    public void send(AuditMessage message) {

    }
}
