package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class DeletedLiveInfo implements Serializable {

    @C09CT("reverse_index")
    public long reverseIndex;

    @C09CT("room_id")
    public long roomId;

    @C09CT("slate_group_type")
    public long slateGroupType;

    public DeletedLiveInfo() {
        this(0L, 0L, 0L);
    }

    public final void setReverseIndex(long j) {
        this.reverseIndex = j;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }

    public final void setSlateGroupType(long j) {
        this.slateGroupType = j;
    }

    public DeletedLiveInfo(long j, long j2, long j3) {
        this.reverseIndex = j;
        this.roomId = j2;
        this.slateGroupType = j3;
    }
}
