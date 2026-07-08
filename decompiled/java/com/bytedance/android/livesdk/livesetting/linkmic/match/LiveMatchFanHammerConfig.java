package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveMatchFanHammerConfig {
    public static final TypeAdapter ADAPTER = new LiveMatchFanHammerConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("container_ready_timeout_sec")
    public long containerReadyTimeoutInSecond;

    @C09CT("enable")
    public boolean enable;

    @C09CT("lynx_schema")
    public String lynxSchema;

    @C09CT("upgrade_guide_schema")
    public String upgradeGuideSchema;

    public LiveMatchFanHammerConfig() {
        this(false, "aweme://roma_redirect/?spark_page=live_match_fans_hammer_effect", "aweme://roma_redirect/?spark_page=live_match_items_upgrade", 3L);
    }

    public LiveMatchFanHammerConfig(boolean z, String str, String str2, long j) {
        this.enable = z;
        this.lynxSchema = str;
        this.upgradeGuideSchema = str2;
        this.containerReadyTimeoutInSecond = j;
    }
}
