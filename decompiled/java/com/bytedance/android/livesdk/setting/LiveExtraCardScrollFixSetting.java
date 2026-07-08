package com.bytedance.android.livesdk.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_extra_card_scroll_fix")
public final class LiveExtraCardScrollFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveExtraCardScrollFixSetting INSTANCE = new LiveExtraCardScrollFixSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_extra_card_scroll_fix", DEFAULT);
    }
}
