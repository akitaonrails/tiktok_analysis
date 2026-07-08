package com.ss.android.ugc.aweme.lego.common.trigger;

import X.AbstractC799790VYz;
import X.C0CCZ;
import X.C786410Ut5;
import X.C799570VYd;
import X.C799900VZk;
import X.EnumC799870VZh;
import X.InterfaceC800080Va2;
import X.RunnableC799600VYg;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes14.dex */
public final class BackgroundTriggerV3 extends AbstractC799790VYz {
    public final HandlerThread LL;
    public DispatcherHandler LLILLJJLI;

    public BackgroundTriggerV3() {
        HandlerThread handlerThread = new HandlerThread("lego_background_dispatcher");
        this.LL = handlerThread;
        handlerThread.start();
    }

    public static final class DispatcherHandler extends BPEAHandler {
        public DispatcherHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            C0CCZ c0ccz = (C0CCZ) HandlerHook.getMessageObj(message.obj);
            ExecutorService executorServiceLIZLLL = C799570VYd.LIZLLL(c0ccz, true);
            int i = C799570VYd.LJIILJJIL;
            C799570VYd.LJIILJJIL = i + 1;
            executorServiceLIZLLL.execute(new RunnableC799600VYg(c0ccz, i, false));
        }
    }

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final synchronized void LIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        super.LIZ(interfaceC800080Va2);
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new DispatcherHandler(C786410Ut5.W2(this.LL));
        }
        C799900VZk.LIZ.getClass();
        C0CCZ c0cczLIZJ = C799900VZk.LIZIZ.LIZJ(EnumC799870VZh.BACKGROUND);
        if (c0cczLIZJ != null) {
            Message.obtain(this.LLILLJJLI, 0, c0cczLIZJ).sendToTarget();
        }
    }
}
