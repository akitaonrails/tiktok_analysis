package com.ss.android.ugc.aweme.app.launch;

import X.C04TD;
import X.C0CBQ;
import X.C0CCZ;
import com.ss.android.ugc.aweme.launcher.service.task.ITaskApi;
import com.ss.android.ugc.aweme.legoImpl.task.InitFireBase;
import com.ss.android.ugc.aweme.legoImpl.task.LegoRequestTask;

/* JADX INFO: loaded from: classes29.dex */
public final class TaskServiceImpl implements ITaskApi {
    public static ITaskApi LIZLLL() {
        Object objLIZ = C04TD.LIZ(ITaskApi.class, false);
        if (objLIZ != null) {
            return (ITaskApi) objLIZ;
        }
        if (C04TD.LLII == null) {
            synchronized (ITaskApi.class) {
                if (C04TD.LLII == null) {
                    C04TD.LLII = new TaskServiceImpl();
                }
            }
        }
        return C04TD.LLII;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.task.ITaskApi
    public final boolean LIZIZ() {
        return C0CBQ.LIZ().contains("BulletPreloadTask");
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.task.ITaskApi
    public final C0CCZ LIZJ() {
        return new LegoRequestTask();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.task.ITaskApi
    public final C0CCZ LIZ() {
        return InitFireBase.LIZ();
    }
}
