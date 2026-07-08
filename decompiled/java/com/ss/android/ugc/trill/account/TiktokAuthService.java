package com.ss.android.ugc.trill.account;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class TiktokAuthService extends Service {
    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/ugc/trill/account/TiktokAuthService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wrdWs/KOurYJDb0iavpReQYusQi9tSxj5Y2NKYItc=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return new AbstractAccountAuthenticator(this) { // from class: X.09dS
            public final Context LIZ;
            public final IMainService LIZIZ;

            @Override // android.accounts.AbstractAccountAuthenticator
            public final Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
                return null;
            }

            @Override // android.accounts.AbstractAccountAuthenticator
            public final Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
                return null;
            }

            @Override // android.accounts.AbstractAccountAuthenticator
            public final Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
                return null;
            }

            @Override // android.accounts.AbstractAccountAuthenticator
            public final Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
                return null;
            }

            {
                super(this);
                IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi(IMainService.class);
                Objects.requireNonNull(iMainService);
                this.LIZIZ = iMainService;
                this.LIZ = this;
            }

            @Override // android.accounts.AbstractAccountAuthenticator
            public final String getAuthTokenLabel(String str) {
                return this.LIZ.getResources().getString(R.string.kci);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x009b A[PHI: r12
              0x009b: PHI (r12v1 android.accounts.AccountManager) = (r12v0 android.accounts.AccountManager), (r12v4 android.accounts.AccountManager) binds: [B:14:0x0078, B:19:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // android.accounts.AbstractAccountAuthenticator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.os.Bundle getAuthToken(android.accounts.AccountAuthenticatorResponse r24, android.accounts.Account r25, java.lang.String r26, android.os.Bundle r27) throws java.lang.Throwable {
                /*
                    r23 = this;
                    r2 = r23
                    android.content.Context r0 = r2.LIZ
                    android.accounts.AccountManager r12 = android.accounts.AccountManager.get(r0)
                    r1 = r26
                    r0 = r25
                    java.lang.String r1 = r12.peekAuthToken(r0, r1)
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 == 0) goto L57
                    X.0WZX r5 = new X.0WZX
                    java.lang.String r4 = "dzBzEhEpEcvSUUUuTBbKc9NnF2wrdWs/KOurYJDb0iavpReQYusQi9tSxghT3s2SN2BaKg=="
                    r3 = 0
                    r5.<init>(r4, r3)
                    X.0WST r6 = new X.0WST
                    r6.<init>()
                    r3 = 1
                    java.lang.Object[] r11 = new java.lang.Object[r3]
                    r14 = 0
                    r11[r14] = r0
                    X.0WZW r13 = new X.0WZW
                    java.lang.String r4 = "(Landroid/accounts/Account;)Ljava/lang/String;"
                    r13.<init>(r14, r4, r5)
                    r7 = 10015(0x271f, float:1.4034E-41)
                    java.lang.String r17 = "android/accounts/AccountManager"
                    java.lang.String r18 = "getPassword"
                    java.lang.String r21 = "java.lang.String"
                    r15 = r6
                    r16 = r7
                    r19 = r12
                    r20 = r11
                    r22 = r13
                    X.0WSU r5 = r15.LIZIZ(r16, r17, r18, r19, r20, r21, r22)
                    boolean r4 = r5.LIZ
                    if (r4 == 0) goto L76
                    r10 = 0
                    java.lang.String r8 = "android/accounts/AccountManager"
                    java.lang.String r9 = "getPassword"
                    r6.LIZ(r7, r8, r9, r10, r11, r12, r13, r14)
                    java.lang.Object r4 = r5.LIZIZ
                L53:
                    if (r4 == 0) goto L57
                    java.lang.String r1 = "success"
                L57:
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L9d
                    android.os.Bundle r4 = new android.os.Bundle
                    r4.<init>()
                    java.lang.String r3 = r0.name
                    java.lang.String r2 = "authAccount"
                    X.C786410Ut5.LJJJI(r2, r3, r4)
                    java.lang.String r2 = "accountType"
                    java.lang.String r0 = r0.type
                    X.C786410Ut5.LJJJI(r2, r0, r4)
                    java.lang.String r0 = "authtoken"
                    X.C786410Ut5.LJJJI(r0, r1, r4)
                    return r4
                L76:
                    java.lang.Object[] r5 = r5.LIZJ
                    if (r5 == 0) goto L9b
                    r4 = r5[r14]
                    if (r4 == 0) goto L81
                    r12 = r4
                    android.accounts.AccountManager r12 = (android.accounts.AccountManager) r12
                L81:
                    r4 = r5[r3]
                    if (r4 == 0) goto L9b
                    android.accounts.Account r4 = (android.accounts.Account) r4
                L87:
                    java.lang.String r4 = r12.getPassword(r4)
                    r7 = 10015(0x271f, float:1.4034E-41)
                    java.lang.String r8 = "android/accounts/AccountManager"
                    java.lang.String r9 = "getPassword"
                    r6 = r6
                    r10 = r4
                    r11 = r11
                    r12 = r12
                    r13 = r13
                    r14 = r3
                    r6.LIZ(r7, r8, r9, r10, r11, r12, r13, r14)
                    goto L53
                L9b:
                    r4 = r0
                    goto L87
                L9d:
                    android.content.Intent r3 = new android.content.Intent
                    android.content.Context r1 = r2.LIZ
                    com.ss.android.ugc.aweme.services.IMainService r0 = r2.LIZIZ
                    java.lang.Class r0 = r0.getMainActivityClass()
                    r3.<init>(r1, r0)
                    java.lang.String r0 = "accountAuthenticatorResponse"
                    r1 = r24
                    r3.putExtra(r0, r1)
                    android.os.Bundle r1 = new android.os.Bundle
                    r1.<init>()
                    java.lang.String r0 = "intent"
                    X.C786410Ut5.LJJIJL(r1, r0, r3)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2416409dS.getAuthToken(android.accounts.AccountAuthenticatorResponse, android.accounts.Account, java.lang.String, android.os.Bundle):android.os.Bundle");
            }

            @Override // android.accounts.AbstractAccountAuthenticator
            public final Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
                Intent intent2 = new Intent(this.LIZ, this.LIZIZ.getMainActivityClass());
                intent2.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
                Bundle bundle2 = new Bundle();
                C786410Ut5.LJJIJL(bundle2, "intent", intent2);
                return bundle2;
            }
        }.getIBinder();
    }
}
