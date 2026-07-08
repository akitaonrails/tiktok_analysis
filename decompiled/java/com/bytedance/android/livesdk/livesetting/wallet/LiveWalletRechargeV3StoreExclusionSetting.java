package com.bytedance.android.livesdk.livesetting.wallet;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SettingsKey("live_wallet_recharge_v3_store_exclusion")
public final class LiveWalletRechargeV3StoreExclusionSetting {
    public static final LiveWalletRechargeV3StoreExclusionSetting INSTANCE = new LiveWalletRechargeV3StoreExclusionSetting();
    public static final List<String> DEFAULT = C1697810uHb.LJIIJJI("com.gbox.android", "com.android.vending");

    public final List<String> getValue() {
        List<String> list = (List) SettingsManager.INSTANCE.getValueSafely(LiveWalletRechargeV3StoreExclusionSetting.class);
        return list == null ? DEFAULT : list;
    }
}
