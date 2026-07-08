package com.bytedance.android.livesdk.model.message.battle;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class BattleRewardSettle {

    @C09CT("Prompt")
    public BattlePrompt rewardSettlePrompt;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
