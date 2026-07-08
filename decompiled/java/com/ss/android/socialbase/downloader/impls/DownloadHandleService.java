package com.ss.android.socialbase.downloader.impls;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1490830otl;
import X.C1B7E;
import X.C1B7M;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2199681B7e;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import X.InterfaceC2199641B7a;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes31.dex */
public class DownloadHandleService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/socialbase/downloader/impls/DownloadHandleService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisofPP81MBTCNPX26PsWQkSKFoYZzqW940LBPyxw==", null)));
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
    public final void onCreate() {
        super.onCreate();
        C2199681B7e.LJJIFFI(this);
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int intExtra;
        super.onStartCommand(intent, i, i2);
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action) && (intExtra = intent.getIntExtra("extra_download_id", 0)) != 0) {
                if (action.equals("com.ss.android.downloader.action.DOWNLOAD_WAKEUP")) {
                    if (C1490830otl.LIZ()) {
                        C1490830otl.LJ(intExtra, "DownloadHandleService", "handleIntent", "Retry delay disable");
                        return 2;
                    }
                    return 2;
                }
                if (action.equals("com.ss.android.downloader.action.PROCESS_NOTIFY")) {
                    C1B7M.LJ().LJII(intExtra, true);
                    InterfaceC2199641B7a interfaceC2199641B7aLIZ = C1B7E.LIZ(true);
                    if (interfaceC2199641B7aLIZ == null) {
                        return 2;
                    }
                    interfaceC2199641B7aLIZ.LIZ();
                    return 2;
                }
                if (!action.equals("com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY")) {
                    return 2;
                }
                C2199681B7e.LJJIIJ();
                return 2;
            }
            return 2;
        }
        return 2;
    }
}
