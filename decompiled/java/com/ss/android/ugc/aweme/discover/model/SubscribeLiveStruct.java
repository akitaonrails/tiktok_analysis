package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SubscribeLiveStruct implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("event_id")
    public String eventId;

    @C09CT("has_subscribed")
    public boolean hasSubscribed;

    @C09CT("has_subscribed_next_live")
    public int hasSubscribedNextLive;

    @C09CT("start_time")
    public String startTime;

    public static final class Companion {
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final boolean getHasSubscribed() {
        return this.hasSubscribed;
    }

    public final int getHasSubscribedNextLive() {
        return this.hasSubscribedNextLive;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setHasSubscribed(boolean z) {
        this.hasSubscribed = z;
    }

    public final void setHasSubscribedNextLive(int i) {
        this.hasSubscribedNextLive = i;
    }

    public final void setStartTime(String str) {
        this.startTime = str;
    }
}
