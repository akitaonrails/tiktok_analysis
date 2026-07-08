package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class BattleBonusStatus {

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int bonusPeriod;

    @C09CT("enter_room_prompt")
    public BattlePrompt enterRoomPrompt;

    @C09CT("reward_settle_duration")
    public long rewardSettleDuration = 3;

    @C09CT("reward_settle_prompt")
    public BattlePrompt rewardSettlePrompt;

    @C09CT("reward_settle_status")
    public long rewardSettleStatus;

    @C09CT("progress")
    public long taskProgress;

    @C09CT("user_assisted")
    public boolean userAssisted;
}
