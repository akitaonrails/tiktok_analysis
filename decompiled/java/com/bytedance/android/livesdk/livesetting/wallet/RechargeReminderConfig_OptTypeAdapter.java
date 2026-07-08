package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class RechargeReminderConfig_OptTypeAdapter extends TypeAdapter<RechargeReminderConfig> {
    public final Gson LIZ;

    public RechargeReminderConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final RechargeReminderConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RechargeReminderConfig rechargeReminderConfig = new RechargeReminderConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "show_live_customized_update_switch")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    rechargeReminderConfig.showLiveCustomizedUpdateSwitch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return rechargeReminderConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RechargeReminderConfig rechargeReminderConfig) throws IOException {
        RechargeReminderConfig rechargeReminderConfig2 = rechargeReminderConfig;
        if (rechargeReminderConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("show_live_customized_update_switch");
        c09dl.LJJJJJL(rechargeReminderConfig2.showLiveCustomizedUpdateSwitch);
        c09dl.LJII();
    }
}
