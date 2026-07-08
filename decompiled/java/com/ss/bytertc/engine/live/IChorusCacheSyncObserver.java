package com.ss.bytertc.engine.live;

import com.ss.bytertc.engine.video.VideoFrame;

/* JADX INFO: loaded from: classes21.dex */
public interface IChorusCacheSyncObserver {
    void onSyncEvent(ChorusCacheSyncEvent chorusCacheSyncEvent, ChorusCacheSyncError chorusCacheSyncError);

    void onSyncedUsersChanged(int i, String[] strArr);

    void onSyncedVideoFrames(int i, String[] strArr, VideoFrame[] videoFrameArr);
}
