package com.bytedance.android.livesdk.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class RandomLinkMicSetting_OptTypeAdapter extends TypeAdapter<RandomLinkMicSetting> {
    public final Gson LIZ;

    public RandomLinkMicSetting_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final RandomLinkMicSetting read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RandomLinkMicSetting randomLinkMicSetting = new RandomLinkMicSetting();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2126283716:
                        if (strLJJJJ.equals("quickly_disconnected_ban_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                randomLinkMicSetting.banTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1169365480:
                        if (strLJJJJ.equals("random_linkmic_bubble_strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                randomLinkMicSetting.bubbleStrategy = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -414612084:
                        if (strLJJJJ.equals("quickly_disconnected_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                randomLinkMicSetting.disconnectTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 23041080:
                        if (strLJJJJ.equals("quickly_disconnected_judge")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                randomLinkMicSetting.disconnectJudge = (RandomLinkMicSetting.DisconnectJudge) this.LIZ.LJIIJ(RandomLinkMicSetting.DisconnectJudge.class).read(c09cu);
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
        return randomLinkMicSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RandomLinkMicSetting randomLinkMicSetting) {
        RandomLinkMicSetting randomLinkMicSetting2 = randomLinkMicSetting;
        if (randomLinkMicSetting2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("quickly_disconnected_time");
        c09dl.LJJJJ(Integer.valueOf(randomLinkMicSetting2.disconnectTime));
        c09dl.LJIILLIIL("quickly_disconnected_judge");
        this.LIZ.LJIIJ(RandomLinkMicSetting.DisconnectJudge.class).write(c09dl, randomLinkMicSetting2.disconnectJudge);
        c09dl.LJIILLIIL("quickly_disconnected_ban_time");
        c09dl.LJJJJ(Integer.valueOf(randomLinkMicSetting2.banTime));
        c09dl.LJIILLIIL("random_linkmic_bubble_strategy");
        c09dl.LJJJJ(Integer.valueOf(randomLinkMicSetting2.bubbleStrategy));
        c09dl.LJII();
    }
}
