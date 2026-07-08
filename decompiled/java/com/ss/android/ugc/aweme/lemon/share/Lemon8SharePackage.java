package com.ss.android.ugc.aweme.lemon.share;

import X.AbstractC1375550ltp;
import X.AbstractC19483511Kn;
import X.C11S5;
import X.C1370940lmO;
import X.C1373440lqQ;
import X.C1701940uOG;
import X.C786410Ut5;
import X.InterfaceC1254030ijp;
import X.InterfaceC1369790lkX;
import Y.AfS156S0200000_21;
import Y.AkS72S1200000_21;
import com.ss.android.ugc.aweme.model.LinkDefaultSharePackageV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class Lemon8SharePackage extends LinkDefaultSharePackageV2 {
    public static final int $stable = 8;

    public Lemon8SharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
    }

    @Override // com.ss.android.ugc.aweme.model.LinkDefaultSharePackageV2, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIJ(InterfaceC1369790lkX interfaceC1369790lkX, Function2<? super AbstractC1375550ltp, ? super Boolean, Unit> function2) {
        C1373440lqQ c1373440lqQ = C1373440lqQ.LIZ;
        String str = this.itemType;
        String str2 = this.description;
        c1373440lqQ.getClass();
        String strLIZ = C1373440lqQ.LIZ(interfaceC1369790lkX, str, str2);
        C786410Ut5.LJJJI("share_form", "url_form", this.extras);
        AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lmo
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                c11ky.onSuccess(this.LIZ.url);
            }
        }).LJIIJ(new AkS72S1200000_21(this, interfaceC1369790lkX, strLIZ, 0)).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ()).LJIILLIIL(new AfS156S0200000_21(this, function2, 6));
    }
}
