package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_custom_poll_short_touch_url")
public final class PollShortTouchUrl {
    public static final String DEFAULT = "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_poll%2Fpoll%2Fpages%2Fcustom-poll%2Fshort-touch%2Ftemplate.js";
    public static final PollShortTouchUrl INSTANCE = new PollShortTouchUrl();

    public final String getUrl() {
        return SettingsManager.INSTANCE.getStringValue("live_custom_poll_short_touch_url", DEFAULT);
    }
}
