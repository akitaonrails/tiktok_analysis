package com.bytedance.android.livesdk.livesetting.message;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class HoldMessageDispatchConfig_OptTypeAdapter extends TypeAdapter<HoldMessageDispatchConfig> {
    public final Gson LIZ;

    public HoldMessageDispatchConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final HoldMessageDispatchConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        HoldMessageDispatchConfig holdMessageDispatchConfig = new HoldMessageDispatchConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enabled")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    holdMessageDispatchConfig.setEnabled(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "max_hold_count")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    holdMessageDispatchConfig.setMaxHoldCount(c09cu.LJJIZ());
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return holdMessageDispatchConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, HoldMessageDispatchConfig holdMessageDispatchConfig) throws IOException {
        HoldMessageDispatchConfig holdMessageDispatchConfig2 = holdMessageDispatchConfig;
        if (holdMessageDispatchConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enabled");
        c09dl.LJJJJJL(holdMessageDispatchConfig2.getEnabled());
        c09dl.LJIILLIIL("max_hold_count");
        c09dl.LJJJJ(Integer.valueOf(holdMessageDispatchConfig2.getMaxHoldCount()));
        c09dl.LJII();
    }
}
