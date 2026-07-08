package com.ss.android.ugc.aweme.account.login.passkey;

import X.C01GW;
import X.C11KZ;
import X.C1239250iLz;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes32.dex */
public final class PasskeyApis {
    public static final PasskeyApis LIZ = new PasskeyApis();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(83));

    public interface Api {
        @InterfaceC1501170pAR("/passport/fido2/begin_user_authentication/")
        Object beginUserAuthentication(InterfaceC1364105Vn<? super BeginUserAuthenticationResponse> interfaceC1364105Vn);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/passport/fido2/finish_user_authentication/")
        Object finishUserAuthentication(@InterfaceC1501050pAF("credential_assertion_data") String str, @InterfaceC1501050pAF("webauthn_ticket") String str2, InterfaceC1364105Vn<? super FinishUserAuthenticationResponse> interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.login.passkey.BeginUserAuthenticationResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C20433714xT
            if (r0 == 0) goto L20
            r4 = r6
            X.14xT r4 = (X.C20433714xT) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L42
        L20:
            X.14xT r4 = new X.14xT
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.01GW r0 = com.ss.android.ugc.aweme.account.login.passkey.PasskeyApis.LIZIZ     // Catch: java.lang.Exception -> L48
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L48
            com.ss.android.ugc.aweme.account.login.passkey.PasskeyApis$Api r0 = (com.ss.android.ugc.aweme.account.login.passkey.PasskeyApis.Api) r0     // Catch: java.lang.Exception -> L48
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L48
            java.lang.Object r3 = r0.beginUserAuthentication(r4)     // Catch: java.lang.Exception -> L48
            if (r3 != r2) goto L45
            return r2
        L42:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L48
        L45:
            com.ss.android.ugc.aweme.account.login.passkey.BeginUserAuthenticationResponse r3 = (com.ss.android.ugc.aweme.account.login.passkey.BeginUserAuthenticationResponse) r3     // Catch: java.lang.Exception -> L48
            return r3
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.login.passkey.BeginUserAuthenticationResponse r3 = new com.ss.android.ugc.aweme.account.login.passkey.BeginUserAuthenticationResponse
            r1 = 0
            java.lang.String r0 = ""
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.passkey.PasskeyApis.LIZ(X.05Vn):java.lang.Object");
    }

    public static final C11KZ LIZJ(String str, String str2) {
        HashMap map = new HashMap();
        map.put("entrance", "account_settings");
        map.put("credential_assertion_data", str);
        map.put("webauthn_ticket", str2);
        return C1239250iLz.LIZ("/passport/fido2/finish_discoverable_user_login/", map);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.account.login.passkey.FinishUserAuthenticationResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C20433814xU
            if (r0 == 0) goto L20
            r4 = r8
            X.14xU r4 = (X.C20433814xU) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L42
        L20:
            X.14xU r4 = new X.14xU
            r4.<init>(r5, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            X.01GW r0 = com.ss.android.ugc.aweme.account.login.passkey.PasskeyApis.LIZIZ     // Catch: java.lang.Exception -> L48
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L48
            com.ss.android.ugc.aweme.account.login.passkey.PasskeyApis$Api r0 = (com.ss.android.ugc.aweme.account.login.passkey.PasskeyApis.Api) r0     // Catch: java.lang.Exception -> L48
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L48
            java.lang.Object r3 = r0.finishUserAuthentication(r6, r7, r4)     // Catch: java.lang.Exception -> L48
            if (r3 != r2) goto L45
            return r2
        L42:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L48
        L45:
            com.ss.android.ugc.aweme.account.login.passkey.FinishUserAuthenticationResponse r3 = (com.ss.android.ugc.aweme.account.login.passkey.FinishUserAuthenticationResponse) r3     // Catch: java.lang.Exception -> L48
            return r3
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.account.login.passkey.FinishUserAuthenticationResponse r3 = new com.ss.android.ugc.aweme.account.login.passkey.FinishUserAuthenticationResponse
            r1 = 0
            java.lang.String r0 = ""
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.passkey.PasskeyApis.LIZIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static C11KZ LIZLLL(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        map.put("entrance", str);
        map.put("credential_creation_data", str2);
        map.put("webauthn_ticket", str3);
        map.put(Scene.SCENE_SERVICE, str4);
        return C1239250iLz.LIZ("/passport/fido2/finish_user_registration/", map);
    }
}
