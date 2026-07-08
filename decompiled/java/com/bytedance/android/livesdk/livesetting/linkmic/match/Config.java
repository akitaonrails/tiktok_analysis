package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class Config {
    public static final TypeAdapter ADAPTER = new Config_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_match_half_rtt_limit")
    public long live_match_half_rtt_limit;

    @C09CT("live_match_start_time_anchor_opt")
    public boolean live_match_start_time_anchor_opt;

    @C09CT("live_match_start_time_opt")
    public boolean live_match_start_time_opt;

    public Config() {
        this(false, false, 2000L);
    }

    public Config(boolean z, boolean z2, long j) {
        this.live_match_start_time_opt = z;
        this.live_match_start_time_anchor_opt = z2;
        this.live_match_half_rtt_limit = j;
    }
}
