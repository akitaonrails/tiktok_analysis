package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_match_enigma_short_touch_schema")
public final class LiveMatchEnigmaShortTouchSchemaSetting {
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=enigma-match-short-touch";
    public static final LiveMatchEnigmaShortTouchSchemaSetting INSTANCE = new LiveMatchEnigmaShortTouchSchemaSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_match_enigma_short_touch_schema", DEFAULT);
    }
}
