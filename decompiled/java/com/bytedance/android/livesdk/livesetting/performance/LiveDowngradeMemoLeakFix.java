package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_downgrade_memo_leak_fix")
public final class LiveDowngradeMemoLeakFix {
    public static final boolean DEFAULT = false;
    public static final LiveDowngradeMemoLeakFix INSTANCE = new LiveDowngradeMemoLeakFix();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_downgrade_memo_leak_fix", DEFAULT);
    }
}
