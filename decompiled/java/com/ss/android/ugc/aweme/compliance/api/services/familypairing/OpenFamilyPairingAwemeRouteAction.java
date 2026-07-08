package com.ss.android.ugc.aweme.compliance.api.services.familypairing;

import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes25.dex */
public final class OpenFamilyPairingAwemeRouteAction implements IRouteAction {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[PHI: r3
      0x006f: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v7 java.lang.String), (r3v7 java.lang.String) binds: [B:7:0x000e, B:9:0x0016, B:11:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0010 A[PHI: r3
      0x0010: PHI (r3v7 java.lang.String) = (r3v0 java.lang.String), (r3v8 java.lang.String) binds: [B:7:0x000e, B:5:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.router.route.IRouteAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object open(android.content.Context r10, java.lang.String r11, android.os.Bundle r12) {
        /*
            r9 = this;
            if (r10 == 0) goto L6c
            if (r12 == 0) goto Lc
            java.lang.String r0 = "enter_from"
            java.lang.String r3 = r12.getString(r0)
            if (r3 != 0) goto L10
        Lc:
            java.lang.String r3 = ""
            if (r12 == 0) goto L6f
        L10:
            java.lang.String r0 = "show_badge"
            java.lang.String r0 = r12.getString(r0)
            if (r0 == 0) goto L6f
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r2 = 1
            if (r0 != r2) goto L6f
        L1f:
            com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService r1 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJIIJJI()
            android.app.Activity r0 = X.C1388190mED.LIZ(r10)
            r1.LJIILLIIL(r0, r3, r2)
            java.lang.String r0 = "reward_flow"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L47
            java.lang.Class<com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService> r3 = com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService.class
            r4 = 0
            r7 = 14
            r8 = 0
            r5 = r4
            r6 = r4
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService r1 = (com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService) r1
            if (r1 == 0) goto L47
            X.0z0c r0 = X.EnumC1879480z0c.FAMILY_PAIRING_INTRO
            r1.LIZLLL(r0, r8)
        L47:
            if (r2 == 0) goto L6c
            java.lang.Class<com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService> r0 = com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r3 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService r3 = (com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService) r3
            if (r3 == 0) goto L6c
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r1 = "challenge_name"
            java.lang.String r0 = "explore_fp"
            r2.LJIIIIZZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "wellbeing_challenge_badge_banner_show"
            r3.sendEvent(r0, r1)
        L6c:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L6f:
            r2 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.api.services.familypairing.OpenFamilyPairingAwemeRouteAction.open(android.content.Context, java.lang.String, android.os.Bundle):java.lang.Object");
    }
}
