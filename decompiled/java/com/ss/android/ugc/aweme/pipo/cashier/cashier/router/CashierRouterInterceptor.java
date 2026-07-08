package com.ss.android.ugc.aweme.pipo.cashier.cashier.router;

import X.C1227904rF;
import X.C1548870qPN;
import X.C1708710uZB;
import X.C1708720uZC;
import X.C1709570uaZ;
import X.C1711340udQ;
import X.C1976907ol;
import X.C2188811AlT;
import X.EnumC1708880uZS;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.PIPOPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPaymentMethod;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPaymentMethodDetail;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CashierRouterInterceptor implements IInterceptor {
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
        return Intrinsics.LJFF(host, "pipo");
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String path;
        String path2 = null;
        if (routeIntent != null) {
            path = routeIntent.getPath();
        } else {
            path = null;
        }
        if (Intrinsics.LJFF(path, "/cashier/pay_page")) {
            if (context == null) {
                return false;
            }
            LIZLLL(routeIntent, context, EnumC1708880uZS.LEGACY);
            return true;
        }
        if (Intrinsics.LJFF(path, "/cashier/unified_pay_page")) {
            if (context == null) {
                return false;
            }
            LIZLLL(routeIntent, context, EnumC1708880uZS.UNIFIED_V3);
            return true;
        }
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unsupported cashier route path: ");
        if (routeIntent != null) {
            path2 = routeIntent.getPath();
        }
        sbLIZ.append(path2);
        c1708720uZCLIZ.LIZ(6, C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c A[PHI: r0
      0x004c: PHI (r0v11 java.lang.String) = (r0v0 java.lang.String), (r0v13 java.lang.String) binds: [B:19:0x0040, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.bytedance.router.RouteIntent r44, android.content.Context r45, X.EnumC1708880uZS r46) {
        /*
            Method dump skipped, instruction units count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.cashier.cashier.router.CashierRouterInterceptor.LIZLLL(com.bytedance.router.RouteIntent, android.content.Context, X.0uZS):void");
    }

    public static void LIZIZ(String str, int i, PaymentOption paymentOption, String str2) {
        PIPOPaymentMethod pIPOPaymentMethod;
        CBIPaymentMethod cBIPaymentMethod;
        CBIPaymentMethodDetail cBIPaymentMethodDetailLIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pay_request_id", str);
        linkedHashMap.put("result", Integer.valueOf(i));
        if (str2 != null) {
            linkedHashMap.put("error_msg", str2);
        }
        if (paymentOption != null && (pIPOPaymentMethod = paymentOption.legacyPM) != null && (cBIPaymentMethod = pIPOPaymentMethod.cbiPaymentMethod) != null && (cBIPaymentMethodDetailLIZ = cBIPaymentMethod.LIZ()) != null) {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(cBIPaymentMethodDetailLIZ);
            if (strLJI == null) {
                strLJI = "";
            }
            linkedHashMap.put("payment_method_json", strLJI);
        }
        C1548870qPN c1548870qPN = new C1548870qPN();
        C1711340udQ.LIZ.getClass();
        c1548870qPN.LJ("pipo_bind_result", C1711340udQ.LJ(linkedHashMap));
    }

    public static void LIZJ(String str, String str2, String str3, C1709570uaZ c1709570uaZ, String str4) {
        PIPOPaymentMethod pIPOPaymentMethod;
        CBIPaymentMethod cBIPaymentMethod;
        CBIPaymentMethodDetail cBIPaymentMethodDetailLIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pay_request_id", str2);
        linkedHashMap.put("result", str3);
        if (str4 != null) {
            linkedHashMap.put("error_msg", str4);
        }
        if (c1709570uaZ != null) {
            String strLJJLIIIIJ = c1709570uaZ.LJJLIIIIJ();
            if (strLJJLIIIIJ != null) {
                linkedHashMap.put("selection_handle", strLJJLIIIIJ);
            }
            PaymentOption paymentOptionLJJIJIIJI = c1709570uaZ.LJJIJIIJI();
            if (paymentOptionLJJIJIIJI != null && (pIPOPaymentMethod = paymentOptionLJJIJIIJI.legacyPM) != null && (cBIPaymentMethod = pIPOPaymentMethod.cbiPaymentMethod) != null && (cBIPaymentMethodDetailLIZ = cBIPaymentMethod.LIZ()) != null) {
                C1227904rF.LIZ.getClass();
                String strLJI = C1227904rF.LJI(cBIPaymentMethodDetailLIZ);
                if (strLJI == null) {
                    strLJI = "";
                }
                linkedHashMap.put("selected_payment_method_info", strLJI);
            }
        }
        C1548870qPN c1548870qPN = new C1548870qPN();
        C1711340udQ.LIZ.getClass();
        c1548870qPN.LJ(str, C1711340udQ.LJ(linkedHashMap));
    }
}
