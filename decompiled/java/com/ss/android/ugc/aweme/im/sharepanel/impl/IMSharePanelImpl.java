package com.ss.android.ugc.aweme.im.sharepanel.impl;

import X.C01GW;
import X.C1532805zK;
import X.C1EQ4;
import X.C1EQ5;
import X.C1EQ6;
import X.C1EQ7;
import X.C452501pT;
import X.InterfaceC1365380ldQ;
import X.InterfaceC1369310ljl;
import X.InterfaceC1369450ljz;
import X.InterfaceC1428690nHX;
import X.InterfaceC1465770oFL;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.im.sharepanel.impl.service.IMActiveContactsProvider;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes36.dex */
public final class IMSharePanelImpl implements IMSharePanelApi {
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1EQ7());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1532805zK());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1EQ6());
    public final C01GW LJ = C452501pT.LIZIZ(new C1EQ5());
    public final C01GW LJFF = C452501pT.LIZIZ(new C1EQ4());
    public final C01GW LJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(543));

    @Override // com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi
    public final InterfaceC1428690nHX LIZ() {
        return (InterfaceC1428690nHX) this.LJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelSaasApi
    public final InterfaceC1369310ljl LIZIZ() {
        return (InterfaceC1369310ljl) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi
    public final InterfaceC1369450ljz LIZJ() {
        return (InterfaceC1369450ljz) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi
    public final IMActiveContactsProvider LIZLLL() {
        return (IMActiveContactsProvider) this.LJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi
    public final InterfaceC1465770oFL LJ() {
        return (InterfaceC1465770oFL) this.LJFF.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi
    public final InterfaceC1365380ldQ getShareService() {
        return (InterfaceC1365380ldQ) this.LIZIZ.getValue();
    }
}
