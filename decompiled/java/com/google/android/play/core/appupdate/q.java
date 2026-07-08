package com.google.android.play.core.appupdate;

import X.AbstractRunnableC2463509l3;
import X.C835520Wq6;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends AbstractRunnableC2463509l3 {
    public final /* synthetic */ C835520Wq6 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ u LLILZ;

    /* JADX WARN: Type inference failed for: r5v0, types: [X.09kv, android.os.IInterface] */
    @Override // X.AbstractRunnableC2463509l3
    public final void LIZIZ() {
        try {
            u uVar = this.LLILZ;
            uVar.LIZ.LJIIL.LLZLI(uVar.LIZIZ, u.LIZIZ(), new s(this.LLILZ, this.LLILLJJLI));
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            u.LJ.LIZIZ("completeUpdate(%s)", e, this.LLILLL);
            this.LLILLJJLI.LIZJ(new RuntimeException(e));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C835520Wq6 c835520Wq6, C835520Wq6 c835520Wq62, u uVar, String str) {
        super(c835520Wq6);
        this.LLILZ = uVar;
        this.LLILLJJLI = c835520Wq62;
        this.LLILLL = str;
    }
}
