package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlh_stage_network_opt_v2_setting")
public final class TTLHStageNetworkOptV2Setting {
    public static final TTLHStageNetworkOptV2Setting INSTANCE = new TTLHStageNetworkOptV2Setting();
    public static final TTLHStageNetworkOptV2SettingRequest DEFAULT = new TTLHStageNetworkOptV2SettingRequest(1, 30);
    public static final int GROUP_V1 = 1;
    public static final int GROUP_V2 = 2;
    public static final int GROUP_V3 = 3;

    private final TTLHStageNetworkOptV2SettingRequest getValue() {
        return (TTLHStageNetworkOptV2SettingRequest) SettingsManager.INSTANCE.getValueSafely("ttlh_stage_network_opt_v2_setting", DEFAULT);
    }

    public final int getTTNetInterval() {
        return getValue().getTtNetInterval();
    }

    public final boolean groupV2() {
        return getValue().getGroup() == GROUP_V2;
    }

    public final boolean groupV3() {
        return getValue().getGroup() == GROUP_V3;
    }
}
