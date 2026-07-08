package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveSearchCardWarmUpOptConfig_OptTypeAdapter extends TypeAdapter<LiveSearchCardWarmUpOptConfig> {
    public final Gson LIZ;

    public LiveSearchCardWarmUpOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveSearchCardWarmUpOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveSearchCardWarmUpOptConfig liveSearchCardWarmUpOptConfig = new LiveSearchCardWarmUpOptConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1690358682:
                        if (strLJJJJ.equals("other_warm_up")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSearchCardWarmUpOptConfig.otherWarmUp = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSearchCardWarmUpOptConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 806297961:
                        if (strLJJJJ.equals("mix_card_warm_up")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSearchCardWarmUpOptConfig.mixCardWarmUp = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 911504999:
                        if (strLJJJJ.equals("ec_card_warm_up")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSearchCardWarmUpOptConfig.ecCardWarmUp = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveSearchCardWarmUpOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSearchCardWarmUpOptConfig liveSearchCardWarmUpOptConfig) throws IOException {
        LiveSearchCardWarmUpOptConfig liveSearchCardWarmUpOptConfig2 = liveSearchCardWarmUpOptConfig;
        if (liveSearchCardWarmUpOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("mix_card_warm_up");
        c09dl.LJJJJJL(liveSearchCardWarmUpOptConfig2.mixCardWarmUp);
        c09dl.LJIILLIIL("ec_card_warm_up");
        c09dl.LJJJJJL(liveSearchCardWarmUpOptConfig2.ecCardWarmUp);
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveSearchCardWarmUpOptConfig2.enable);
        c09dl.LJIILLIIL("other_warm_up");
        c09dl.LJJJJJL(liveSearchCardWarmUpOptConfig2.otherWarmUp);
        c09dl.LJII();
    }
}
