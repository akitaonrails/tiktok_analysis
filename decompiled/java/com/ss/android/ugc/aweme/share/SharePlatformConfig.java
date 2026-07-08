package com.ss.android.ugc.aweme.share;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePlatformConfig {

    @C09CT("client_strategy")
    public final String clientStrategy;

    @C09CT("platforms")
    public final List<SharePlatform> platforms;

    @C09CT("rules_config")
    public final String rulesConfig;

    @C09CT("server_share_platforms")
    public final List<SharePlatform> serverSharePlatforms;

    public SharePlatformConfig() {
        this("", new ArrayList(), new ArrayList(), "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SharePlatformConfig(String str, List<? extends SharePlatform> list, List<? extends SharePlatform> list2, String str2) {
        this.rulesConfig = str;
        this.platforms = list;
        this.serverSharePlatforms = list2;
        this.clientStrategy = str2;
    }
}
