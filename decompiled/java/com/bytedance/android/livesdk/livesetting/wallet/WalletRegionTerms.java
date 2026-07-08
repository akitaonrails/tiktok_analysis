package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("wallet_region")
public final class WalletRegionTerms {
    public static final String DEFAULT = "ROW";
    public static final WalletRegionTerms INSTANCE = new WalletRegionTerms();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("wallet_region", DEFAULT);
    }

    public final boolean isEU() {
        return Intrinsics.LJFF(getValue(), "EU");
    }

    public final boolean isROW() {
        return Intrinsics.LJFF(getValue(), "ROW");
    }

    public final boolean isUS() {
        return Intrinsics.LJFF(getValue(), "US");
    }
}
