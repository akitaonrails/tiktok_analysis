package com.bytedance.android.starship.strategy;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class DecisionUpdateConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("live_request_params")
    public final Map<String, Object> liveRequestParams;

    @C09CT("live_update_interval")
    public final int liveUpdateInterval;

    @C09CT("live_update_max_count")
    public final int liveUpdateMaxCount;

    @C09CT("vod_request_params")
    public final Map<String, Object> vodRequestParams;

    @C09CT("vod_update_interval")
    public final int vodUpdateInterval;

    @C09CT("vod_update_max_count")
    public final int vodUpdateMaxCount;

    public DecisionUpdateConfig() {
        this(false, 0, 0, 2, 8, null, null);
    }

    public DecisionUpdateConfig(boolean z, int i, int i2, int i3, int i4, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        this.enable = z;
        this.vodUpdateInterval = i;
        this.liveUpdateInterval = i2;
        this.vodUpdateMaxCount = i3;
        this.liveUpdateMaxCount = i4;
        this.liveRequestParams = map;
        this.vodRequestParams = map2;
    }
}
