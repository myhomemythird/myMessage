package org.richardliao.mq;

import org.richardliao.mq.domain.Spittle;

public class SpittleAlertHandler {
    public void handleSpittleAlert(Spittle spittle) {
	System.out.println(spittle);
    }
}
