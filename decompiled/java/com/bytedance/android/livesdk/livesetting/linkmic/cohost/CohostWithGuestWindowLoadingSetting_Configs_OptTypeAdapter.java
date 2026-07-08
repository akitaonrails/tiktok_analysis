package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestWindowLoadingSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class CohostWithGuestWindowLoadingSetting_Configs_OptTypeAdapter extends TypeAdapter<CohostWithGuestWindowLoadingSetting.Configs> {
    public final Gson LIZ;

    public CohostWithGuestWindowLoadingSetting_Configs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final CohostWithGuestWindowLoadingSetting.Configs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CohostWithGuestWindowLoadingSetting.Configs configs = new CohostWithGuestWindowLoadingSetting.Configs(true, Mp4ScreenVideoLoadTimeout.CONTROL);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "is_enabled")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    configs.isEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "time_out_ms")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    configs.timeOutMs = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return configs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CohostWithGuestWindowLoadingSetting.Configs configs) throws IOException {
        CohostWithGuestWindowLoadingSetting.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enabled");
        c09dl.LJJJJJL(configs2.isEnabled);
        c09dl.LJIILLIIL("time_out_ms");
        c09dl.LJJIZ(configs2.timeOutMs);
        c09dl.LJII();
    }
}
