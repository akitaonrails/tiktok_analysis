package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_game_tag_select_pop_audience_control_sheet")
public final class TtliveGameTagSelectPopAudienceControlSheetSetting {
    public static final boolean DEFAULT = false;
    public static final TtliveGameTagSelectPopAudienceControlSheetSetting INSTANCE = new TtliveGameTagSelectPopAudienceControlSheetSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_game_tag_select_pop_audience_control_sheet", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
