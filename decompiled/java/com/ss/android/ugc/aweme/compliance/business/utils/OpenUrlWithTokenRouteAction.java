package com.ss.android.ugc.aweme.compliance.business.utils;

import X.C018G;
import X.C0WZX;
import X.C1069500dwC;
import X.C123100dR;
import X.C1701330uNH;
import X.C20684815ws;
import X.C2204961BRm;
import X.C2344009Gk;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.AgeAppealService;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenUrlWithTokenRouteAction implements IRouteAction {
    public static final int $stable = 0;
    public static final C1069500dwC Companion = new Object() { // from class: X.0dwC
    };

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_business_utils_OpenUrlWithTokenRouteAction_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Context context, Intent intent) {
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/C1TNahjga4ycgRyXuKk15OOLJ2e5XJgt/upyHaXFDOivGq/5c/gWg7sRcr2G6LDvt", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_business_utils_OpenUrlWithTokenRouteAction_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_business_utils_OpenUrlWithTokenRouteAction_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(context, intent);
    }

    public final void openExternalBrowser(String str, Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str));
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        if (context != null) {
            try {
                INVOKEVIRTUAL_com_ss_android_ugc_aweme_compliance_business_utils_OpenUrlWithTokenRouteAction_com_bytedance_router_monitor_page_PageLancet_startActivity(context, intent);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("exception", String.valueOf(e.getMessage()));
                C20684815ws.LJIILLIIL("open_url_with_token_error", c2344009Gk.LIZ);
            }
        }
    }

    public final void openInternalBrowser(String str, Context context) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//webview");
        smartRouteBuildRoute.withParam(UriProtector.parse(str));
        smartRouteBuildRoute.withParam("use_spark", true);
        smartRouteBuildRoute.open(17);
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) throws UnsupportedEncodingException {
        String strDecode = URLDecoder.decode(C018G.LIZIZ(str, "url"), "UTF-8");
        String strLIZIZ = C018G.LIZIZ(str, "enter_from");
        String strLIZIZ2 = C018G.LIZIZ(str, "in_app");
        String strLIZIZ3 = C018G.LIZIZ(str, "verify_ticket");
        String strLIZIZ4 = C018G.LIZIZ(str, "user_nick_name");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", strLIZIZ);
        c2344009Gk.LJIIIIZZ("in_app", strLIZIZ2);
        C20684815ws.LJIILLIIL("open_url_with_token", c2344009Gk.LIZ);
        if (C123100dR.LIZ(strLIZIZ3)) {
            if (Intrinsics.LJFF(strLIZIZ2, "1")) {
                String strValueOf = String.valueOf(1233);
                Uri.Builder builderBuildUpon = UriProtector.parse(strDecode).buildUpon();
                if (C123100dR.LIZ(strValueOf)) {
                    builderBuildUpon.appendQueryParameter("app_id", strValueOf);
                }
                if (C123100dR.LIZ(strLIZIZ3)) {
                    builderBuildUpon.appendQueryParameter("verify_ticket", strLIZIZ3);
                }
                if (C123100dR.LIZ(strLIZIZ4)) {
                    builderBuildUpon.appendQueryParameter("user_nick_name", strLIZIZ4);
                }
                openInternalBrowser(builderBuildUpon.toString(), context);
            } else {
                String strValueOf2 = String.valueOf(1233);
                Uri.Builder builderBuildUpon2 = UriProtector.parse(strDecode).buildUpon();
                if (C123100dR.LIZ(strValueOf2)) {
                    builderBuildUpon2.appendQueryParameter("app_id", strValueOf2);
                }
                if (C123100dR.LIZ(strLIZIZ3)) {
                    builderBuildUpon2.appendQueryParameter("verify_ticket", strLIZIZ3);
                }
                if (C123100dR.LIZ(strLIZIZ4)) {
                    builderBuildUpon2.appendQueryParameter("user_nick_name", strLIZIZ4);
                }
                openExternalBrowser(builderBuildUpon2.toString(), context);
            }
            return Boolean.TRUE;
        }
        if (Intrinsics.LJFF(strLIZIZ2, "1")) {
            ComplianceServiceProvider.LIZIZ.getClass();
            AgeAppealService ageAppealServiceLIZJ = ComplianceServiceProvider.LIZJ();
            if (ageAppealServiceLIZJ != null) {
                ageAppealServiceLIZJ.LIZ(strDecode, new AwS382S0200000_16(this, context, 19));
            }
        } else {
            ComplianceServiceProvider.LIZIZ.getClass();
            AgeAppealService ageAppealServiceLIZJ2 = ComplianceServiceProvider.LIZJ();
            if (ageAppealServiceLIZJ2 != null) {
                ageAppealServiceLIZJ2.LIZ(strDecode, new AwS382S0200000_16(this, context, 20));
            }
        }
        return Boolean.TRUE;
    }
}
