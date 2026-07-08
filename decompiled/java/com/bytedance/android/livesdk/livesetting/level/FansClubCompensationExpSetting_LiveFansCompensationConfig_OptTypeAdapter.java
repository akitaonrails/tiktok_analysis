package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.level.FansClubCompensationExpSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubCompensationExpSetting_LiveFansCompensationConfig_OptTypeAdapter extends TypeAdapter<FansClubCompensationExpSetting.LiveFansCompensationConfig> {
    public final Gson LIZ;

    public FansClubCompensationExpSetting_LiveFansCompensationConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FansClubCompensationExpSetting.LiveFansCompensationConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FansClubCompensationExpSetting.LiveFansCompensationConfig liveFansCompensationConfig = new FansClubCompensationExpSetting.LiveFansCompensationConfig(false, 2000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveFansCompensationConfig.enableCompensation = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "starling_key")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    liveFansCompensationConfig.compensationDelayTime = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return liveFansCompensationConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubCompensationExpSetting.LiveFansCompensationConfig liveFansCompensationConfig) throws IOException {
        FansClubCompensationExpSetting.LiveFansCompensationConfig liveFansCompensationConfig2 = liveFansCompensationConfig;
        if (liveFansCompensationConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveFansCompensationConfig2.enableCompensation);
        c09dl.LJIILLIIL("starling_key");
        c09dl.LJJIZ(liveFansCompensationConfig2.compensationDelayTime);
        c09dl.LJII();
    }
}
