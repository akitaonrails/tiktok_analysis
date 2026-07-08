package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class MiniPollOrderConfig {

    @C09CT("cancel_poll_interval_time")
    public final long cancelPollIntervalTime;

    @C09CT("cancel_poll_total_time")
    public final long cancelPollTotalTime;

    @C09CT("pay_poll_interval_time")
    public final long payPollIntervalTime;

    @C09CT("poll_num_interval_list")
    public final List<Long> pollNumIntervalList;

    @C09CT("poll_time_interval_list")
    public final List<Long> pollTimeIntervalList;

    public MiniPollOrderConfig() {
        this(2000L, 1000L, 1000L, C1697810uHb.LJIIJJI(1000L, 2000L, 3000L, 10000L), C1697810uHb.LJIIJJI(5L, 10L, 20L, 1000L));
    }

    public MiniPollOrderConfig(long j, long j2, long j3, List<Long> list, List<Long> list2) {
        this.cancelPollTotalTime = j;
        this.cancelPollIntervalTime = j2;
        this.payPollIntervalTime = j3;
        this.pollTimeIntervalList = list;
        this.pollNumIntervalList = list2;
    }
}
