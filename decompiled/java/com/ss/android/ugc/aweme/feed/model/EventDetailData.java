package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes9.dex */
public final class EventDetailData extends BaseResponse {

    @C09CT("event")
    public EventStruct event;

    @C09CT("room_id")
    public String roomId;

    public final EventStruct getEvent() {
        return this.event;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final void setEvent(EventStruct eventStruct) {
        this.event = eventStruct;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }
}
