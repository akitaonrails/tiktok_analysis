package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_fans_club_register_for_preview_living")
public final class LiveFansClubPreviewRegisterSetting {
    public static final boolean DEFAULT = true;
    public static final LiveFansClubPreviewRegisterSetting INSTANCE = new LiveFansClubPreviewRegisterSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_fans_club_register_for_preview_living", DEFAULT);
    }
}
