package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.level.SuperFanPurchaseConfig;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class SuperFanPurchaseConfig_SuperFanConfig_OptTypeAdapter extends TypeAdapter<SuperFanPurchaseConfig.SuperFanConfig> {
    @Override // com.google.gson.TypeAdapter
    public final SuperFanPurchaseConfig.SuperFanConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SuperFanPurchaseConfig.SuperFanConfig superFanConfig = new SuperFanPurchaseConfig.SuperFanConfig(10, 1350, "aweme://roma_redirect/?spark_page=TT_CSP_Live_sf_payfail_bot");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1725459019) {
                    if (iHashCode != 781825464) {
                        if (iHashCode == 1097924076 && strLJJJJ.equals("get_points")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                superFanConfig.getPoints = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("reach_level")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            superFanConfig.reachLevel = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("feedback_url")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        superFanConfig.feedbackUrl = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return superFanConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SuperFanPurchaseConfig.SuperFanConfig superFanConfig) {
        SuperFanPurchaseConfig.SuperFanConfig superFanConfig2 = superFanConfig;
        if (superFanConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("reach_level");
        c09dl.LJJJJ(Integer.valueOf(superFanConfig2.reachLevel));
        c09dl.LJIILLIIL("get_points");
        c09dl.LJJJJ(Integer.valueOf(superFanConfig2.getPoints));
        c09dl.LJIILLIIL("feedback_url");
        c09dl.LJJJJJ(superFanConfig2.feedbackUrl);
        c09dl.LJII();
    }
}
