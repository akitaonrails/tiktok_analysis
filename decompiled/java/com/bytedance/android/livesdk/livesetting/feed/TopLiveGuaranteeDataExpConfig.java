package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class TopLiveGuaranteeDataExpConfig {
    public static final TypeAdapter ADAPTER = new TopLiveGuaranteeDataExpConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("toplive_guarantee_data_list")
    public Map<String, Integer> dataSourceList;

    @C09CT("enable")
    public boolean enable;

    @C09CT("immediately_follow_data_fresh_time")
    public int followFreshTime;

    @C09CT("max_wait_time")
    public int maxWaitTime;

    public TopLiveGuaranteeDataExpConfig() {
        this(false, -1, C2097608Jq.LJ(), -1);
    }

    public TopLiveGuaranteeDataExpConfig(boolean z, int i, Map<String, Integer> map, int i2) {
        this.enable = z;
        this.maxWaitTime = i;
        this.dataSourceList = map;
        this.followFreshTime = i2;
    }
}
