package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class CancelRetentionTimeConfig_OptTypeAdapter extends TypeAdapter<CancelRetentionTimeConfig> {
    @Override // com.google.gson.TypeAdapter
    public final CancelRetentionTimeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CancelRetentionTimeConfig cancelRetentionTimeConfig = new CancelRetentionTimeConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "min_recharge_panel_stay_duration_second")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    cancelRetentionTimeConfig.rechargePageStayMinDuration = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "max_payment_cancel_duration_second")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    cancelRetentionTimeConfig.paymentCancelMaxDuration = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return cancelRetentionTimeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CancelRetentionTimeConfig cancelRetentionTimeConfig) {
        CancelRetentionTimeConfig cancelRetentionTimeConfig2 = cancelRetentionTimeConfig;
        if (cancelRetentionTimeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("min_recharge_panel_stay_duration_second");
        c09dl.LJJJJ(Integer.valueOf(cancelRetentionTimeConfig2.rechargePageStayMinDuration));
        c09dl.LJIILLIIL("max_payment_cancel_duration_second");
        c09dl.LJJJJ(Integer.valueOf(cancelRetentionTimeConfig2.paymentCancelMaxDuration));
        c09dl.LJII();
    }
}
