package com.bytedance.geckox.task;

import X.AbstractC1552990qW1;
import X.C1C7U;
import X.C786410Ut5;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: loaded from: classes24.dex */
public final class HandlerTimerTask {
    public TimeHandler LIZ;
    public HandlerThread LIZIZ;

    public final void LIZ() {
        if (this.LIZ == null || C786410Ut5.W2(this.LIZIZ) == null) {
            HandlerThread handlerThread = new HandlerThread("gecko-timer-task", 3);
            this.LIZIZ = handlerThread;
            handlerThread.start();
            this.LIZ = new TimeHandler(C786410Ut5.W2(this.LIZIZ));
        }
    }

    public HandlerTimerTask() {
        LIZ();
    }

    public class TimeHandler extends BPEAHandler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("HandlerTimerTask$TimeHandler@b9ad.handleMessage");
            AbstractC1552990qW1 abstractC1552990qW1 = (AbstractC1552990qW1) HandlerHook.getMessageObj(message.obj);
            abstractC1552990qW1.LIZ();
            if (abstractC1552990qW1.LIZ > 0) {
                Message messageObtainMessage = HandlerTimerTask.this.LIZ.obtainMessage(message.what);
                messageObtainMessage.obj = abstractC1552990qW1;
                C786410Ut5.LJLJLJ(HandlerTimerTask.this.LIZ, messageObtainMessage, abstractC1552990qW1.LIZ);
            }
            C1C7U.LIZIZ("HandlerTimerTask$TimeHandler@b9ad.handleMessage");
        }

        public TimeHandler(Looper looper) {
            super(looper);
        }
    }
}
