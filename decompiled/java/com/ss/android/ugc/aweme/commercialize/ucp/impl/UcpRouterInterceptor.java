package com.ss.android.ugc.aweme.commercialize.ucp.impl;

import X.C0DHO;
import X.C0DHP;
import X.C13LQ;
import X.C1976907ol;
import X.C19EG;
import X.C2095008Iq;
import X.C332230D0r;
import X.C332710D2n;
import X.InterfaceC332180D0m;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.ucp.IUcpService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class UcpRouterInterceptor implements IInterceptor {
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
        return Intrinsics.LJFF(host, "acshop");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String host;
        int iIntValue;
        C0DHO next;
        IUcpService iUcpService;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Integer numLJIIJJI;
        String lowerCase = null;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        if (!Intrinsics.LJFF(host, "acshop")) {
            return false;
        }
        C0DHP c0dhp = C0DHO.Companion;
        Uri uri = routeIntent.getUri();
        if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "checkout_type")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
            iIntValue = numLJIIJJI.intValue();
        } else {
            iIntValue = 0;
        }
        c0dhp.getClass();
        Iterator<C0DHO> it2 = C0DHO.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getValue() == iIntValue) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0DHO c0dho = next;
        if (c0dho == null) {
            c0dho = C0DHO.STANDARD;
        }
        if (C13LQ.LJJIJIIJI(routeIntent.getPath(), new String[]{"/ucppdp", "/acppdp", "/ucp/onestep_checkout"}) >= 0) {
            C332710D2n c332710D2n = new C332710D2n(c0dho, null, null, null);
            Intent extra = routeIntent.getExtra();
            if (extra != null) {
                extra.putExtra("ucp_entry_context", c332710D2n);
            }
        }
        if (Intrinsics.LJFF(routeIntent.getPath(), "/ucppdp") || Intrinsics.LJFF(routeIntent.getPath(), "/acppdp")) {
            Intent extra2 = routeIntent.getExtra();
            if (extra2 != null) {
                try {
                    String stringExtra = extra2.getStringExtra("fullScreen");
                    if (stringExtra != null) {
                        lowerCase = stringExtra.toLowerCase(Locale.getDefault());
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (!Intrinsics.LJFF(lowerCase, "false") || !(context instanceof C19EG) || (iUcpService = (IUcpService) PluggableExtentionKt.pluggableSpi$default(IUcpService.class, false, false, false, 14, null)) == null) {
                return false;
            }
            if (c0dho == C0DHO.ONESTEP_AUTO) {
                return iUcpService.LJ((C19EG) context, routeIntent.getExtra());
            }
            InterfaceC332180D0m.LIZ.getClass();
            if (Intrinsics.LJFF(C332230D0r.LIZ().getString("ucp_demo.onestep_override_half_pdp", "false"), "true")) {
                return iUcpService.LJIIL((C19EG) context, routeIntent.getExtra());
            }
            return iUcpService.LJI((C19EG) context, routeIntent.getExtra());
        }
        return false;
    }
}
