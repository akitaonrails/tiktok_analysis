package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig_Config_OptTypeAdapter extends TypeAdapter<LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig.Config> {
    public final Gson LIZ;

    public LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig.Config config = new LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig.Config(false, false, false, false, new ArrayList(), 0L, false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1843203425:
                        if (strLJJJJ.equals("ranking_entrance_tiles_anim_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.rankingEntranceTilesAnimOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1388403802:
                        if (strLJJJJ.equals("ranking_tiles_page_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.rankingTilesPageOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1276113983:
                        if (strLJJJJ.equals("overall_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.overallOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1268954932:
                        if (strLJJJJ.equals("notice_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.noticeOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -126987069:
                        if (strLJJJJ.equals("notice_rank_type_check_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.noticeRankTypeCheckOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 488197368:
                        if (strLJJJJ.equals("notice_close_frequency_control_in_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.noticeCloseFrequencyControlInSeconds = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1802739944:
                        if (strLJJJJ.equals("ranking_page_tiles_service_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.rankingPageTilesServiceOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1998625399:
                        if (strLJJJJ.equals("notice_rank_type_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.noticeRankTypeList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2081720127:
                        if (strLJJJJ.equals("ranking_page_bottom_bar_tiles_notice_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.rankingPageBottomBarTilesNoticeOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
    public final void write(C09DL c09dl, LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig.Config config) throws IOException {
        LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("overall_opt");
        c09dl.LJJJJJL(config2.overallOpt);
        c09dl.LJIILLIIL("ranking_entrance_tiles_anim_opt");
        c09dl.LJJJJJL(config2.rankingEntranceTilesAnimOpt);
        c09dl.LJIILLIIL("notice_opt");
        c09dl.LJJJJJL(config2.noticeOpt);
        c09dl.LJIILLIIL("notice_rank_type_check_opt");
        c09dl.LJJJJJL(config2.noticeRankTypeCheckOpt);
        c09dl.LJIILLIIL("notice_rank_type_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, config2.noticeRankTypeList, Integer.TYPE);
        c09dl.LJIILLIIL("notice_close_frequency_control_in_seconds");
        c09dl.LJJIZ(config2.noticeCloseFrequencyControlInSeconds);
        c09dl.LJIILLIIL("ranking_page_tiles_service_opt");
        c09dl.LJJJJJL(config2.rankingPageTilesServiceOpt);
        c09dl.LJIILLIIL("ranking_page_bottom_bar_tiles_notice_opt");
        c09dl.LJJJJJL(config2.rankingPageBottomBarTilesNoticeOpt);
        c09dl.LJIILLIIL("ranking_tiles_page_opt");
        c09dl.LJJJJJL(config2.rankingTilesPageOpt);
        c09dl.LJII();
    }
}
