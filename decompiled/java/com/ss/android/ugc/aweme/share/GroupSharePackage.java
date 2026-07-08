package com.ss.android.ugc.aweme.share;

import X.AbstractC1375550ltp;
import X.AbstractC1387200mCc;
import X.C0I0B;
import X.C1370940lmO;
import X.C1370950lmP;
import X.C1371430lnB;
import X.C1388190mED;
import X.C1608506Rn;
import X.C1906580ziK;
import X.C894660Z7w;
import X.EnumC1373410lqN;
import X.InterfaceC1369790lkX;
import android.app.Activity;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class GroupSharePackage extends SharePackage {
    public GroupSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final AbstractC1375550ltp LJIILLIIL(InterfaceC1369790lkX interfaceC1369790lkX) {
        String string;
        String strLJJII;
        IMShareService.LIZ.getClass();
        IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
        String str = "";
        if (iMShareServiceLIZ == null || (string = iMShareServiceLIZ.LJJIII(0, this.url, this.itemType, interfaceC1369790lkX.key())) == null) {
            string = "";
        }
        if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "twitter")) {
            C0I0B.LJFF.LIZJ();
            string = C894660Z7w.LIZ().getString(2131835417, string);
        }
        IMShareService iMShareServiceLIZ2 = C1608506Rn.LIZ();
        if (iMShareServiceLIZ2 != null && (strLJJII = iMShareServiceLIZ2.LJJII(interfaceC1369790lkX, this.itemType, this.description)) != null) {
            str = strLJJII;
        }
        if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "email")) {
            return new C1371430lnB(string, this.title, str);
        }
        return new C1371430lnB(string, str, 4);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIJ(InterfaceC1369790lkX interfaceC1369790lkX, Function2<? super AbstractC1375550ltp, ? super Boolean, Unit> function2) {
        String strLJJIII;
        String string;
        C1371430lnB c1371430lnB;
        Activity activityLIZ;
        Activity activityLIZIZ;
        String strLJJII;
        IMShareService.LIZ.getClass();
        IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
        if (iMShareServiceLIZ != null && iMShareServiceLIZ.LJII(EnumC1373410lqN.SHARE_GROUP_CHAT.getNum())) {
            IMShareService iMShareServiceLIZ2 = C1608506Rn.LIZ();
            String str = "";
            if (iMShareServiceLIZ2 == null || (strLJJIII = iMShareServiceLIZ2.LJJIII(0, this.url, this.itemType, interfaceC1369790lkX.key())) == null) {
                strLJJIII = "";
            }
            if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "twitter")) {
                C0I0B.LJFF.LIZJ();
                string = C894660Z7w.LIZ().getString(2131835417, strLJJIII);
            } else {
                string = strLJJIII;
            }
            IMShareService iMShareServiceLIZ3 = C1608506Rn.LIZ();
            if (iMShareServiceLIZ3 != null && (strLJJII = iMShareServiceLIZ3.LJJII(interfaceC1369790lkX, this.itemType, this.description)) != null) {
                str = strLJJII;
            }
            if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "email")) {
                c1371430lnB = new C1371430lnB(string, this.title, str);
            } else {
                c1371430lnB = new C1371430lnB(string, str, 4);
            }
            C1370950lmP c1370950lmP = SharePackage.Companion;
            AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(217);
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                activityLIZ = C1388190mED.LIZ(activityLIZIZ);
            } else {
                activityLIZ = null;
            }
            c1370950lmP.getClass();
            C1370950lmP.LIZ(strLJJIII, this, c1371430lnB, activityLIZ, aFwS259S0000000_21, function2);
            return;
        }
        super.LJIJ(interfaceC1369790lkX, function2);
    }
}
