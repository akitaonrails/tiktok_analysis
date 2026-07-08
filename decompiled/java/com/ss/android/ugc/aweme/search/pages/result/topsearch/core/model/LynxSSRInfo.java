package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxSSRInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("extra")
    public final String extra;

    @C09CT("ssr_result")
    public final SSRResult ssrResult;

    public LynxSSRInfo() {
        this(null, null);
    }

    public LynxSSRInfo(SSRResult sSRResult, String str) {
        this.ssrResult = sSRResult;
        this.extra = str;
    }
}
