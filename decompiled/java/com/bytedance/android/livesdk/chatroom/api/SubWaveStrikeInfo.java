package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubWaveStrikeInfo {

    @C09CT("emote_list")
    public List<EmoteModel> emoteList = new ArrayList();

    @C09CT("end_time")
    public long endTime;

    @C09CT("round")
    public long round;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("strike_record_id")
    public long strikeRecordId;

    @C09CT("strike_reward")
    public WaveReward strikeReward;

    @C09CT("strike_target_count")
    public long strikeTargetCount;
}
