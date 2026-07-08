package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class SparkDynamicParam_OptTypeAdapter extends TypeAdapter<SparkDynamicParam> {
    public final Gson LIZ;

    public SparkDynamicParam_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final SparkDynamicParam read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SparkDynamicParam sparkDynamicParam = new SparkDynamicParam();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -198625299) {
                    if (iHashCode != 1165864767) {
                        if (iHashCode == 1954273197 && strLJJJJ.equals("param_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sparkDynamicParam.paramKey = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("param_value")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            sparkDynamicParam.paramValue = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("pattern_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        sparkDynamicParam.patternList = (String[]) this.LIZ.LJIIJ(String[].class).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return sparkDynamicParam;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SparkDynamicParam sparkDynamicParam) {
        SparkDynamicParam sparkDynamicParam2 = sparkDynamicParam;
        if (sparkDynamicParam2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("pattern_list");
        this.LIZ.LJIIJ(String[].class).write(c09dl, sparkDynamicParam2.patternList);
        c09dl.LJIILLIIL("param_key");
        c09dl.LJJJJJ(sparkDynamicParam2.paramKey);
        c09dl.LJIILLIIL("param_value");
        c09dl.LJJJJJ(sparkDynamicParam2.paramValue);
        c09dl.LJII();
    }
}
