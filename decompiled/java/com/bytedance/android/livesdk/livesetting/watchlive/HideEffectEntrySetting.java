package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_hide_effect_entry")
public final class HideEffectEntrySetting {
    public static final boolean DEFAULT = false;
    public static final HideEffectEntrySetting INSTANCE = new HideEffectEntrySetting();

    public final boolean shouldHide() {
        return SettingsManager.INSTANCE.getBooleanValue("live_hide_effect_entry", DEFAULT);
    }
}
