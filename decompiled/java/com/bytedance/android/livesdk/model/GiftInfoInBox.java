package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;

/* JADX INFO: loaded from: classes.dex */
public final class GiftInfoInBox {

    @C09CT("asset")
    public AssetsModel asset;

    @C09CT("color_id")
    public long colorId;

    @C09CT("effect_id")
    public long effectId;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("remain_times")
    public int remainTimes;

    public GiftInfoInBox() {
        this(0L, 0L, 0L, 0);
    }

    public GiftInfoInBox(long j, long j2, long j3, int i) {
        this.giftId = j;
        this.effectId = j2;
        this.colorId = j3;
        this.remainTimes = i;
    }
}
