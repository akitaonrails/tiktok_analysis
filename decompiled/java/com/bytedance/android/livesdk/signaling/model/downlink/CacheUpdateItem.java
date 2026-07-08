package com.bytedance.android.livesdk.signaling.model.downlink;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class CacheUpdateItem {

    @C09CT("time_stamp")
    public long baseVersion;

    @C09CT("room_id")
    public long roomId;

    public CacheUpdateItem(long j, long j2) {
        this.roomId = j;
        this.baseVersion = j2;
    }
}
