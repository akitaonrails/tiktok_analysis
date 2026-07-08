package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("is_cohost_old_group_channel_id_fix_enable")
public final class LiveCohostOldGroupChannelIdFixEnableSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCohostOldGroupChannelIdFixEnableSetting INSTANCE = new LiveCohostOldGroupChannelIdFixEnableSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("is_cohost_old_group_channel_id_fix_enable", DEFAULT);
    }
}
