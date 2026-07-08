package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClaimResConfig_OptTypeAdapter extends TypeAdapter<FansClaimResConfig> {
    @Override // com.google.gson.TypeAdapter
    public final FansClaimResConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FansClaimResConfig fansClaimResConfig = new FansClaimResConfig(0, "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -2036133237) {
                    if (iHashCode != -1856230760) {
                        if (iHashCode == 374962995 && strLJJJJ.equals("android_channel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansClaimResConfig.geckoChannel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("fans_grade")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            fansClaimResConfig.fansGrade = c09cu.LJJIZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("webp_file_name")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        fansClaimResConfig.webpFileName = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return fansClaimResConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClaimResConfig fansClaimResConfig) {
        FansClaimResConfig fansClaimResConfig2 = fansClaimResConfig;
        if (fansClaimResConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("fans_grade");
        c09dl.LJJJJ(Integer.valueOf(fansClaimResConfig2.fansGrade));
        c09dl.LJIILLIIL("webp_file_name");
        c09dl.LJJJJJ(fansClaimResConfig2.webpFileName);
        c09dl.LJIILLIIL("android_channel");
        c09dl.LJJJJJ(fansClaimResConfig2.geckoChannel);
        c09dl.LJII();
    }
}
