package com.ss.android.ugc.aweme.deeplink.actions;

import X.AbstractC1950107kR;
import X.C1697810uHb;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public final class EmailVerificationAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final ArrayList<Integer> LJ() {
        return C1697810uHb.LJ(67108864, 536870912);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    @Override // X.AbstractC1950207kS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Object>> LIZLLL(java.lang.String r7, java.util.HashMap<java.lang.String, java.lang.Object> r8, X.C1950707kX r9) {
        /*
            r6 = this;
            android.app.Activity r0 = r9.LIZ
            boolean r0 = r0.isTaskRoot()
            if (r0 == 0) goto L2b
            android.app.Activity r1 = r9.LIZ
            java.lang.String r0 = "//main"
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r1, r0)
            r0.open()
            android.app.Activity r0 = r9.LIZ
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.deeplink.AppLinkHandlerV2
            if (r0 == 0) goto L96
            java.lang.String r3 = "from_app_link"
        L1b:
            android.net.Uri r0 = r9.LIZIZ
            boolean r0 = X.C848610XQt.LIZIZ(r0)
            if (r0 == 0) goto L2b
            X.10ZH r2 = X.C10ZH.LIZIZ
            android.app.Activity r1 = r9.LIZ
            r0 = 0
            r2.LJJIJIL(r1, r3, r0)
        L2b:
            java.lang.String r5 = "type"
            boolean r0 = r8.containsKey(r5)
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r8.get(r5)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            r0 = 1
            if (r1 == r0) goto L93
            r0 = 4
            if (r1 == r0) goto L93
            r0 = 13
            if (r1 == r0) goto L93
            switch(r1) {
                case 24: goto L8a;
                case 25: goto L8d;
                case 26: goto L90;
                case 27: goto L93;
                default: goto L4d;
            }
        L4d:
            java.lang.String r4 = "//ucenter_web/deeplink/email_verification"
        L4f:
            java.lang.String r0 = "open_from"
            java.lang.Object r1 = r8.get(r0)
            if (r1 != 0) goto L59
            java.lang.String r1 = "email"
        L59:
            java.lang.Object r3 = r8.get(r5)
            if (r3 != 0) goto L64
            r0 = 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L64:
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "enter_from"
            r2.LJIIIIZZ(r0, r1)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            r2.LIZJ(r0, r5)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "magic_link_start_handling"
            X.C20684815ws.LJIILLIIL(r0, r1)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r4, r8)
            return r0
        L8a:
            java.lang.String r4 = "//account/login/auth/two_step"
            goto L4f
        L8d:
            java.lang.String r4 = "//account/phone_or_email/unbind"
            goto L4f
        L90:
            java.lang.String r4 = "//account/phone/bind_or_modify"
            goto L4f
        L93:
            java.lang.String r4 = "//account/login/signup_or_login"
            goto L4f
        L96:
            java.lang.String r3 = "from_deep_link"
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.actions.EmailVerificationAction.LIZLLL(java.lang.String, java.util.HashMap, X.07kX):kotlin.Pair");
    }
}
