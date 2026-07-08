package com.ss.android.ugc.aweme.ecommerce.base.common;

import X.C0X52;
import X.C1507790pL7;
import X.C7879035x;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.retrofit2.client.Request;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes31.dex */
public final class EcommerceRequestParamsMonitor implements NetworkPartner.Bystander {
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LIZLLL(C0X52<?> c0x52) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJ(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void onException(Throwable th) {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x0018, B:7:0x0023, B:9:0x002e, B:11:0x0034, B:13:0x003e, B:23:0x0061, B:24:0x0065, B:26:0x006b, B:28:0x007b, B:16:0x0045, B:17:0x0049, B:19:0x004f), top: B:44:0x0000 }] */
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.bytedance.retrofit2.client.Request r5) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.common.EcommerceRequestParamsMonitor.LJI(com.bytedance.retrofit2.client.Request):void");
    }

    public static void LIZIZ(String str, String str2) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("package_type", C7879035x.LIZIZ());
        linkedHashMap.put("path", str);
        linkedHashMap.put("business", "GECC");
        linkedHashMap.put("requestParams", str2);
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("gecc_request_report", linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:8:0x0016, B:10:0x0020, B:12:0x0026, B:14:0x0030, B:24:0x0053, B:25:0x0057, B:27:0x005d, B:29:0x006d, B:17:0x0037, B:18:0x003b, B:20:0x0041), top: B:35:0x0016 }] */
    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(com.bytedance.retrofit2.client.Request r8, X.C0X52<?> r9, java.lang.Throwable r10) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.ecommerce.ab.EcVmSdkConfigSettings$EcVmSdkConfigModel r0 = com.ss.android.ugc.aweme.ecommerce.ab.EcVmSdkConfigSettings.LIZ()
            boolean r0 = r0.enableCommonCheckApi
            if (r0 != 0) goto L13
            com.ss.android.ugc.aweme.ecommerce.ab.SmartCheckSettingModelV2 r0 = X.C21187817vo.LIZ()
            com.ss.android.ugc.aweme.ecommerce.ab.SmartCheckSettingModelV2$SmartCheckSwitch r0 = r0.switchConfig
            boolean r0 = r0.subSwitchForRequest
            if (r0 != 0) goto L13
            return
        L13:
            r5 = 0
            r6 = 0
            r3 = 1
            com.ss.android.ugc.aweme.ecommerce.core.ab.EcomRequestParamMonitorSetting$EcomRequestParamsMonitorModel r0 = com.ss.android.ugc.aweme.ecommerce.core.ab.EcomRequestParamMonitorSetting.LIZ()     // Catch: java.lang.Exception -> L7e
            java.util.List<java.lang.String> r1 = r0.rules     // Catch: java.lang.Exception -> L7e
            boolean r0 = r1 instanceof java.util.Collection     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L37
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L37
        L26:
            com.ss.android.ugc.aweme.ecommerce.ab.SmartCheckSettingModelV2 r0 = X.C21187817vo.LIZ()     // Catch: java.lang.Exception -> L7e
            java.util.List<java.lang.String> r1 = r0.apiList     // Catch: java.lang.Exception -> L7e
            boolean r0 = r1 instanceof java.util.Collection     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L53
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L53
            goto L52
        L37:
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> L7e
        L3b:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L26
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L7e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L7e
            java.lang.String r0 = r8.getUrl()     // Catch: java.lang.Exception -> L7e
            boolean r0 = kotlin.text.a0.LJJIIZI(r0, r1, r6)     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L3b
            goto L6d
        L52:
            return
        L53:
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> L7e
        L57:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L7d
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L7e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L7e
            java.lang.String r0 = r8.getUrl()     // Catch: java.lang.Exception -> L7e
            boolean r0 = kotlin.text.a0.LJJIIZI(r0, r1, r6)     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L57
        L6d:
            X.1DFB r0 = X.C0PEM.LIZJ     // Catch: java.lang.Exception -> L7e
            X.054G r2 = X.C2296808zG.LIZ(r0)     // Catch: java.lang.Exception -> L7e
            X.13ul r1 = new X.13ul     // Catch: java.lang.Exception -> L7e
            r1.<init>(r8, r9, r5)     // Catch: java.lang.Exception -> L7e
            r0 = 3
            X.C23250099c.LIZLLL(r2, r5, r5, r1, r0)     // Catch: java.lang.Exception -> L7e
            return
        L7d:
            return
        L7e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.03xw r4 = X.EnumC1014603xw.ERR95
            kotlin.Pair[] r3 = new kotlin.Pair[r3]
            java.lang.String r2 = X.C13SZ.LIZIZ(r0)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "exception_description"
            r1.<init>(r0, r2)
            r3[r6] = r1
            java.util.HashMap r0 = X.C2097608Jq.LJI(r3)
            X.C1019103yf.LIZ(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.common.EcommerceRequestParamsMonitor.LJIIJJI(com.bytedance.retrofit2.client.Request, X.0X52, java.lang.Throwable):void");
    }
}
