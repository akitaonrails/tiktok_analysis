package com.ss.android.ugc.aweme.feed.module;

import X.C09CT;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowingEcLiveEvent implements Serializable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("description")
    public final String description;

    @C09CT("end_time")
    public final Long endTime;

    @C09CT("event_id")
    public final String eventId;

    @C09CT("is_after_story")
    public final Boolean isAfterStory;

    @C09CT("live_event_icon")
    public final ImageUrlModel liveEventIcon;

    @C09CT("name")
    public final String name;

    @C09CT("start_time")
    public final Long startTime;

    public FollowingEcLiveEvent() {
        this(null, null, null, null, null, null, null, null);
    }

    public final String getDaInfo() {
        return this.daInfo;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final ImageUrlModel getLiveEventIcon() {
        return this.liveEventIcon;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final Boolean isAfterStory() {
        return this.isAfterStory;
    }

    public FollowingEcLiveEvent(String str, String str2, Long l, Long l2, String str3, ImageUrlModel imageUrlModel, Boolean bool, String str4) {
        this.eventId = str;
        this.name = str2;
        this.startTime = l;
        this.endTime = l2;
        this.description = str3;
        this.liveEventIcon = imageUrlModel;
        this.isAfterStory = bool;
        this.daInfo = str4;
    }
}
