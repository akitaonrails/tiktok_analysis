package com.samsung.sdk.sperf;

import X.C1C7U;
import X.C2179971ATj;
import android.content.Context;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes32.dex */
public class TaskBoostReleaseHandler extends BPEAHandler implements Runnable {
    public SPerfManager sPerfManager;
    public int type;

    public TaskBoostReleaseHandler(Context context, SPerfManager sPerfManager, int i) {
        super(context.getMainLooper());
        this.sPerfManager = sPerfManager;
        this.type = i;
    }

    public void com_samsung_sdk_sperf_TaskBoostReleaseHandler__run$___twin___() {
        this.sPerfManager.stopBoost(this.type, PerformanceManager.getPid());
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        C1C7U.LIZ("TaskBoostReleaseHandler@7eda.handleMessage");
        if (message.what == 15067) {
            run();
        }
        C1C7U.LIZIZ("TaskBoostReleaseHandler@7eda.handleMessage");
    }

    @Override // java.lang.Runnable
    public void run() {
        C1C7U.LIZ("TaskBoostReleaseHandler@7eda.run");
        com_samsung_sdk_sperf_TaskBoostReleaseHandler_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        C1C7U.LIZIZ("TaskBoostReleaseHandler@7eda.run");
    }

    public void startBoostTimeout(int i) {
        removeMessages(15067);
        sendEmptyMessageDelayed(15067, i);
    }

    public static void com_samsung_sdk_sperf_TaskBoostReleaseHandler_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(TaskBoostReleaseHandler taskBoostReleaseHandler) {
        try {
            taskBoostReleaseHandler.com_samsung_sdk_sperf_TaskBoostReleaseHandler__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }
}
