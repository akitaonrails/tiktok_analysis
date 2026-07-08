package com.ss.android.ugc.aweme.live.feedpage;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveRoomInfoResponse extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("data")
    public NewLiveRoomStruct roomStruct;

    public final NewLiveRoomStruct getRoomStruct() {
        return this.roomStruct;
    }

    public final void setRoomStruct(NewLiveRoomStruct newLiveRoomStruct) {
        this.roomStruct = newLiveRoomStruct;
    }
}
