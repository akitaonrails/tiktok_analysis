package com.bytedance.android.livesdk.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PerfItemConfig_OptTypeAdapter extends TypeAdapter<PerfItemConfig> {
    public final Gson LIZ;

    public PerfItemConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PerfItemConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PerfItemConfig perfItemConfig = new PerfItemConfig(null, 0.0f, 0.0f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -997445875) {
                    if (iHashCode != 98) {
                        if (iHashCode == 119 && strLJJJJ.equals("w")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                perfItemConfig.setWeight((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("b")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            perfItemConfig.setBase((float) c09cu.LJJIL());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("p_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        perfItemConfig.setPieces(C473040Igo.LIZ(this.LIZ, c09cu, ScorePiecewise.class));
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return perfItemConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PerfItemConfig perfItemConfig) {
        PerfItemConfig perfItemConfig2 = perfItemConfig;
        if (perfItemConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("p_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, perfItemConfig2.getPieces(), ScorePiecewise.class);
        c09dl.LJIILLIIL("b");
        c09dl.LJJJJ(Float.valueOf(perfItemConfig2.getBase()));
        c09dl.LJIILLIIL("w");
        c09dl.LJJJJ(Float.valueOf(perfItemConfig2.getWeight()));
        c09dl.LJII();
    }
}
