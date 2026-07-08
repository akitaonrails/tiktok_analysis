package com.heytap.mcssdk.utils;

import X.C1C7U;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class f {
    public final Handler b;
    public final long c;
    public Runnable d;
    public final Object e = new Object();

    public f(Handler handler, long j) {
        this.b = handler == null ? new BPEAHandler(Looper.getMainLooper()) : handler;
        this.c = j;
    }

    public void b() {
        Runnable runnable;
        synchronized (this.e) {
            try {
                Handler handler = this.b;
                if (handler != null && (runnable = this.d) != null) {
                    handler.removeCallbacks(runnable);
                    this.d = null;
                    if (e.g()) {
                        e.b("RegisterTimeoutTask", "register timeout task cancelled");
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public boolean c() {
        boolean z;
        synchronized (this.e) {
            try {
                z = this.d != null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public void a() {
        synchronized (this.e) {
            try {
                b();
                a aVar = new a();
                this.d = aVar;
                C786410Ut5.LJLIIL(this.c, this.b, aVar);
                if (e.g()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("register timeout task started, timeout: ");
                    sbLIZ.append(this.c);
                    sbLIZ.append("ms");
                    e.b("RegisterTimeoutTask", C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static class a implements Runnable {
        public a() {
        }

        public void com_heytap_mcssdk_utils_f$a__run$___twin___() {
            if (e.g()) {
                e.b("RegisterTimeoutTask", "register timeout, increment timeout count");
            }
            g.f().d();
        }

        @Override // java.lang.Runnable
        public void run() {
            C1C7U.LIZ("f$a@cb95.run");
            com_heytap_mcssdk_utils_f$a_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("f$a@cb95.run");
        }

        public static void com_heytap_mcssdk_utils_f$a_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(a aVar) {
            try {
                aVar.com_heytap_mcssdk_utils_f$a__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    }
}
