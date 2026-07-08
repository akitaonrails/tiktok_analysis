package com.google.android.gms.measurement;

import X.C12Z4;
import X.C12ZV;
import X.C19804712eD;
import X.C19806212eS;
import X.C19836312jJ;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import X.InterfaceC19836812jO;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes31.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC19836812jO {
    public C19836312jJ<AppMeasurementJobService> LL;

    @Override // X.InterfaceC19836812jO
    public final void LIZ(Intent intent) {
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final C19836312jJ<AppMeasurementJobService> LIZJ() {
        if (this.LL == null) {
            this.LL = new C19836312jJ<>(this);
        }
        return this.LL;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        LIZJ().LIZ();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C19804712eD.LIZIZ(LIZJ().LIZ, null, null).LJIILJJIL().LJIILIIL.LIZJ("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // X.InterfaceC19836812jO
    public final void LIZIZ(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // X.InterfaceC19836812jO
    public final boolean LJII(int i) {
        throw new UnsupportedOperationException();
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
    public final void onRebind(Intent intent) {
        LIZJ().LIZIZ(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final C19836312jJ<AppMeasurementJobService> c19836312jJLIZJ = LIZJ();
        final C19806212eS c19806212eSLJIILJJIL = C19804712eD.LIZIZ(c19836312jJLIZJ.LIZ, null, null).LJIILJJIL();
        String string = jobParameters.getExtras().getString("action");
        c19806212eSLJIILJJIL.LJIILIIL.LIZ(string, "Local AppMeasurementJobService called. action");
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            Runnable runnable = new Runnable() { // from class: X.12jL
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzmh@399c.run");
                    try {
                        C19836312jJ c19836312jJ = c19836312jJLIZJ;
                        C19806212eS c19806212eS = c19806212eSLJIILJJIL;
                        JobParameters jobParameters2 = jobParameters;
                        c19836312jJ.getClass();
                        c19806212eS.LJIILIIL.LIZJ("AppMeasurementJobService processed last upload request.");
                        c19836312jJ.LIZ.LIZIZ(jobParameters2);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzmh@399c.run");
                }
            };
            C12Z4 c12z4LJIIIZ = C12Z4.LJIIIZ(c19836312jJLIZJ.LIZ);
            c12z4LJIIIZ.LJIIL().LJIILL(new C12ZV(c12z4LJIIIZ, runnable));
            return true;
        }
        return true;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        LIZJ().LIZLLL(intent);
        return true;
    }
}
