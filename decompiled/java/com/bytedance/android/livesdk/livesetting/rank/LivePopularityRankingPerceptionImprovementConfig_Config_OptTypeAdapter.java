package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingPerceptionImprovementConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes28.dex */
public final class LivePopularityRankingPerceptionImprovementConfig_Config_OptTypeAdapter extends TypeAdapter<LivePopularityRankingPerceptionImprovementConfig.Config> {
    public final Gson LIZ;

    public LivePopularityRankingPerceptionImprovementConfig_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePopularityRankingPerceptionImprovementConfig.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePopularityRankingPerceptionImprovementConfig.Config config = new LivePopularityRankingPerceptionImprovementConfig.Config(true, true, true, true, true, true, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1892519549:
                        if (strLJJJJ.equals("realtime_top_anim_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.realtimeTopAnimOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1324960091:
                        if (strLJJJJ.equals("rise_and_fall_anim_bg_color_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.riseAndFallAnimBgColorOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -573229535:
                        if (strLJJJJ.equals("education_panel_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.educationPanelOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -278967715:
                        if (strLJJJJ.equals("bottom_bar_tag_icon_rtl_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.bottomBarTagIconRTLOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 803056491:
                        if (strLJJJJ.equals("historical_achievement_sharing_page_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.historicalAchievementSharingPageOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1157607502:
                        if (strLJJJJ.equals("bottom_bar_tag_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.bottomBarTagOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1276323392:
                        if (strLJJJJ.equals("spotlight_moment_notice_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.spotlightMomentNoticeOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1366231793:
                        if (strLJJJJ.equals("historical_achievement_notice_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.historicalAchievementNoticeOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
    public final void write(C09DL c09dl, LivePopularityRankingPerceptionImprovementConfig.Config config) throws IOException {
        LivePopularityRankingPerceptionImprovementConfig.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("education_panel_opt");
        c09dl.LJJJJJL(config2.educationPanelOpt);
        c09dl.LJIILLIIL("historical_achievement_notice_opt");
        c09dl.LJJJJJL(config2.historicalAchievementNoticeOpt);
        c09dl.LJIILLIIL("historical_achievement_sharing_page_opt");
        c09dl.LJJJJJL(config2.historicalAchievementSharingPageOpt);
        c09dl.LJIILLIIL("bottom_bar_tag_opt");
        c09dl.LJJJJJL(config2.bottomBarTagOpt);
        c09dl.LJIILLIIL("bottom_bar_tag_icon_rtl_opt");
        c09dl.LJJJJJL(config2.bottomBarTagIconRTLOpt);
        c09dl.LJIILLIIL("spotlight_moment_notice_opt");
        c09dl.LJJJJJL(config2.spotlightMomentNoticeOpt);
        c09dl.LJIILLIIL("rise_and_fall_anim_bg_color_opt");
        c09dl.LJJJJJL(config2.riseAndFallAnimBgColorOpt);
        c09dl.LJIILLIIL("realtime_top_anim_opt");
        c09dl.LJJJJJL(config2.realtimeTopAnimOpt);
        c09dl.LJII();
    }
}
