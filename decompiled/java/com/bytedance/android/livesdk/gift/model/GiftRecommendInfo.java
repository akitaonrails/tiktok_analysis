package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class GiftRecommendInfo {

    @C09CT("recommend_reason")
    public long recommendReason;

    @C09CT("should_call_realtime_after_sent")
    public boolean shouldCallRealtimeAfterSent;

    @C09CT("starling_key")
    public String starlingKey = "";

    @C09CT("text")
    public Text text;
}
