package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_sub_resource_memory_cache_setting")
public final class LiveSubResourceMemoryCacheSettingSetting {
    public static final LiveSubResourceMemoryCacheSettingSetting INSTANCE = new LiveSubResourceMemoryCacheSettingSetting();
    public static final String[] DEFAULT = new String[0];

    private final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_sub_resource_memory_cache_setting", DEFAULT);
    }

    public final boolean enable() {
        return !(getValue().length == 0);
    }

    public final boolean inAllowList(String str) {
        return C13LQ.LJIILLIIL(str, getValue());
    }
}
