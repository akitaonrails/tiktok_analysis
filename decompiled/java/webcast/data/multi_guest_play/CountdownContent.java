package webcast.data.multi_guest_play;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class CountdownContent {

    @C09CT("channel_id")
    public long channelId;

    @C09CT("countdown_config")
    public CountdownConfig countdownConfig;

    @C09CT("countdown_id")
    public long countdownId;

    @C09CT("countdown_user")
    public CountdownUser countdownUser;

    @C09CT("end_time")
    public long endTime;

    @C09CT("room_id")
    public long roomId;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
