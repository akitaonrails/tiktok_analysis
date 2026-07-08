package com.ss.android.ugc.aweme.compliance.sandbox.api.webview;

import X.C09CT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class WebViewHookSettingsBean {

    @C09CT("disable_redirect_background")
    public final boolean disable_redirect_background;

    @C09CT("enabled")
    public final boolean enable;

    @C09CT("fix_performance_timing_data")
    public final boolean enableFixPerfTimingData;

    @C09CT("enable_ttnet_native")
    public final boolean enableTTWebLoad;

    @C09CT("enable_disable_ttnet_hook_js")
    public final boolean enable_disable_ttnet_hook_js;

    @C09CT("http_cache")
    public final boolean enable_http_cache;

    @C09CT("fix_uri_get_host")
    public final boolean fixUriGetHost;

    @C09CT("fix_url_includes")
    public final List<String> fixUrlIncludes;

    @C09CT("policy")
    public final int policy;

    @C09CT("redirect_reload")
    public final boolean redirect_reload;

    @C09CT("url")
    public final UrlRules url;

    public WebViewHookSettingsBean() {
        this(false, false, 0, false, null, false, false, false, false, null, false, 2047, null);
    }

    public WebViewHookSettingsBean(boolean z, boolean z2, int i, boolean z3, UrlRules urlRules, boolean z4, boolean z5, boolean z6, boolean z7, List<String> list, boolean z8) {
        this.enable = z;
        this.enableTTWebLoad = z2;
        this.policy = i;
        this.enableFixPerfTimingData = z3;
        this.url = urlRules;
        this.enable_http_cache = z4;
        this.redirect_reload = z5;
        this.disable_redirect_background = z6;
        this.enable_disable_ttnet_hook_js = z7;
        this.fixUrlIncludes = list;
        this.fixUriGetHost = z8;
    }

    public WebViewHookSettingsBean(boolean z, boolean z2, int i, boolean z3, UrlRules urlRules, boolean z4, boolean z5, boolean z6, boolean z7, List list, boolean z8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? true : z3, (i2 & 16) != 0 ? new UrlRules(null, null, false, null, 15, null) : urlRules, (i2 & 32) != 0 ? false : z4, (i2 & 64) != 0 ? true : z5, (i2 & 128) == 0 ? z6 : true, (i2 & 256) != 0 ? false : z7, (i2 & 512) != 0 ? Collections.singletonList("*") : list, (i2 & 1024) == 0 ? z8 : false);
    }
}
