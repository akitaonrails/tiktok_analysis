package com.ss.android.ugc.aweme.poi.thirdparty;

import X.C1388190mED;
import X.C1912680zsA;
import X.C1976907ol;
import X.C19EG;
import X.EnumC1779910wQ1;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PoiThirdPartyDisclaimerInterceptor implements IInterceptor {
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
        return Intrinsics.LJFF(host, "poi_disclaimer_third_party");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        String stringExtra;
        Intent extra;
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
            return false;
        }
        String stringExtra2 = null;
        if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
            try {
                stringExtra = extra.getStringExtra("enter_from");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        } else {
            stringExtra = null;
            if (routeIntent != null) {
            }
            C1912680zsA.LIZJ(C1912680zsA.LIZ, context, supportFragmentManager, EnumC1779910wQ1.CLAIM, stringExtra, stringExtra2, null, null, 448);
            return true;
        }
        Intent extra2 = routeIntent.getExtra();
        if (extra2 != null) {
            try {
                stringExtra2 = extra2.getStringExtra("enter_method");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        C1912680zsA.LIZJ(C1912680zsA.LIZ, context, supportFragmentManager, EnumC1779910wQ1.CLAIM, stringExtra, stringExtra2, null, null, 448);
        return true;
    }
}
