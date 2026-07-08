package com.ss.bytertc.engine.livepusher;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes21.dex */
public class StatisticsEventHandler {
    public WeakReference<LivePusherImpl> mLivePusherImpl;

    public StatisticsEventHandler(LivePusherImpl livePusherImpl) {
        this.mLivePusherImpl = new WeakReference<>(livePusherImpl);
    }

    public void onLogMonitor(String str) {
        LivePusherImpl livePusherImpl;
        IStatisticsEventHandler statisticsEventHandler;
        WeakReference<LivePusherImpl> weakReference = this.mLivePusherImpl;
        if (weakReference != null && (livePusherImpl = weakReference.get()) != null && (statisticsEventHandler = livePusherImpl.getStatisticsEventHandler()) != null) {
            statisticsEventHandler.onLogMonitor(str);
        }
    }
}
