package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class SubInvitationParameter {

    @C09CT("invite_fans_num_limit")
    public int inviteFansNumLimit;

    @C09CT("invitee_task_a")
    public TaskParam inviteeTaskA;

    @C09CT("invitee_task_b")
    public TaskParam inviteeTaskB;

    @C09CT("leader_board_rank_length")
    public int leaderBoardRankLength;

    @C09CT("normal_user_reward_num")
    public int normalUserRewardNum;

    @C09CT("seed_user_reward_num")
    public int seedUserRewardNum;

    @C09CT("self")
    public TaskParam self;

    @C09CT("swag_reward_limit")
    public int swagRewardLimit;

    public static final class TaskParam {

        @C09CT("limit")
        public int limit;

        @C09CT("reward_num")
        public int rewardNum;
    }
}
