package com.ss.android.ugc.aweme.account.otl;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import X.C824470WVx;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes14.dex */
public final class LoginSyncService extends Service {
    public static volatile boolean LLILLJJLI;
    public LoginSyncLocalServer LL;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/ugc/aweme/account/otl/LoginSyncService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECup+5CllxapptYY4EpS3EUpPfmM=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        LLILLJJLI = false;
        if (this.LL != null) {
            C824470WVx c824470WVx = LoginSyncLocalServer.LJI;
            if (c824470WVx != null) {
                c824470WVx.LJFF();
            }
            LoginSyncLocalServer.LJI = null;
        }
    }

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

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0070 A[PHI: r20
      0x0070: PHI (r20v5 java.lang.String) = (r20v0 java.lang.String), (r20v6 java.lang.String) binds: [B:10:0x006e, B:8:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0078 A[PHI: r20
      0x0078: PHI (r20v4 java.lang.String) = (r20v0 java.lang.String), (r20v5 java.lang.String) binds: [B:10:0x006e, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e A[PHI: r19 r20
      0x008e: PHI (r19v2 java.lang.String) = (r19v0 java.lang.String), (r19v0 java.lang.String), (r19v3 java.lang.String) binds: [B:19:0x008b, B:16:0x0083, B:14:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r20v3 java.lang.String) = (r20v1 java.lang.String), (r20v1 java.lang.String), (r20v4 java.lang.String) binds: [B:19:0x008b, B:16:0x0083, B:14:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007c A[EXC_TOP_SPLITTER, PHI: r19 r20
      0x007c: PHI (r19v0 java.lang.String) = (r19v3 java.lang.String), (r19v4 java.lang.String) binds: [B:14:0x007a, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r20v1 java.lang.String) = (r20v4 java.lang.String), (r20v5 java.lang.String) binds: [B:14:0x007a, B:12:0x0076] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.0WVx] */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int onStartCommand(android.content.Intent r25, int r26, int r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.otl.LoginSyncService.onStartCommand(android.content.Intent, int, int):int");
    }
}
