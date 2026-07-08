package com.ss.android.ugc.aweme.lifecycle.task;

import X.C0C64;
import X.C1906580ziK;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2455309jj;
import X.C2455709jn;
import X.C2499609qs;
import X.C786410Ut5;
import X.C788530UwV;
import X.C817700W5w;
import Y.ARunnableS103S0100000_3;
import Y.AfS131S0000000_3;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Log;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class KeepWarmJobService extends JobService {
    public static WeakReference<KeepWarmJobService> LLILZLL;
    public volatile JobParameters LLILLL;
    public boolean LLILZ;
    public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS103S0100000_3 LLILLJJLI = new ARunnableS103S0100000_3((Object) this, 62);
    public final C2499609qs LLILZIL = new C2499609qs(this, 1);

    public final synchronized void LIZIZ() {
        this.LL.removeCallbacks(this.LLILLJJLI);
        if (this.LLILLL == null) {
            return;
        }
        JobParameters jobParameters = this.LLILLL;
        this.LLILLL = null;
        LIZ(jobParameters);
    }

    static {
        try {
            C1906580ziK.LIZJ().LIZ().LJLLLLLL(new AfS131S0000000_3(5));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        LLILZLL = new WeakReference<>(this);
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        try {
            C786410Ut5.LJJI(this, this.LLILZIL, new IntentFilter("android.intent.action.SCREEN_OFF"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.LL.removeCallbacks(this.LLILLJJLI);
        this.LLILLL = null;
        try {
            C2499609qs c2499609qs = this.LLILZIL;
            ReceiverRegisterLancet.loge(c2499609qs, false);
            unregisterReceiver(c2499609qs);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LLILZLL = null;
    }

    public final void LIZ(JobParameters jobParameters) {
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "4500_lifecycle_job_fake_fail", true);
        if (iLJIJ <= 0) {
            jobFinished(jobParameters, false);
            return;
        }
        Keva repo = Keva.getRepo("perf_job_keep_warm");
        int i = repo.getInt("fail_count", 0);
        if (i < iLJIJ) {
            repo.storeInt("fail_count", i + 1);
            jobFinished(jobParameters, true);
        } else {
            repo.storeInt("fail_count", 0);
            jobFinished(jobParameters, false);
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PowerManager powerManager;
        try {
            if (Keva.getRepo("perf_job_keep_warm").getInt("schedule_mode", 0) == 2 && C2455309jj.LIZJ() >= 0) {
                C2455709jn.LIZJ(this);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            powerManager = (PowerManager) C786410Ut5.P2(this);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        if (powerManager != null) {
            if (powerManager.isInteractive()) {
                this.LLILLL = jobParameters;
                int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "4500_lifecycle_job_hold_sec", true);
                if (iLJIJ <= 0) {
                    iLJIJ = 600;
                }
                this.LL.removeCallbacks(this.LLILLJJLI);
                C786410Ut5.LJLIIL(((long) iLJIJ) * 1000, this.LL, this.LLILLJJLI);
                return true;
            }
        }
        LIZ(jobParameters);
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        this.LL.removeCallbacks(this.LLILLJJLI);
        this.LLILLL = null;
        return true;
    }
}
