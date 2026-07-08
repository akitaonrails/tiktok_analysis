package com.bytedance.android.starship.strategy.graph;

import X.C05YT;
import X.C09AE;
import X.C23250099c;
import X.C23271099x;
import com.bytedance.android.starship.strategy.CancelableJob;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes3.dex */
public final class CancelableJobImpl implements CancelableJob {
    public volatile boolean isCanceled;
    public C09AE job;

    public CancelableJobImpl() {
        this(null);
    }

    @Override // com.bytedance.android.starship.strategy.CancelableJob
    public void cancel() {
        this.isCanceled = true;
        C09AE c09ae = this.job;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
    }

    public final void cancelAndJoin() throws Throwable {
        try {
            this.isCanceled = true;
            C23250099c.LJ(C23271099x.INSTANCE, new C05YT(this, null));
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final C09AE getJob$engine_release() {
        return this.job;
    }

    public CancelableJobImpl(C09AE c09ae) {
        this.job = c09ae;
    }

    public final void setJob$engine_release(C09AE c09ae) {
        this.job = c09ae;
    }

    public final void setProxyJob(C09AE c09ae) throws Throwable {
        this.job = c09ae;
        if (this.isCanceled) {
            cancelAndJoin();
        }
    }
}
