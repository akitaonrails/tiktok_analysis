package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class EffectBubbleConfig_OptTypeAdapter extends TypeAdapter<EffectBubbleConfig> {
    public final Gson LIZ;

    public EffectBubbleConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final EffectBubbleConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        EffectBubbleConfig effectBubbleConfig = new EffectBubbleConfig(false, 5, 900, null, "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                effectBubbleConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -907987551:
                        if (strLJJJJ.equals("schema")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                effectBubbleConfig.schema = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1004704531:
                        if (strLJJJJ.equals("round_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                effectBubbleConfig.roundConfig = C473040Igo.LIZ(this.LIZ, c09cu, FestRoundConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1503712293:
                        if (strLJJJJ.equals("display_duration_s")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                effectBubbleConfig.displayDuration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1550348471:
                        if (strLJJJJ.equals("delay_s")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                effectBubbleConfig.delayDuration = c09cu.LJJIZ();
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
        return effectBubbleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, EffectBubbleConfig effectBubbleConfig) throws IOException {
        EffectBubbleConfig effectBubbleConfig2 = effectBubbleConfig;
        if (effectBubbleConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(effectBubbleConfig2.enable);
        c09dl.LJIILLIIL("display_duration_s");
        c09dl.LJJJJ(Integer.valueOf(effectBubbleConfig2.displayDuration));
        c09dl.LJIILLIIL("delay_s");
        c09dl.LJJJJ(Integer.valueOf(effectBubbleConfig2.delayDuration));
        c09dl.LJIILLIIL("round_config");
        C473040Igo.LIZLLL(this.LIZ, c09dl, effectBubbleConfig2.roundConfig, FestRoundConfig.class);
        c09dl.LJIILLIIL("schema");
        c09dl.LJJJJJ(effectBubbleConfig2.schema);
        c09dl.LJII();
    }
}
