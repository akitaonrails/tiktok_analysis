package com.ss.android.ugc.aweme.router;

import X.C1976907ol;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SignupOrLoginActivityInterceptorForET implements IInterceptor {
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
        if (Intrinsics.LJFF(host, "account") && Intrinsics.LJFF(routeIntent.getPath(), "/login/signup_or_login")) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Intent extra;
        boolean z;
        String stringExtra;
        String stringExtra2;
        if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
            String stringExtra3 = null;
            try {
                stringExtra3 = extra.getStringExtra("login_panel_type");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (stringExtra3 != null && stringExtra3.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                extra.putExtra("login_panel_type", "deeplink");
            }
            try {
                stringExtra2 = extra.getStringExtra("enter_from");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (stringExtra2 == null || stringExtra2.length() == 0) {
                extra.putExtra("enter_from", "deeplink");
            }
            try {
                stringExtra = extra.getStringExtra("enter_method");
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (stringExtra == null || stringExtra.length() == 0) {
                extra.putExtra("enter_method", "deeplink");
            }
        }
        return false;
    }
}
