package com.bytedance.android.livesdk.livesetting.other.subscribe;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_subscribe_poll_view_action_next")
public final class LiveSubscribePollViewActionNextSettings {
    public static final boolean DEFAULT = true;
    public static final LiveSubscribePollViewActionNextSettings INSTANCE = new LiveSubscribePollViewActionNextSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_subscribe_poll_view_action_next", DEFAULT);
    }
}
