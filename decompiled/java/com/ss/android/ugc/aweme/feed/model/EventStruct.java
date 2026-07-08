package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class EventStruct implements Serializable {

    @C09CT("desc")
    public String desc;

    @C09CT("duration")
    public long duration;

    @C09CT("enable_update")
    public boolean enableUpdate;

    @C09CT("has_subscribed")
    public boolean hasSubscribed;

    @C09CT("host")
    public User host;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("subscriber_count")
    public long subscriberCount;

    @C09CT("title")
    public String title;

    @C09CT("type")
    public int type;

    public final String getDesc() {
        return this.desc;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final boolean getEnableUpdate() {
        return this.enableUpdate;
    }

    public final boolean getHasSubscribed() {
        return this.hasSubscribed;
    }

    public final User getHost() {
        return this.host;
    }

    public final String getId() {
        return this.id;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getSubscriberCount() {
        return this.subscriberCount;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEnableUpdate(boolean z) {
        this.enableUpdate = z;
    }

    public final void setHasSubscribed(boolean z) {
        this.hasSubscribed = z;
    }

    public final void setHost(User user) {
        this.host = user;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setSubscriberCount(long j) {
        this.subscriberCount = j;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
