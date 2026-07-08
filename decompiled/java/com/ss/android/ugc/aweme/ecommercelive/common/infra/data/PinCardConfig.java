package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class PinCardConfig {

    @C09CT("activity_finish_display_duration_ms")
    public final long displayDurationAfterActivityFinish;

    @C09CT("display_duration_ms")
    public final long displayDurationMs;

    @C09CT("real_card_type")
    public final int realCardType;

    @C09CT("real_pop_card_id")
    public final long realPopCardId;

    public PinCardConfig() {
        this(0L, 0L, 0, 0L);
    }

    public PinCardConfig(long j, long j2, int i, long j3) {
        this.displayDurationMs = j;
        this.displayDurationAfterActivityFinish = j2;
        this.realCardType = i;
        this.realPopCardId = j3;
    }
}
