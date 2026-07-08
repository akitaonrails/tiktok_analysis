package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting;

import X.C01GW;
import X.C1152730g6R;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_secondary_board_item_max_input")
public final class LiveSecondaryBoardItemMaxInputSetting {
    public static final LiveSecondaryBoardItemMaxInputSetting INSTANCE = new LiveSecondaryBoardItemMaxInputSetting();
    public static final SecondaryBoardInputConfig DEFAULT = new SecondaryBoardInputConfig(120, 12);
    public static final C01GW config$delegate = C452501pT.LIZIZ(new C1152730g6R());

    private final SecondaryBoardInputConfig getConfig() {
        return (SecondaryBoardInputConfig) config$delegate.getValue();
    }

    public final SecondaryBoardInputConfig getValue() {
        return getConfig();
    }
}
