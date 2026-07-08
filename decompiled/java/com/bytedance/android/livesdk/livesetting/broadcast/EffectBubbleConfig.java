package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class EffectBubbleConfig {
    public static final TypeAdapter ADAPTER = new EffectBubbleConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("delay_s")
    public int delayDuration;

    @C09CT("display_duration_s")
    public int displayDuration;

    @C09CT("enable")
    public boolean enable;

    @C09CT("round_config")
    public List<FestRoundConfig> roundConfig;

    @C09CT("schema")
    public String schema;

    public EffectBubbleConfig() {
        this(false, 5, 900, null, "");
    }

    public EffectBubbleConfig(boolean z, int i, int i2, List<FestRoundConfig> list, String str) {
        this.enable = z;
        this.displayDuration = i;
        this.delayDuration = i2;
        this.roundConfig = list;
        this.schema = str;
    }
}
