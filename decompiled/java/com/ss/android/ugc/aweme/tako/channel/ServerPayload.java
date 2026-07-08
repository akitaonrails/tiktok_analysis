package com.ss.android.ugc.aweme.tako.channel;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class ServerPayload {

    @C09CT("msg_payload")
    public final Event event;

    @C09CT("event_type")
    public final int eventType;

    public ServerPayload() {
        this(0, new Event(0L));
    }

    public ServerPayload(int i, Event event) {
        this.eventType = i;
        this.event = event;
    }
}
