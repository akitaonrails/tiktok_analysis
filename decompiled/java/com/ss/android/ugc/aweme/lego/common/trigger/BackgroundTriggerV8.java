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
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class BackgroundTriggerV8 extends AbstractC799790VYz {
    public final HandlerThread LL;
    public DispatcherHandler LLILLJJLI;

    public BackgroundTriggerV8() {
        HandlerThread handlerThread = new HandlerThread("lego_background_dispatcher");
        this.LL = handlerThread;
        handlerThread.start();
    }

    public static final class DispatcherHandler extends BPEAHandler {
        public final BlockingQueue<C0CCZ> LL;
        public C0CCZ LLILLJJLI;

        public DispatcherHandler(Looper looper) {
            super(looper);
            this.LL = new ArrayBlockingQueue(32);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            while (true) {
                try {
                    Object objPoll = ((ArrayBlockingQueue) this.LL).poll(5L, TimeUnit.MILLISECONDS);
                    C0CCZ c0ccz = (C0CCZ) objPoll;
                    this.LLILLJJLI = c0ccz;
                    if (objPoll != null) {
                        if (c0ccz != null) {
                            ExecutorService executorServiceLIZLLL = C799570VYd.LIZLLL(c0ccz, true);
                            int i = C799570VYd.LJIILJJIL;
                            C799570VYd.LJIILJJIL = i + 1;
                            executorServiceLIZLLL.execute(new RunnableC799600VYg(c0ccz, i, true));
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw new RuntimeException(th);
                }
            }
        }
    }

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        super.LIZ(interfaceC800080Va2);
        if (this.LLILLJJLI == null) {
            DispatcherHandler dispatcherHandler = new DispatcherHandler(C786410Ut5.W2(this.LL));
            this.LLILLJJLI = dispatcherHandler;
            Message.obtain(dispatcherHandler, 0).sendToTarget();
        }
        C799900VZk.LIZ.getClass();
        C0CCZ c0cczLIZJ = C799900VZk.LIZIZ.LIZJ(EnumC799870VZh.BACKGROUND);
        if (c0cczLIZJ != null) {
            DispatcherHandler dispatcherHandler2 = this.LLILLJJLI;
            synchronized (dispatcherHandler2) {
                ((ArrayBlockingQueue) dispatcherHandler2.LL).offer(c0cczLIZJ);
                if (dispatcherHandler2.LLILLJJLI == null) {
                    dispatcherHandler2.sendEmptyMessage(0);
                }
            }
        }
    }
}
