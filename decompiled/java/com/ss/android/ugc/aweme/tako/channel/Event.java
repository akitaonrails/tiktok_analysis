package com.ss.android.ugc.aweme.tako.channel;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class Event {

    @C09CT("server_latest_inbox_cursor")
    public final long lastInboxCursor;

    public Event() {
        this(0L);
    }

    public Event(long j) {
        this.lastInboxCursor = j;
    }
}
