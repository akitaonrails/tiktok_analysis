package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlive_game_cpa_video_enter_from")
public final class GameLivePartnershipEnterFromConfig {
    public static final GameLivePartnershipEnterFromConfig INSTANCE = new GameLivePartnershipEnterFromConfig();
    public static final Map<String, Integer> DEFAULT = C2097608Jq.LJ();

    public final Map<String, Integer> getConfig() {
        Map<String, Integer> map = (Map) SettingsManager.INSTANCE.getValueSafely(GameLivePartnershipEnterFromConfig.class);
        return map == null ? DEFAULT : map;
    }
}
