package com.bytedance.android.livesdk.broadcast.video;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "test_ttlh_split_update_params")
public final class TestTtlhSplitUpdateParamsSetting {
    public static final boolean DEFAULT = false;
    public static final TestTtlhSplitUpdateParamsSetting INSTANCE = new TestTtlhSplitUpdateParamsSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("test_ttlh_split_update_params", DEFAULT);
    }
}
