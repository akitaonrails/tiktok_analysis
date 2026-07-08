package com.bytedance.android.livesdk.livesetting.decoration;

import X.C01GW;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("donation_adapt_top_status")
public final class DonationAdaptTopStatusSetting {
    public static final boolean DEFAULT = true;
    public static final DonationAdaptTopStatusSetting INSTANCE = new DonationAdaptTopStatusSetting();
    public static final C01GW enable$delegate = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(146));

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}
