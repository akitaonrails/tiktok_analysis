package com.bytedance.android.livesdk.gift.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class FreqLimitGiftOption {

    @C09CT("close_gift_panel")
    public boolean closeGiftPanel;

    @C09CT("work_single_anchor")
    public boolean workSingleAnchor;

    @C09CT("gift_id")
    public long giftId = 1;

    @C09CT("refresh_timestamp")
    public long refreshTimeStamp = 2;

    @C09CT("frequency_limit")
    public int frequencyLimit = 5;
}
