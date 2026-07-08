package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class FullyCustomizedInputConfig_OptTypeAdapter extends TypeAdapter<FullyCustomizedInputConfig> {
    @Override // com.google.gson.TypeAdapter
    public final FullyCustomizedInputConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FullyCustomizedInputConfig fullyCustomizedInputConfig = new FullyCustomizedInputConfig(120, 6, 12);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1635329506) {
                    if (iHashCode != 600519419) {
                        if (iHashCode == 1816430150 && strLJJJJ.equals("word_limit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fullyCustomizedInputConfig.wordLimit = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("headline_line_limit")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            fullyCustomizedInputConfig.headlineLineLimit = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("desc_line_limit")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        fullyCustomizedInputConfig.descLineLimit = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return fullyCustomizedInputConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FullyCustomizedInputConfig fullyCustomizedInputConfig) {
        FullyCustomizedInputConfig fullyCustomizedInputConfig2 = fullyCustomizedInputConfig;
        if (fullyCustomizedInputConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("word_limit");
        c09dl.LJJJJ(Integer.valueOf(fullyCustomizedInputConfig2.wordLimit));
        c09dl.LJIILLIIL("headline_line_limit");
        c09dl.LJJJJ(Integer.valueOf(fullyCustomizedInputConfig2.headlineLineLimit));
        c09dl.LJIILLIIL("desc_line_limit");
        c09dl.LJJJJ(Integer.valueOf(fullyCustomizedInputConfig2.descLineLimit));
        c09dl.LJII();
    }
}
