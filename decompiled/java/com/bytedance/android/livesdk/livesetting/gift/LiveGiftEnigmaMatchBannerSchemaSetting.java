package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("gift_panel_enigma_match_banner_schema")
public final class LiveGiftEnigmaMatchBannerSchemaSetting {
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=enigma-match-gift-panel-banner";
    public static final LiveGiftEnigmaMatchBannerSchemaSetting INSTANCE = new LiveGiftEnigmaMatchBannerSchemaSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("gift_panel_enigma_match_banner_schema", DEFAULT);
    }
}
