package defpackage;

import X.AbstractC2252651DEx;
import X.C0WQX;
import X.C2123408To;
import X.C2123508Tp;
import X.C823050WQl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class d3 extends AbstractC2252651DEx implements Closeable {
    public final AtomicLong LL = new AtomicLong(0);
    public final AtomicLong LLILLJJLI = new AtomicLong(0);
    public final AtomicLong LLILLL = new AtomicLong(0);
    public final ExecutorService LLILZ;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LLILZ.shutdown();
    }

    public d3(int i, String str) {
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        C2123408To c2123408To = new C2123408To(C0WQX.FIXED);
        c2123408To.LIZJ = i;
        c2123408To.LIZLLL = priorityBlockingQueue;
        c2123408To.LIZIZ = str;
        this.LLILZ = C823050WQl.LIZ(new C2123508Tp(c2123408To));
    }

    @Override // X.AbstractC2252651DEx
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        int i;
        long jIncrementAndGet;
        e3 e3Var = (e3) coroutineContext.get(e3.LLILLJJLI);
        try {
            if (e3Var != null) {
                i = e3Var.LL;
                if (i != 1) {
                    jIncrementAndGet = this.LLILLJJLI.decrementAndGet();
                }
                this.LLILZ.execute(new j6(i, jIncrementAndGet, this.LLILLL.incrementAndGet(), runnable));
                return;
            }
            i = 1;
            this.LLILZ.execute(new j6(i, jIncrementAndGet, this.LLILLL.incrementAndGet(), runnable));
            return;
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            return;
        }
        jIncrementAndGet = this.LL.incrementAndGet();
    }
}
