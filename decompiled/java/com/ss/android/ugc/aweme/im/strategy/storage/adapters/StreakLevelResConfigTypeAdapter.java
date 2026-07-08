package com.ss.android.ugc.aweme.im.strategy.storage.adapters;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakLevelResConfig;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakResData;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class StreakLevelResConfigTypeAdapter extends TypeAdapter<StreakLevelResConfig> {
    public final Gson LIZ;

    public StreakLevelResConfigTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final StreakLevelResConfig read(C09CU c09cu) throws IOException {
        c09cu.LIZIZ();
        StreakResData streakResData = null;
        StreakResData streakResData2 = null;
        StreakResData streakResData3 = null;
        StreakResData streakResData4 = null;
        StreakResData streakResData5 = null;
        String strLJJJZ = null;
        String strLJJJZ2 = null;
        boolean zLJJ = false;
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2087927040:
                        if (strLJJJJ.equals("streak_animation_unlock")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                streakResData5 = (StreakResData) this.LIZ.LJIIJ(StreakResData.class).read(c09cu);
                            }
                        }
                        break;
                    case -1741818518:
                        if (strLJJJJ.equals("streak_font_color_grey")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ2 = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case -1526639029:
                        if (strLJJJJ.equals("streak_icon_active")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                streakResData2 = (StreakResData) this.LIZ.LJIIJ(StreakResData.class).read(c09cu);
                            }
                        }
                        break;
                    case 215075859:
                        if (strLJJJJ.equals("is_animation_unlock_keep_last_frame")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                zLJJ = c09cu.LJJ();
                            }
                        }
                        break;
                    case 287938556:
                        if (strLJJJJ.equals("streak_fire_lottie_unlock")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                streakResData3 = (StreakResData) this.LIZ.LJIIJ(StreakResData.class).read(c09cu);
                            }
                        }
                        break;
                    case 883519332:
                        if (strLJJJJ.equals("streak_icon_grey")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                streakResData = (StreakResData) this.LIZ.LJIIJ(StreakResData.class).read(c09cu);
                            }
                        }
                        break;
                    case 964457169:
                        if (strLJJJJ.equals("streak_font_color_active")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                strLJJJZ = c09cu.LJJJZ();
                            }
                        }
                        break;
                    case 1474795359:
                        if (strLJJJJ.equals("streak_fire_lottie_continue")) {
                            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                                c09cu.LJJJJJL();
                            } else {
                                streakResData4 = (StreakResData) this.LIZ.LJIIJ(StreakResData.class).read(c09cu);
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return new StreakLevelResConfig(streakResData, streakResData2, streakResData3, streakResData4, streakResData5, strLJJJZ, strLJJJZ2, zLJJ);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, StreakLevelResConfig streakLevelResConfig) throws IOException {
        StreakLevelResConfig streakLevelResConfig2 = streakLevelResConfig;
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("streak_icon_grey");
        if (streakLevelResConfig2.streakIconGrey == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(StreakResData.class).write(c09dl, streakLevelResConfig2.streakIconGrey);
        }
        c09dl.LJIILLIIL("streak_icon_active");
        if (streakLevelResConfig2.streakIconActive == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(StreakResData.class).write(c09dl, streakLevelResConfig2.streakIconActive);
        }
        c09dl.LJIILLIIL("streak_fire_lottie_unlock");
        if (streakLevelResConfig2.streakFireLottieUnlock == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(StreakResData.class).write(c09dl, streakLevelResConfig2.streakFireLottieUnlock);
        }
        c09dl.LJIILLIIL("streak_fire_lottie_continue");
        if (streakLevelResConfig2.streakFireLottieContinue == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(StreakResData.class).write(c09dl, streakLevelResConfig2.streakFireLottieContinue);
        }
        c09dl.LJIILLIIL("streak_animation_unlock");
        if (streakLevelResConfig2.streakAnimationUnlock == null) {
            c09dl.LJIJJ();
        } else {
            this.LIZ.LJIIJ(StreakResData.class).write(c09dl, streakLevelResConfig2.streakAnimationUnlock);
        }
        c09dl.LJIILLIIL("streak_font_color_active");
        c09dl.LJJJJJ(streakLevelResConfig2.streakFontColorActive);
        c09dl.LJIILLIIL("streak_font_color_grey");
        c09dl.LJJJJJ(streakLevelResConfig2.streakFontColorGrey);
        c09dl.LJIILLIIL("is_animation_unlock_keep_last_frame");
        c09dl.LJJJJJL(streakLevelResConfig2.isAnimationUnlockKeepLastFrame);
        c09dl.LJII();
    }
}
