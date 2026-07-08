package com.bytedance.crash.looper;

import X.C786410Ut5;
import android.os.MessageQueue;

/* JADX INFO: loaded from: classes14.dex */
public class IdleMessageObserver extends FullMessageObserver implements MessageQueue.IdleHandler {
    public IdleMessageObserver() {
        super(false);
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        super.start();
        return false;
    }

    @Override // com.bytedance.crash.looper.FullMessageObserver, com.bytedance.crash.looper.MessageObserver
    public final void start() {
        MessageQueue messageQueueLIZ = MessageQueueWrapper.LIZ();
        if (messageQueueLIZ != null) {
            C786410Ut5.f3(this, messageQueueLIZ);
        }
    }
}
