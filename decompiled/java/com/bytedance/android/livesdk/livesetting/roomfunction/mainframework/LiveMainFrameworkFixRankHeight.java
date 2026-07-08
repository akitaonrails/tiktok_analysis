package com.bytedance.android.livesdk.livesetting.roomfunction.mainframework;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("main_framework_fix_rank_height")
public final class LiveMainFrameworkFixRankHeight {
    public static final LiveMainFrameworkFixRankHeight INSTANCE = new LiveMainFrameworkFixRankHeight();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("main_framework_fix_rank_height", true);

    public final boolean enable() {
        return value;
    }
}
