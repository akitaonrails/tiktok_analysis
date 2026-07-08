package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_host_karaok_enable_coin")
public final class CoinForbidLiveKaraokeSetting {
    public static final int DEFAULT = 0;
    public static final CoinForbidLiveKaraokeSetting INSTANCE = new CoinForbidLiveKaraokeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_host_karaok_enable_coin", DEFAULT) == 1 || !((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isCoin();
    }
}
