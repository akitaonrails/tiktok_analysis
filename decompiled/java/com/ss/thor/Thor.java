package com.ss.thor;

import X.C1C7U;
import X.C786410Ut5;
import X.C792640V7m;
import X.InterfaceC792670V7p;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import duo.b;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class Thor {
    public static HandlerThread LIZ;
    public static ThorHandler LIZIZ;
    public static InterfaceC792670V7p LIZJ;
    public static int LIZLLL;

    static {
        new AtomicInteger(0);
    }

    public static class ThorHandler extends BPEAHandler {
        public ThorHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("Thor$ThorHandler@29ee.handleMessage");
            if (Thor.LIZJ == null) {
                C1C7U.LIZIZ("Thor$ThorHandler@29ee.handleMessage");
                return;
            }
            int i = message.what;
            Context context = (Context) HandlerHook.getMessageObj(message.obj);
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                InterfaceC792670V7p interfaceC792670V7p = Thor.LIZJ;
                                float fLIZJ = b.LIZJ(context);
                                b.LIZLLL(context);
                                ((C792640V7m) interfaceC792670V7p).LIZ(fLIZJ, b.LIZIZ(context));
                            }
                            sendMessageDelayed(obtainMessage(i, context), Thor.LIZLLL);
                            C1C7U.LIZIZ("Thor$ThorHandler@29ee.handleMessage");
                        }
                        InterfaceC792670V7p interfaceC792670V7p2 = Thor.LIZJ;
                        float fLIZJ2 = b.LIZJ(context);
                        b.LIZLLL(context);
                        ((C792640V7m) interfaceC792670V7p2).LIZ(fLIZJ2, -1L);
                    } else {
                        ((C792640V7m) Thor.LIZJ).LIZ(-1.0f, b.LIZIZ(context));
                    }
                } else {
                    InterfaceC792670V7p interfaceC792670V7p3 = Thor.LIZJ;
                    b.LIZLLL(context);
                    ((C792640V7m) interfaceC792670V7p3).LIZ(-1.0f, -1L);
                }
            } else {
                ((C792640V7m) Thor.LIZJ).LIZ(b.LIZJ(context), -1L);
            }
            sendMessageDelayed(obtainMessage(i, context), Thor.LIZLLL);
            C1C7U.LIZIZ("Thor$ThorHandler@29ee.handleMessage");
        }
    }

    public static void LIZ(Context context, C792640V7m c792640V7m, int i) {
        if (LIZ == null) {
            HandlerThread handlerThread = new HandlerThread("Thor-Handler-Thread");
            LIZ = handlerThread;
            handlerThread.start();
            LIZIZ = new ThorHandler(C786410Ut5.W2(LIZ));
            LIZJ = c792640V7m;
            c792640V7m.LIZ.LJIILLIIL();
            LIZLLL = i;
        }
        ThorHandler thorHandler = LIZIZ;
        thorHandler.sendMessage(thorHandler.obtainMessage(5, context));
    }
}
