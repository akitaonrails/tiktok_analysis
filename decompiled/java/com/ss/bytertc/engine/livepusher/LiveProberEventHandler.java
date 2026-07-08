package com.ss.bytertc.engine.livepusher;

import X.C2188811AlT;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class LiveProberEventHandler {
    public WeakReference<LiveProberImpl> mLiveProberImpl;

    public LiveProberEventHandler(LiveProberImpl liveProberImpl) {
        this.mLiveProberImpl = new WeakReference<>(liveProberImpl);
    }

    public void onLogMonitor(String str) {
        LiveProberImpl liveProberImpl;
        ILiveProberEventHandler liveProberEventHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLogMonitor... log: ");
        sbLIZ.append(str);
        LogUtil.d("LiveProberEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        WeakReference<LiveProberImpl> weakReference = this.mLiveProberImpl;
        if (weakReference != null && (liveProberImpl = weakReference.get()) != null && (liveProberEventHandler = liveProberImpl.getLiveProberEventHandler()) != null) {
            liveProberEventHandler.onLogMonitor(str);
        }
    }

    public void onEvent(LiveProbeResult liveProbeResult, int i, String str) {
        LiveProberImpl liveProberImpl;
        ILiveProberEventHandler liveProberEventHandler;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEvent... result: ");
        sbLIZ.append(liveProbeResult.value());
        sbLIZ.append(", bweKbps: ");
        sbLIZ.append(i);
        sbLIZ.append(", msg: ");
        sbLIZ.append(str);
        LogUtil.d("LiveProberEventHandler", C2188811AlT.LIZIZ(sbLIZ));
        WeakReference<LiveProberImpl> weakReference = this.mLiveProberImpl;
        if (weakReference != null && (liveProberImpl = weakReference.get()) != null && (liveProberEventHandler = liveProberImpl.getLiveProberEventHandler()) != null) {
            liveProberEventHandler.onEvent(liveProbeResult, i, str);
        }
    }
}
