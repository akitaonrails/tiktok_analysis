package com.bytedance.android.livesdk.watch;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public final class ReasonCacheEntry implements Serializable {

    @C09CT("room_id")
    public String roomId;

    @C09CT("timestamp")
    public String timestamp;

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setTimestamp(String str) {
        this.timestamp = str;
    }

    public ReasonCacheEntry(String str, String str2) {
        this.roomId = str;
        this.timestamp = str2;
    }
}
