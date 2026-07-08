package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveNetworkControlConfig {
    public static final TypeAdapter ADAPTER = new LiveNetworkControlConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("apiThrottleLimitedDomainList")
    public String apiThrottleLimitedDomainList;

    @C09CT("blackList")
    public String blackList;

    @C09CT("delayReleaseTimeMs")
    public Long delayReleaseTimeMs;

    @C09CT("dropList")
    public String dropList;

    @C09CT("enable")
    public boolean enabled;

    @C09CT("highPriorityApis")
    public String highPriorityApis;

    @C09CT("lowPriorityApis")
    public String lowPriorityApis;

    @C09CT("throttleConfigByPath")
    public String throttleConfigByPath;

    public LiveNetworkControlConfig() {
        this(false, null, null, null, null, null, null, 0L);
    }

    public LiveNetworkControlConfig(boolean z, String str, String str2, String str3, String str4, String str5, String str6, Long l) {
        this.enabled = z;
        this.dropList = str;
        this.blackList = str2;
        this.lowPriorityApis = str3;
        this.highPriorityApis = str4;
        this.throttleConfigByPath = str5;
        this.apiThrottleLimitedDomainList = str6;
        this.delayReleaseTimeMs = l;
    }
}
