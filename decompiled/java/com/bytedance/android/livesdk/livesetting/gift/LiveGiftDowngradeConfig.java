package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftDowngradeConfig {
    public static final TypeAdapter ADAPTER = new LiveGiftDowngradeConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("fps")
    public DowngradeDimensionConfig fpsConfig;

    @C09CT("memory")
    public DowngradeDimensionConfig memoryConfig;

    @C09CT("overload_score")
    public DowngradeDimensionConfig overloadScoreConfig;

    public LiveGiftDowngradeConfig() {
        this(null, null, null);
    }

    public LiveGiftDowngradeConfig(DowngradeDimensionConfig downgradeDimensionConfig, DowngradeDimensionConfig downgradeDimensionConfig2, DowngradeDimensionConfig downgradeDimensionConfig3) {
        this.fpsConfig = downgradeDimensionConfig;
        this.memoryConfig = downgradeDimensionConfig2;
        this.overloadScoreConfig = downgradeDimensionConfig3;
    }
}
