package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class ECSurpriseSetAnimDebugInfo {

    @C09CT("is_debug")
    public final boolean isDebug;

    @C09CT("lottery_alpha_duration_last_ms")
    public final long lotteryAlphaDurationLastMs;

    @C09CT("lottery_alpha_duration_next_ms")
    public final long lotteryAlphaDurationNextMs;

    @C09CT("lottery_alpha_start_delay_ms")
    public final long lotteryAlphaStartDelayMs;

    @C09CT("lottery_total_duration_ms")
    public final long lotteryTotalDurationMs;

    @C09CT("lottery_y_duration_last_ms")
    public final long lotteryYDurationLastMs;

    @C09CT("lottery_y_duration_next_ms")
    public final long lotteryYDurationNextMs;

    @C09CT("lottery_y_start_delay_ms")
    public final long lotteryYStartDelayMs;

    public ECSurpriseSetAnimDebugInfo() {
        this(false, 167L, 167L, 167L, 167L, 0L, 0L, 180L);
    }

    public ECSurpriseSetAnimDebugInfo(boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.isDebug = z;
        this.lotteryAlphaDurationLastMs = j;
        this.lotteryYDurationLastMs = j2;
        this.lotteryAlphaDurationNextMs = j3;
        this.lotteryYDurationNextMs = j4;
        this.lotteryAlphaStartDelayMs = j5;
        this.lotteryYStartDelayMs = j6;
        this.lotteryTotalDurationMs = j7;
    }
}
