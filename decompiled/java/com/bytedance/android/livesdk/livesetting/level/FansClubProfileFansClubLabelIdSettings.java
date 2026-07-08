package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "fans_club_profile_fans_club_label_id")
public final class FansClubProfileFansClubLabelIdSettings {
    public static final FansClubProfileFansClubLabelIdSettings INSTANCE = new FansClubProfileFansClubLabelIdSettings();
    public static final Map<String, String> DEFAULT = new LinkedHashMap();

    public final Map<String, String> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely("fans_club_profile_fans_club_label_id", DEFAULT);
    }
}
