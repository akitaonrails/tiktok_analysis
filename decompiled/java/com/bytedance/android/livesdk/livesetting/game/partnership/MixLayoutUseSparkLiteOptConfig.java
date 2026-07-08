package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class MixLayoutUseSparkLiteOptConfig {
    public static final TypeAdapter ADAPTER = new MixLayoutUseSparkLiteOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enableSparkLite")
    public boolean enableSparkLite;

    @C09CT("preloadAndDecodeResource")
    public boolean preloadAndDecodeResource;

    @C09CT("useCachedScreenParameter")
    public boolean useCachedScreenParameter;
}
