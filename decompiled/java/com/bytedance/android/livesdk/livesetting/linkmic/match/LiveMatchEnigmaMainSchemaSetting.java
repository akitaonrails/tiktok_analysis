package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_enigma_main_schema")
public final class LiveMatchEnigmaMainSchemaSetting {
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=enigma-match-main";
    public static final LiveMatchEnigmaMainSchemaSetting INSTANCE = new LiveMatchEnigmaMainSchemaSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_match_enigma_main_schema", DEFAULT);
    }
}
