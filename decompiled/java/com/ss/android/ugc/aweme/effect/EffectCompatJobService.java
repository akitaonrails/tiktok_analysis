package com.ss.android.ugc.aweme.effect;

import X.C15O7;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2501409rA;
import X.C788530UwV;
import X.C817700W5w;
import X.C823050WQl;
import Y.ACallableS147S0000000_3;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.services.IExternalService;

/* JADX INFO: loaded from: classes4.dex */
public class EffectCompatJobService extends JobService {
    public static volatile boolean LL;

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (!((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig().isHasEffectCache()) {
            return false;
        }
        C15O7.LIZIZ(new ACallableS147S0000000_3(1), C823050WQl.LIZLLL(), null).LJIIZILJ(new C2501409rA(this, jobParameters, 3), C15O7.LJIIIIZZ);
        return true;
    }
}
