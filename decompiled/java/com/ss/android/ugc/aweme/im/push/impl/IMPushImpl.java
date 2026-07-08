package com.ss.android.ugc.aweme.im.push.impl;

import X.C01GW;
import X.C0ZVP;
import X.C452501pT;
import X.C817490W5b;
import X.C817500W5c;
import X.InterfaceC815000Vy6;
import X.InterfaceC896430ZEr;
import com.ss.android.ugc.aweme.im.push.api.IMPushApi;

/* JADX INFO: loaded from: classes14.dex */
public final class IMPushImpl implements IMPushApi {
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C817500W5c());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C817490W5b());

    @Override // com.ss.android.ugc.aweme.im.push.api.IMPushApi
    public final InterfaceC815000Vy6 LIZJ() {
        return (InterfaceC815000Vy6) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.IMPushApi
    public final InterfaceC896430ZEr LIZLLL() {
        return (InterfaceC896430ZEr) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.IMPushApi
    public final void LIZ() {
        LIZLLL().LIZ();
        LIZJ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.IMPushApi
    public final void LIZIZ() {
        LIZLLL().LIZIZ();
        LIZJ().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.push.api.IMPushApi
    public final void LJ(String str) {
        C0ZVP.LIZIZ.LIZIZ(str);
    }
}
