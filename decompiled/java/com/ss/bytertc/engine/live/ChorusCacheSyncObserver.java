package com.ss.bytertc.engine.live;

import com.bytedance.realx.video.VideoFrame;

/* JADX INFO: loaded from: classes21.dex */
public class ChorusCacheSyncObserver {
    public IChorusCacheSyncObserver observer;

    public void onSyncedVideoFrames(int i, String[] strArr, VideoFrame[] videoFrameArr) {
    }

    public void setUserObserver(IChorusCacheSyncObserver iChorusCacheSyncObserver) {
        if (iChorusCacheSyncObserver != null) {
            this.observer = iChorusCacheSyncObserver;
        }
    }

    public void onSyncEvent(ChorusCacheSyncEvent chorusCacheSyncEvent, ChorusCacheSyncError chorusCacheSyncError) {
        IChorusCacheSyncObserver iChorusCacheSyncObserver = this.observer;
        if (iChorusCacheSyncObserver != null) {
            iChorusCacheSyncObserver.onSyncEvent(chorusCacheSyncEvent, chorusCacheSyncError);
        }
    }

    public void onSyncedUsersChanged(int i, String[] strArr) {
        IChorusCacheSyncObserver iChorusCacheSyncObserver = this.observer;
        if (iChorusCacheSyncObserver != null) {
            iChorusCacheSyncObserver.onSyncedUsersChanged(i, strArr);
        }
    }
}
