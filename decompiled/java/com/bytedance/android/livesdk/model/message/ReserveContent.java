package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class ReserveContent {

    @C09CT("created_timestamp")
    public long createdTimestamp;

    @C09CT("red_dot_num")
    public long redDotNum;

    @C09CT("reservation_anchor_count")
    public long reservationAnchorCount;

    @C09CT("reserver")
    public User reserver;

    @C09CT("reserver_room_id")
    public long reserverRoomId;
}
