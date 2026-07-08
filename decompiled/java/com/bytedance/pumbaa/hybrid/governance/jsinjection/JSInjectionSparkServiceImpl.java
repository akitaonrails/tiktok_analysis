package com.bytedance.pumbaa.hybrid.governance.jsinjection;

import X.C0WMJ;
import X.C0WMZ;
import X.C821850WLv;
import X.C828420Wee;
import com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSInjectionService;

/* JADX INFO: loaded from: classes14.dex */
public final class JSInjectionSparkServiceImpl implements SparkSecurityJSInjectionService {
    public final C0WMJ LIZ;

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityService
    public boolean interceptable() {
        return true;
    }

    public JSInjectionSparkServiceImpl(C0WMJ c0wmj) {
        this.LIZ = c0wmj;
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSInjectionService
    public C821850WLv handleEvaluateJSByJSInjectSDKWithEvent(C828420Wee c828420Wee) {
        return LIZ(c828420Wee, C0WMZ.EVALUATE_BY_JS_INJECT_SDK);
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSInjectionService
    public C821850WLv handleInitScriptByJSInjectSDKWithEvent(C828420Wee c828420Wee) {
        return LIZ(c828420Wee, C0WMZ.INIT_SCRIPT_BY_JS_INJECT_SDK);
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSInjectionService
    public C821850WLv handleWillEvaluateJSWithEvent(C828420Wee c828420Wee) {
        return LIZ(c828420Wee, C0WMZ.WILL_EVALUATE);
    }

    @Override // com.bytedance.hybrid.spark.security.api.protocols.SparkSecurityJSInjectionService
    public C821850WLv handleWillLoadURLWithScriptWithEvent(C828420Wee c828420Wee) {
        return LIZ(c828420Wee, C0WMZ.WILL_LOAD_URL_WITH_SCRIPT);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:3:0x0005, B:5:0x0015, B:8:0x0027, B:10:0x002d, B:16:0x003c, B:18:0x0040, B:19:0x0044, B:24:0x0050, B:26:0x0056, B:27:0x005b, B:29:0x005f, B:32:0x0064, B:15:0x0039, B:7:0x0019), top: B:40:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C821850WLv LIZ(X.C828420Wee r14, X.C0WMZ r15) {
        /*
            r13 = this;
            java.lang.String r4 = "inject success"
            java.lang.String r3 = "info"
            r2 = 0
            X.0WMa r5 = new X.0WMa     // Catch: java.lang.Throwable -> L6b
            r5.<init>(r15)     // Catch: java.lang.Throwable -> L6b
            r5.LIZJ(r14)     // Catch: java.lang.Throwable -> L6b
            X.0WMJ r0 = r13.LIZ     // Catch: java.lang.Throwable -> L6b
            X.0WM1 r0 = r0.LIZ(r5)     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L19
            X.0WLv r1 = r0.LIZLLL     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L27
        L19:
            X.0WLv r1 = new X.0WLv     // Catch: java.lang.Throwable -> L6b
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Throwable -> L6b
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L6b
            java.util.Map r0 = X.C2097908Jt.LIZJ(r0)     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L6b
        L27:
            X.0WMe r6 = r5.LIZIZ     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r6.LJ     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L32
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L6b
            goto L33
        L32:
            r0 = 0
        L33:
            r11 = 0
            r5 = 40
            if (r0 <= r5) goto L39
            goto L3c
        L39:
            java.lang.String r8 = r6.LJ     // Catch: java.lang.Throwable -> L6b
            goto L44
        L3c:
            java.lang.String r0 = r6.LJ     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L49
            java.lang.String r8 = r0.substring(r2, r5)     // Catch: java.lang.Throwable -> L6b
        L44:
            java.lang.String r7 = r15.name()     // Catch: java.lang.Throwable -> L6b
            goto L4b
        L49:
            r8 = r11
            goto L44
        L4b:
            java.lang.String r5 = ""
            if (r8 != 0) goto L50
            r8 = r5
        L50:
            android.webkit.WebView r9 = r6.LIZLLL     // Catch: java.lang.Throwable -> L6b
            boolean r10 = r1.LIZ     // Catch: java.lang.Throwable -> L6b
            if (r10 == 0) goto L5b
            java.lang.Throwable r11 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L6b
            r11.<init>()     // Catch: java.lang.Throwable -> L6b
        L5b:
            com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig r0 = r6.LJFF     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L63
            java.lang.String r12 = r0.name     // Catch: java.lang.Throwable -> L6b
            if (r12 != 0) goto L64
        L63:
            r12 = r5
        L64:
            X.C800480Vag.LIZ(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L6b
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L6b
            goto L77
        L6b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L77:
            java.lang.Throwable r7 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r7 == 0) goto Laf
            r0 = 2
            kotlin.Pair[] r6 = new kotlin.Pair[r0]
            java.lang.String r5 = r15.name()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "triggerType"
            r1.<init>(r0, r5)
            r6[r2] = r1
            kotlin.Pair r5 = new kotlin.Pair
            java.lang.String r0 = "message"
            java.lang.String r1 = "js_injection_execute_error"
            r5.<init>(r0, r1)
            r0 = 1
            r6[r0] = r5
            java.util.Map r0 = X.C2097608Jq.LJIIJ(r6)
            X.C0VZK.LIZ(r7, r1, r0)
            X.0WLv r1 = new X.0WLv
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r4)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r0)
            r1.<init>(r2, r0)
        Laf:
            X.0WLv r1 = (X.C821850WLv) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pumbaa.hybrid.governance.jsinjection.JSInjectionSparkServiceImpl.LIZ(X.0Wee, X.0WMZ):X.0WLv");
    }
}
