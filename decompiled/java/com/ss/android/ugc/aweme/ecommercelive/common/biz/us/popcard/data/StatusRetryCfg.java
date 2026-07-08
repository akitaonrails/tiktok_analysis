package com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class StatusRetryCfg {

    @C09CT("auction_status")
    public final Integer auctionStatus;

    @C09CT("max_retry_times")
    public final Long maxRetryTimes;

    @C09CT("retry_after_ms")
    public final Long retryAfterMs;

    @C09CT("retry_by_message")
    public final Boolean retryByMessage;

    public StatusRetryCfg() {
        this(null, null, null, null);
    }

    public StatusRetryCfg(Integer num, Long l, Boolean bool, Long l2) {
        this.auctionStatus = num;
        this.retryAfterMs = l;
        this.retryByMessage = bool;
        this.maxRetryTimes = l2;
    }
}
