package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_gift_class_rank_star_config")
public final class ClassRankStarImageConfigSettings {
    public static final ClassRankStarImageConfigSettings INSTANCE = new ClassRankStarImageConfigSettings();
    public static final ClassRankStarResConfig DEFAULT = new ClassRankStarResConfig("", Boolean.FALSE, new ArrayList());

    public final ClassRankStarResConfig getClassRankStarImageConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ClassRankStarResConfig classRankStarResConfig = DEFAULT;
        ClassRankStarResConfig classRankStarResConfig2 = (ClassRankStarResConfig) settingsManager.getValueSafely("live_gift_class_rank_star_config", classRankStarResConfig);
        return classRankStarResConfig2 != null ? classRankStarResConfig2 : classRankStarResConfig;
    }

    public final ClassRankStarResConfig getDEFAULT() {
        return DEFAULT;
    }
}
