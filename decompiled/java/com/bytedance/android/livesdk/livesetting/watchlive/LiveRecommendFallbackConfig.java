package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRecommendFallbackConfig {
    public static final TypeAdapter ADAPTER = new LiveRecommendFallbackConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("channel_id")
    public String channelId;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enter_from_merge")
    public String enterFromMerge;

    @C09CT("enter_method")
    public String enterMethod;

    @C09CT("req_from")
    public String reqFrom;

    public LiveRecommendFallbackConfig() {
        this(false, "tiktok_common_backup", "76", "loadmore_recommend", "live_cell");
    }

    public LiveRecommendFallbackConfig(boolean z, String str, String str2, String str3, String str4) {
        this.enable = z;
        this.reqFrom = str;
        this.channelId = str2;
        this.enterFromMerge = str3;
        this.enterMethod = str4;
    }
}
