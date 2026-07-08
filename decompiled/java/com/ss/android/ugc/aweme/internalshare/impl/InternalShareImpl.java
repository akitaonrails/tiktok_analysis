package com.ss.android.ugc.aweme.internalshare.impl;

import X.C01GW;
import X.C2280301ENg;
import X.C2280311ENh;
import X.C2280321ENi;
import X.C452501pT;
import X.InterfaceC1364710lcL;
import X.InterfaceC1367800lhK;
import X.InterfaceC1378730lyx;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;

/* JADX INFO: loaded from: classes36.dex */
public final class InternalShareImpl implements IInternalShareApi {
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C2280301ENg());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C2280311ENh());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C2280321ENi());

    @Override // com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi
    public final InterfaceC1378730lyx LIZ() {
        return (InterfaceC1378730lyx) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi
    public final InterfaceC1364710lcL LIZIZ() {
        return (InterfaceC1364710lcL) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi
    public final InterfaceC1367800lhK LIZJ() {
        return (InterfaceC1367800lhK) this.LIZJ.getValue();
    }
}
