package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_share_channel_list_i18n")
public final class LiveShareChannelListI18nSetting {
    public static final LiveShareChannelListI18nSetting INSTANCE = new LiveShareChannelListI18nSetting();
    public static final String[] DEFAULT = {"facebook", "twitter"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_share_channel_list_i18n", DEFAULT);
    }
}
