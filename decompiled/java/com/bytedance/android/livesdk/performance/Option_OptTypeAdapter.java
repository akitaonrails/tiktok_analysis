package com.bytedance.android.livesdk.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class Option_OptTypeAdapter extends TypeAdapter<Option> {
    public final Gson LIZ;

    public Option_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final Option read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        Option option = new Option(false, false, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1113458133:
                        if (strLJJJJ.equals("speed_test_overall_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                option.speedTestOverallScore = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -998588761:
                        if (strLJJJJ.equals("auto_adaptive_overall_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                option.autoAdaptiveOverallScore = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 706454661:
                        if (strLJJJJ.equals("effect_adaptive_overall_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                option.effectAdaptiveOverallScore = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1996641781:
                        if (strLJJJJ.equals("speed_test_thermal_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                option.speedTestThermalScore = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2111511153:
                        if (strLJJJJ.equals("auto_adaptive_thermal_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                option.autoAdaptiveThermalScore = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return option;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, Option option) throws IOException {
        Option option2 = option;
        if (option2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("auto_adaptive_overall_score");
        c09dl.LJJJJJL(option2.autoAdaptiveOverallScore);
        c09dl.LJIILLIIL("auto_adaptive_thermal_score");
        c09dl.LJJJJJL(option2.autoAdaptiveThermalScore);
        c09dl.LJIILLIIL("speed_test_overall_score");
        c09dl.LJJJJJL(option2.speedTestOverallScore);
        c09dl.LJIILLIIL("speed_test_thermal_score");
        c09dl.LJJJJJL(option2.speedTestThermalScore);
        c09dl.LJIILLIIL("effect_adaptive_overall_score");
        c09dl.LJJJJJL(option2.effectAdaptiveOverallScore);
        c09dl.LJII();
    }
}
