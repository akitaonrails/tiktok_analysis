package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class FlyMicV2Config_OptTypeAdapter extends TypeAdapter<FlyMicV2Config> {
    public final Gson LIZ;

    public FlyMicV2Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final FlyMicV2Config read(C09CU c09cu) {
        FlyMicV2Config flyMicV2Config = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            flyMicV2Config = new FlyMicV2Config(false, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "flying_gift_multi_guest_phase_2")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        flyMicV2Config.setInExperiment(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "flying_gift_multi_guest_delay_strat")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        flyMicV2Config.setShouldUseNewStrat(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return flyMicV2Config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FlyMicV2Config flyMicV2Config) throws IOException {
        FlyMicV2Config flyMicV2Config2 = flyMicV2Config;
        if (flyMicV2Config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("flying_gift_multi_guest_phase_2");
        c09dl.LJJJJJL(flyMicV2Config2.isInExperiment());
        c09dl.LJIILLIIL("flying_gift_multi_guest_delay_strat");
        c09dl.LJJJJJL(flyMicV2Config2.getShouldUseNewStrat());
        c09dl.LJII();
    }
}
