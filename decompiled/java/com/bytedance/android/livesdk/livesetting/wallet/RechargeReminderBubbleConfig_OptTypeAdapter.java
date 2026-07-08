package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class RechargeReminderBubbleConfig_OptTypeAdapter extends TypeAdapter<RechargeReminderBubbleConfig> {
    @Override // com.google.gson.TypeAdapter
    public final RechargeReminderBubbleConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RechargeReminderBubbleConfig rechargeReminderBubbleConfig = new RechargeReminderBubbleConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "recharge_reminder_bubble_delay")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    rechargeReminderBubbleConfig.bubbleShowDelaySec = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return rechargeReminderBubbleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RechargeReminderBubbleConfig rechargeReminderBubbleConfig) throws IOException {
        RechargeReminderBubbleConfig rechargeReminderBubbleConfig2 = rechargeReminderBubbleConfig;
        if (rechargeReminderBubbleConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("recharge_reminder_bubble_delay");
        c09dl.LJJIZ(rechargeReminderBubbleConfig2.bubbleShowDelaySec);
        c09dl.LJII();
    }
}
