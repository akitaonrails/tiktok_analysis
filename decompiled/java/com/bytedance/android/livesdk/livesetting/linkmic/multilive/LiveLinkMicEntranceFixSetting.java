package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_entrance_load_fix")
public final class LiveLinkMicEntranceFixSetting {
    public static final boolean DEFAULT = true;
    public static final LiveLinkMicEntranceFixSetting INSTANCE = new LiveLinkMicEntranceFixSetting();

    public static final boolean fixLoad() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_entrance_load_fix", DEFAULT);
    }
}
