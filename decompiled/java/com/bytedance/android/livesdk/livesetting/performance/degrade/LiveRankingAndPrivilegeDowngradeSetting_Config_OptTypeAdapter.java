package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveRankingAndPrivilegeDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.rank.RankEntranceLoopInterval;
import com.bytedance.android.livesdk.livesetting.rank.RankEntranceMarqueeInterval;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveRankingAndPrivilegeDowngradeSetting_Config_OptTypeAdapter extends TypeAdapter<LiveRankingAndPrivilegeDowngradeSetting.Config> {
    public final Gson LIZ;

    public LiveRankingAndPrivilegeDowngradeSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveRankingAndPrivilegeDowngradeSetting.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRankingAndPrivilegeDowngradeSetting.Config config = new LiveRankingAndPrivilegeDowngradeSetting.Config(false, false, false, 0L, false, false, false, false, RankEntranceLoopInterval.INSTANCE.getValue().rankLoopInterval, RankEntranceMarqueeInterval.INSTANCE.getValue(), false, false, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2144376201:
                        if (strLJJJJ.equals("disable_ranking_list_bottom_bar_enter_rank_animation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.disableRankingListBottomBarEnterRankAnimation = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1847004087:
                        if (strLJJJJ.equals("loading_delay_time_for_creator_ranking_widget")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.loadingDelayTimeForCreatorRankingWidget = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -900980789:
                        if (strLJJJJ.equals("ranking_entrance_loop_optimization_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.rankingEntranceLoopOptimizationSwitch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 34532251:
                        if (strLJJJJ.equals("disable_ranking_entrance_animation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.disableRankingEntranceAnimation = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 386114656:
                        if (strLJJJJ.equals("ranking_entrance_loop_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.rankingEntranceLoopInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 448936930:
                        if (strLJJJJ.equals("ranking_entrance_marquee_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.rankingEntranceMarqueeInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 678251078:
                        if (strLJJJJ.equals("enable_creator_side_optimization")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enableCreatorSideOptimization = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 703535172:
                        if (strLJJJJ.equals("disable_ranking_list_item_live_webp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.disableRankingListItemLiveWebp = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1046466222:
                        if (strLJJJJ.equals("widget_loading_delay_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.widgetLoadingDelaySwitch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1267519987:
                        if (strLJJJJ.equals("disable_creator_team_entrance_animation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.disableCreatorTeamEntranceAnimation = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1418666761:
                        if (strLJJJJ.equals("ranking_entrance_marquee_optimization_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.rankingEntranceMarqueeOptimizationSwitch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1544930508:
                        if (strLJJJJ.equals("disable_ranking_list_page_refresh")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.disableRankingListPageRefresh = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1772443158:
                        if (strLJJJJ.equals("enable_audience_side_optimization")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enableAudienceSideOptimization = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1872065190:
                        if (strLJJJJ.equals("ranking_entrance_optimization_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.rankingEntranceOptimizationSwitch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1881158512:
                        if (strLJJJJ.equals("disable_user_level_public_screen_barrage_animation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.disableUserLevelPublicScreenBarrageAnimation = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
    public final void write(C09DL c09dl, LiveRankingAndPrivilegeDowngradeSetting.Config config) throws IOException {
        LiveRankingAndPrivilegeDowngradeSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_creator_side_optimization");
        c09dl.LJJJJJL(config2.enableCreatorSideOptimization);
        c09dl.LJIILLIIL("enable_audience_side_optimization");
        c09dl.LJJJJJL(config2.enableAudienceSideOptimization);
        c09dl.LJIILLIIL("widget_loading_delay_switch");
        c09dl.LJJJJJL(config2.widgetLoadingDelaySwitch);
        c09dl.LJIILLIIL("loading_delay_time_for_creator_ranking_widget");
        c09dl.LJJIZ(config2.loadingDelayTimeForCreatorRankingWidget);
        c09dl.LJIILLIIL("ranking_entrance_optimization_switch");
        c09dl.LJJJJJL(config2.rankingEntranceOptimizationSwitch);
        c09dl.LJIILLIIL("ranking_entrance_loop_optimization_switch");
        c09dl.LJJJJJL(config2.rankingEntranceLoopOptimizationSwitch);
        c09dl.LJIILLIIL("ranking_entrance_marquee_optimization_switch");
        c09dl.LJJJJJL(config2.rankingEntranceMarqueeOptimizationSwitch);
        c09dl.LJIILLIIL("disable_ranking_entrance_animation");
        c09dl.LJJJJJL(config2.disableRankingEntranceAnimation);
        c09dl.LJIILLIIL("ranking_entrance_loop_interval");
        c09dl.LJJIZ(config2.rankingEntranceLoopInterval);
        c09dl.LJIILLIIL("ranking_entrance_marquee_interval");
        c09dl.LJJIZ(config2.rankingEntranceMarqueeInterval);
        c09dl.LJIILLIIL("disable_ranking_list_page_refresh");
        c09dl.LJJJJJL(config2.disableRankingListPageRefresh);
        c09dl.LJIILLIIL("disable_ranking_list_item_live_webp");
        c09dl.LJJJJJL(config2.disableRankingListItemLiveWebp);
        c09dl.LJIILLIIL("disable_ranking_list_bottom_bar_enter_rank_animation");
        c09dl.LJJJJJL(config2.disableRankingListBottomBarEnterRankAnimation);
        c09dl.LJIILLIIL("disable_creator_team_entrance_animation");
        c09dl.LJJJJJL(config2.disableCreatorTeamEntranceAnimation);
        c09dl.LJIILLIIL("disable_user_level_public_screen_barrage_animation");
        c09dl.LJJJJJL(config2.disableUserLevelPublicScreenBarrageAnimation);
        c09dl.LJII();
    }
}
