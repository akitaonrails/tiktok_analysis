package com.bytedance.android.livesdk.livesetting.privilege;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_announcement_force_using_arrow_icon")
public final class LiveAnnouncementForceUsingArrowIcon {
    public static final boolean DEFAULT = false;
    public static final LiveAnnouncementForceUsingArrowIcon INSTANCE = new LiveAnnouncementForceUsingArrowIcon();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_announcement_force_using_arrow_icon", DEFAULT);
    }
}
