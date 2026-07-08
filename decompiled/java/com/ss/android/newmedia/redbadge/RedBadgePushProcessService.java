package com.ss.android.newmedia.redbadge;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C808480Vna;
import X.C808510Vnd;
import X.C817700W5w;
import X.InterfaceC808610Vnn;
import Y.ARunnableS82S0200000_13;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes14.dex */
public class RedBadgePushProcessService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/newmedia/redbadge/RedBadgePushProcessService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDI6Tnc06sSnI7zvlImrF4sWI0lJNNre1TEDzUrraj5qk06Rs=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        return null;
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
        Bundle extras;
        if (intent != null) {
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
        } else {
            extras = null;
        }
        InterfaceC808610Vnn interfaceC808610VnnLIZ = C808480Vna.LIZ();
        C808510Vnd.LIZ().LIZJ(new ARunnableS82S0200000_13(interfaceC808610VnnLIZ, extras, 23));
        int iOnStartCommand = super.onStartCommand(intent, i, i2);
        if (interfaceC808610VnnLIZ != null && !interfaceC808610VnnLIZ.LJFF()) {
            return iOnStartCommand;
        }
        return 2;
    }
}
