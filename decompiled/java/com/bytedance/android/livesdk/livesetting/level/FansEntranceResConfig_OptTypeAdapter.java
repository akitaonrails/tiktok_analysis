package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FansEntranceResConfig_OptTypeAdapter extends TypeAdapter<FansEntranceResConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FansEntranceResConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FansEntranceResConfig fansEntranceResConfig = new FansEntranceResConfig(0, "", "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1856230760:
                        if (strLJJJJ.equals("fans_grade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansEntranceResConfig.fansGrade = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1538702003:
                        if (strLJJJJ.equals("entrance_lottie_animation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansEntranceResConfig.entranceLottieFileName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1321694675:
                        if (strLJJJJ.equals("gecko_channel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansEntranceResConfig.geckoChannel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -216644790:
                        if (strLJJJJ.equals("entrance_webp_animation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansEntranceResConfig.entranceAnimFileName = c09cu.LJJJZ();
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
        return fansEntranceResConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansEntranceResConfig fansEntranceResConfig) {
        FansEntranceResConfig fansEntranceResConfig2 = fansEntranceResConfig;
        if (fansEntranceResConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("fans_grade");
        c09dl.LJJJJ(Integer.valueOf(fansEntranceResConfig2.fansGrade));
        c09dl.LJIILLIIL("entrance_webp_animation");
        c09dl.LJJJJJ(fansEntranceResConfig2.entranceAnimFileName);
        c09dl.LJIILLIIL("entrance_lottie_animation");
        c09dl.LJJJJJ(fansEntranceResConfig2.entranceLottieFileName);
        c09dl.LJIILLIIL("gecko_channel");
        c09dl.LJJJJJ(fansEntranceResConfig2.geckoChannel);
        c09dl.LJII();
    }
}
