package com.ss.android.ugc.aweme.notification.api;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class EventInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("action")
    public final Integer action;

    @C09CT("channel")
    public final Integer channel;

    @C09CT("event_id")
    public final String eventId;

    @C09CT("extras")
    public final List<EventExtra> extras;

    @C09CT("gen_time")
    public final String genTime;

    public EventInfo() {
        this(0, 0, null, null, null);
    }

    public EventInfo(Integer num, Integer num2, String str, String str2, List<EventExtra> list) {
        this.channel = num;
        this.action = num2;
        this.eventId = str;
        this.genTime = str2;
        this.extras = list;
    }
}
