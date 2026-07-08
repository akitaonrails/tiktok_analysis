package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("ttlive_game_auto_cover_introduce_page")
public final class LiveGameAutoCoverFAQPage {
    public static final String DEFAULT = "";
    public static final LiveGameAutoCoverFAQPage INSTANCE = new LiveGameAutoCoverFAQPage();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("ttlive_game_auto_cover_introduce_page", DEFAULT);
    }
}
