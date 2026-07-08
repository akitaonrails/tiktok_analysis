package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlive_game_partnership_rewards_fyp_bottom_tag")
public final class GameLivePartnershipRewardsFypTagSetting {
    public static final int DEFAULT;
    public static final int DIS_ENABLE = 0;
    public static final int ENABLE;
    public static final GameLivePartnershipRewardsFypTagSetting INSTANCE;
    public static final boolean isEnable;
    public static final boolean isInvolve;

    static {
        GameLivePartnershipRewardsFypTagSetting gameLivePartnershipRewardsFypTagSetting = new GameLivePartnershipRewardsFypTagSetting();
        INSTANCE = gameLivePartnershipRewardsFypTagSetting;
        DEFAULT = -1;
        ENABLE = 1;
        isEnable = gameLivePartnershipRewardsFypTagSetting.getSwitch() == 1;
        isInvolve = C1697810uHb.LJIIJJI(Integer.valueOf(DIS_ENABLE), 1).contains(Integer.valueOf(gameLivePartnershipRewardsFypTagSetting.getSwitch()));
    }

    private final int getSwitch() {
        return SettingsManager.INSTANCE.getIntValue("ttlive_game_partnership_rewards_fyp_bottom_tag", DEFAULT);
    }

    public final boolean isEnable() {
        return isEnable;
    }

    public final boolean isInvolve() {
        return isInvolve;
    }
}
