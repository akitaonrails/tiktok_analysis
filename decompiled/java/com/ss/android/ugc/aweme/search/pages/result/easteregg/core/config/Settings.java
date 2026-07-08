package com.ss.android.ugc.aweme.search.pages.result.easteregg.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class Settings {

    @C09CT("enabled")
    public final Integer enabled;

    @C09CT("lynx_channel")
    public final String lynxTemplateChannel;

    @C09CT("preload_interval_ms")
    public final Long preloadIntervalMillis;

    @C09CT("resource_channel")
    public final String resourceChannel;

    public Settings() {
        this(null, null, null, null);
    }

    public Settings(Integer num, Long l, String str, String str2) {
        this.enabled = num;
        this.preloadIntervalMillis = l;
        this.resourceChannel = str;
        this.lynxTemplateChannel = str2;
    }
}
