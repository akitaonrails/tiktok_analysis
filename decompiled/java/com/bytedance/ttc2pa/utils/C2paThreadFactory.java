package com.bytedance.ttc2pa.utils;

import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttc2pa.utils.C2paThreadFactory;
import com.bytedance.ttc2pa.utils.Logger;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes27.dex */
public final class C2paThreadFactory implements ThreadFactory {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final String LL = "TTC2PA-IO";

    public static final class Companion {
    }

    static {
        new Companion();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        return new BPEAThread(new Runnable() { // from class: X.0uM2
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = runnable;
                C2paThreadFactory c2paThreadFactory = this;
                C1C7U.LIZ("C2paThreadFactory@6776.newThread$1L");
                Process.setThreadPriority(10);
                try {
                    runnable2.run();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Logger logger = Logger.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("C2paThreadFactory error when running in thread ");
                    sbLIZ.append(c2paThreadFactory.LL);
                    C2188811AlT.LIZIZ(sbLIZ);
                    logger.getClass();
                }
                C1C7U.LIZIZ("C2paThreadFactory@6776.newThread$1L");
            }
        }, this.LL);
    }
}
