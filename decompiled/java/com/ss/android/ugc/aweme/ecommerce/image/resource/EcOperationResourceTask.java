package com.ss.android.ugc.aweme.ecommerce.image.resource;

import X.AbstractRunnableC204495150b;
import X.C054G;
import X.C0PEM;
import X.C1325970kbr;
import X.C1325990kbt;
import X.C1326020kbw;
import X.C1326580kcq;
import X.C1561210qjH;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.EnumC1153730g83;
import X.EnumC1326550kcn;
import kotlin.jvm.internal.AwS397S0200000_31;

/* JADX INFO: loaded from: classes21.dex */
public final class EcOperationResourceTask extends AbstractRunnableC204495150b {
    public final C054G LLJI;

    public EcOperationResourceTask() {
        super(EnumC1153730g83.MAIN_PAGE_ONLINE_RENDER, false);
        this.LLJI = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
    }

    @Override // X.AbstractRunnableC204495150b
    public final void LIZIZ(AwS397S0200000_31 awS397S0200000_31) {
        EcOperationResourceData ecOperationResourceData = C1325970kbr.LIZ;
        if (ecOperationResourceData.enable == 1) {
            C1326020kbw c1326020kbw = new C1326020kbw();
            c1326020kbw.LIZLLL(0, 0, 0, null);
            C23250099c.LIZLLL(this.LLJI, null, null, new C1325990kbt(((long) ecOperationResourceData.delayTime) * 1000, c1326020kbw, ecOperationResourceData, null), 3);
        }
        C1561210qjH.LIZJ = true;
        C1561210qjH.LIZLLL = false;
        C1326580kcq.LIZJ(EnumC1326550kcn.SECOND_REFRESH_DONE);
        awS397S0200000_31.invoke(Boolean.TRUE);
    }
}
