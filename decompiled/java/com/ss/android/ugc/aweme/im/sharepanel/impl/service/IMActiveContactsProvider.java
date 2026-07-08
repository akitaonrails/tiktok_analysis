package com.ss.android.ugc.aweme.im.sharepanel.impl.service;

import X.AbstractC1381820m3w;
import X.AbstractC23140094w;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C1368260li4;
import X.C1381880m42;
import X.C2252611DEt;
import com.ss.android.ugc.aweme.im.sharepanel.api.service.IImActiveContactsProvider;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: loaded from: classes22.dex */
public final class IMActiveContactsProvider implements IImActiveContactsProvider {
    public final int LIZ = 100;

    @Override // com.ss.android.ugc.aweme.im.sharepanel.api.service.IImActiveContactsProvider
    public final Object LIZ(AbstractC23140094w abstractC23140094w) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(abstractC23140094w));
        c2252611DEt.LJIJJ();
        C1368260li4 c1368260li4 = new C1368260li4(0, false);
        c1368260li4.LJFF = true;
        c1368260li4.LJIIL = true;
        c1368260li4.LJI = true;
        C1381880m42 c1381880m42 = new C1381880m42(c1368260li4, this.LIZ);
        AbstractC1381820m3w.LJII(c1381880m42, new AwS618S0100000_4(c2252611DEt, 69), new AwS583S0100000_4(c2252611DEt, 267));
        c1381880m42.LIZLLL();
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLJIJ;
    }
}
