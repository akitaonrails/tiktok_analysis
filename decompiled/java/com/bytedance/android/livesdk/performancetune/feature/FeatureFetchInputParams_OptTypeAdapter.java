package com.bytedance.android.livesdk.performancetune.feature;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FeatureFetchInputParams_OptTypeAdapter extends TypeAdapter<FeatureFetchInputParams> {
    @Override // com.google.gson.TypeAdapter
    public final FeatureFetchInputParams read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FeatureFetchInputParams featureFetchInputParams = new FeatureFetchInputParams("default", "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1241406145) {
                    if (iHashCode != 106079) {
                        if (iHashCode == 98629247 && strLJJJJ.equals("group")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                featureFetchInputParams.setGroup(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("key")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            featureFetchInputParams.setKey(c09cu.LJJJZ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("dataSourceType")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        featureFetchInputParams.setDataSourceType(c09cu.LJJJZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return featureFetchInputParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FeatureFetchInputParams featureFetchInputParams) {
        FeatureFetchInputParams featureFetchInputParams2 = featureFetchInputParams;
        if (featureFetchInputParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("dataSourceType");
        c09dl.LJJJJJ(featureFetchInputParams2.getDataSourceType());
        c09dl.LJIILLIIL("group");
        c09dl.LJJJJJ(featureFetchInputParams2.getGroup());
        c09dl.LJIILLIIL("key");
        c09dl.LJJJJJ(featureFetchInputParams2.getKey());
        c09dl.LJII();
    }
}
