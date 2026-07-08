package com.bytedance.lobby.facebook;

import X.C19EG;
import X.C1AWO;
import X.C1BJO;
import X.C2193741AtQ;
import X.C2202501BIa;
import X.C2202711BIv;
import X.C2202861BJk;
import X.C2277811EDr;
import X.C834830Woz;
import X.C851480Xak;
import X.EnumC2202541BIe;
import X.InterfaceC2206961BZe;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import java.util.HashMap;

/* JADX INFO: loaded from: classes35.dex */
public class FacebookAuth extends FacebookProvider<AuthResult> implements C1AWO, InterfaceC2206961BZe<C2202861BJk> {
    public C2202501BIa LLILZIL;
    public LobbyViewModel LLILZLL;
    public C2202711BIv LLIZ;

    @Override // X.C1AWO
    public final /* synthetic */ void KY0(int i) {
    }

    @Override // X.C1AWO
    public final void onDestroy() {
        C2202711BIv c2202711BIv = this.LLIZ;
        if (c2202711BIv != null) {
            C2202501BIa c2202501BIa = this.LLILZIL;
            c2202711BIv.LLJJIJIIJIL.getValue().getClass();
            if (!(c2202501BIa instanceof C2202501BIa)) {
                throw new C1BJO("Unexpected CallbackManager, please use the provided Factory.");
            }
            int requestCode = EnumC2202541BIe.Login.toRequestCode();
            ((HashMap) c2202501BIa.LIZ).remove(Integer.valueOf(requestCode));
            this.LLIZ = null;
        }
    }

    public FacebookAuth(C2277811EDr c2277811EDr) {
        super(LobbyCore.getApplication(), c2277811EDr);
    }

    @Override // X.C1AWO
    public final void mQ(C19EG c19eg, Bundle bundle) {
        C834830Woz.LIZ(this.LLILZLL, this.LLILLL.LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    @Override // X.C1AWO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n20(X.C19EG r6, android.os.Bundle r7) {
        /*
            r5 = this;
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r6)
            java.lang.Class<com.bytedance.lobby.internal.LobbyViewModel> r0 = com.bytedance.lobby.internal.LobbyViewModel.class
            androidx.lifecycle.ViewModel r0 = r1.get(r0)
            com.bytedance.lobby.internal.LobbyViewModel r0 = (com.bytedance.lobby.internal.LobbyViewModel) r0
            r5.LLILZLL = r0
            boolean r0 = r5.isAvailable()
            r4 = 1
            if (r0 != 0) goto L1d
            com.bytedance.lobby.internal.LobbyViewModel r1 = r5.LLILZLL
            java.lang.String r0 = "facebook"
            X.C834830Woz.LIZIZ(r1, r0, r4)
            return
        L1d:
            X.1BIa r0 = new X.1BIa
            r0.<init>()
            r5.LLILZIL = r0
            if (r7 == 0) goto L32
            java.lang.String r0 = "fb_read_permissions"
            java.lang.String r3 = r7.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L34
        L32:
            java.lang.String r3 = "public_profile"
        L34:
            X.1BIv r2 = new X.1BIv
            r2.<init>(r6)
            r5.LLIZ = r2
            java.lang.String[] r1 = new java.lang.String[r4]
            r0 = 0
            r1[r0] = r3
            r2.setReadPermissions(r1)
            X.1BIv r4 = r5.LLIZ
            X.1BIa r3 = r5.LLILZIL
            X.01GW<? extends com.facebook.login.LoginManager> r0 = r4.LLJJIJIIJIL
            java.lang.Object r1 = r0.getValue()
            com.facebook.login.LoginManager r1 = (com.facebook.login.LoginManager) r1
            r1.getClass()
            boolean r0 = r3 instanceof X.C2202501BIa
            if (r0 == 0) goto L8c
            X.1BIe r0 = X.EnumC2202541BIe.Login
            int r0 = r0.toRequestCode()
            X.1BIZ r2 = new X.1BIZ
            r2.<init>()
            java.util.Map<java.lang.Integer, X.1BIc> r1 = r3.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.put(r0, r2)
            com.facebook.CallbackManager r0 = r4.LLJJJJ
            if (r0 != 0) goto L72
            r4.LLJJJJ = r3
        L72:
            X.1BIw r0 = com.facebook.AccessToken.Companion
            r0.getClass()
            com.facebook.AccessToken r0 = X.C2202721BIw.LIZIZ()
            if (r0 == 0) goto L86
            X.1BJc r0 = com.facebook.login.LoginManager.LJIIIZ
            com.facebook.login.LoginManager r0 = r0.LIZ()
            r0.LIZLLL()
        L86:
            X.1BIv r0 = r5.LLIZ
            r0.performClick()
            return
        L8c:
            X.1BJO r1 = new X.1BJO
            java.lang.String r0 = "Unexpected CallbackManager, please use the provided Factory."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lobby.facebook.FacebookAuth.n20(X.19EG, android.os.Bundle):void");
    }

    @Override // X.C1AWO
    public final void ID0(C19EG c19eg, int i, int i2, Intent intent) {
        C2202501BIa c2202501BIa = this.LLILZIL;
        if (c2202501BIa != null) {
            c2202501BIa.onActivityResult(i, i2, intent);
            return;
        }
        C2193741AtQ c2193741AtQ = new C2193741AtQ("facebook", 1);
        c2193741AtQ.LIZ = false;
        c2193741AtQ.LIZIZ = new C851480Xak(3, "Facebook CallbackManager is null");
        AuthResult authResult = new AuthResult(c2193741AtQ);
        LobbyViewModel lobbyViewModel = this.LLILZLL;
        if (lobbyViewModel == null) {
            return;
        }
        lobbyViewModel.xQ2(authResult);
    }
}
