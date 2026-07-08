package com.bytedance.android.livesdk.goal.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class StreamGoalRecExtra {

    @C09CT("fixed_gift_rec_quantity")
    public Map<Long, FixedSubGoalGiftRecQuantity> fixedGiftRecQuantity;

    @C09CT("lead_text")
    public String leadText = "";

    @C09CT("reasonable_rec")
    public ReasonableGoalRec reasonableRec;
}
