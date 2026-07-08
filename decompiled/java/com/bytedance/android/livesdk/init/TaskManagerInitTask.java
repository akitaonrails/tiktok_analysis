package com.bytedance.android.livesdk.init;

import X.AbstractC20513081v;
import X.C08UK;
import X.C1119370fEd;
import X.C1119380fEe;
import X.C786410Ut5;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes18.dex */
public class TaskManagerInitTask extends AbstractC20513081v {
    @Override // X.AbstractC20513081v
    public String getTaskName() {
        return "task_manager_init_task";
    }

    @Override // X.AbstractC20513081v
    public void run() {
        Executor executorC4 = C786410Ut5.c4(new C08UK());
        C1119380fEe c1119380fEe = new C1119380fEe();
        if (executorC4 == null) {
            executorC4 = C1119370fEd.LIZJ;
        }
        c1119380fEe.LIZ = executorC4;
        C1119370fEd c1119370fEdLIZIZ = C1119370fEd.LIZIZ();
        c1119370fEdLIZIZ.getClass();
        c1119370fEdLIZIZ.LIZIZ = c1119380fEe.LIZ;
        new BPEAHandler(Looper.getMainLooper());
        c1119370fEdLIZIZ.LIZ = true;
    }
}
