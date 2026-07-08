package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.EventUserInfo;

/* JADX INFO: loaded from: classes.dex */
public final class RoomEventMessage extends AbstractC1136060ffY {

    @C09CT("config_opt")
    public int configOpt;

    @C09CT("event_id")
    public long eventId;

    @C09CT("event_user_info")
    public List<EventUserInfo> eventUserInfo;

    @C09CT("pos_x")
    public String posX;

    @C09CT("pos_y")
    public String posY;

    @C09CT("start_time")
    public long startTime;

    @C09CT("subscribed_count")
    public long subscribedCount;

    @C09CT("title")
    public String title;

    public RoomEventMessage() {
        this.type = C001A.ROOM_EVENT_MESSAGE;
        this.title = "";
        this.posX = "";
        this.posY = "";
        this.eventUserInfo = new ArrayList();
    }
}
