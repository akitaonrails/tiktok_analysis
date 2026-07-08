package com.bytedance.android.livesdk.minute_game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class MinuteGameGameplay {

    @C09CT("finish_reason")
    public int finishReason;

    @C09CT("game_type")
    public int gameType;

    @C09CT("gameplay_id")
    public long gameplayId;

    @C09CT("progress_time")
    public MinuteGameProgressTime progressTime;

    @C09CT("reject_reason")
    public int rejectReason;

    @C09CT("sender_id")
    public long senderId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("trigger_gift")
    public TriggerGift triggerGift;
}
