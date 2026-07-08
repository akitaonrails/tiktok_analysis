package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public class RoomInfo {

    @C09CT(alternate = {"anchor_id"}, value = "anchorId")
    public String anchorId;

    @C09CT(alternate = {"room_id"}, value = "roomId")
    public long roomId;

    public RoomInfo() {
    }

    public String getAnchorId() {
        return this.anchorId;
    }

    public long getRoomId() {
        return this.roomId;
    }

    public RoomInfo(long j) {
        this.roomId = j;
    }

    public void setAnchorId(String str) {
        this.anchorId = str;
    }

    public void setRoomId(long j) {
        this.roomId = j;
    }

    public RoomInfo(long j, String str) {
        this.roomId = j;
        this.anchorId = str;
    }
}
