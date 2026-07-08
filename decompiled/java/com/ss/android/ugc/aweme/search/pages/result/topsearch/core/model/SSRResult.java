package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SSRResult implements Serializable {
    public static final int $stable = 8;

    @C09CT("disable_hydrate")
    public final Number disableHydrate;

    @C09CT("originalSource")
    public final String originalSource;

    @C09CT("ssrSource")
    public final String ssrSource;

    public SSRResult() {
        this(null, null, null);
    }

    public SSRResult(String str, String str2, Number number) {
        this.originalSource = str;
        this.ssrSource = str2;
        this.disableHydrate = number;
    }
}
