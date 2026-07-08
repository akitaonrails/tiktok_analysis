package org.greenrobot.eventbus;

import X.C14EP;
import X.C14EQ;
import X.C14ET;
import X.C14EW;
import X.InterfaceC20231114Eb;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes31.dex */
public class HandlerPoster extends BPEAHandler implements InterfaceC20231114Eb {
    public final C14ET LL;
    public final int LLILLJJLI;
    public final EventBus LLILLL;
    public boolean LLILZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                C14EQ c14eqLIZIZ = this.LL.LIZIZ();
                if (c14eqLIZIZ == null) {
                    synchronized (this) {
                        try {
                            c14eqLIZIZ = this.LL.LIZIZ();
                            if (c14eqLIZIZ == null) {
                                this.LLILZ = false;
                                return;
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
                this.LLILLL.LJIIIZ(c14eqLIZIZ);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.LLILLJJLI);
            if (sendMessage(obtainMessage())) {
                this.LLILZ = true;
                return;
            }
            throw new C14EW("Could not send handler message");
        } catch (Throwable th) {
            this.LLILZ = false;
            throw th;
        }
    }

    public HandlerPoster(EventBus eventBus, Looper looper) {
        super(looper);
        this.LLILLL = eventBus;
        this.LLILLJJLI = 10;
        this.LL = new C14ET();
    }

    @Override // X.InterfaceC20231114Eb
    public final void LIZJ(Object obj, C14EP c14ep) {
        C14EQ c14eqLIZ = C14EQ.LIZ(obj, c14ep);
        synchronized (this) {
            try {
                this.LL.LIZ(c14eqLIZ);
                if (!this.LLILZ) {
                    this.LLILZ = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new C14EW("Could not send handler message");
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
