package com.ss.android.ugc.aweme.effect;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C15O7;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2501509rB;
import X.C788530UwV;
import X.C817700W5w;
import X.C823050WQl;
import Y.ACallableS147S0000000_3;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.services.IExternalService;

/* JADX INFO: loaded from: classes4.dex */
public class EffectJobService extends Service {
    public static final /* synthetic */ int LL = 0;

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig().isHasEffectCache()) {
            C15O7.LIZIZ(new ACallableS147S0000000_3(0), C823050WQl.LIZLLL(), null).LJIIZILJ(new C2501509rB(this, 4), C15O7.LJIIIIZZ);
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

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/ugc/aweme/effect/EffectJobService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+uZZrNyHwjx0eB7GAT4sHWEdz3J5JF", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
