package com.facebook.login;

import X.C0WZX;
import X.C13LP;
import X.C1697810uHb;
import X.C19F0;
import X.C1BJ0;
import X.C1BJO;
import X.C2202561BIg;
import X.C2202621BIm;
import X.C2204961BRm;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginClient;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    public static final /* synthetic */ int LL = 0;
    public final C1BJ0 tokenSource;

    public C1BJ0 LJIIJJI() {
        return this.tokenSource;
    }

    public NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.tokenSource = C1BJ0.FACEBOOK_APPLICATION_WEB;
    }

    public final void LJIIJ(LoginClient.Result result) {
        if (result != null) {
            LoginClient loginClient = this.loginClient;
            loginClient.getClass();
            loginClient.LJ(result);
        } else {
            LoginClient loginClient2 = this.loginClient;
            loginClient2.getClass();
            loginClient2.LJIIJ();
        }
    }

    public final boolean LJIILJJIL(Intent intent) {
        LoginFragment loginFragment;
        if (intent == null || !(!C2204961BRm.LJJJJZ(FacebookSdk.LIZJ().getPackageManager(), intent, 65536, new C0WZX("dzBzEgQ7XM/eWlgqCx6LYVXDpct6aNWNeXVkgrbafl+cJUTF+JIKKNkqCajl2Q==", new String[]{"019e5"})).isEmpty())) {
            return false;
        }
        LoginClient loginClient = this.loginClient;
        loginClient.getClass();
        Fragment fragment = loginClient.fragment;
        if ((fragment instanceof LoginFragment) && (loginFragment = (LoginFragment) fragment) != null) {
            C19F0<Intent> c19f0 = loginFragment.LLILZ;
            c19f0.getClass();
            c19f0.LIZ(intent);
            if (Unit.LIZ != null) {
                return true;
            }
        }
        return false;
    }

    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.tokenSource = C1BJ0.FACEBOOK_APPLICATION_WEB;
    }

    public final void LJIILIIL(Bundle bundle, LoginClient.Request request) {
        try {
            C2202561BIg c2202561BIg = LoginMethodHandler.Companion;
            Set<String> set = request.permissions;
            C1BJ0 c1bj0LJIIJJI = LJIIJJI();
            String str = request.applicationId;
            c2202561BIg.getClass();
            AccessToken accessTokenLIZIZ = C2202561BIg.LIZIZ(set, bundle, c1bj0LJIIJJI, str);
            AuthenticationToken authenticationTokenLIZJ = C2202561BIg.LIZJ(bundle, request.nonce);
            LoginClient.Result.Companion.getClass();
            LJIIJ(C2202621BIm.LIZIZ(request, accessTokenLIZIZ, authenticationTokenLIZJ));
        } catch (C1BJO e) {
            TryCatchGuardChecker.doCheck(e);
            C2202621BIm c2202621BIm = LoginClient.Result.Companion;
            String message = e.getMessage();
            c2202621BIm.getClass();
            LJIIJ(C2202621BIm.LIZJ(request, null, message, null));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:10|(3:(1:13)|16|18)(1:(1:18))|85|29|(1:31)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[PHI: r6 r7
      0x0042: PHI (r6v3 java.lang.String) = 
      (r6v1 java.lang.String)
      (r6v4 java.lang.String)
      (r6v5 java.lang.String)
      (r6v5 java.lang.String)
      (r6v5 java.lang.String)
     binds: [B:16:0x003e, B:17:0x0040, B:33:0x0074, B:35:0x0079, B:30:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r7v3 android.os.Bundle) = 
      (r7v1 android.os.Bundle)
      (r7v4 android.os.Bundle)
      (r7v4 android.os.Bundle)
      (r7v4 android.os.Bundle)
      (r7v4 android.os.Bundle)
     binds: [B:16:0x003e, B:17:0x0040, B:33:0x0074, B:35:0x0079, B:30:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.facebook.login.LoginMethodHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(int r12, int r13, android.content.Intent r14) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.NativeAppLoginMethodHandler.LJI(int, int, android.content.Intent):boolean");
    }

    public final void LJIIL(LoginClient.Request request, String str, String str2, String str3) {
        if (str != null && Intrinsics.LJFF(str, "logged_out")) {
            CustomTabLoginMethodHandler.calledThroughLoggedOutAppSwitch = true;
            LJIIJ(null);
        } else if (C13LP.LJJJJ(str, C1697810uHb.LJIIJJI("service_disabled", "AndroidAuthKillSwitchException"))) {
            LJIIJ(null);
        } else if (C13LP.LJJJJ(str, C1697810uHb.LJIIJJI("access_denied", "OAuthAccessDeniedException"))) {
            LoginClient.Result.Companion.getClass();
            LJIIJ(C2202621BIm.LIZ(request, null));
        } else {
            LoginClient.Result.Companion.getClass();
            LJIIJ(C2202621BIm.LIZJ(request, str, str2, str3));
        }
    }
}
