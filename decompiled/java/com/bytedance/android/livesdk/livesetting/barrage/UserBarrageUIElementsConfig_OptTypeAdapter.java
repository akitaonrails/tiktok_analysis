package com.bytedance.android.livesdk.livesetting.barrage;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class UserBarrageUIElementsConfig_OptTypeAdapter extends TypeAdapter<UserBarrageUIElementsConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final UserBarrageUIElementsConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        UserBarrageUIElementsConfig userBarrageUIElementsConfig = new UserBarrageUIElementsConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1992012396:
                        if (strLJJJJ.equals("duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                userBarrageUIElementsConfig.duration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1387977540:
                        if (strLJJJJ.equals("right_icon")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                userBarrageUIElementsConfig.rightIcon = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1332194002:
                        if (strLJJJJ.equals("background")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                userBarrageUIElementsConfig.background = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -931257130:
                        if (strLJJJJ.equals("ribbon")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                userBarrageUIElementsConfig.ribbon = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 102865796:
                        if (strLJJJJ.equals("level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                userBarrageUIElementsConfig.levelRange = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1741636017:
                        if (strLJJJJ.equals("left_icon")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                userBarrageUIElementsConfig.leftIcon = c09cu.LJJJZ();
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
        return userBarrageUIElementsConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, UserBarrageUIElementsConfig userBarrageUIElementsConfig) {
        UserBarrageUIElementsConfig userBarrageUIElementsConfig2 = userBarrageUIElementsConfig;
        if (userBarrageUIElementsConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("level");
        c09dl.LJJJJJ(userBarrageUIElementsConfig2.levelRange);
        c09dl.LJIILLIIL("duration");
        c09dl.LJJJJ(Integer.valueOf(userBarrageUIElementsConfig2.duration));
        c09dl.LJIILLIIL("background");
        c09dl.LJJJJJ(userBarrageUIElementsConfig2.background);
        c09dl.LJIILLIIL("left_icon");
        c09dl.LJJJJJ(userBarrageUIElementsConfig2.leftIcon);
        c09dl.LJIILLIIL("right_icon");
        c09dl.LJJJJJ(userBarrageUIElementsConfig2.rightIcon);
        c09dl.LJIILLIIL("ribbon");
        c09dl.LJJJJJ(userBarrageUIElementsConfig2.ribbon);
        c09dl.LJII();
    }
}
