package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("multi_guest_applied_guest_count_fix")
public final class MultiGuestAppliedGuestCountFixSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestAppliedGuestCountFixSetting INSTANCE = new MultiGuestAppliedGuestCountFixSetting();

    public final boolean needUpdate() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_applied_guest_count_fix", DEFAULT);
    }
}
