package com.ss.android.ugc.aweme.poi.thirdparty;

import X.C1388190mED;
import X.C1976907ol;
import X.C19EG;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class PoiThirdPartyDisclaimerLayerInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        return Intrinsics.LJFF(host, "poi_third_party_disclaimer_layer");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        String stringExtra;
        String stringExtra2;
        Intent extra;
        Intent extra2;
        Intent extra3;
        Intent extra4;
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
            return false;
        }
        ThirdPartyBlurDisclaimerPopup thirdPartyBlurDisclaimerPopup = new ThirdPartyBlurDisclaimerPopup();
        Uri.Builder builderBuildUpon = UriProtector.parse("aweme://roma_redirect/?spark_page=poi_third_party_disclaimer_v3").buildUpon();
        String stringExtra3 = null;
        if (routeIntent != null && (extra4 = routeIntent.getExtra()) != null) {
            try {
                stringExtra3 = extra4.getStringExtra("disclaimer_info");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        String str = "";
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("disclaimer_info", stringExtra3);
        if (routeIntent == null || (extra3 = routeIntent.getExtra()) == null) {
            stringExtra = "";
        } else {
            try {
                stringExtra = extra3.getStringExtra("click_url");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (stringExtra == null) {
                stringExtra = "";
            }
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("click_url", stringExtra);
        if (routeIntent == null || (extra2 = routeIntent.getExtra()) == null) {
            stringExtra2 = "";
        } else {
            try {
                stringExtra2 = extra2.getStringExtra("track_params");
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
        }
        Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("track_params", stringExtra2);
        if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
            try {
                String stringExtra4 = extra.getStringExtra("package_name");
                if (stringExtra4 != null) {
                    str = stringExtra4;
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
        thirdPartyBlurDisclaimerPopup.LLILLJJLI = builderAppendQueryParameter3.appendQueryParameter("package_name", str).build().toString();
        thirdPartyBlurDisclaimerPopup.show(supportFragmentManager, "ThirdPartyBlurDisclaimerPopup");
        return true;
    }
}
