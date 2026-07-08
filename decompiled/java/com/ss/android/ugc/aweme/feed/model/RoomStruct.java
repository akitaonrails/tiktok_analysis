package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public class RoomStruct implements Serializable {

    @C09CT("height")
    public int height;

    @C09CT("live_type_audio")
    public boolean liveTypeAudio;

    @C09CT("room_id")
    public long roomId;

    @C09CT("tv_station_room")
    public TVStationRoomStruct tvStationRoomStruct;

    @C09CT("user_count")
    public int userCount;

    @C09CT("width")
    public int width;

    @C09CT("with_linkmic")
    public boolean withLinkmic;

    public int getUserCount() {
        return this.userCount;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }
}
