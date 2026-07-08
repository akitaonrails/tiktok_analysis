package com.ss.android.ugc.aweme.pipo.hybrid.prefetch;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PipoPrefetchRule {

    @C09CT("prefetch_api_names")
    public final List<String> prefetchApiNames;

    public PipoPrefetchRule() {
        this(null);
    }

    public PipoPrefetchRule(List<String> list) {
        this.prefetchApiNames = list;
    }
}
