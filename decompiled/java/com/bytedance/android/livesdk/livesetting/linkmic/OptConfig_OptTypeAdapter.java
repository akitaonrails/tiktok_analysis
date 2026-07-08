package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class OptConfig_OptTypeAdapter extends TypeAdapter<OptConfig> {
    public final Gson LIZ;

    public OptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final OptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        OptConfig optConfig = new OptConfig(false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1249775031) {
                    if (iHashCode != -228391983) {
                        if (iHashCode == 810057733 && strLJJJJ.equals("opt_card_cpu")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                optConfig.optCardCpu = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("opt_save_room")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            optConfig.optSaveRoom = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("opt_mem")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        optConfig.optMem = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return optConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, OptConfig optConfig) throws IOException {
        OptConfig optConfig2 = optConfig;
        if (optConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("opt_mem");
        c09dl.LJJJJJL(optConfig2.optMem);
        c09dl.LJIILLIIL("opt_save_room");
        c09dl.LJJJJJL(optConfig2.optSaveRoom);
        c09dl.LJIILLIIL("opt_card_cpu");
        c09dl.LJJJJJL(optConfig2.optCardCpu);
        c09dl.LJII();
    }
}
