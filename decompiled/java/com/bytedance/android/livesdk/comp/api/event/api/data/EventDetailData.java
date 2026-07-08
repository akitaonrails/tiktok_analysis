package com.bytedance.android.livesdk.comp.api.event.api.data;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class EventDetailData {

    @C09CT("status_code")
    public final long code;

    @C09CT("event")
    public EventStruct event;

    @C09CT("status_msg")
    public final String msg;

    @C09CT("room_id")
    public String roomId;

    public EventDetailData() {
        this(0L, "", null, null);
    }

    public EventDetailData(long j, String str, EventStruct eventStruct, String str2) {
        this.code = j;
        this.msg = str;
        this.event = eventStruct;
        this.roomId = str2;
    }
}
