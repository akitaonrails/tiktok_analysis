package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class SubsPayoutOnboardingUrlConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("payout_onboarding_popup")
    public String payoutOnboardingPopup;

    static {
        NormalGson.singleton();
        ADAPTER = new SubsPayoutOnboardingUrlConfig_OptTypeAdapter();
    }

    public SubsPayoutOnboardingUrlConfig() {
        this("");
    }

    public SubsPayoutOnboardingUrlConfig(String str) {
        this.payoutOnboardingPopup = str;
    }
}
