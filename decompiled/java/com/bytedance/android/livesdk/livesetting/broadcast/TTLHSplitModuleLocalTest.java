package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlh_split_module_local_test")
public final class TTLHSplitModuleLocalTest {
    public static final int DEFAULT = 0;
    public static final TTLHSplitModuleLocalTest INSTANCE = new TTLHSplitModuleLocalTest();

    public final boolean enabled() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_split_module_local_test", DEFAULT) == 1;
    }
}
