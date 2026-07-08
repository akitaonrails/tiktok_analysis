package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("anchor_lynx_cpu_boost")
public final class LiveAnchorLynxCpuBoostABSetting {
    public static final LiveAnchorLynxCpuBoostABSetting INSTANCE = new LiveAnchorLynxCpuBoostABSetting();
    public static final SparkCpuBoostMatchParam[] DEFAULT = new SparkCpuBoostMatchParam[0];

    public final SparkCpuBoostMatchParam[] getValue() {
        return (SparkCpuBoostMatchParam[]) SettingsManager.INSTANCE.getValueSafely("anchor_lynx_cpu_boost", DEFAULT);
    }

    public final boolean enable() {
        SparkCpuBoostMatchParam[] value = getValue();
        if (value != null) {
            return !(value.length == 0);
        }
        return false;
    }
}
