package com.bytedance.memdump.upload;

import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2406809bu;
import X.C788530UwV;
import X.C817700W5w;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.util.Log;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.memdump.upload.HprofUploadJobService;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class HprofUploadJobService extends JobService {
    public static final AtomicInteger LLILLL = new AtomicInteger(0);
    public final AtomicInteger LL = new AtomicInteger(0);
    public final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);

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
        new BPEAThread() { // from class: X.09bo
            @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("HprofUploadJobService@bd89.onStartJob$1");
                boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                try {
                    LIZJ();
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("HprofUploadJobService@bd89.onStartJob$1");
            }

            public final void LIZJ() {
                super.run();
                this.LLILLJJLI.LL.set(0);
                this.LLILLJJLI.LLILLJJLI.set(false);
                HprofUploadJobService hprofUploadJobService = this.LLILLJJLI;
                JobParameters jobParameters2 = jobParameters;
                File fileLIZIZ = C2223108nN.LIZIZ();
                if (fileLIZIZ == null || !fileLIZIZ.exists()) {
                    return;
                }
                File[] fileArrListFiles = fileLIZIZ.listFiles(new FileFilter() { // from class: X.09bp
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        return file.isDirectory();
                    }
                });
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        C1501930pBf.LIZJ(new C2406409bq(false, 0), file, null, hprofUploadJobService, jobParameters2);
                    }
                }
                hprofUploadJobService.LIZ(jobParameters2, true, true);
            }
        }.start();
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return !C2406809bu.LIZJ;
    }

    public final void LIZ(JobParameters jobParameters, boolean z, boolean z2) {
        if (C2406809bu.LIZJ) {
            if (z2) {
                if (this.LL.get() <= 0) {
                    jobFinished(jobParameters, false);
                    return;
                }
                return;
            }
            if (!z) {
                if (this.LLILLJJLI.compareAndSet(false, true)) {
                    AtomicInteger atomicInteger = LLILLL;
                    if (atomicInteger.get() >= 3) {
                        jobFinished(jobParameters, false);
                        return;
                    } else {
                        atomicInteger.incrementAndGet();
                        jobFinished(jobParameters, true);
                        return;
                    }
                }
                return;
            }
            if (this.LLILLJJLI.get()) {
                return;
            }
            this.LL.decrementAndGet();
            if (this.LL.get() > 0) {
                return;
            }
            jobFinished(jobParameters, false);
        }
    }
}
