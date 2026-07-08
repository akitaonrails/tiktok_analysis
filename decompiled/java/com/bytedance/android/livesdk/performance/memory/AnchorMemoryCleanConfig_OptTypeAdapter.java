package com.bytedance.android.livesdk.performance.memory;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class AnchorMemoryCleanConfig_OptTypeAdapter extends TypeAdapter<AnchorMemoryCleanConfig> {
    public final Gson LIZ;

    public AnchorMemoryCleanConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final AnchorMemoryCleanConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        AnchorMemoryCleanConfig anchorMemoryCleanConfig = new AnchorMemoryCleanConfig(false, null, 0L, 7, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1262297706) {
                    if (iHashCode != -109284052) {
                        if (iHashCode == 570418373 && strLJJJJ.equals("interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                anchorMemoryCleanConfig.setInterval(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("is_enabled")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            anchorMemoryCleanConfig.setEnabled(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("threshold_config")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        anchorMemoryCleanConfig.setThresholds(C473040Igo.LIZIZ(this.LIZ, c09cu, Integer.TYPE));
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return anchorMemoryCleanConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, AnchorMemoryCleanConfig anchorMemoryCleanConfig) throws IOException {
        AnchorMemoryCleanConfig anchorMemoryCleanConfig2 = anchorMemoryCleanConfig;
        if (anchorMemoryCleanConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enabled");
        c09dl.LJJJJJL(anchorMemoryCleanConfig2.isEnabled());
        c09dl.LJIILLIIL("threshold_config");
        C473040Igo.LJ(this.LIZ, c09dl, anchorMemoryCleanConfig2.getThresholds(), Integer.TYPE);
        c09dl.LJIILLIIL("interval");
        c09dl.LJJIZ(anchorMemoryCleanConfig2.getInterval());
        c09dl.LJII();
    }
}
