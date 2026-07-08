package com.ss.android.ugc.aweme.compliance.business.agegate.action;

import X.C2432509g3;
import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes4.dex */
public final class StoreDataRouteAction implements IRouteAction {
    public static final C2432509g3 Companion = new Object() { // from class: X.09g3
    };

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.bytedance.router.route.IRouteAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object open(android.content.Context r7, java.lang.String r8, android.os.Bundle r9) {
        /*
            r6 = this;
            android.net.Uri r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r8)
            java.lang.String r0 = "key"
            java.lang.String r3 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r2, r0)
            java.lang.String r0 = "value"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r2, r0)
            java.lang.String r0 = "type"
            java.lang.String r4 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r2, r0)
            r5 = 0
            if (r3 == 0) goto L27
            java.lang.String r0 = "ftc_"
            r2 = 1
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r3, r0, r2)
            if (r0 != r2) goto L27
        L22:
            if (r2 != 0) goto L29
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L27:
            r2 = 0
            goto L22
        L29:
            if (r3 == 0) goto La1
            if (r1 == 0) goto La1
            if (r4 == 0) goto La1
            X.0XPY r0 = X.C0XPY.LIZ
            r0.getClass()
            android.app.Application r2 = X.C0XPY.LIZ()
            java.lang.String r0 = "aweme-app"
            android.content.SharedPreferences r0 = X.C810670Vr7.LIZJ(r2, r5, r0)
            android.content.SharedPreferences$Editor r2 = r0.edit()
            int r0 = r4.hashCode()     // Catch: java.lang.Exception -> L9d
            switch(r0) {
                case -891985903: goto L91;
                case 104431: goto L81;
                case 3327612: goto L71;
                case 64711720: goto L5f;
                case 97526364: goto L4f;
                default: goto L49;
            }     // Catch: java.lang.Exception -> L9d
        L49:
            r2.apply()     // Catch: java.lang.Exception -> L9d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L9d
            return r0
        L4f:
            java.lang.String r0 = "float"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> L9d
            if (r0 == 0) goto L49
            float r0 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r1)     // Catch: java.lang.Exception -> L9d
            r2.putFloat(r3, r0)     // Catch: java.lang.Exception -> L9d
            goto L49
        L5f:
            java.lang.String r0 = "boolean"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> L9d
            if (r0 == 0) goto L49
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L9d
            r2.putBoolean(r3, r0)     // Catch: java.lang.Exception -> L9d
            goto L49
        L71:
            java.lang.String r0 = "long"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> L9d
            if (r0 == 0) goto L49
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r1)     // Catch: java.lang.Exception -> L9d
            r2.putLong(r3, r0)     // Catch: java.lang.Exception -> L9d
            goto L49
        L81:
            java.lang.String r0 = "int"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> L9d
            if (r0 == 0) goto L49
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r1)     // Catch: java.lang.Exception -> L9d
            r2.putInt(r3, r0)     // Catch: java.lang.Exception -> L9d
            goto L49
        L91:
            java.lang.String r0 = "string"
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Exception -> L9d
            if (r0 == 0) goto L49
            r2.putString(r3, r1)     // Catch: java.lang.Exception -> L9d
            goto L49
        L9d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La1:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.agegate.action.StoreDataRouteAction.open(android.content.Context, java.lang.String, android.os.Bundle):java.lang.Object");
    }
}
