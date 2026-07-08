package com.ss.android.ugc.aweme.service;

import X.C01GW;
import X.C1595440rcU;
import X.C1595450rcV;
import X.C1595460rcW;
import X.C1595470rcX;
import X.C452501pT;
import X.InterfaceC1564570qoh;
import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService;
import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabRedDotService;
import com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService;

/* JADX INFO: loaded from: classes25.dex */
public final class Social2TabServiceImpl implements ISocial2TabService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1595440rcU());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1595450rcV());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1595470rcX());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1595460rcW());

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService
    public final InterfaceC1564570qoh LIZ() {
        return (InterfaceC1564570qoh) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService
    public final ISocial2TabRedDotService LIZIZ() {
        return (ISocial2TabRedDotService) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.ISocial2TabService
    public final ISocial2TabDelegateService LIZJ() {
        return (ISocial2TabDelegateService) this.LIZ.getValue();
    }
}
