package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("enable_two_match_link_retry")
public final class LiveTwoMatchLinkOptAbTest {
    public static final boolean DEFAULT = false;
    public static final LiveTwoMatchLinkOptAbTest INSTANCE = new LiveTwoMatchLinkOptAbTest();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_two_match_link_retry", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
