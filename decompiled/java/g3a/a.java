package g3a;

import X.AbstractRunnableC21377818lM;
import X.C1C7U;
import X.C21378918lX;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.taskscheduler.scheduler.g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes33.dex */
public abstract class a extends AbstractRunnableC21377818lM {
    public final CountDownLatch LLILZLL = new CountDownLatch(1);
    public final long LLIZ;

    public final void LJIIJ() {
        this.LLILZLL.countDown();
    }

    @Override // X.AbstractRunnableC21377818lM, java.lang.Runnable, X.InterfaceC1408530ml1
    public void run() {
        boolean zLIZ;
        C1C7U.LIZ("BlockingTask@231.run");
        try {
            LJIIIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BlockingTask@231.run");
    }

    public a() {
        g.LIZ.getClass();
        this.LLIZ = g.LJII.getTimeout();
    }

    public final void LJIIIZ() {
        boolean zAwait;
        LJII();
        try {
            zAwait = this.LLILZLL.await(this.LLIZ, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zAwait = false;
        }
        if (this.LLIZ < 30000 || !C21378918lX.LIZ || zAwait) {
            return;
        }
        throw new RuntimeException("taskName: " + this.LLILLL.LIZ + " className: " + getClass().getSimpleName() + " forget to invoke taskFinish() or task execution takes more than 30 seconds");
    }
}
