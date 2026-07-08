package com.ss.android.ugc.aweme.im.streak.impl.pet.share;

import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes3.dex */
public final class OpenStreakSharePanelAction implements IRouteAction {
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // com.bytedance.router.route.IRouteAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object open(android.content.Context r19, java.lang.String r20, android.os.Bundle r21) {
        /*
            r18 = this;
            java.lang.String r0 = "OpenStreakSharePanelAction open"
            X.C1590806Ks.LIZ(r0)
            r11 = 0
            r1 = r21
            if (r1 == 0) goto Lb9
            java.lang.String r0 = "enter_from"
            java.lang.String r8 = r1.getString(r0)
            java.lang.String r0 = "enter_from_equal_feature_key"
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r0 = "click_time"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto Lbb
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto Lbb
            long r5 = r0.longValue()
        L28:
            r4 = 0
            if (r19 == 0) goto L58
            boolean r3 = X.C960203pA.LIZIZ(r19)
            android.app.Activity r7 = X.C1388190mED.LIZ(r19)
            if (r7 == 0) goto L58
            X.06RY r1 = X.C06RY.LIZ
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r1.getClass()
            X.0956 r0 = X.C06RY.LIZIZ
            if (r0 == 0) goto L5b
            boolean r1 = r0.isActive()
            r0 = 1
            if (r1 != r0) goto L5b
            java.lang.String r0 = "ShareStreakUtil, job is active"
            X.C1590906Kt.LIZIZ(r0)
        L58:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L5b:
            X.06RR r14 = new X.06RR
            r14.<init>(r4)
            if (r8 != 0) goto Lb7
            java.lang.String r0 = ""
        L64:
            r14.LIZ = r0
            if (r2 == 0) goto Lb2
            long r0 = r2.longValue()
        L6c:
            r14.LIZIZ = r0
            boolean r15 = X.C296670Bk1.LIZ()
            com.ss.android.ugc.aweme.im.common.setting.StreakPetSettingsConfig r0 = X.C1583306Hv.LIZ()
            if (r3 == 0) goto Laf
            java.lang.String r0 = r0.streakGroupHatchingSharePanelBgDark
        L7a:
            X.06RO r6 = new X.06RO
            r12 = r6
            r16 = r0
            r17 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            kotlin.jvm.internal.AwS581S0100000_2 r10 = new kotlin.jvm.internal.AwS581S0100000_2
            r0 = 560(0x230, float:7.85E-43)
            r10.<init>(r7, r0)
            X.06RP r9 = new X.06RP
            r9.<init>(r7)
            X.1DFB r3 = X.C0PEM.LIZJ
            X.08hG r2 = kotlinx.coroutines.CoroutineExceptionHandler.LJJLIL
            X.06wV r1 = new X.06wV
            r0 = 6
            r1.<init>(r2, r9, r0)
            kotlin.coroutines.CoroutineContext r0 = r3.plus(r1)
            X.054G r1 = X.C2296808zG.LIZ(r0)
            X.06RT r5 = new X.06RT
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = 3
            X.0956 r0 = X.C23250099c.LIZLLL(r1, r11, r11, r5, r0)
            X.C06RY.LIZIZ = r0
            goto L58
        Laf:
            java.lang.String r0 = r0.streakGroupHatchingSharePanelBg
            goto L7a
        Lb2:
            long r0 = java.lang.System.currentTimeMillis()
            goto L6c
        Lb7:
            r0 = r8
            goto L64
        Lb9:
            r8 = r11
            r2 = r11
        Lbb:
            long r5 = java.lang.System.currentTimeMillis()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.streak.impl.pet.share.OpenStreakSharePanelAction.open(android.content.Context, java.lang.String, android.os.Bundle):java.lang.Object");
    }
}
