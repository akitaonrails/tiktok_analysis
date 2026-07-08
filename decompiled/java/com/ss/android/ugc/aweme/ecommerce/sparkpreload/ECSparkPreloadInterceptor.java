package com.ss.android.ugc.aweme.ecommerce.sparkpreload;

import X.C013C;
import X.C1523700pkm;
import X.C1743690vTb;
import X.C1946007jm;
import X.C1976907ol;
import X.C1AF0;
import X.C2188811AlT;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS172S1100000_23;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class ECSparkPreloadInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String url;
        if (routeIntent != null) {
            url = routeIntent.getUrl();
        } else {
            url = null;
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<ECSparkPreloadConfigItem>> concurrentHashMap = C1523700pkm.LIZLLL;
        if (!concurrentHashMap.isEmpty()) {
            Set<String> setKeySet = concurrentHashMap.keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                for (String str : setKeySet) {
                    if ((!a0.LJJJIL(str)) && url != null && a0.LJJIIZI(url, str, false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (routeIntent == null) {
            return false;
        }
        try {
            Uri uriLJ = C1946007jm.LJ(routeIntent.getUrl());
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "channel");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "url")) == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "surl")) == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('/');
                sbLIZ.append(uriLJ.getAuthority());
                sbLIZ.append(uriLJ.getPath());
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (((Boolean) C1523700pkm.LIZIZ.getValue()).booleanValue()) {
                try {
                    C1743690vTb.LIZLLL(new AwS172S1100000_23(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, new C013C(), 9));
                    return false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ECSparkPreloader, handleRoute error: ");
                    sbLIZ2.append(th.getMessage());
                    C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                    return false;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }
}
