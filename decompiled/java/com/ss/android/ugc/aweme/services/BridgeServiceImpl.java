package com.ss.android.ugc.aweme.services;

import X.C1066720dri;
import X.C10HO;
import X.C1254160ik2;
import X.C1440005kM;
import X.C1594160raQ;
import X.C1618670sDx;
import X.C2188811AlT;
import X.C2277881EDy;
import X.C2429209fW;
import X.C7821033r;
import X.InterfaceC1054820dYW;
import X.InterfaceC1257400ipG;
import X.InterfaceC1257430ipJ;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.ab.BulletFragmentABHelper;
import com.ss.android.ugc.aweme.profile.model.Lemon8Struct;

/* JADX INFO: loaded from: classes29.dex */
public final class BridgeServiceImpl implements InterfaceC1257430ipJ {
    public static final int $stable = 0;

    @Override // X.InterfaceC1257430ipJ
    public InterfaceC1054820dYW getBulletABHelper() {
        return BulletFragmentABHelper.LIZ.getValue();
    }

    @Override // X.InterfaceC1257430ipJ
    public void onFeedStop() {
        C1594160raQ.LIZ.LIZIZ = false;
    }

    @Override // X.InterfaceC1257430ipJ
    public boolean needShowSafeInfoNotice() {
        return C1618670sDx.LIZIZ();
    }

    @Override // X.InterfaceC1257430ipJ
    public void postSafeInfoNoticeEvent(boolean z) {
        C1440005kM.LIZ(new C7821033r(z));
    }

    @Override // X.InterfaceC1257430ipJ
    public void startThirdSocialActivity(Context context, C10HO c10ho, int i, boolean z) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        Lemon8Struct lemon8StructLIZ = c10ho.LIZ();
                        boolean zLJI = MethodIDManager.LJI(200853);
                        C1254160ik2.LIZIZ.LJFF(context, lemon8StructLIZ);
                        if (zLJI) {
                            MethodIDManager.LJ();
                            return;
                        }
                        return;
                    }
                    return;
                }
                String strLIZLLL = c10ho.LIZLLL();
                if (strLIZLLL == null || strLIZLLL.isEmpty()) {
                    return;
                }
                if (z) {
                    C1066720dri.LIZIZ(context, 3, strLIZLLL);
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("twitter://user?id=");
                sbLIZ.append(strLIZLLL);
                Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
                intent.setPackage("com.twitter.android");
                C2429209fW.LIZ().appendDataFlowId(intent, 1207960066);
                try {
                    C1066720dri.LIZ(context, intent);
                    return;
                } catch (ActivityNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("https://twitter.com/intent/user?user_id=");
                    sbLIZ2.append(strLIZLLL);
                    C1066720dri.LIZJ(context, 402665474, C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
            }
            String strLIZJ = c10ho.LIZJ();
            if (strLIZJ == null || strLIZJ.isEmpty()) {
                return;
            }
            if (z) {
                C1066720dri.LIZIZ(context, 2, strLIZJ);
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("https://www.youtube.com/channel/");
            sbLIZ3.append(strLIZJ);
            Uri uri = UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ3));
            Intent intent2 = new Intent("android.intent.action.VIEW", uri);
            intent2.setPackage("com.google.android.youtube");
            C2429209fW.LIZ().appendDataFlowId(intent2, 1207964673);
            try {
                C1066720dri.LIZ(context, intent2);
                return;
            } catch (ActivityNotFoundException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1066720dri.LIZJ(context, 402665475, uri.toString());
                return;
            }
        }
        String strLIZIZ = c10ho.LIZIZ();
        if (strLIZIZ == null || strLIZIZ.isEmpty()) {
            return;
        }
        if (z) {
            C1066720dri.LIZIZ(context, 1, strLIZIZ);
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("instagram://user?username=");
        sbLIZ4.append(strLIZIZ);
        Intent intent3 = new Intent("android.intent.action.VIEW", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ4)));
        intent3.setPackage("com.instagram.android");
        C2429209fW.LIZ().appendDataFlowId(intent3, 1207959812);
        try {
            C1066720dri.LIZ(context, intent3);
        } catch (ActivityNotFoundException e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("https://instagram.com/_u/");
            sbLIZ5.append(strLIZIZ);
            C1066720dri.LIZJ(context, 402665473, C2188811AlT.LIZIZ(sbLIZ5));
        }
    }

    @Override // X.InterfaceC1257430ipJ
    public InterfaceC1257400ipG createAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return C2277881EDy.LIZIZ.getMTAwemeListFragment(i, i2, str, str2, z, z2, z4, new Bundle());
    }
}
