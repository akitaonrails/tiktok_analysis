package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CreateOrderLimitData {

    @C09CT("delay_time")
    public final Long delayTime;

    @C09CT("enable_auto_retry")
    public final Boolean enableAutoRetry;

    @C09CT("error_code")
    public final List<String> errorCodeList;

    @C09CT("http_code")
    public final List<String> httpCodeList;

    @C09CT("max_retry_count")
    public final Integer maxRetryCount;

    public CreateOrderLimitData(Boolean bool, Long l, Integer num, List<String> list, List<String> list2) {
        this.enableAutoRetry = bool;
        this.delayTime = l;
        this.maxRetryCount = num;
        this.errorCodeList = list;
        this.httpCodeList = list2;
    }
}
