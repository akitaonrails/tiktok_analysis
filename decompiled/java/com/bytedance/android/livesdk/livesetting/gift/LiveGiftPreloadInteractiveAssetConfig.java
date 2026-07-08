package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftPreloadInteractiveAssetConfig {
    public static final TypeAdapter ADAPTER = new LiveGiftPreloadInteractiveAssetConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("live_gift_predownload_interactive_gift_phase2_enabled")
    public boolean isEnable;

    @C09CT("live_gift_predownload_interactive_gift_count")
    public int preloadCount;

    public LiveGiftPreloadInteractiveAssetConfig() {
        this(true, 10);
    }

    public LiveGiftPreloadInteractiveAssetConfig(boolean z, int i) {
        this.isEnable = z;
        this.preloadCount = i;
    }
}
