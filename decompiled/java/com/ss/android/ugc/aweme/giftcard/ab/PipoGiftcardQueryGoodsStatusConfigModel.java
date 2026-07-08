package com.ss.android.ugc.aweme.giftcard.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoGiftcardQueryGoodsStatusConfigModel {

    @C09CT("request_interval")
    public final int intervalSecond;

    @C09CT("request_max_time")
    public final int maxTime;

    public PipoGiftcardQueryGoodsStatusConfigModel() {
        this(1, 10);
    }

    public PipoGiftcardQueryGoodsStatusConfigModel(int i, int i2) {
        this.intervalSecond = i;
        this.maxTime = i2;
    }
}
