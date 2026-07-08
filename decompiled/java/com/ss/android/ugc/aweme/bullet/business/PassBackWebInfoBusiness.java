package com.ss.android.ugc.aweme.bullet.business;

import X.C01GW;
import X.C1038730d8Z;
import X.C1039190d9J;
import X.C1041600dDC;
import X.C452501pT;
import X.C844470XAv;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class PassBackWebInfoBusiness extends BulletBusinessService.Business {
    public final C01GW LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final boolean LJ;
    public String LJFF;
    public final C01GW LJI;

    public final void LIZ() {
        C1038730d8Z c1038730d8Z;
        C1041600dDC c1041600dDC = this.LIZ.LIZIZ;
        if ((c1041600dDC instanceof C1038730d8Z) && (c1038730d8Z = (C1038730d8Z) c1041600dDC) != null && Intrinsics.LJFF(c1038730d8Z.LJLILLLLZI.LIZJ(), Boolean.TRUE) && this.LJ) {
            C844470XAv.LIZ.getClass();
            NetworkUtils.getNetworkType(C844470XAv.LIZ());
        }
    }

    public PassBackWebInfoBusiness(C1039190d9J c1039190d9J) {
        super(c1039190d9J);
        this.LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(118));
        this.LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(117));
        this.LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(119));
        this.LJ = true;
        this.LJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(120));
    }
}
