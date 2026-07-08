package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PollOrderRetryConfig {

    @C09CT("order_status_retry_delay_time")
    public final List<Integer> retryMaxDelayTimes;

    public PollOrderRetryConfig(List<Integer> list) {
        this.retryMaxDelayTimes = list;
    }
}
