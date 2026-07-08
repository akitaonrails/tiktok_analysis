package com.ss.android.ugc.aweme.model;

import X.AbstractC1375550ltp;
import X.C0M7Y;
import X.C11S5;
import X.C1370940lmO;
import X.C1373440lqQ;
import X.C1374720lsU;
import X.C1701940uOG;
import X.C621180OYa;
import X.C786410Ut5;
import X.InterfaceC1369790lkX;
import Y.AfS156S0200000_21;
import Y.AkS72S1200000_21;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public abstract class LinkDefaultSharePackageV2 extends SharePackage {
    public LinkDefaultSharePackageV2(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public void LJIJ(InterfaceC1369790lkX interfaceC1369790lkX, Function2<? super AbstractC1375550ltp, ? super Boolean, Unit> function2) {
        C1373440lqQ c1373440lqQ = C1373440lqQ.LIZ;
        String str = this.itemType;
        String str2 = this.description;
        c1373440lqQ.getClass();
        String strLIZ = C1373440lqQ.LIZ(interfaceC1369790lkX, str, str2);
        C786410Ut5.LJJJI("share_form", "url_form", this.extras);
        C1374720lsU.LJ(this.url, this.itemType, interfaceC1369790lkX.key(), this, 4).LJIIJ(new AkS72S1200000_21(this, interfaceC1369790lkX, strLIZ, 1)).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ()).LJIILLIIL(new AfS156S0200000_21(this, function2, 7));
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public boolean LJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) {
        C621180OYa.LIZIZ.LJJLI(0, interfaceC1369790lkX.key(), "others_video_share_list");
        return false;
    }
}
