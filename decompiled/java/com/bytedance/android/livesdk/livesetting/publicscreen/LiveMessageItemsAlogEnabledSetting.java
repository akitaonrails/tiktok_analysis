package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_message_items_alog_enabled")
public final class LiveMessageItemsAlogEnabledSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMessageItemsAlogEnabledSetting INSTANCE = new LiveMessageItemsAlogEnabledSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_message_items_alog_enabled", DEFAULT);
    }
}
