package com.ss.android.ugc.aweme.search.pages.result.livesearch.core.ui;

import X.C09CT;
import X.C2097608Jq;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("duration")
    public final long duration;

    public final Map<String, Long> toMap() {
        return C2097608Jq.LJIIJ(new Pair("duration", Long.valueOf(this.duration)));
    }

    public RequestInfo() {
        this(0L);
    }

    public RequestInfo(long j) {
        this.duration = j;
    }
}
