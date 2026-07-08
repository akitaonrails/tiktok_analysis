package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import X.AbstractC818550W9d;
import X.C0WCT;
import X.C0WCW;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2409809cO;
import X.C788530UwV;
import X.C816330W0p;
import X.C817700W5w;
import X.C818540W9c;
import X.C818570W9f;
import X.C819200WBq;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes14.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int LL = 0;

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
    public final boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        Context applicationContext = getApplicationContext();
        if (C2409809cO.LIZIZ && applicationContext == null) {
            applicationContext = C2409809cO.LIZ;
        }
        C819200WBq.LIZIZ(applicationContext);
        C818570W9f c818570W9fLIZ = AbstractC818550W9d.LIZ();
        c818570W9fLIZ.LIZIZ(string);
        c818570W9fLIZ.LIZJ(C816330W0p.LIZIZ(i));
        if (string2 != null) {
            c818570W9fLIZ.LIZIZ = Base64.decode(string2, 0);
        }
        C0WCW c0wcw = C819200WBq.LIZ().LIZLLL;
        c0wcw.LJ.execute(new C0WCT(c0wcw, c818570W9fLIZ.LIZ(), i2, new Runnable() { // from class: X.0W0o
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService jobInfoSchedulerService = this.LL;
                JobParameters jobParameters2 = jobParameters;
                jobInfoSchedulerService.getClass();
                C1C7U.LIZ("JobInfoSchedulerService@c2cc.com_google_android_datatransport_runtime_scheduling_jobscheduling_JobInfoSchedulerService__onStartJob$___twin___$1L");
                jobInfoSchedulerService.jobFinished(jobParameters2, false);
                C1C7U.LIZIZ("JobInfoSchedulerService@c2cc.com_google_android_datatransport_runtime_scheduling_jobscheduling_JobInfoSchedulerService__onStartJob$___twin___$1L");
            }
        }));
        if (((Boolean) C818540W9c.LJI.getValue()).booleanValue()) {
            try {
                jobFinished(jobParameters, false);
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return true;
            }
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return !((Boolean) C818540W9c.LJFF.getValue()).booleanValue();
    }
}
