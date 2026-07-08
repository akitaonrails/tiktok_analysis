package com.ss.android.ugc.aweme.im.userportrait.impl.service;

import X.C01GW;
import X.C452501pT;
import X.InterfaceC2270081DtG;
import X.InterfaceC886280Ypm;
import X.InterfaceC891490YyB;
import X.InterfaceC909580ZmG;
import com.ss.android.ugc.aweme.im.userportrait.api.service.IMUserPortraitApi;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class IMUserPortraitImpl implements IMUserPortraitApi {
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(215));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(90));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(214));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(216));

    @Override // com.ss.android.ugc.aweme.im.userportrait.api.service.IMUserPortraitApi
    public final InterfaceC886280Ypm LIZ() {
        return (InterfaceC886280Ypm) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.userportrait.api.service.IMUserPortraitApi
    public final InterfaceC2270081DtG LIZJ() {
        return (InterfaceC2270081DtG) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.userportrait.api.service.IMUserPortraitApi
    public final InterfaceC891490YyB LIZLLL() {
        return (InterfaceC891490YyB) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.userportrait.api.service.IMUserPortraitApi
    public final InterfaceC909580ZmG LJ() {
        return (InterfaceC909580ZmG) this.LJ.getValue();
    }

    public IMUserPortraitImpl() {
        LIZJ().LJ();
    }

    @Override // com.ss.android.ugc.aweme.im.userportrait.api.service.IMUserPortraitApi
    public final void LIZIZ() {
    }
}
