package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.BorderInfo;

/* JADX INFO: loaded from: classes.dex */
public class WeeklyRankRewardMessage extends AbstractC1136060ffY {

    @C09CT("avatar_border")
    public BorderInfo borderInfo;

    @C09CT("msg")
    public RoomNotifyMessage notifyMessage;

    @C09CT("user_id")
    public long userId;

    public WeeklyRankRewardMessage() {
        this.type = C001A.WEEKLY_RANK_REWARD_MESSAGE;
    }
}
