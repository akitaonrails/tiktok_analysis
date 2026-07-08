package com.bytedance.pipo.ttpay.onboarding;

import X.C1716310ulR;
import X.C1716650ulz;
import X.C1976907ol;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.pipo.common.ab.PipoTtpayOsCheckModel;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes27.dex */
public final class TTPayOnBoardingInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Integer num;
        boolean z;
        Uri uri;
        PipoTtpayOsCheckModel pipoTtpayOsCheckModel = C1716650ulz.LIZJ().osCheck;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        if (pipoTtpayOsCheckModel != null) {
            num = pipoTtpayOsCheckModel.androidSdkVersion;
        } else {
            num = null;
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("step", "onboarding_intercept"), new Pair("result", "check"), new Pair("arg1", String.valueOf(num)));
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("rd_pipo_on_boarding", mapLJIIIIZZ);
        if (num == null) {
            int i = C2187451AjH.LIZ;
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= num.intValue()) {
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInterceptRoute, currentSdk:");
            sbLIZ.append(i2);
            sbLIZ.append(" >= requiredSdk:");
            sbLIZ.append(num);
            sbLIZ.append(", release route");
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        if (routeIntent != null && (uri = routeIntent.getUri()) != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "update_system_url")) != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onInterceptRoute, currentSdk:");
            sbLIZ2.append(i2);
            sbLIZ2.append(" < requiredSdk:");
            sbLIZ2.append(num);
            sbLIZ2.append(", but update_system_url is empty, release route");
            C2188811AlT.LIZIZ(sbLIZ2);
            C1716310ulR.LIZLLL("rd_pipo_on_boarding", C2097608Jq.LJIIIIZZ(new Pair("step", "onboarding_intercept"), new Pair("result", "intercept"), new Pair("extra", Integer.valueOf(i2)), new Pair("arg1", "url_null"), new Pair("arg2", num.toString())));
            return true;
        }
        C1716310ulR.LIZLLL("rd_pipo_on_boarding", C2097608Jq.LJIIIIZZ(new Pair("step", "onboarding_intercept"), new Pair("result", "intercept"), new Pair("extra", Integer.valueOf(i2)), new Pair("arg1", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter), new Pair("arg2", num.toString())));
        int i5 = C2187451AjH.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onInterceptRoute, currentSdk:");
        sbLIZ3.append(i2);
        sbLIZ3.append(" < requiredSdk:");
        sbLIZ3.append(num);
        sbLIZ3.append(", redirect to update_system_url:");
        sbLIZ3.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        C2188811AlT.LIZIZ(sbLIZ3);
        SmartRouter.buildRoute(context, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).open();
        return true;
    }
}
