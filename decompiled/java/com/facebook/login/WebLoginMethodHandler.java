package com.facebook.login;

import X.C0W7Q;
import X.C0WVE;
import X.C1BIN;
import X.C1BJ0;
import X.C1BJO;
import X.C1BKG;
import X.C2202561BIg;
import X.C2202621BIm;
import X.C810670Vr7;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.webkit.CookieSyncManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginClient;
import java.util.Set;

/* JADX INFO: loaded from: classes35.dex */
public abstract class WebLoginMethodHandler extends LoginMethodHandler {
    public static final C1BKG Companion = new Object() { // from class: X.1BKG
    };
    public String e2e;

    public abstract C1BJ0 LJIIJJI();

    public WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle LJIIJ(com.facebook.login.LoginClient.Request r9) {
        /*
            r8 = this;
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.util.Set<java.lang.String> r0 = r9.permissions
            r3 = 0
            if (r0 == 0) goto L20
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L20
            java.util.Set<java.lang.String> r1 = r9.permissions
            java.lang.String r0 = ","
            java.lang.String r1 = android.text.TextUtils.join(r0, r1)
            java.lang.String r0 = "scope"
            X.C786410Ut5.LJJJI(r0, r1, r2)
            r8.LIZ(r1, r0)
        L20:
            X.1BIP r0 = r9.defaultAudience
            if (r0 != 0) goto L26
            X.1BIP r0 = X.C1BIP.NONE
        L26:
            java.lang.String r1 = "default_audience"
            java.lang.String r0 = r0.getNativeProtocolAudience()
            X.C786410Ut5.LJJJI(r1, r0, r2)
            java.lang.String r0 = r9.authId
            java.lang.String r1 = r8.LIZJ(r0)
            java.lang.String r0 = "state"
            X.C786410Ut5.LJJJI(r0, r1, r2)
            X.1BIw r0 = com.facebook.AccessToken.Companion
            r0.getClass()
            com.facebook.AccessToken r0 = X.C2202721BIw.LIZIZ()
            if (r0 != 0) goto La3
            r7 = 0
        L46:
            java.lang.String r4 = "0"
            java.lang.String r5 = "1"
            java.lang.String r6 = "access_token"
            if (r7 == 0) goto L91
            com.facebook.login.LoginClient r0 = r8.loginClient
            r0.getClass()
            X.19EG r1 = r0.LJFF()
            if (r1 != 0) goto L5d
            android.content.Context r1 = com.facebook.FacebookSdk.LIZJ()
        L5d:
            java.lang.String r0 = "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY"
            android.content.SharedPreferences r3 = X.C810670Vr7.LIZJ(r1, r3, r0)
            java.lang.String r1 = "TOKEN"
            java.lang.String r0 = ""
            java.lang.String r0 = r3.getString(r1, r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 == 0) goto L91
            X.C786410Ut5.LJJJI(r6, r7, r2)
            r8.LIZ(r5, r6)
        L77:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "cbt"
            X.C786410Ut5.LJJJI(r0, r1, r2)
            boolean r0 = X.C1BJJ.LIZJ()
            if (r0 == 0) goto L8b
            r4 = r5
        L8b:
            java.lang.String r0 = "ies"
            X.C786410Ut5.LJJJI(r0, r4, r2)
            return r2
        L91:
            com.facebook.login.LoginClient r0 = r8.loginClient
            r0.getClass()
            X.19EG r0 = r0.LJFF()
            if (r0 == 0) goto L9f
            X.C786410Ut5.B2(r0)
        L9f:
            r8.LIZ(r4, r6)
            goto L77
        La3:
            java.lang.String r7 = r0.token
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.WebLoginMethodHandler.LJIIJ(com.facebook.login.LoginClient$Request):android.os.Bundle");
    }

    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public final void LJIIL(LoginClient.Request request, Bundle bundle, C1BJO c1bjo) {
        String message;
        String strValueOf;
        LoginClient.Result resultLIZJ;
        LoginClient loginClient = this.loginClient;
        loginClient.getClass();
        this.e2e = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.e2e = bundle.getString("e2e");
            }
            try {
                C2202561BIg c2202561BIg = LoginMethodHandler.Companion;
                Set<String> set = request.permissions;
                C1BJ0 c1bj0LJIIJJI = LJIIJJI();
                String str = request.applicationId;
                c2202561BIg.getClass();
                AccessToken accessTokenLIZIZ = C2202561BIg.LIZIZ(set, bundle, c1bj0LJIIJJI, str);
                AuthenticationToken authenticationTokenLIZJ = C2202561BIg.LIZJ(bundle, request.nonce);
                C2202621BIm c2202621BIm = LoginClient.Result.Companion;
                LoginClient.Request request2 = loginClient.pendingRequest;
                c2202621BIm.getClass();
                resultLIZJ = C2202621BIm.LIZIZ(request2, accessTokenLIZIZ, authenticationTokenLIZJ);
                if (loginClient.LJFF() != null) {
                    try {
                        CookieSyncManager.createInstance(loginClient.LJFF()).sync();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (accessTokenLIZIZ != null) {
                        String str2 = accessTokenLIZIZ.token;
                        LoginClient loginClient2 = this.loginClient;
                        loginClient2.getClass();
                        Context contextLJFF = loginClient2.LJFF();
                        if (contextLJFF == null) {
                            contextLJFF = FacebookSdk.LIZJ();
                        }
                        C810670Vr7.LIZJ(contextLJFF, 0, "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY").edit().putString("TOKEN", str2).apply();
                    }
                }
            } catch (C1BJO e2) {
                TryCatchGuardChecker.doCheck(e2);
                C2202621BIm c2202621BIm2 = LoginClient.Result.Companion;
                LoginClient.Request request3 = loginClient.pendingRequest;
                String message2 = e2.getMessage();
                c2202621BIm2.getClass();
                resultLIZJ = C2202621BIm.LIZJ(request3, null, message2, null);
            }
        } else if (c1bjo instanceof C1BIN) {
            C2202621BIm c2202621BIm3 = LoginClient.Result.Companion;
            LoginClient.Request request4 = loginClient.pendingRequest;
            c2202621BIm3.getClass();
            resultLIZJ = C2202621BIm.LIZ(request4, "User canceled log in.");
        } else {
            this.e2e = null;
            if (c1bjo == null) {
                message = null;
            } else {
                message = c1bjo.getMessage();
            }
            if (c1bjo instanceof C0WVE) {
                FacebookRequestError requestError = ((C0WVE) c1bjo).getRequestError();
                strValueOf = String.valueOf(requestError.errorCode);
                message = requestError.toString();
            } else {
                strValueOf = null;
            }
            C2202621BIm c2202621BIm4 = LoginClient.Result.Companion;
            LoginClient.Request request5 = loginClient.pendingRequest;
            c2202621BIm4.getClass();
            resultLIZJ = C2202621BIm.LIZJ(request5, null, message, strValueOf);
        }
        if (!C0W7Q.LJIILL(this.e2e)) {
            LJFF(this.e2e);
        }
        loginClient.LJ(resultLIZJ);
    }
}
