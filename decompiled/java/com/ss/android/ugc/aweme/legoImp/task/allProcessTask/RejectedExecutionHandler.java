package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import X.C0CCZ;
import X.C0VZ0;
import X.C0WP3;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import android.content.Context;
import android.os.Build;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes14.dex */
@InterfaceC20234614Fk
public final class RejectedExecutionHandler implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "RejectedExecutionHandler";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (Build.VERSION.SDK_INT <= 28) {
            ((ThreadPoolExecutor) C0WP3.LIZ(PthreadAsyncTask.THREAD_POOL_EXECUTOR_V2)).setRejectedExecutionHandler(new java.util.concurrent.RejectedExecutionHandler() { // from class: X.0WPB
                @Override // java.util.concurrent.RejectedExecutionHandler
                public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                    BlockingQueue<Runnable> queue = threadPoolExecutor.getQueue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Task ");
                    sbLIZ.append(runnable.toString());
                    sbLIZ.append(" rejected from ");
                    sbLIZ.append(threadPoolExecutor.toString());
                    sbLIZ.append(" Pending tasks: ");
                    sbLIZ.append(queue);
                    C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                }
            });
        }
    }
}
