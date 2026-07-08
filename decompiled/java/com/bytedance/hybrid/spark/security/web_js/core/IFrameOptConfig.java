package com.bytedance.hybrid.spark.security.web_js.core;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class IFrameOptConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_non_html_cache")
    public final boolean enableNonHtmlCache;

    @C09CT("enable_nonce")
    public final boolean enableNonce;

    @C09CT("exts")
    public final List<String> extensions;

    @C09CT("non_html_cache_limit")
    public final int nonHtmlCacheLimit;

    @C09CT("report_error")
    public final Boolean reportError;

    public IFrameOptConfig(boolean z, boolean z2, boolean z3, int i, List<String> list, Boolean bool) {
        this.enable = z;
        this.enableNonce = z2;
        this.enableNonHtmlCache = z3;
        this.nonHtmlCacheLimit = i;
        this.extensions = list;
        this.reportError = bool;
    }
}
