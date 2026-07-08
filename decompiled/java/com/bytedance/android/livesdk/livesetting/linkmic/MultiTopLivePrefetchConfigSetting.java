package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "multi_top_live_prefetch_config")
public final class MultiTopLivePrefetchConfigSetting {
    public static final MultiTopLivePrefetchConfigSetting INSTANCE = new MultiTopLivePrefetchConfigSetting();
    public static final MultiTopLivePrefetchConfig DEFAULT = new MultiTopLivePrefetchConfig(false, 1);

    public static final MultiTopLivePrefetchConfig getConfig() {
        MultiTopLivePrefetchConfig multiTopLivePrefetchConfig = (MultiTopLivePrefetchConfig) SettingsManager.INSTANCE.getValueSafely(MultiTopLivePrefetchConfigSetting.class);
        return multiTopLivePrefetchConfig == null ? DEFAULT : multiTopLivePrefetchConfig;
    }
}
