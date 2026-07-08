package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_item_old_ui_downgrade_enable")
public final class LiveMatchItemOldUIDowngradeEnable {
    public static final int DEFAULT = 0;
    public static final LiveMatchItemOldUIDowngradeEnable INSTANCE = new LiveMatchItemOldUIDowngradeEnable();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_match_item_old_ui_downgrade_enable", DEFAULT) == 1;
    }
}
