package com.bytedance.android.livesdkapi.ping;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public class PingResult {

    @C09CT("mosaic_status")
    public int mosaicStatus;

    @C09CT("next_ping")
    public long nextPingInterval;

    @C09CT("room_id")
    public long roomId;

    @C09CT("room_status")
    public int roomStatus;

    public int getMosaicStatus() {
        return this.mosaicStatus;
    }

    public long getNextPingInterval() {
        return this.nextPingInterval;
    }

    public long getRoomId() {
        return this.roomId;
    }

    public int getRoomStatus() {
        return this.roomStatus;
    }
}
