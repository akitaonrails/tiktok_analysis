package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("ttlive_partnership_detail_page_auto_play")
public final class GameLivePartnershipMixLiveAutoPlaySetting {
    public static final GameAutoPlayConfig DEFAULT;
    public static final GameLivePartnershipMixLiveAutoPlaySetting INSTANCE;
    public static final boolean liveAutoPlay;
    public static final boolean videoAutoPlay;

    static {
        GameLivePartnershipMixLiveAutoPlaySetting gameLivePartnershipMixLiveAutoPlaySetting = new GameLivePartnershipMixLiveAutoPlaySetting();
        INSTANCE = gameLivePartnershipMixLiveAutoPlaySetting;
        DEFAULT = new GameAutoPlayConfig(false, false);
        liveAutoPlay = gameLivePartnershipMixLiveAutoPlaySetting.getConfig().enableLive;
        videoAutoPlay = gameLivePartnershipMixLiveAutoPlaySetting.getConfig().enableVideo;
    }

    private final GameAutoPlayConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        GameAutoPlayConfig gameAutoPlayConfig = DEFAULT;
        GameAutoPlayConfig gameAutoPlayConfig2 = (GameAutoPlayConfig) settingsManager.getValueSafely("ttlive_partnership_detail_page_auto_play", gameAutoPlayConfig);
        return gameAutoPlayConfig2 != null ? gameAutoPlayConfig2 : gameAutoPlayConfig;
    }

    public final boolean getLiveAutoPlay() {
        return liveAutoPlay;
    }

    public final boolean getVideoAutoPlay() {
        return videoAutoPlay;
    }
}
