package com.bytedance.android.livesdk.comp.api.pcs.data.setting.onestopshop;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("one_stop_shop_go_live_scheme")
public final class OneStopShopGoLiveSchemaSetting {
    public static final OneStopShopGoLiveSchemaSetting INSTANCE = new OneStopShopGoLiveSchemaSetting();
    public static final String DEFAULT = "sslocal://openShoot?tab=live";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("one_stop_shop_go_live_scheme", DEFAULT);
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
