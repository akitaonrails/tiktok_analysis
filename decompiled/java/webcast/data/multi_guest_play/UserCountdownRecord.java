package webcast.data.multi_guest_play;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class UserCountdownRecord {

    @C09CT("achieved")
    public boolean achieved;

    @C09CT("countdown_id")
    public long countdownId;

    @C09CT("duration")
    public long duration;

    @C09CT("end_time")
    public long endTime;

    @C09CT("score")
    public long score;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("target_score")
    public long targetScore;
}
