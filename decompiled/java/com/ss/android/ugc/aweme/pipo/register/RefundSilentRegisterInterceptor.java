package com.ss.android.ugc.aweme.pipo.register;

import X.C098200Yq;
import X.C0PEM;
import X.C1507010pJr;
import X.C1546480qLW;
import X.C155000ia;
import X.C189200o6;
import X.C1905707dH;
import X.C1948507kB;
import X.C1976907ol;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC1506990pJp;
import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes24.dex */
public class RefundSilentRegisterInterceptor implements IInterceptor {
    public String LL = "";
    public String LLILLJJLI = "";

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String path;
        if (routeIntent == null || (path = routeIntent.getPath()) == null) {
            return false;
        }
        return a0.LJJIIZI(path, "refund_wallet/entry/silent", false);
    }

    public final void LIZ(String str, String str2) {
        Object c098200Yq;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (C1948507kB.LIZ(this.LL)) {
                linkedHashMap.put("merchant_id", this.LL);
            }
            if (C1948507kB.LIZ(this.LLILLJJLI)) {
                linkedHashMap.put("merchant_user_id", this.LLILLJJLI);
            }
            linkedHashMap.put("result", str);
            if (C1948507kB.LIZ(str2)) {
                linkedHashMap.put("error_msg", str2);
            }
            C1905707dH.LIZ("rd_pipo_refund_silent_register", linkedHashMap);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C155000ia.LIZIZ(c098200Yq);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [X.0pJp, X.0qMq] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String path;
        Object c098200Yq;
        Uri uri;
        if (routeIntent == null || (path = routeIntent.getPath()) == null || !a0.LJJIIZI(path, "refund_wallet/entry/silent", false)) {
            return false;
        }
        final boolean zLJFF = Intrinsics.LJFF("1", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(routeIntent.getOriginUrl()), "need_callback"));
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(routeIntent.getOriginUrl()), "merchant_id");
        String str = "";
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        this.LL = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(routeIntent.getOriginUrl()), "merchant_user_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
        }
        this.LLILLJJLI = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        String originUrl = routeIntent.getOriginUrl();
        ?? r10 = new InterfaceC1506990pJp() { // from class: X.0qMq
            @Override // X.InterfaceC1506990pJp
            public final void onSuccess() {
                if (zLJFF) {
                    n nVar = new n();
                    nVar.LJJIIJ("result", "success");
                    new C1548870qPN().LJ("pipo_user_register_result", nVar.toString());
                }
                this.LIZ("success", null);
            }

            @Override // X.InterfaceC1506990pJp
            public final void LIZ(String str2) {
                String str3;
                String str4;
                if (zLJFF) {
                    SettingsManager.LIZLLL().getClass();
                    if (SettingsManager.LIZ("pipo_pa_rtc_callback_fix_fail", false)) {
                        str3 = "fail";
                    } else {
                        str3 = "success";
                    }
                    n nVar = new n();
                    nVar.LJJIIJ("result", str3);
                    if (str2 == null) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    nVar.LJJIIJ("error_msg", str4);
                    new C1548870qPN().LJ("pipo_user_register_result", nVar.toString());
                }
                this.LIZ("fail", str2);
            }
        };
        if (originUrl.length() == 0) {
            r10.LIZ("schema is null");
        } else {
            try {
                uri = UriProtector.parse(originUrl);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "host");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (str.length() == 0) {
                r10.LIZ("host is null");
                return true;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "merchant_id");
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "pipo_product_code");
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "token");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7.length() != 0) {
                c098200Yq = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C1546480qLW(CoroutineExceptionHandler.LJJLIL, r10))), null, null, new C1507010pJr(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5, r10, null), 3);
                C189200o6.m2constructorimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    String message = thM5exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "error";
                    }
                    r10.LIZ(message);
                    return true;
                }
            } else {
                r10.LIZ("token is null");
                return true;
            }
        }
        return true;
    }
}
