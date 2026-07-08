package com.ss.android.ugc.aweme.operation;

import X.C08CX;
import X.C1976907ol;
import X.C20571615ec;
import X.C2095008Iq;
import X.C2188811AlT;
import android.net.Uri;
import com.bytedance.applog.AppLog;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class OutreachOperationRouterInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    public static JSONObject LIZIZ(RouteIntent routeIntent) {
        boolean z;
        String string;
        JSONObject jSONObject = new JSONObject();
        Uri uri = routeIntent.getUri();
        if (uri == null) {
            return jSONObject;
        }
        try {
            Iterable<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            if (queryParameterNames == null) {
                queryParameterNames = C08CX.INSTANCE;
            }
            for (String str : queryParameterNames) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    if (Intrinsics.LJFF(str, "trace_info")) {
                        JSONObject jSONObject2 = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            Object objOpt = jSONObject2.opt(next);
                            if (objOpt != null) {
                                string = objOpt.toString();
                            } else {
                                string = null;
                            }
                            LIZJ(next, string, jSONObject);
                        }
                    } else {
                        LIZJ(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, jSONObject);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20571615ec c20571615ec = C20571615ec.LIZ;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            c20571615ec.getClass();
            C20571615ec.LIZLLL(message);
        }
        return jSONObject;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        return Intrinsics.LJFF(host, "outreach");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01df  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptRoute(android.content.Context r23, com.bytedance.router.RouteIntent r24) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.operation.OutreachOperationRouterInterceptor.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }

    public static Uri LIZ(Uri uri, Uri uri2, JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Uri.Builder builderBuildUpon = uri2.buildUpon();
        Iterable queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames == null) {
            queryParameterNames = C08CX.INSTANCE;
        }
        Iterator it2 = queryParameterNames.iterator();
        while (true) {
            z = false;
            if (!it2.hasNext()) {
                break;
            }
            String str = (String) it2.next();
            if (u.LJJIIJZLJL(str, "outreach", false)) {
                try {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                }
                builderBuildUpon.appendQueryParameter(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
        }
        Iterator<String> itKeys = jSONObject.keys();
        if (itKeys != null) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (u.LJJIIJZLJL(next, "outreach", false)) {
                    builderBuildUpon.appendQueryParameter(next, jSONObject.optString(next));
                }
            }
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "outreach_type");
        String str2 = "";
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = jSONObject.optString("outreach_type")) == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "outreach_key");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            String strOptString = jSONObject.optString("outreach_key");
            if (strOptString != null) {
                str2 = strOptString;
            }
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = str2;
        }
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3.length() > 0) {
                z = true;
            }
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                sbLIZ.append('_');
                sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                builderBuildUpon.appendQueryParameter("gd_label", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        builderBuildUpon.appendQueryParameter("m_device_id", AppLog.getDid());
        Uri uriBuild = builderBuildUpon.build();
        C20571615ec c20571615ec = C20571615ec.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("buildOpenM2Uri: ");
        sbLIZ2.append(uriBuild);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        c20571615ec.getClass();
        C20571615ec.LIZ(strLIZIZ);
        return uriBuild;
    }

    public static void LIZJ(String str, String str2, JSONObject jSONObject) throws JSONException {
        if (str2 != null && str2.length() != 0) {
            if (C2095008Iq.LJIIJJI(str2) != null) {
                jSONObject.putOpt(str, Integer.valueOf(CastIntegerProtector.parseInt(str2)));
            } else {
                jSONObject.putOpt(str, str2);
            }
        }
    }
}
