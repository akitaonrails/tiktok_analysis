package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("bug_fix_guest_showdown_animation_container_setting")
public final class BugFixGuestShowdownAnimationContainerSetting {
    public static final int DEFAULT = 1;
    public static final BugFixGuestShowdownAnimationContainerSetting INSTANCE = new BugFixGuestShowdownAnimationContainerSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("bug_fix_guest_showdown_animation_container_setting", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
