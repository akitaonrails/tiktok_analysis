package com.ss.android.ugc.aweme.lego.common.trigger;

import X.AbstractC799790VYz;
import X.C0CCZ;
import X.C0VU1;
import X.C0VU3;
import X.C1954807lC;
import X.C786410Ut5;
import X.C799570VYd;
import X.C799900VZk;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.InterfaceC799590VYf;
import X.InterfaceC800080Va2;
import Y.ARunnableS113S0100000_13;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes14.dex */
public final class BackgroundTriggerV5 extends AbstractC799790VYz {
    public final HandlerThread LL;
    public DispatcherHandler LLILLJJLI;

    public BackgroundTriggerV5() {
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
            ExecutorService executorServiceLJFF;
            super.handleMessage(message);
            C0CCZ c0ccz = (C0CCZ) HandlerHook.getMessageObj(message.obj);
            if (c0ccz instanceof InterfaceC799590VYf) {
                C0VU1 c0vu1ThreadType = ((InterfaceC799590VYf) c0ccz).threadType();
                if (c0vu1ThreadType != null) {
                    int i = C0VU3.LIZ[c0vu1ThreadType.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            executorServiceLJFF = C799570VYd.LJFF(c0ccz.serialExecute());
                        }
                    } else {
                        executorServiceLJFF = C823050WQl.LIZLLL();
                    }
                }
                throw new C1954807lC();
            }
            executorServiceLJFF = C799570VYd.LJFF(c0ccz.serialExecute());
            executorServiceLJFF.execute(new ARunnableS113S0100000_13(c0ccz, 106));
        }
    }

    @Override // X.AbstractC799790VYz, X.InterfaceC800100Va4
    public final void LIZ(InterfaceC800080Va2 interfaceC800080Va2) {
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
