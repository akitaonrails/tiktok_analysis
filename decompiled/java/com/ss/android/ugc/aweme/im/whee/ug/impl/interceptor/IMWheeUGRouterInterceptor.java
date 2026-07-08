package com.ss.android.ugc.aweme.im.whee.ug.impl.interceptor;

import X.C098200Yq;
import X.C0I0B;
import X.C0WZX;
import X.C1388190mED;
import X.C1701330uNH;
import X.C189200o6;
import X.C1976907ol;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2431309fr;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class IMWheeUGRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String strLIZIZ;
        if (routeIntent != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(routeIntent.getHost());
            sbLIZ.append(routeIntent.getPath());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = null;
        }
        return Intrinsics.LJFF(strLIZIZ, "im/standalone_app_ug2");
    }

    public static boolean LIZIZ(Context context, String str) {
        try {
            Intent intentAddFlags = new Intent("android.intent.action.VIEW", UriProtector.parse(str)).addFlags(268435456);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentAddFlags, "Context_startActivity_1");
            C1701330uNH.LIZ(intentAddFlags, context);
            C2204961BRm.LJJJJJL(context, intentAddFlags, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYjG2TdQ5aYaT+giLNllj/fJbObDJG9TLBXt7nQjOEyud2hhHUU7z2zuiJ3KCm8rCfFE", null));
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(com.bytedance.router.RouteIntent r4, java.lang.String r5) {
        /*
            android.net.Uri r0 = r4.getUri()
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L26
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r0, r5)
            if (r0 == 0) goto L26
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L26
            int r0 = r1.length()
            if (r0 <= 0) goto L24
            r0 = 1
        L1f:
            if (r0 == 0) goto L26
        L21:
            if (r1 == 0) goto L28
            return r1
        L24:
            r0 = 0
            goto L1f
        L26:
            r1 = r2
            goto L21
        L28:
            android.content.Intent r0 = r4.getExtra()
            if (r0 == 0) goto L4e
            java.lang.String r0 = r0.getStringExtra(r5)     // Catch: java.lang.Exception -> L33
            goto L38
        L33:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = r2
        L38:
            if (r0 == 0) goto L4e
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L4e
            int r0 = r1.length()
            if (r0 > 0) goto L4b
            r3 = 0
        L4b:
            if (r3 == 0) goto L4e
            return r1
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.whee.ug.impl.interceptor.IMWheeUGRouterInterceptor.LIZJ(com.bytedance.router.RouteIntent, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[PHI: r0
      0x0031: PHI (r0v34 java.lang.Integer) = (r0v7 java.lang.Integer), (r0v37 java.lang.Integer) binds: [B:41:0x0082, B:11:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0149 A[RETURN] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(final android.content.Context r27, com.bytedance.router.RouteIntent r28) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.whee.ug.impl.interceptor.IMWheeUGRouterInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }

    public static void LIZ(Context context, String str, String str2, String str3, String str4, String str5) {
        Object c098200Yq;
        String str6 = str5;
        if (str6 == null || !(!a0.LJJJIL(str6))) {
            str6 = "https://snssdk364225.onelink.me/tzwf/z4iprh1a";
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (((Boolean) C2431309fr.LIZ.getValue()).booleanValue() && activityLIZ != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("utm_source=");
                sbLIZ.append(str2);
                String strEncode = Uri.encode(C2188811AlT.LIZIZ(sbLIZ));
                String packageName = activityLIZ.getPackageName();
                intent.setPackage("com.android.vending");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("https://play.google.com/d?id=");
                sbLIZ2.append(str);
                sbLIZ2.append("&referrer=");
                sbLIZ2.append(strEncode);
                intent.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ2)));
                intent.putExtra("overlay", true);
                intent.putExtra("callerId", String.valueOf(packageName));
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZ, intent, "Activity_startActivityForResult_2");
                C1701330uNH.LIZ(intent, activityLIZ);
                C2204961BRm.LJIIZILJ(0, activityLIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYjG2TdQ5aYaT+giLNllj/fJbObDJG9TLBXt7nQjOEyud2hhHUU7z2zuiJ3KCm8rCfFE", null));
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("ttsocial_whee_download_popup_result", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str3), new Pair("enter_method", str4)));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                LIZIZ(activityLIZ, str6);
                return;
            }
            return;
        }
        try {
            Uri.Builder builderAppendQueryParameter = UriProtector.parse("https://play.google.com/d").buildUpon().appendQueryParameter(FollowStatusChangeMethod.PARAM_UID, str);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("utm_source=");
            sbLIZ3.append(str2);
            Intent intentPutExtra = new Intent("android.intent.action.VIEW", builderAppendQueryParameter.appendQueryParameter("referrer", C2188811AlT.LIZIZ(sbLIZ3)).build()).setPackage("com.android.vending").putExtra("overlay", true).putExtra("callerId", context.getPackageName());
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentPutExtra, "Context_startActivity_1");
            C1701330uNH.LIZ(intentPutExtra, context);
            C2204961BRm.LJJJJJL(context, intentPutExtra, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYjG2TdQ5aYaT+giLNllj/fJbObDJG9TLBXt7nQjOEyud2hhHUU7z2zuiJ3KCm8rCfFE", null));
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("ttsocial_whee_download_popup_result", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str3), new Pair("enter_method", str4)));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }
}
