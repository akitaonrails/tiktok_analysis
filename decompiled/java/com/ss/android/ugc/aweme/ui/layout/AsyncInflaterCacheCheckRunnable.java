package com.ss.android.ugc.aweme.ui.layout;

import X.C098200Yq;
import X.C189200o6;
import X.C1C7U;
import X.C20673215v0;
import X.C710340Rtg;
import X.EnumC742800TBu;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public final class AsyncInflaterCacheCheckRunnable {
    public final WeakReference<Context> LIZ;
    public final String LIZIZ;
    public final Runnable LIZJ;
    public boolean LJ;
    public Runnable LJFF;
    public boolean LJII;
    public final H LIZLLL = new H();
    public EnumC742800TBu LJI = EnumC742800TBu.LL;

    public final void LIZ() {
        Context context;
        EnumC742800TBu enumC742800TBu = this.LJI;
        EnumC742800TBu enumC742800TBu2 = EnumC742800TBu.LLILZ;
        if (enumC742800TBu == enumC742800TBu2 || (context = this.LIZ.get()) == null) {
            return;
        }
        this.LJI = enumC742800TBu2;
        C20673215v0.LJII(context, this.LIZIZ);
    }

    public final void LIZIZ() {
        EnumC742800TBu enumC742800TBu = this.LJI;
        if (enumC742800TBu == EnumC742800TBu.LL) {
            this.LJI = EnumC742800TBu.LLILLL;
        } else if (enumC742800TBu == EnumC742800TBu.LLILLJJLI) {
            this.LIZLLL.removeMessages(2);
            LIZ();
        }
    }

    public final void LIZJ() {
        this.LIZLLL.removeCallbacksAndMessages(null);
        this.LJFF = null;
        C20673215v0.LJIIIZ(this.LIZIZ);
    }

    public final void LIZLLL() {
        Object c098200Yq;
        if (this.LJII || this.LIZ.get() == null) {
            return;
        }
        try {
            c098200Yq = C710340Rtg.LIZIZ(this.LIZIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        if (c098200Yq != null) {
            this.LIZLLL.sendEmptyMessageDelayed(1, 16L);
            this.LJII = true;
        } else {
            this.LJI = EnumC742800TBu.LLILZ;
            this.LIZJ.run();
            this.LJ = true;
        }
    }

    public final class H extends BPEAHandler {
        public H() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("AsyncInflaterCacheCheckRunnable$H@6dda.handleMessage");
            super.handleMessage(message);
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    AsyncInflaterCacheCheckRunnable.this.LIZ();
                }
            } else {
                AsyncInflaterCacheCheckRunnable asyncInflaterCacheCheckRunnable = AsyncInflaterCacheCheckRunnable.this;
                Context context = asyncInflaterCacheCheckRunnable.LIZ.get();
                if (context == null) {
                    asyncInflaterCacheCheckRunnable.LIZJ();
                } else if (!asyncInflaterCacheCheckRunnable.LJ) {
                    if (C20673215v0.LIZIZ(context, asyncInflaterCacheCheckRunnable.LIZIZ)) {
                        asyncInflaterCacheCheckRunnable.LIZJ.run();
                        asyncInflaterCacheCheckRunnable.LJ = true;
                        if (asyncInflaterCacheCheckRunnable.LJFF != null) {
                            asyncInflaterCacheCheckRunnable.LIZLLL.post(new ARunnableS112S0100000_12(asyncInflaterCacheCheckRunnable, 290));
                        }
                    } else {
                        asyncInflaterCacheCheckRunnable.LIZLLL.sendEmptyMessageDelayed(1, 16L);
                    }
                }
            }
            C1C7U.LIZIZ("AsyncInflaterCacheCheckRunnable$H@6dda.handleMessage");
        }
    }

    public final void LJ(Runnable runnable) {
        if (this.LIZ.get() == null) {
            return;
        }
        if (this.LJ) {
            runnable.run();
            return;
        }
        EnumC742800TBu enumC742800TBu = this.LJI;
        if (enumC742800TBu == EnumC742800TBu.LL) {
            this.LJI = EnumC742800TBu.LLILLJJLI;
            this.LIZLLL.sendEmptyMessageDelayed(2, 200L);
        } else if (enumC742800TBu == EnumC742800TBu.LLILLL) {
            LIZ();
        }
        this.LJFF = runnable;
    }

    public AsyncInflaterCacheCheckRunnable(WeakReference<Context> weakReference, String str, Runnable runnable) {
        this.LIZ = weakReference;
        this.LIZIZ = str;
        this.LIZJ = runnable;
    }
}
