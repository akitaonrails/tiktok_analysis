package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_replay_faq")
public final class LiveReplayFaqSetting {
    public static final String DEFAULT = "sslocal://webcast_lynxview?hide_nav_bar=1&use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_live_replay%2Fpages%2Freplay-faq%2Ftemplate.js&bdhm_bid=tiktok_live_fundamental_replay&bdhm_pid=replay_faq&enter_from_page=launch_live";
    public static final LiveReplayFaqSetting INSTANCE = new LiveReplayFaqSetting();

    public final String getValue() {
        String stringValue = SettingsManager.INSTANCE.getStringValue("live_replay_faq", DEFAULT);
        return a0.LJJJIL(stringValue) ? "sslocal://webcast_lynxview?hide_nav_bar=1&use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_live_replay%2Fpages%2Freplay-faq%2Ftemplate.js&bdhm_bid=tiktok_live_fundamental_replay&bdhm_pid=replay_faq&enter_from_page=launch_live" : stringValue;
    }
}
