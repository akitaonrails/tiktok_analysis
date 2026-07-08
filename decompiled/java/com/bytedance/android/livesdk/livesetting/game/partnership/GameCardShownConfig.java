package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class GameCardShownConfig {
    public static final TypeAdapter ADAPTER = new GameCardShownConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("delay_time")
    public long delayTime;

    @C09CT("enable")
    public boolean enable;

    public GameCardShownConfig() {
        this(false, 0L);
    }

    public GameCardShownConfig(boolean z, long j) {
        this.enable = z;
        this.delayTime = j;
    }
}
