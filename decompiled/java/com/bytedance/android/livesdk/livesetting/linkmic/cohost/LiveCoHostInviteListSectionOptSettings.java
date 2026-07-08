package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_cohost_invite_list_section_opt")
public final class LiveCoHostInviteListSectionOptSettings {
    public static final int DEFAULT = 0;
    public static final LiveCoHostInviteListSectionOptSettings INSTANCE = new LiveCoHostInviteListSectionOptSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_cohost_invite_list_section_opt", DEFAULT) > 0;
    }
}
