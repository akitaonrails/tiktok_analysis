package com.ss.android.ugc.aweme.challenge.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class MixCardStruct implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("aweme_info")
    public Aweme aweme;

    @C09CT("room_info")
    public RoomStructV2 roomInfo;

    @C09CT("type")
    public int type;

    public static final class Companion {
    }

    public final boolean isLive() {
        return this.roomInfo != null;
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final RoomStructV2 getRoomInfo() {
        return this.roomInfo;
    }

    public final int getType() {
        return this.type;
    }

    public final void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public final void setRoomInfo(RoomStructV2 roomStructV2) {
        this.roomInfo = roomStructV2;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
