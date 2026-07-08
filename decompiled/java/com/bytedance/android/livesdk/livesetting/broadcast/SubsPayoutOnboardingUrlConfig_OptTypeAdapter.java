package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class SubsPayoutOnboardingUrlConfig_OptTypeAdapter extends TypeAdapter<SubsPayoutOnboardingUrlConfig> {
    @Override // com.google.gson.TypeAdapter
    public final SubsPayoutOnboardingUrlConfig read(C09CU c09cu) {
        SubsPayoutOnboardingUrlConfig subsPayoutOnboardingUrlConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            subsPayoutOnboardingUrlConfig = new SubsPayoutOnboardingUrlConfig("");
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "payout_onboarding_popup")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        subsPayoutOnboardingUrlConfig.payoutOnboardingPopup = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return subsPayoutOnboardingUrlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SubsPayoutOnboardingUrlConfig subsPayoutOnboardingUrlConfig) {
        SubsPayoutOnboardingUrlConfig subsPayoutOnboardingUrlConfig2 = subsPayoutOnboardingUrlConfig;
        if (subsPayoutOnboardingUrlConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("payout_onboarding_popup");
        c09dl.LJJJJJ(subsPayoutOnboardingUrlConfig2.payoutOnboardingPopup);
        c09dl.LJII();
    }
}
