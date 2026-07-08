package com.ss.android.ugc.aweme.feed.netdetector.fetchfeed;

import X.C1492500owS;
import X.C1C7U;
import X.C563400M7u;
import android.os.Handler;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes25.dex */
public final class NoNetDetectHelper {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(true);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(true);
    public static final AtomicBoolean LJ = new AtomicBoolean(false);
    public static final AtomicBoolean LJFF = new AtomicBoolean(true);
    public static final AtomicBoolean LJI = new AtomicBoolean(false);
    public static final AtomicBoolean LJII = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIIIZZ = new AtomicBoolean(true);
    public static final AtomicBoolean LJIIIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIJ = new AtomicBoolean(true);
    public static final AtomicBoolean LJIIJJI = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIL = new AtomicBoolean(false);
    public static final AtomicBoolean LJIILIIL = new AtomicBoolean(false);
    public static final C563400M7u LJIILJJIL = new C563400M7u(0);
    public static final BitSet LJIILL = new BitSet();
    public static final AtomicBoolean LJIILLIIL = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIZILJ = new AtomicBoolean(false);
    public static final AtomicBoolean LJIJ;
    public static final AtomicBoolean LJIJI;
    public static final AtomicBoolean LJIJJ;
    public static final AtomicBoolean LJIJJLI;
    public static final AtomicBoolean LJIL;
    public static final AtomicBoolean LJJ;
    public static final AtomicBoolean LJJI;
    public static NoNetDetectCancelableHandlerWrapper LJJIFFI;
    public static final Object LJJII;

    static {
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        LJIJ = new AtomicBoolean(false);
        LJIJI = new AtomicBoolean(false);
        LJIJJ = new AtomicBoolean(false);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        LJIJJLI = new AtomicBoolean(false);
        LJIL = new AtomicBoolean(false);
        LJJ = new AtomicBoolean(true);
        LJJI = new AtomicBoolean(false);
        LJJII = new Object();
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static class NoNetDetectCancelableHandlerWrapper extends BPEAHandler {
        public final Handler LL;

        public NoNetDetectCancelableHandlerWrapper(Handler handler) {
            this.LL = handler;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("NoNetDetectHelper$NoNetDetectCancelableHandlerWrapper@d218.handleMessage");
            super.handleMessage(message);
            NoNetDetectHelper.LJJIFFI = null;
            this.LL.handleMessage(message);
            C1C7U.LIZIZ("NoNetDetectHelper$NoNetDetectCancelableHandlerWrapper@d218.handleMessage");
        }
    }

    public static void LIZ(Boolean bool) {
        LJIIZILJ.set(bool.booleanValue());
    }

    public static void LIZJ(Handler handler) {
        if (C1492500owS.LIZ()) {
            synchronized (LJJII) {
                try {
                    LJJIFFI = new NoNetDetectCancelableHandlerWrapper(handler);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void LIZIZ(int i, Boolean bool) {
        if (bool.booleanValue()) {
            LJIILJJIL.LJ(i);
        }
        LJIILIIL.set(bool.booleanValue());
    }
}
