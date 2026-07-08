package com.ss.android.ugc.aweme.account.login.config;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class ThirdPartyConfig {

    @C09CT("default_platforms")
    public final String defaultPlatforms;

    @C09CT("regions_to_platforms")
    public final Map<String, String> regionsToPlatforms;

    public ThirdPartyConfig() {
        this("", C2097608Jq.LJ());
    }

    public ThirdPartyConfig(String str, Map<String, String> map) {
        this.defaultPlatforms = str;
        this.regionsToPlatforms = map;
    }
}
