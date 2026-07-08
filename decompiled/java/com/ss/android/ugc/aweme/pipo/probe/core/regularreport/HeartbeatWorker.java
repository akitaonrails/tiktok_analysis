package com.ss.android.ugc.aweme.pipo.probe.core.regularreport;

import X.AbstractC795160VHe;
import X.AnonymousClass1489;
import X.C795180VHg;
import X.C795400VIc;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;

/* JADX INFO: loaded from: classes14.dex */
public final class HeartbeatWorker extends Worker {
    @Override // androidx.work.Worker
    public final AbstractC795160VHe LJII() {
        C795400VIc.LIZ.getClass();
        if (C795400VIc.LIZJ) {
            C795400VIc.LIZJ = false;
            return new C795180VHg();
        }
        IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
        if (iProbeService != null) {
            iProbeService.LJIIIIZZ(new AnonymousClass1489("sdk_internal", "heartBeat", null, null, 248));
        }
        return new C795180VHg();
    }

    public HeartbeatWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
