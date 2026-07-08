package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("cohost_username_match_start_animation_opt")
public final class CohostWindowUserNameMatchAnimationOpt {
    public static final boolean DEFAULT = true;
    public static final CohostWindowUserNameMatchAnimationOpt INSTANCE = new CohostWindowUserNameMatchAnimationOpt();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue("cohost_username_match_start_animation_opt", DEFAULT);
    }
}
