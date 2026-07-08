package com.bytedance.android.livesdk.comp.api.event.api.data;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class EventStruct {

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

    @C09CT("is_paid_event")
    public boolean isPaidEvent;

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

    public EventStruct() {
        this(null, 0L, 0L, null, null, 0, null, 0L, 0, false, false, false);
    }

    public EventStruct(String str, long j, long j2, String str2, String str3, int i, User user, long j3, int i2, boolean z, boolean z2, boolean z3) {
        this.id = str;
        this.startTime = j;
        this.duration = j2;
        this.title = str2;
        this.desc = str3;
        this.status = i;
        this.host = user;
        this.subscriberCount = j3;
        this.type = i2;
        this.enableUpdate = z;
        this.hasSubscribed = z2;
        this.isPaidEvent = z3;
    }
}
