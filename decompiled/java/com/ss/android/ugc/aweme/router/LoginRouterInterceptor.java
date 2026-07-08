package com.ss.android.ugc.aweme.router;

import X.AbstractC848400XPy;
import X.C0WZX;
import X.C0XPD;
import X.C0XQ7;
import X.C1076350e7F;
import X.C1388190mED;
import X.C1701330uNH;
import X.C1976907ol;
import X.C1BN8;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C844470XAv;
import X.InterfaceC19725812Fs;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class LoginRouterInterceptor implements IInterceptor, InterfaceC19725812Fs {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            host = uri.getHost();
        } else {
            host = null;
        }
        return Intrinsics.LJFF("login", host);
    }

    @Override // X.InterfaceC19725812Fs
    public final boolean open(String str) throws Throwable {
        LIZIZ(null, str);
        return true;
    }

    @Override // X.InterfaceC19725812Fs
    public final boolean LIZ(Activity activity, String str) throws Throwable {
        LIZIZ(activity, str);
        return true;
    }

    public final boolean LIZIZ(Activity activity, String str) throws Throwable {
        if (Intrinsics.LJFF("push", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "enter_from"))) {
            Intent intentLIZ = C1076350e7F.LIZ(activity);
            Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(ILoginService.class, false, false, false, 14, null);
            if (objPluggableSpi$default != null) {
                Intent intent = new Intent(activity, ((ILoginService) objPluggableSpi$default).getPushLoginActivityClass());
                if (activity != null && !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    if (C1BN8.LIZ().LIZIZ()) {
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
                        C1701330uNH.LIZ(intent, activity);
                        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPindovLznytrRwmjXg+QAYTh2SlBAp8jV1/Dssz", null));
                        return true;
                    }
                    C2204961BRm.LJIILJJIL(activity, new Intent[]{intentLIZ, intent}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPindovLznytrRwmjXg+QAYTh2SlBAp8jV1/Dssz", null));
                    return true;
                }
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                intentLIZ.setFlags(268435456);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(contextLIZ, intentLIZ, "Context_startActivity_1");
                C1701330uNH.LIZ(intentLIZ, contextLIZ);
                C2204961BRm.LJJJJJL(contextLIZ, intentLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPindovLznytrRwmjXg+QAYTh2SlBAp8jV1/Dssz", null));
                return true;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (activity == null) {
            C0XPD.LIZIZ(C2214201BlK.LJFF(), "h5", "", null, null);
            return true;
        }
        C0XPD.LIZIZ(activity, "h5", "", null, null);
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) throws Throwable {
        String url;
        Activity activityLIZ;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            context = activityLIZ;
        }
        String url2 = null;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (routeIntent != null) {
                url2 = routeIntent.getUrl();
            }
            LIZIZ(activity, url2);
            return true;
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            if (routeIntent != null) {
                url2 = routeIntent.getUrl();
            }
            LIZIZ(activityLJFF, url2);
            return true;
        }
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        } else {
            url = null;
        }
        LIZIZ(null, url);
        return true;
    }
}
