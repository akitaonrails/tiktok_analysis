package com.google.android.play.core.appupdate;

import X.AbstractRunnableC2463509l3;
import X.C835520Wq6;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends AbstractRunnableC2463509l3 {
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C835520Wq6 LLILLL;
    public final /* synthetic */ u LLILZ;

    /* JADX WARN: Type inference failed for: r6v0, types: [X.09kv, android.os.IInterface] */
    @Override // X.AbstractRunnableC2463509l3
    public final void LIZIZ() {
        try {
            u uVar = this.LLILZ;
            uVar.LIZ.LJIIL.LLZZLLIL(uVar.LIZIZ, u.LIZ(uVar, this.LLILLJJLI), new t(this.LLILZ, this.LLILLL, this.LLILLJJLI));
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            u.LJ.LIZIZ("requestUpdateInfo(%s)", e, this.LLILLJJLI);
            this.LLILLL.LIZJ(new RuntimeException(e));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C835520Wq6 c835520Wq6, C835520Wq6 c835520Wq62, u uVar, String str) {
        super(c835520Wq6);
        this.LLILZ = uVar;
        this.LLILLJJLI = str;
        this.LLILLL = c835520Wq62;
    }
}
