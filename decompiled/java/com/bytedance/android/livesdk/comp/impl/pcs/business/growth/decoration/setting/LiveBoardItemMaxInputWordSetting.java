package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_board_item_max_input_word")
public final class LiveBoardItemMaxInputWordSetting {
    public static final int DEFAULT = 20;
    public static final LiveBoardItemMaxInputWordSetting INSTANCE = new LiveBoardItemMaxInputWordSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_board_item_max_input_word", DEFAULT);
    }
}
