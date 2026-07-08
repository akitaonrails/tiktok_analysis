package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_icy_clash_educate_url")
public final class LiveMatchIcyClashEducateUrl {
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=match_icy_clash_educate";
    public static final LiveMatchIcyClashEducateUrl INSTANCE = new LiveMatchIcyClashEducateUrl();

    public final String link() {
        return SettingsManager.INSTANCE.getStringValue("live_match_icy_clash_educate_url", DEFAULT);
    }
}
