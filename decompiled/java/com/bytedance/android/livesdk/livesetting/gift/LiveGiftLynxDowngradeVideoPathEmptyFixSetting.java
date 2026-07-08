package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_gift_lynx_downgrade_video_path_empty_fix")
public final class LiveGiftLynxDowngradeVideoPathEmptyFixSetting {
    public static final LiveGiftLynxDowngradeVideoPathEmptyFixSetting INSTANCE = new LiveGiftLynxDowngradeVideoPathEmptyFixSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_gift_lynx_downgrade_video_path_empty_fix", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
