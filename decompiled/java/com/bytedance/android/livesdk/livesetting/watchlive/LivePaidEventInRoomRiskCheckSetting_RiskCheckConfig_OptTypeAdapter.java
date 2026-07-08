package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePaidEventInRoomRiskCheckSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class LivePaidEventInRoomRiskCheckSetting_RiskCheckConfig_OptTypeAdapter extends TypeAdapter<LivePaidEventInRoomRiskCheckSetting.RiskCheckConfig> {
    public final Gson LIZ;

    public LivePaidEventInRoomRiskCheckSetting_RiskCheckConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePaidEventInRoomRiskCheckSetting.RiskCheckConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePaidEventInRoomRiskCheckSetting.RiskCheckConfig riskCheckConfig = new LivePaidEventInRoomRiskCheckSetting.RiskCheckConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    riskCheckConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "check_count")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    riskCheckConfig.checkCount = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return riskCheckConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePaidEventInRoomRiskCheckSetting.RiskCheckConfig riskCheckConfig) throws IOException {
        LivePaidEventInRoomRiskCheckSetting.RiskCheckConfig riskCheckConfig2 = riskCheckConfig;
        if (riskCheckConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(riskCheckConfig2.enable);
        c09dl.LJIILLIIL("check_count");
        c09dl.LJJJJ(Integer.valueOf(riskCheckConfig2.checkCount));
        c09dl.LJII();
    }
}
