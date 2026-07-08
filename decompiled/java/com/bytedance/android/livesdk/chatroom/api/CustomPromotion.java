package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class CustomPromotion {

    @C09CT("discount_local_price_amount_micros")
    public long discountLocalPriceAmountMicros;

    @C09CT("discount_percentage")
    public long discountPercentage;

    @C09CT("free_trial_info")
    public FreeTrialInfo freeTrialInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("type")
    public int type;

    @C09CT("title")
    public String title = "";

    @C09CT("desc")
    public String desc = "";

    @C09CT("tip")
    public String tip = "";
}
