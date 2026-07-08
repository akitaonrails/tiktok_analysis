package com.ss.android.ugc.aweme.compliance.business.policynotice.routeaction;

import X.AbstractC1387200mCc;
import X.AbstractC848400XPy;
import X.C0DHG;
import X.C0XQ7;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1906580ziK;
import X.C1914170zuZ;
import X.C19719212De;
import X.C1A41;
import X.C632670Orh;
import X.C985403tE;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import kotlin.jvm.internal.AwS114S0110000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes29.dex */
public final class ConfirmLogoutRouteAction implements IRouteAction {
    public static void LIZ(boolean z) {
        if (z && ComplianceServiceProvider.LJIJI().LIZ() != null) {
            C1914170zuZ.LIZ();
        }
        C0XQ7.LIZJ().logout("router_action", "user_logout");
    }

    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if ((context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) && ((abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null)) {
            return Boolean.FALSE;
        }
        boolean z = false;
        if (str != null && !a0.LJJJIL(str) && (uri = UriProtector.parse(str)) != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "dismiss_pns_policy_popups")) != null && (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1") || u.LJIJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "true", true))) {
            z = true;
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser() == null) {
            LIZ(z);
            return Boolean.TRUE;
        }
        if (C0DHG.LIZ() && C1388190mED.LIZ(activityLIZ) != null) {
            C632670Orh.LIZIZ(activityLIZ, new C19719212De(1389031283, new C1A41(this, z), true));
        } else {
            C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
            c1397580mTM.LJFF(2131828323);
            c1397580mTM.LIZ(2131828322);
            C985403tE.LIZ(c1397580mTM, new AwS114S0110000_28(this, z, 0));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        return Boolean.TRUE;
    }
}
