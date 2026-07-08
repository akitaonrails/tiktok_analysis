package com.ss.android.ugc.aweme.control;

import X.C1475000oUE;
import X.C2187451AjH;
import X.C786410Ut5;
import Y.ARunnableS92S0000000_13;
import com.ss.android.ugc.aweme.net.control.IRequestCoordinator;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* JADX INFO: loaded from: classes14.dex */
public final class RequestCoordinatorImpl implements IRequestCoordinator {
    @Override // com.ss.android.ugc.aweme.net.control.IRequestCoordinator
    public final void LIZ() {
        int i = C2187451AjH.LIZ;
        TTVideoEngineLog.d("ApiVodNetController", "stopVodNetControl.");
        C786410Ut5.LJJZZIII(C1475000oUE.LJ, new ARunnableS92S0000000_13(7));
    }

    @Override // com.ss.android.ugc.aweme.net.control.IRequestCoordinator
    public final void LIZIZ() {
        int i = C2187451AjH.LIZ;
        TTVideoEngineLog.d("ApiVodNetController", "startVodNetControl.");
        C786410Ut5.LJJZZIII(C1475000oUE.LJ, new ARunnableS92S0000000_13(8));
    }
}
