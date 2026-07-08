package com.ss.android.ugc.aweme.legoImp;

import X.C1BVL;
import X.C786410Ut5;
import X.C823050WQl;
import com.ss.android.ugc.aweme.base.ITaskManagerConfig;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes35.dex */
public final class TaskManagerConfigImpl implements ITaskManagerConfig {
    @Override // com.ss.android.ugc.aweme.base.ITaskManagerConfig
    public final C1BVL LIZ() {
        C1BVL c1bvl = new C1BVL();
        ExecutorService executorServiceLIZLLL = C823050WQl.LIZLLL();
        if (executorServiceLIZLLL == null) {
            executorServiceLIZLLL = C786410Ut5.d4(4);
        }
        c1bvl.LIZ = executorServiceLIZLLL;
        return c1bvl;
    }
}
