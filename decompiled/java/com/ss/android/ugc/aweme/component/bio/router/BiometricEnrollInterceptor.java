package com.ss.android.ugc.aweme.component.bio.router;

import X.C1238130iKB;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1715520ukA;
import X.C1716020uky;
import X.C1716050ul1;
import X.C1836510xtJ;
import X.C1948507kB;
import X.C1976907ol;
import X.C19EG;
import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.component.bio.biometric.enroll.BioEnrollFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.AwS6S1310000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public final class BiometricEnrollInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) throws JSONException {
        C19EG c19egLIZIZ;
        String url;
        boolean zLJIJI;
        String string;
        if (!C1716020uky.LIZ()) {
            C1715520ukA.LIZLLL("bio_ef_system_check", CardStruct.IStatusCode.DEFAULT, null, null);
            C1716020uky.LIZIZ(false);
            return true;
        }
        C1715520ukA.LIZLLL("bio_ef_system_check", "1", null, null);
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        } else {
            url = null;
        }
        if (C1948507kB.LIZ(url) && c19egLIZIZ != null) {
            Uri uri = UriProtector.parse(url);
            int iLIZ = C1836510xtJ.LIZIZ(c19egLIZIZ).LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInterceptRoute canAuthenticate: ");
            sbLIZ.append(iLIZ);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("BiometricEnrollInterceptor", C2188811AlT.LIZIZ(sbLIZ));
            C1716050ul1 c1716050ul1 = new C1716050ul1(C1716020uky.LIZLLL(uri));
            C1715520ukA.LIZLLL("bio_ef_bio_mgr_check", String.valueOf(iLIZ), null, null);
            if (iLIZ != 0) {
                if (iLIZ != 11) {
                    C1716020uky.LIZIZ(false);
                    return true;
                }
                if (Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "pre_check_bio"), "1")) {
                    C1716020uky.LIZIZ(false);
                    return true;
                }
                C1716050ul1.LJ(c1716050ul1, "biometric_info_not_set", new String[]{"go_to_settings", "maybe_later"});
                int i = Build.VERSION.SDK_INT;
                if (i == 28) {
                    if (u.LJIJI(Build.MANUFACTURER, "HUAWEI", true) || u.LJIJI(Build.BRAND, "Redmi", true)) {
                        zLJIJI = true;
                        string = context.getString(2131840137);
                    }
                    zLJIJI = false;
                    string = context.getString(2131840134);
                } else {
                    if (i == 29) {
                        zLJIJI = u.LJIJI(Build.BRAND, "Redmi", true);
                        if (zLJIJI) {
                            string = context.getString(2131840137);
                        }
                    } else {
                        zLJIJI = false;
                    }
                    string = context.getString(2131840134);
                }
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJI(context.getString(2131840136));
                c1397580mTM.LIZIZ(context.getString(2131840133));
                c1397580mTM.LJII = false;
                C1238130iKB.LIZ(c1397580mTM, new AwS6S1310000_26(string, zLJIJI, context, c1716050ul1, c19egLIZIZ, 0));
                new C1397510mTF(c1397580mTM).LIZLLL();
                C1716020uky.LIZIZ(false);
                return true;
            }
            BioEnrollFragment bioEnrollFragment = new BioEnrollFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("openPageUrl", url, bundle);
            bioEnrollFragment.setArguments(bundle);
            bioEnrollFragment.show(c19egLIZIZ.getSupportFragmentManager(), "BiometricEnrollInterceptor");
            return true;
        }
        String strValueOf = String.valueOf(C1948507kB.LIZ(url));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c19egLIZIZ);
        sbLIZ2.append(" is FragmentActivity");
        C1715520ukA.LIZJ("bio_enroll_invalid_env", strValueOf, C2188811AlT.LIZIZ(sbLIZ2), 8);
        C1716020uky.LIZIZ(false);
        return true;
    }
}
