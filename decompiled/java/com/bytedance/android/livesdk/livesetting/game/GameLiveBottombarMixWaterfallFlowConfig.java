package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class GameLiveBottombarMixWaterfallFlowConfig {
    public static final TypeAdapter ADAPTER = new GameLiveBottombarMixWaterfallFlowConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("auto_play")
    public boolean autoPlay;

    @C09CT("refresh_interval")
    public int refreshInterval;

    public GameLiveBottombarMixWaterfallFlowConfig() {
        this(180, true);
    }

    public GameLiveBottombarMixWaterfallFlowConfig(int i, boolean z) {
        this.refreshInterval = i;
        this.autoPlay = z;
    }
}
