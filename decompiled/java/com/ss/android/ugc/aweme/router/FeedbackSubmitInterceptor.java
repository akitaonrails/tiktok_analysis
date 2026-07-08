package com.ss.android.ugc.aweme.router;

import X.C0CLW;
import X.C19724912Fj;
import X.C1976907ol;
import X.C686150Qvl;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class FeedbackSubmitInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        Uri uri;
        Uri uri2;
        String host2 = null;
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            host = uri2.getHost();
        } else {
            host = null;
        }
        if (!Intrinsics.LJFF(host, "feedback_input")) {
            if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
                host2 = uri.getHost();
            }
            if (!Intrinsics.LJFF(host2, "i18n_feedback_input")) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String originUrl;
        try {
            C686150Qvl c686150Qvl = new C686150Qvl(C0CLW.LIZIZ.LIZ.getFeedbackConf().getFeHelp());
            if (routeIntent == null) {
                originUrl = null;
            } else {
                originUrl = routeIntent.getOriginUrl();
            }
            Uri uri = UriProtector.parse(originUrl);
            for (String str : UriProtector.getQueryParameterNames(uri)) {
                c686150Qvl.LIZIZ(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str));
            }
            C19724912Fj.LIZLLL().LJII(c686150Qvl.LIZJ());
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return true;
        }
    }
}
