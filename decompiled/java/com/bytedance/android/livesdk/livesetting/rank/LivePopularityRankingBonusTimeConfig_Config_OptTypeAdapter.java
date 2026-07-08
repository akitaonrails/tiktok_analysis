package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingBonusTimeConfig;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePopularityRankingBonusTimeConfig_Config_OptTypeAdapter extends TypeAdapter<LivePopularityRankingBonusTimeConfig.Config> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePopularityRankingBonusTimeConfig.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePopularityRankingBonusTimeConfig.Config config = new LivePopularityRankingBonusTimeConfig.Config(13651L, 2L, 15000L, 3000L, 2, "aweme://roma_redirect/?spark_page=anchor_ranking_gameplay&roma_group_key=spark_page_anchor_ranking_gameplay&roma_page_key=p&show_entrance=rank_sticker_set_show_page&always_show_mask=1", "aweme://roma_redirect/?roma_group_key=roma_schema_group_fans_level_main&roma_page_key=roma_schema_page_ranking_faq");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1659342362:
                        if (strLJJJJ.equals("fans_team_rank_faq")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.fansTeamRankFaq = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -287280860:
                        if (strLJJJJ.equals("gameplay_detail_page")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.gameplayDetailPage = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 27409034:
                        if (strLJJJJ.equals("gift_id")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.giftId = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 266921288:
                        if (strLJJJJ.equals("gift_guide_bubble_gift_locate_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.giftGuideBubbleGiftLocateDelayTimeMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 505642433:
                        if (strLJJJJ.equals("gift_point")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.giftPoint = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1000260575:
                        if (strLJJJJ.equals("point_multiple")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.pointMultiple = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1213536167:
                        if (strLJJJJ.equals("gift_guide_bubble_display_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.giftGuideBubbleDisplayDelayTimeMs = c09cu.LJJJ();
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
    public final void write(C09DL c09dl, LivePopularityRankingBonusTimeConfig.Config config) throws IOException {
        LivePopularityRankingBonusTimeConfig.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("gift_id");
        c09dl.LJJIZ(config2.giftId);
        c09dl.LJIILLIIL("gift_point");
        c09dl.LJJIZ(config2.giftPoint);
        c09dl.LJIILLIIL("gift_guide_bubble_display_delay_time");
        c09dl.LJJIZ(config2.giftGuideBubbleDisplayDelayTimeMs);
        c09dl.LJIILLIIL("gift_guide_bubble_gift_locate_delay_time");
        c09dl.LJJIZ(config2.giftGuideBubbleGiftLocateDelayTimeMs);
        c09dl.LJIILLIIL("point_multiple");
        c09dl.LJJJJ(Integer.valueOf(config2.pointMultiple));
        c09dl.LJIILLIIL("gameplay_detail_page");
        c09dl.LJJJJJ(config2.gameplayDetailPage);
        c09dl.LJIILLIIL("fans_team_rank_faq");
        c09dl.LJJJJJ(config2.fansTeamRankFaq);
        c09dl.LJII();
    }
}
