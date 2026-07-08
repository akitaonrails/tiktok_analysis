package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubLottieConfig_OptTypeAdapter extends TypeAdapter<FansClubLottieConfig> {
    @Override // com.google.gson.TypeAdapter
    public final FansClubLottieConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FansClubLottieConfig fansClubLottieConfig = new FansClubLottieConfig("", "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1871513438) {
                    if (iHashCode != -1526739296) {
                        if (iHashCode == 1204962460 && strLJJJJ.equals("fans_club_entrance_finish_all_task_lottie_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansClubLottieConfig.finishAllTaskLottieName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("fans_club_entrance_weak_guide_lottie_name")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            fansClubLottieConfig.weakGuideLottieName = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("fans_club_entrance_lottie_channel")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        fansClubLottieConfig.lottieChannel = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return fansClubLottieConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubLottieConfig fansClubLottieConfig) {
        FansClubLottieConfig fansClubLottieConfig2 = fansClubLottieConfig;
        if (fansClubLottieConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("fans_club_entrance_lottie_channel");
        c09dl.LJJJJJ(fansClubLottieConfig2.lottieChannel);
        c09dl.LJIILLIIL("fans_club_entrance_weak_guide_lottie_name");
        c09dl.LJJJJJ(fansClubLottieConfig2.weakGuideLottieName);
        c09dl.LJIILLIIL("fans_club_entrance_finish_all_task_lottie_name");
        c09dl.LJJJJJ(fansClubLottieConfig2.finishAllTaskLottieName);
        c09dl.LJII();
    }
}
