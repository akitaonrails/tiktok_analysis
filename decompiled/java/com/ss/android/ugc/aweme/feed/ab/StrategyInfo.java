package com.ss.android.ugc.aweme.feed.ab;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class StrategyInfo {

    @C09CT("config")
    public final Map<String, String> config;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("name")
    public final String name;

    public StrategyInfo() {
        this("unknown", false, C2097608Jq.LJ());
    }

    public StrategyInfo(String str, boolean z, Map<String, String> map) {
        this.name = str;
        this.enable = z;
        this.config = map;
    }
}
