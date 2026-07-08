package com.ss.android.ugc.aweme.im.streak.impl.pet.share;

import X.AbstractC1375550ltp;
import X.C1370940lmO;
import X.C1371430lnB;
import X.C1608506Rn;
import X.InterfaceC1369790lkX;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakSharePackage extends SharePackage {
    public StreakSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final AbstractC1375550ltp LJIILLIIL(InterfaceC1369790lkX interfaceC1369790lkX) {
        String strLJJIII;
        IMShareService.LIZ.getClass();
        IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
        if (iMShareServiceLIZ == null || (strLJJIII = iMShareServiceLIZ.LJJIII(0, this.url, this.itemType, interfaceC1369790lkX.key())) == null) {
            strLJJIII = "";
        }
        return new C1371430lnB(strLJJIII, "", 4);
    }
}
