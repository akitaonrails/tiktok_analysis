package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.ability;

import X.AnonymousClass0951;
import X.C09IC;
import X.C1BNE;
import X.C2252321DDq;

/* JADX INFO: loaded from: classes4.dex */
public final class PdpNavBarAbility implements IPdpNavBarAbility {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;

    public PdpNavBarAbility() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.FALSE);
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.ability.IPdpNavBarAbility
    public final void wI(boolean z) {
        this.LL.setValue(Boolean.valueOf(z));
    }
}
