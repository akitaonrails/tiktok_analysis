package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "short_touch_subscription_emote_poll_url")
public final class EmotePollShortTouchUrl {
    public static final String DEFAULT = "sslocal://webcast_lynxview_card?bdhm_bid=tiktok_live_fundamental_sub_indicators&bdhm_pid=short_touch_emote_poll&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_sub_indicators%2Fpages%2Fshort-touch-emote-poll%2Ftemplate.js";
    public static final EmotePollShortTouchUrl INSTANCE = new EmotePollShortTouchUrl();

    public final String getUrl() {
        return SettingsManager.INSTANCE.getStringValue("short_touch_subscription_emote_poll_url", DEFAULT);
    }
}
