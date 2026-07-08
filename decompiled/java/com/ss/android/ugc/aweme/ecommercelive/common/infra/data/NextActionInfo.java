package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class NextActionInfo {

    @C09CT("current_item_show_time_ms")
    public final Long currentShowTimeMs;

    @C09CT("trace_data")
    public final String traceData;

    public NextActionInfo() {
        this(0L, null);
    }

    public NextActionInfo(Long l, String str) {
        this.currentShowTimeMs = l;
        this.traceData = str;
    }
}
