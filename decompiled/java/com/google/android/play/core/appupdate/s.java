package com.google.android.play.core.appupdate;

import X.C2461909kn;
import X.C835520Wq6;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends r {
    @Override // com.google.android.play.core.appupdate.r, X.InterfaceC2467409lg
    public final void LJJZZIII(Bundle bundle) {
        super.LJJZZIII(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.LLILLJJLI.LIZJ(new com.google.android.play.core.install.a(bundle.getInt("error.code", -2)));
        } else {
            this.LLILLJJLI.LIZLLL(null);
        }
    }

    public s(u uVar, C835520Wq6 c835520Wq6) {
        super(uVar, new C2461909kn("OnCompleteUpdateCallback"), c835520Wq6);
    }
}
