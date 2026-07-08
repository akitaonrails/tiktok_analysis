package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostMockQuickCohostAvatarNudgeSetting;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes33.dex */
public final class LiveCohostMockQuickCohostAvatarNudgeSetting_Configs_OptTypeAdapter extends TypeAdapter<LiveCohostMockQuickCohostAvatarNudgeSetting.Configs> {
    @Override // com.google.gson.TypeAdapter
    public final LiveCohostMockQuickCohostAvatarNudgeSetting.Configs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCohostMockQuickCohostAvatarNudgeSetting.Configs configs = new LiveCohostMockQuickCohostAvatarNudgeSetting.Configs(0.0f, 0.0f, 0.9f, 6.0f, 6.0f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1149072785) {
                    if (iHashCode != -681476241) {
                        if (iHashCode != 109250890) {
                            if (iHashCode != 3220) {
                                if (iHashCode == 3221 && strLJJJJ.equals("dy")) {
                                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                        configs.dy = (float) c09cu.LJJIL();
                                    } else {
                                        c09cu.LJJJJJL();
                                    }
                                }
                            } else if (strLJJJJ.equals("dx")) {
                                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                    configs.dx = (float) c09cu.LJJIL();
                                } else {
                                    c09cu.LJJJJJL();
                                }
                            }
                        } else if (strLJJJJ.equals("scale")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                configs.scale = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("badgeNudgeBottomDp")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            configs.badgeNudgeBottomDp = (float) c09cu.LJJIL();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("badgeNudgeEndDp")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        configs.badgeNudgeEndDp = (float) c09cu.LJJIL();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return configs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCohostMockQuickCohostAvatarNudgeSetting.Configs configs) {
        LiveCohostMockQuickCohostAvatarNudgeSetting.Configs configs2 = configs;
        if (configs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("dx");
        c09dl.LJJJJ(Float.valueOf(configs2.dx));
        c09dl.LJIILLIIL("dy");
        c09dl.LJJJJ(Float.valueOf(configs2.dy));
        c09dl.LJIILLIIL("scale");
        c09dl.LJJJJ(Float.valueOf(configs2.scale));
        c09dl.LJIILLIIL("badgeNudgeEndDp");
        c09dl.LJJJJ(Float.valueOf(configs2.badgeNudgeEndDp));
        c09dl.LJIILLIIL("badgeNudgeBottomDp");
        c09dl.LJJJJ(Float.valueOf(configs2.badgeNudgeBottomDp));
        c09dl.LJII();
    }
}
