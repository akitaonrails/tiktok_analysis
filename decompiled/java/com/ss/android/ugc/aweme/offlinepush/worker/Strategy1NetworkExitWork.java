package com.ss.android.ugc.aweme.offlinepush.worker;

import X.C816100Vzs;
import android.content.Context;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes29.dex */
public final class Strategy1NetworkExitWork extends BaseOfflinePushWork {
    public final int LLJI;

    @Override // com.ss.android.ugc.aweme.offlinepush.worker.BaseOfflinePushWork
    public final int LJIIJ() {
        return this.LLJI;
    }

    public Strategy1NetworkExitWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.LLJI = 1;
    }

    @Override // com.ss.android.ugc.aweme.offlinepush.worker.BaseOfflinePushWork
    public final C816100Vzs LJIIIIZZ(Context context, int i) {
        return new C816100Vzs(this.LLJI, context.getString(2131838520), BaseOfflinePushWork.LJIIL(2131755437, i, context));
    }
}
