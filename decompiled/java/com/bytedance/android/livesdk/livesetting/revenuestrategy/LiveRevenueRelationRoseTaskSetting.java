package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_revenue_relation_rose_task")
public final class LiveRevenueRelationRoseTaskSetting {
    public static final LiveRevenueRelationRoseTaskSetting INSTANCE = new LiveRevenueRelationRoseTaskSetting();
    public static final RelationRoseTaskConfig DEFAULT = new RelationRoseTaskConfig(false, 180L, 30L);

    private final RelationRoseTaskConfig getSettingsValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        RelationRoseTaskConfig relationRoseTaskConfig = DEFAULT;
        RelationRoseTaskConfig relationRoseTaskConfig2 = (RelationRoseTaskConfig) settingsManager.getValueSafely("live_revenue_relation_rose_task", relationRoseTaskConfig);
        return relationRoseTaskConfig2 != null ? relationRoseTaskConfig2 : relationRoseTaskConfig;
    }

    public final Long completedCheckPeriod() {
        return getSettingsValue().completedCheckPeriod;
    }

    public final Long enableCheckDuration() {
        return getSettingsValue().enableCheckDuration;
    }

    public final boolean isEnable() {
        return getSettingsValue().enable;
    }
}
