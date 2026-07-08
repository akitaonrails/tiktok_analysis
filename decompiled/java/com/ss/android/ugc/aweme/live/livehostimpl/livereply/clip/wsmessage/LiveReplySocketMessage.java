package com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip.wsmessage;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public abstract class LiveReplySocketMessage implements Serializable {
    public static final int $stable = 8;

    @C09CT("room_id")
    public long roomId;

    public final long getRoomId() {
        return this.roomId;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }
}
