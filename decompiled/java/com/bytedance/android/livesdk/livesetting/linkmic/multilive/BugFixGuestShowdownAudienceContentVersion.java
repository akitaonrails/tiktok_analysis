package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("guest_showdown_audience_content_version")
public final class BugFixGuestShowdownAudienceContentVersion {
    public static final int DEFAULT = 1;
    public static final BugFixGuestShowdownAudienceContentVersion INSTANCE = new BugFixGuestShowdownAudienceContentVersion();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("guest_showdown_audience_content_version", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
