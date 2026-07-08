package webcast.api.feed;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class EventStruct {

    @C09CT("duration")
    public long duration;

    @C09CT("enable_update")
    public boolean enableUpdate;

    @C09CT("has_subscribed")
    public boolean hasSubscribed;

    @C09CT("owner")
    public User owner;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("style")
    public int style;

    @C09CT("subscriber_count")
    public long subscriberCount;

    @C09CT("type")
    public int type;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("title")
    public String title = "";

    @C09CT("desc")
    public String desc = "";
}
