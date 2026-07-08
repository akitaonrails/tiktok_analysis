package com.ss.android.ugc.aweme.portrait.impl;

import X.C0C64;
import X.C1486390omb;
import X.C1505160pGs;
import X.C1505180pGu;
import X.C1505230pGz;
import X.C1505260pH2;
import X.C1505290pH5;
import X.C1505300pH6;
import X.C1505320pH8;
import X.C1505330pH9;
import X.C1505340pHA;
import X.C1510700pPo;
import X.C823050WQl;
import X.C844470XAv;
import com.ss.android.ugc.aweme.portrait.api.PortraitCenterInitService;

/* JADX INFO: loaded from: classes24.dex */
public final class PortraitCenterInitServiceImpl extends PortraitCenterInitService {
    public static final /* synthetic */ int LIZ = 0;

    @Override // com.ss.android.ugc.aweme.portrait.api.PortraitCenterInitService, com.ss.android.ugc.aweme.portrait.api.IPortraitCenterInitService
    public final void checkAndInit() {
        C1505180pGu.LIZ = false;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "client_portrait_center_switch", true, false)) {
            C1505340pHA.LIZ = C1505300pH6.LIZ;
            C1505260pH2.LIZ = C1486390omb.LIZ;
            C1505230pGz.LIZ = C1505320pH8.LIZ;
            C1505160pGs c1505160pGsLIZ = C1510700pPo.LIZ();
            C844470XAv.LIZ.getClass();
            c1505160pGsLIZ.LJIIJ(C844470XAv.LIZ(), C823050WQl.LJ());
            C1510700pPo.LIZ().LJIIIZ(C1505290pH5.LIZ);
            C1510700pPo.LIZ().LJIIIZ(C1505330pH9.LIZ);
        }
    }
}
