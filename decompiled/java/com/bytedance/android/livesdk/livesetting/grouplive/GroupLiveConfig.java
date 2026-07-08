package com.bytedance.android.livesdk.livesetting.grouplive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("ttlive_group_live_config")
public final class GroupLiveConfig {
    public static final GroupLiveConfig INSTANCE = new GroupLiveConfig();
    public static final GroupLiveConfigModel DEFAULT = new GroupLiveConfigModel(new TimedCompetitionConfigModel(10, 2, 5, 2), new RankingPanelConfigModel(3, -1));

    public final GroupLiveConfigModel getGetValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GroupLiveConfigModel groupLiveConfigModel = DEFAULT;
        GroupLiveConfigModel groupLiveConfigModel2 = (GroupLiveConfigModel) settingsManager.getValueSafely("ttlive_group_live_config", groupLiveConfigModel);
        return groupLiveConfigModel2 != null ? groupLiveConfigModel2 : groupLiveConfigModel;
    }
}
