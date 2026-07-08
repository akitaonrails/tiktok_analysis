package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_mkt_and_qual_to_foundation_board_convert")
public final class LiveMktAndQualToFoundationBoardConvertSetting {
    public static final boolean DEFAULT = false;
    public static final LiveMktAndQualToFoundationBoardConvertSetting INSTANCE = new LiveMktAndQualToFoundationBoardConvertSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_mkt_and_qual_to_foundation_board_convert", DEFAULT);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
