package com.ss.android.ugc.aweme.widget;

import X.C1841010y0Z;
import X.C1841030y0b;
import X.C1C7U;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2409809cO;
import X.C788530UwV;
import X.C817700W5w;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.Message;
import android.os.PersistableBundle;
import android.util.Log;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import kotlin.jvm.internal.AwS393S0200000_27;

/* JADX INFO: loaded from: classes4.dex */
public final class AppWidgetSchedulerService extends JobService {
    public JobHandler LL;

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    /* JADX INFO: loaded from: classes28.dex */
    public static final class JobHandler extends BPEAHandler {
        public final Context LL;
        public final AppWidgetSchedulerService LLILLJJLI;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("AppWidgetSchedulerService$JobHandler@c800.handleMessage");
            JobParameters jobParameters = (JobParameters) HandlerHook.getMessageObj(message.obj);
            if (message.what != 1) {
                this.LLILLJJLI.jobFinished(jobParameters, false);
                C1C7U.LIZIZ("AppWidgetSchedulerService$JobHandler@c800.handleMessage");
                return;
            }
            PersistableBundle extras = jobParameters.getExtras();
            int[] intArray = extras.getIntArray("app_widget_ids");
            if (intArray != null && intArray.length != 0) {
                int i = extras.getInt("app_widget_type");
                boolean z = extras.getBoolean("app_widget_force_update");
                if (i != 1) {
                    if (i == 5) {
                        C1841030y0b c1841030y0b = C1841030y0b.LIZ;
                        Context context = this.LL;
                        AwS393S0200000_27 awS393S0200000_27 = new AwS393S0200000_27(this, jobParameters, 63);
                        c1841030y0b.getClass();
                        C1841030y0b.LJFF(context, intArray, awS393S0200000_27, z);
                    }
                } else {
                    C1841010y0Z.LIZIZ(C1841010y0Z.LIZ, this.LL, intArray, new AwS393S0200000_27(this, jobParameters, 64));
                }
                C1C7U.LIZIZ("AppWidgetSchedulerService$JobHandler@c800.handleMessage");
                return;
            }
            this.LLILLJJLI.jobFinished(jobParameters, false);
            C1C7U.LIZIZ("AppWidgetSchedulerService$JobHandler@c800.handleMessage");
        }

        public JobHandler(Context context, AppWidgetSchedulerService appWidgetSchedulerService) {
            this.LL = context;
            this.LLILLJJLI = appWidgetSchedulerService;
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
        int i;
        PersistableBundle extras;
        if (this.LL == null) {
            Context applicationContext = getApplicationContext();
            if (C2409809cO.LIZIZ && applicationContext == null) {
                applicationContext = C2409809cO.LIZ;
            }
            this.LL = new JobHandler(applicationContext, this);
        }
        Message message = new Message();
        if (jobParameters != null && (extras = jobParameters.getExtras()) != null) {
            i = extras.getInt("app_widget_action_type");
        } else {
            i = -1;
        }
        message.what = i;
        message.obj = jobParameters;
        JobHandler jobHandler = this.LL;
        if (jobHandler != null) {
            jobHandler.sendMessage(message);
            return true;
        }
        return true;
    }
}
