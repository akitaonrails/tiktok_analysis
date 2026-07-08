package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = true, value = "anchor_second_page_code_cache")
public final class SecondPageCodeCacheABSetting {
    public static final int DEFAULT = 0;
    public static final SecondPageCodeCacheABSetting INSTANCE = new SecondPageCodeCacheABSetting();

    public final boolean isMatch() {
        return SettingsManager.INSTANCE.getIntValue("anchor_second_page_code_cache", DEFAULT) == 1;
    }
}
