package com.bytedance.android.livesdkapi.model;

/* JADX INFO: loaded from: classes8.dex */
public final class LatestLiveData {
    public final long latestDuration;
    public final long latestLeaveTime;
    public final long latestRoomId;

    public LatestLiveData() {
        this(0L, 0L, 0L);
    }

    public LatestLiveData(long j, long j2, long j3) {
        this.latestRoomId = j;
        this.latestLeaveTime = j2;
        this.latestDuration = j3;
    }
}
