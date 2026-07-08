package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_battle_draw_oncemore_duration_opt")
public final class LiveBattleDrawOnceMoreDurationOptSettings {
    public static final LiveBattleDrawOnceMoreDurationOptSettings INSTANCE = new LiveBattleDrawOnceMoreDurationOptSettings();
    public static final SettingsParams DEFAULT = new SettingsParams(0, "", "");

    private final SettingsParams getSettingsValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        SettingsParams settingsParams = DEFAULT;
        SettingsParams settingsParams2 = (SettingsParams) settingsManager.getValueSafely("live_battle_draw_oncemore_duration_opt", settingsParams);
        return settingsParams2 != null ? settingsParams2 : settingsParams;
    }

    public final String durationOptBusinessName() {
        return getSettingsValue().durationOptBusinessName;
    }

    public final boolean enable() {
        return getSettingsValue().status > 0;
    }

    public final String featureCollectBusinessName() {
        return getSettingsValue().featureCollectBusinessName;
    }

    public final boolean multiMatchEnable() {
        return (getSettingsValue().status & 2) > 0;
    }

    public final boolean twoMatchEnable() {
        return (getSettingsValue().status & 1) > 0;
    }
}
