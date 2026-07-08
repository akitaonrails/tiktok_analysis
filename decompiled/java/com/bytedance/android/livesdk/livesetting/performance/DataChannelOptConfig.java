package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class DataChannelOptConfig {
    public static final TypeAdapter ADAPTER = new DataChannelOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_audience_registry")
    public boolean enableAudienceRegistry;

    @C09CT("enable_broadcast_registry")
    public boolean enableBroadcastRegistry;

    @C09CT("enable_observe_opt")
    public boolean enableObserveOpt;

    @C09CT("enable_observe_sticky_opt")
    public boolean enableObserveStickyOpt;
}
