package com.ss.android.ugc.aweme.ecommerce.search.bubble.aftersearch;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchQuery implements Serializable {
    public static final int $stable = 0;

    @C09CT("has_request")
    public final boolean hasRequest;

    @C09CT("last_request_time")
    public final long lastRequestTime;

    @C09CT("query")
    public final String query;

    @C09CT("timestamp")
    public final long timestamp;

    public final EcSearchQuery copy(String str, long j, boolean z, long j2) {
        return new EcSearchQuery(str, j, z, j2);
    }

    public EcSearchQuery() {
        this("", 0L, false, 0L);
    }

    public EcSearchQuery(String str, long j, boolean z, long j2) {
        this.query = str;
        this.timestamp = j;
        this.hasRequest = z;
        this.lastRequestTime = j2;
    }
}
