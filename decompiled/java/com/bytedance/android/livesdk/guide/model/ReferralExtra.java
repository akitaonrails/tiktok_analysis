package com.bytedance.android.livesdk.guide.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class ReferralExtra {

    @C09CT("can_notify")
    public boolean canNotify;

    @C09CT("earned_reward_amount")
    public long earnedRewardAmount;

    @C09CT("mentee_tasks")
    public List<TaskInfo> menteeTasks = new ArrayList();

    @C09CT("mentor_user")
    public UserBaseData mentorUser;

    @C09CT("paused")
    public boolean paused;

    @C09CT("reached_invite_limit")
    public boolean reachedInviteLimit;
}
