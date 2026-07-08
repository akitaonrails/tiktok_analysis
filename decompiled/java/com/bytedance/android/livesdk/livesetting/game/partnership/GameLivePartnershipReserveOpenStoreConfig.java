package com.bytedance.android.livesdk.livesetting.game.partnership;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlive_partnership_reserve_open_store_enable")
public final class GameLivePartnershipReserveOpenStoreConfig {
    public static final GameLivePartnershipReserveOpenStoreConfig INSTANCE = new GameLivePartnershipReserveOpenStoreConfig();
    public static final boolean DEFAULT = false;
    public static final boolean enable = SettingsManager.INSTANCE.getBooleanValue("ttlive_partnership_reserve_open_store_enable", DEFAULT);

    public final boolean getEnable() {
        return enable;
    }
}
