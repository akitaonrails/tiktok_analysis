package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting;

import X.C01GW;
import X.C187800ns;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_fully_customized_board_item_max_input")
public final class LiveFullyCustomizedBoardItemMaxInputSetting {
    public static final LiveFullyCustomizedBoardItemMaxInputSetting INSTANCE = new LiveFullyCustomizedBoardItemMaxInputSetting();
    public static final FullyCustomizedInputConfig DEFAULT = new FullyCustomizedInputConfig(120, 6, 12);
    public static final C01GW config$delegate = C452501pT.LIZIZ(new C187800ns());

    private final FullyCustomizedInputConfig getConfig() {
        return (FullyCustomizedInputConfig) config$delegate.getValue();
    }

    public final FullyCustomizedInputConfig getValue() {
        return getConfig();
    }
}
