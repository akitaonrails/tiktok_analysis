package com.google.android.play.core.appupdate;

import X.C19262110Xj;
import X.C2465209lK;
import X.C2465609lO;
import X.C786410Ut5;
import X.C835510Wq5;
import X.C835520Wq6;
import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements b {
    public final u LIZ;
    public final g LIZIZ;
    public final Context LIZJ;

    @Override // com.google.android.play.core.appupdate.b
    public final synchronized void LIZ() {
        this.LIZIZ.LIZ();
    }

    @Override // com.google.android.play.core.appupdate.b
    public final C835510Wq5 LIZIZ() {
        u uVar = this.LIZ;
        String packageName = this.LIZJ.getPackageName();
        if (uVar.LIZ == null) {
            return u.LIZJ();
        }
        u.LJ.LIZJ("requestUpdateInfo(%s)", packageName);
        C835520Wq6 c835520Wq6 = new C835520Wq6();
        C2465209lK c2465209lK = uVar.LIZ;
        p pVar = new p(c835520Wq6, c835520Wq6, uVar, packageName);
        c2465209lK.getClass();
        C786410Ut5.LJJZZIII(c2465209lK.LIZ(), new C2465609lO(c2465209lK, c835520Wq6, c835520Wq6, pVar));
        return c835520Wq6.LIZ;
    }

    @Override // com.google.android.play.core.appupdate.b
    public final C835510Wq5 LJ() {
        u uVar = this.LIZ;
        String packageName = this.LIZJ.getPackageName();
        if (uVar.LIZ == null) {
            return u.LIZJ();
        }
        u.LJ.LIZJ("completeUpdate(%s)", packageName);
        C835520Wq6 c835520Wq6 = new C835520Wq6();
        C2465209lK c2465209lK = uVar.LIZ;
        q qVar = new q(c835520Wq6, c835520Wq6, uVar, packageName);
        c2465209lK.getClass();
        C786410Ut5.LJJZZIII(c2465209lK.LIZ(), new C2465609lO(c2465209lK, c835520Wq6, c835520Wq6, qVar));
        return c835520Wq6.LIZ;
    }

    @Override // com.google.android.play.core.appupdate.b
    public final synchronized void LIZLLL(C19262110Xj c19262110Xj) {
        this.LIZIZ.LIZIZ(c19262110Xj);
    }

    @Override // com.google.android.play.core.appupdate.b
    public final boolean LIZJ(a aVar, Activity activity) throws IntentSender.SendIntentException {
        z zVarLIZJ = d.LIZJ();
        if (activity == null || aVar == null || aVar.LIZ(zVarLIZJ) == null || aVar.LJIIIZ) {
            return false;
        }
        aVar.LJIIIZ = true;
        activity.startIntentSenderForResult(aVar.LIZ(zVarLIZJ).getIntentSender(), 19, null, 0, 0, 0, null);
        return true;
    }

    public j(u uVar, g gVar, Context context) {
        new BPEAHandler(Looper.getMainLooper());
        this.LIZ = uVar;
        this.LIZIZ = gVar;
        this.LIZJ = context;
    }
}
