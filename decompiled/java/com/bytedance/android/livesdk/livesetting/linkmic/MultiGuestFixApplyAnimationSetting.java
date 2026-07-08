package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_fix_apply_animation_setting")
public final class MultiGuestFixApplyAnimationSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestFixApplyAnimationSetting INSTANCE = new MultiGuestFixApplyAnimationSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_fix_apply_animation_setting", DEFAULT);
    }
}
