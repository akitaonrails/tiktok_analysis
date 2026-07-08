package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class PartnershipDropsTask {

    @C09CT("active_rewarded_num")
    public long activeRewardedNum;

    @C09CT("claim_expire_ts")
    public long claimExpireTs;

    @C09CT("claimed_num")
    public long claimedNum;

    @C09CT("comment_interval")
    public int commentInterval;

    @C09CT("comment_times")
    public int commentTimes;

    @C09CT("comment_type")
    public int commentType;

    @C09CT("countdown_duration")
    public long countdownDuration;

    @C09CT("countdown_passed")
    public long countdownPassed;

    @C09CT("gift")
    public PartnershipGiftInfo gift;

    @C09CT("is_exclusive")
    public boolean isExclusive;

    @C09CT("real_available_num")
    public long realAvailableNum;

    @C09CT("rewarded_num")
    public long rewardedNum;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("total_num")
    public long totalNum;

    @C09CT("type")
    public int type;

    @C09CT("user_comment_times")
    public int userCommentTimes;

    @C09CT("user_finish_time")
    public long userFinishTime;

    @C09CT("user_last_comment_time")
    public long userLastCommentTime;

    @C09CT("user_status")
    public int userStatus;

    @C09CT("user_view_duration")
    public long userViewDuration;

    @C09CT("user_view_start")
    public long userViewStart;

    @C09CT("view_duration")
    public int viewDuration;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("comment_content")
    public String commentContent = "";
}
