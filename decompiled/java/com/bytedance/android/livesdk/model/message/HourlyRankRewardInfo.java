package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.BorderInfo;

/* JADX INFO: loaded from: classes.dex */
public class HourlyRankRewardInfo {

    @C09CT("asset_id")
    public long assetId;

    @C09CT("avatar_border")
    public BorderInfo borderInfo;

    @C09CT("notify")
    public RoomNotifyMessage notifyMessage;

    @C09CT("user_id")
    public long userId;
}
