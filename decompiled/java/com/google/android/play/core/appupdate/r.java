package com.google.android.play.core.appupdate;

import X.AbstractBinderC2467209le;
import X.C2461909kn;
import X.C835520Wq6;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public class r extends AbstractBinderC2467209le {
    public final C2461909kn LL;
    public final C835520Wq6 LLILLJJLI;
    public final /* synthetic */ u LLILLL;

    @Override // X.InterfaceC2467409lg
    public void LJJZ(Bundle bundle) {
        this.LLILLL.LIZ.LIZJ(this.LLILLJJLI);
        this.LL.LIZJ("onRequestInfo", new Object[0]);
    }

    @Override // X.InterfaceC2467409lg
    public void LJJZZIII(Bundle bundle) {
        this.LLILLL.LIZ.LIZJ(this.LLILLJJLI);
        this.LL.LIZJ("onCompleteUpdate", new Object[0]);
    }

    public r(u uVar, C2461909kn c2461909kn, C835520Wq6 c835520Wq6) {
        this.LLILLL = uVar;
        this.LL = c2461909kn;
        this.LLILLJJLI = c835520Wq6;
    }
}
