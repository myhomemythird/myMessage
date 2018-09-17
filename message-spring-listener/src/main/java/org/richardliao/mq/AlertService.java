package org.richardliao.mq;

import org.richardliao.mq.domain.Spittle;

public interface AlertService {
    void sendSpittleAlert(Spittle spittle);
}
