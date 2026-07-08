package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class FanClubUserEvent {

    @C09CT("anchor_info")
    public User anchorInfo;

    @C09CT("content")
    public String content = "";

    @C09CT("event_time")
    public long eventTime;

    @C09CT("event_type")
    public int eventType;

    @C09CT("user_info")
    public MiniUser userInfo;
}
