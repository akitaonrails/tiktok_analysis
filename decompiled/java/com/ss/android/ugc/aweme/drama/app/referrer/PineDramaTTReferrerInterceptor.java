package com.ss.android.ugc.aweme.drama.app.referrer;

import X.C098200Yq;
import X.C09RS;
import X.C0WZX;
import X.C189200o6;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C844470XAv;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.util.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class PineDramaTTReferrerInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean shouldHandleRoute(RouteIntent routeIntent) {
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || !Intrinsics.LJFF(uri.getHost(), "outreach") || !((Boolean) C09RS.LIZ.getValue()).booleanValue()) {
            return false;
        }
        return Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "outreach_to_app_id"), "845221");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Object c098200Yq;
        Uri uri;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "open_schema")) == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        if (a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            Logger.d("PineDramaTTReferrer", "[PineDramaTTReferrerInterceptor] open_schema is blank, skip");
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[PineDramaTTReferrerInterceptor] record deeplink=");
        sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        Logger.d("PineDramaTTReferrer", C2188811AlT.LIZIZ(sbLIZ));
        new Object() { // from class: X.09RT
        }.getClass();
        if (((Boolean) C09RS.LIZ.getValue()).booleanValue()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues();
            contentValues.put("deeplink", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            contentValues.put("timestamp", Long.valueOf(jCurrentTimeMillis));
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            try {
                C2204961BRm.LJJIJLIJ(contextLIZ.getContentResolver(), UriProtector.parse(C786410Ut5.j4("content://%s.provider.drama.ttreferrer", Arrays.copyOf(new Object[]{contextLIZ.getApplicationInfo().packageName}, 1))), contentValues, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO66YpLPkjMXM2TPvqDxjM+LYWZozC9D7Ix9r8CLUI+QSsBUozYxCUlktQ2z", null));
                c098200Yq = Integer.valueOf(Log.d("PineDramaTTReferrer", "[PineDramaTTReferrerHelper] insert success: deeplink=" + strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter + " timestamp=" + jCurrentTimeMillis));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        return false;
    }
}
