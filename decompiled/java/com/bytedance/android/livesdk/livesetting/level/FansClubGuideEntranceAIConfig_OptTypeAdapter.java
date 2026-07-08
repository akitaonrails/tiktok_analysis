package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubGuideEntranceAIConfig_OptTypeAdapter extends TypeAdapter<FansClubGuideEntranceAIConfig> {
    @Override // com.google.gson.TypeAdapter
    public final FansClubGuideEntranceAIConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FansClubGuideEntranceAIConfig fansClubGuideEntranceAIConfig = new FansClubGuideEntranceAIConfig(0, "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1144511094) {
                    if (iHashCode != 1279191607) {
                        if (iHashCode == 2144580847 && strLJJJJ.equals("algo_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansClubGuideEntranceAIConfig.algoEnable = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("biz_name")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            fansClubGuideEntranceAIConfig.bizName = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("algo_pkg_name")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        fansClubGuideEntranceAIConfig.algoPkgName = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return fansClubGuideEntranceAIConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubGuideEntranceAIConfig fansClubGuideEntranceAIConfig) {
        FansClubGuideEntranceAIConfig fansClubGuideEntranceAIConfig2 = fansClubGuideEntranceAIConfig;
        if (fansClubGuideEntranceAIConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("algo_enable");
        c09dl.LJJJJ(Integer.valueOf(fansClubGuideEntranceAIConfig2.algoEnable));
        c09dl.LJIILLIIL("algo_pkg_name");
        c09dl.LJJJJJ(fansClubGuideEntranceAIConfig2.algoPkgName);
        c09dl.LJIILLIIL("biz_name");
        c09dl.LJJJJJ(fansClubGuideEntranceAIConfig2.bizName);
        c09dl.LJII();
    }
}
