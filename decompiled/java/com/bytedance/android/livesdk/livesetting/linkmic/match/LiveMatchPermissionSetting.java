package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_permission_settings")
public final class LiveMatchPermissionSetting {
    public static final LiveMatchPermissionSetting INSTANCE = new LiveMatchPermissionSetting();
    public static final DisabledMatchTypesParams DEFAULT = new DisabledMatchTypesParams(null, 1, null);

    public final DisabledMatchTypesParams getValue() {
        return (DisabledMatchTypesParams) SettingsManager.INSTANCE.getValueSafely("live_match_permission_settings", DEFAULT);
    }

    public final DisabledMatchTypesParams getDEFAULT() {
        return DEFAULT;
    }
}
