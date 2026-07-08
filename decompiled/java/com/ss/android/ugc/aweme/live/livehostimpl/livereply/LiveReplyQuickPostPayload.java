package com.ss.android.ugc.aweme.live.livehostimpl.livereply;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveReplyQuickPostPayload implements Serializable {
    public static final int $stable = 8;

    @C09CT("fragment_id")
    public long fragmentId;

    @C09CT("fragment_type")
    public int fragmentType;

    @C09CT("item_id")
    public long itemId;

    @C09CT("room_id")
    public long roomId;

    @C09CT("owner_user_id")
    public long userId;

    public final long getFragmentId() {
        return this.fragmentId;
    }

    public final int getFragmentType() {
        return this.fragmentType;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final void setFragmentId(long j) {
        this.fragmentId = j;
    }

    public final void setFragmentType(int i) {
        this.fragmentType = i;
    }

    public final void setItemId(long j) {
        this.itemId = j;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }
}
