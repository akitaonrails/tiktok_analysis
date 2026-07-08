package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubDynamicConfig_OptTypeAdapter extends TypeAdapter<FansClubDynamicConfig> {
    public final Gson LIZ;

    public FansClubDynamicConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FansClubDynamicConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FansClubDynamicConfig fansClubDynamicConfig = new FansClubDynamicConfig(10, false, 4000L, 1);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1171660567:
                        if (strLJJJJ.equals("play_guide_anim_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansClubDynamicConfig.playGuideAnimDelayTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 437961099:
                        if (strLJJJJ.equals("min_barrage_grade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansClubDynamicConfig.minBarrageGrade = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 812430664:
                        if (strLJJJJ.equals("badge_span_factor")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansClubDynamicConfig.badgeMarginSpanFactor = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1102866849:
                        if (strLJJJJ.equals("enable_fast_follow_by_fans")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                fansClubDynamicConfig.enableFastFollowByFansLevel = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return fansClubDynamicConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FansClubDynamicConfig fansClubDynamicConfig) throws IOException {
        FansClubDynamicConfig fansClubDynamicConfig2 = fansClubDynamicConfig;
        if (fansClubDynamicConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("min_barrage_grade");
        c09dl.LJJJJ(Integer.valueOf(fansClubDynamicConfig2.minBarrageGrade));
        c09dl.LJIILLIIL("enable_fast_follow_by_fans");
        c09dl.LJJJJJL(fansClubDynamicConfig2.enableFastFollowByFansLevel);
        c09dl.LJIILLIIL("play_guide_anim_delay_time");
        c09dl.LJJIZ(fansClubDynamicConfig2.playGuideAnimDelayTime);
        c09dl.LJIILLIIL("badge_span_factor");
        c09dl.LJJJJ(Integer.valueOf(fansClubDynamicConfig2.badgeMarginSpanFactor));
        c09dl.LJII();
    }
}
