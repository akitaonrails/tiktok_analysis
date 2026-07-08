package com.ss.android.startup;

import X.C1BWX;
import X.C799900VZk;
import X.C848140XOy;
import android.app.Application;
import com.ss.android.ugc.aweme.launcher.service.task.ITaskParams;

/* JADX INFO: loaded from: classes14.dex */
public class TaskParamsImpl implements ITaskParams {
    @Override // com.ss.android.ugc.aweme.launcher.service.task.ITaskParams
    public final boolean LIZIZ() {
        return LIZ(C799900VZk.LJFF.LJIJJLI() ? 1 : 16777215);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.task.ITaskParams
    public final Application getApplication() {
        return C848140XOy.LIZ.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.task.ITaskParams
    public final boolean LIZ(int i) {
        return C1BWX.LIZ(i);
    }
}
