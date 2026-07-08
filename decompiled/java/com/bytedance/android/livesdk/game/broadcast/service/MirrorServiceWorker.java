package com.bytedance.android.livesdk.game.broadcast.service;

import X.AbstractC795160VHe;
import X.C20441214yg;
import X.C795180VHg;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public final class MirrorServiceWorker extends Worker {
    public static Function0<Unit> LLIZ;

    @Override // androidx.work.Worker
    public final AbstractC795160VHe LJII() {
        C20441214yg.LIZIZ("GameBgServiceHelper", "MirrorServiceWorker checkAndRestartMirrorService");
        Function0<Unit> function0 = LLIZ;
        if (function0 != null) {
            function0.invoke();
        }
        return new C795180VHg();
    }

    public MirrorServiceWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
