package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankEntranceSplitSetting;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveRankEntranceSplitSetting_Config_OptTypeAdapter extends TypeAdapter<LiveRankEntranceSplitSetting.Config> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveRankEntranceSplitSetting.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRankEntranceSplitSetting.Config config = new LiveRankEntranceSplitSetting.Config(0, 3, 3, 3, 86400, 10, 5);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2115302676:
                        if (strLJJJJ.equals("min_expand_duration_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.minExpandDurationS = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1686218485:
                        if (strLJJJJ.equals("dual_entrance_style")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.style = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1605074591:
                        if (strLJJJJ.equals("pre_collapse_cooldown_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.collapseAfterAnimationEndS = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 327720290:
                        if (strLJJJJ.equals("education_cooldown_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.guideIntervalS = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 593505132:
                        if (strLJJJJ.equals("education_delay_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.guideDelayS = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 659664541:
                        if (strLJJJJ.equals("education_max_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.guideCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 754079569:
                        if (strLJJJJ.equals("education_expand_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.guideExpandDurationS = c09cu.LJJIZ();
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
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRankEntranceSplitSetting.Config config) {
        LiveRankEntranceSplitSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("dual_entrance_style");
        c09dl.LJJJJ(Integer.valueOf(config2.style));
        c09dl.LJIILLIIL("education_max_count");
        c09dl.LJJJJ(Integer.valueOf(config2.guideCount));
        c09dl.LJIILLIIL("education_delay_seconds");
        c09dl.LJJJJ(Integer.valueOf(config2.guideDelayS));
        c09dl.LJIILLIIL("education_expand_seconds");
        c09dl.LJJJJ(Integer.valueOf(config2.guideExpandDurationS));
        c09dl.LJIILLIIL("education_cooldown_seconds");
        c09dl.LJJJJ(Integer.valueOf(config2.guideIntervalS));
        c09dl.LJIILLIIL("min_expand_duration_seconds");
        c09dl.LJJJJ(Integer.valueOf(config2.minExpandDurationS));
        c09dl.LJIILLIIL("pre_collapse_cooldown_seconds");
        c09dl.LJJJJ(Integer.valueOf(config2.collapseAfterAnimationEndS));
        c09dl.LJII();
    }
}
