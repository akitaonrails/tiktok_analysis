package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlive_game_guide_to_ls_scheme")
public final class LiveStudioGuideLynxUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveStudioGuideLynxUrlSetting INSTANCE = new LiveStudioGuideLynxUrlSetting();

    public final String getLynxUrl() {
        return SettingsManager.INSTANCE.getStringValue("ttlive_game_guide_to_ls_scheme", DEFAULT);
    }
}
