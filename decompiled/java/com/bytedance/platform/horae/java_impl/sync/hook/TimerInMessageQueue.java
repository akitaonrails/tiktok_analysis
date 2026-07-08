package com.bytedance.platform.horae.java_impl.sync.hook;

import X.C088C;
import X.C088V;
import X.C1C7U;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class TimerInMessageQueue extends C088V {
    public TickHandler LLILLJJLI;

    public class TickHandler extends BPEAHandler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("TimerInMessageQueue$TickHandler@4c31.handleMessage");
            super.handleMessage(message);
            if (message.what == 101) {
                if (TimerInMessageQueue.this.LL != null) {
                    C088C.LIZ();
                }
                TimerInMessageQueue timerInMessageQueue = TimerInMessageQueue.this;
                Message messageObtainMessage = timerInMessageQueue.LLILLJJLI.obtainMessage(101);
                messageObtainMessage.setAsynchronous(true);
                timerInMessageQueue.LLILLJJLI.sendMessageDelayed(messageObtainMessage, 3000L);
            }
            C1C7U.LIZIZ("TimerInMessageQueue$TickHandler@4c31.handleMessage");
        }

        public TickHandler(Looper looper) {
            super(looper);
        }
    }

    public TimerInMessageQueue(C088C c088c) {
        super("TimerInMessageQueue", c088c);
    }
}
