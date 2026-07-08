package com.bytedance.android.livesdk.rank.api;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.EnumC1083210eIJ;
import com.bytedance.android.livesdk.rank.api.LiveRankingCompetitiveAtmosphereConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRankingCompetitiveAtmosphereConfig_RankingCompetitiveAtmosphereConfig_OptTypeAdapter extends TypeAdapter<LiveRankingCompetitiveAtmosphereConfig.RankingCompetitiveAtmosphereConfig> {
    public final Gson LIZ;

    public LiveRankingCompetitiveAtmosphereConfig_RankingCompetitiveAtmosphereConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveRankingCompetitiveAtmosphereConfig.RankingCompetitiveAtmosphereConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRankingCompetitiveAtmosphereConfig.RankingCompetitiveAtmosphereConfig rankingCompetitiveAtmosphereConfig = new LiveRankingCompetitiveAtmosphereConfig.RankingCompetitiveAtmosphereConfig(-1, EnumC1083210eIJ.RANKING_SETTLEMENT.getType(), false, -1, -1, false, -1, -1, false, -1);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2078710579:
                        if (strLJJJJ.equals("ranking_entrance_score_info_countdown")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingCompetitiveAtmosphereConfig.rankingEntranceActiveScoreInfoCountdown = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1645747633:
                        if (strLJJJJ.equals("ranking_entrance_score_info_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingCompetitiveAtmosphereConfig.rankingEntranceScoreInfoOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -775588976:
                        if (strLJJJJ.equals("scenario")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingCompetitiveAtmosphereConfig.scenario = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -681446649:
                        if (strLJJJJ.equals("ranking_entrance_score_info_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingCompetitiveAtmosphereConfig.rankingEntranceScoreInfoThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -641681555:
                        if (strLJJJJ.equals("rank_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingCompetitiveAtmosphereConfig.rankType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 182837446:
                        if (strLJJJJ.equals("ranking_entrance_highlight_countdown")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingCompetitiveAtmosphereConfig.rankingEntranceHighlightCountdown = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1540681896:
                        if (strLJJJJ.equals("highlight_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingCompetitiveAtmosphereConfig.highlightOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1580101376:
                        if (strLJJJJ.equals("ranking_entrance_highlight_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingCompetitiveAtmosphereConfig.rankingEntranceHighlightThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2009451894:
                        if (strLJJJJ.equals("ranking_entrance_active_update_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingCompetitiveAtmosphereConfig.rankingEntranceActiveUpdateOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2130093294:
                        if (strLJJJJ.equals("ranking_entrance_active_update_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingCompetitiveAtmosphereConfig.rankingEntranceActiveUpdateThreshold = c09cu.LJJIZ();
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
        return rankingCompetitiveAtmosphereConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRankingCompetitiveAtmosphereConfig.RankingCompetitiveAtmosphereConfig rankingCompetitiveAtmosphereConfig) throws IOException {
        LiveRankingCompetitiveAtmosphereConfig.RankingCompetitiveAtmosphereConfig rankingCompetitiveAtmosphereConfig2 = rankingCompetitiveAtmosphereConfig;
        if (rankingCompetitiveAtmosphereConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("rank_type");
        c09dl.LJJJJ(Integer.valueOf(rankingCompetitiveAtmosphereConfig2.rankType));
        c09dl.LJIILLIIL("scenario");
        c09dl.LJJJJ(Integer.valueOf(rankingCompetitiveAtmosphereConfig2.scenario));
        c09dl.LJIILLIIL("highlight_opt");
        c09dl.LJJJJJL(rankingCompetitiveAtmosphereConfig2.highlightOpt);
        c09dl.LJIILLIIL("ranking_entrance_highlight_countdown");
        c09dl.LJJJJ(Integer.valueOf(rankingCompetitiveAtmosphereConfig2.rankingEntranceHighlightCountdown));
        c09dl.LJIILLIIL("ranking_entrance_highlight_threshold");
        c09dl.LJJJJ(Integer.valueOf(rankingCompetitiveAtmosphereConfig2.rankingEntranceHighlightThreshold));
        c09dl.LJIILLIIL("ranking_entrance_score_info_opt");
        c09dl.LJJJJJL(rankingCompetitiveAtmosphereConfig2.rankingEntranceScoreInfoOpt);
        c09dl.LJIILLIIL("ranking_entrance_score_info_countdown");
        c09dl.LJJJJ(Integer.valueOf(rankingCompetitiveAtmosphereConfig2.rankingEntranceActiveScoreInfoCountdown));
        c09dl.LJIILLIIL("ranking_entrance_score_info_threshold");
        c09dl.LJJJJ(Integer.valueOf(rankingCompetitiveAtmosphereConfig2.rankingEntranceScoreInfoThreshold));
        c09dl.LJIILLIIL("ranking_entrance_active_update_opt");
        c09dl.LJJJJJL(rankingCompetitiveAtmosphereConfig2.rankingEntranceActiveUpdateOpt);
        c09dl.LJIILLIIL("ranking_entrance_active_update_threshold");
        c09dl.LJJJJ(Integer.valueOf(rankingCompetitiveAtmosphereConfig2.rankingEntranceActiveUpdateThreshold));
        c09dl.LJII();
    }
}
