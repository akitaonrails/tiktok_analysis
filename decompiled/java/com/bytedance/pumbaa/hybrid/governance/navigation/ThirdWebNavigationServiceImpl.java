package com.bytedance.pumbaa.hybrid.governance.navigation;

import X.C0WMK;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityWebNavigationService;

/* JADX INFO: loaded from: classes14.dex */
public final class ThirdWebNavigationServiceImpl implements SparkSecurityWebNavigationService {
    public final C0WMK LIZ;

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService
    public boolean interceptable() {
        return true;
    }

    public ThirdWebNavigationServiceImpl(C0WMK c0wmk) {
        this.LIZ = c0wmk;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityWebNavigationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C821850WLv handleWebViewWillStartNavigation(X.C828420Wee r13) {
        /*
            r12 = this;
            X.0WMT r3 = new X.0WMT
            r3.<init>()
            r11 = r13
            java.util.Map<java.lang.String, java.lang.Object> r1 = r11.LJFF
            java.lang.String r0 = "URL"
            java.lang.Object r6 = r1.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            java.util.Map<java.lang.String, java.lang.Object> r1 = r11.LJFF
            java.lang.String r0 = "origin_http_url"
            java.lang.Object r5 = r1.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.util.Map<java.lang.String, java.lang.Object> r1 = r11.LJFF
            java.lang.String r0 = "is_main_frame"
            java.lang.Object r0 = r1.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r10 = r0.booleanValue()
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.LJFF
            java.lang.String r1 = "web_instance"
            boolean r0 = r0.containsKey(r1)
            r2 = 0
            if (r0 == 0) goto L80
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.LJFF
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof java.lang.ref.WeakReference
            if (r0 == 0) goto L80
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            if (r1 == 0) goto L80
            java.lang.Object r7 = r1.get()
            android.webkit.WebView r7 = (android.webkit.WebView) r7
        L48:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r11.LJFF
            java.lang.String r0 = "is_spark"
            java.lang.Object r0 = r1.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.LJFF
            java.lang.String r1 = "dataflowId"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L7e
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.LJFF
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r8 = r0.intValue()
        L6c:
            X.0WMt r4 = new X.0WMt
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.LIZ = r4
            X.0WMK r0 = r12.LIZ
            X.0WM1 r0 = r0.LIZ(r3)
            if (r0 == 0) goto L7d
            X.0WLv r2 = r0.LIZLLL
        L7d:
            return r2
        L7e:
            r8 = 0
            goto L6c
        L80:
            r7 = r2
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pumbaa.hybrid.governance.navigation.ThirdWebNavigationServiceImpl.handleWebViewWillStartNavigation(X.0Wee):X.0WLv");
    }
}
