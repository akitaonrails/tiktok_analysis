package com.ss.android.ugc.aweme.compliance.protection.familypairing;

import X.C1388190mED;
import X.C1976907ol;
import X.InterfaceC19725812Fs;
import android.app.Activity;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;

/* JADX INFO: loaded from: classes17.dex */
public class FamilyPairingRouter implements InterfaceC19725812Fs, IInterceptor {
    @Override // X.InterfaceC19725812Fs
    public final boolean LIZ(Activity activity, String str) {
        return true;
    }

    @Override // X.InterfaceC19725812Fs
    public final boolean open(String str) {
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        if (routeIntent != null && routeIntent.getUri() != null) {
            host = routeIntent.getUri().getHost();
        } else {
            host = null;
        }
        return "teen_protection".equals(host);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        C1388190mED.LIZ(context);
        routeIntent.getOriginUrl();
        return true;
    }
}
