package com.bytedance.android.livesdk.rank.api;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.rank.api.LiveRankingEntranceSettlementCountdownConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRankingEntranceSettlementCountdownConfig_RankingSettlementCountdownConfig_OptTypeAdapter extends TypeAdapter<LiveRankingEntranceSettlementCountdownConfig.RankingSettlementCountdownConfig> {
    public final Gson LIZ;

    public LiveRankingEntranceSettlementCountdownConfig_RankingSettlementCountdownConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveRankingEntranceSettlementCountdownConfig.RankingSettlementCountdownConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRankingEntranceSettlementCountdownConfig.RankingSettlementCountdownConfig rankingSettlementCountdownConfig = new LiveRankingEntranceSettlementCountdownConfig.RankingSettlementCountdownConfig(0, 0, null, 0, 0, 0, 63, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1644795419:
                        if (strLJJJJ.equals("rank_settlement_countdown_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingSettlementCountdownConfig.rankSettlementCountdownDuration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1122082910:
                        if (strLJJJJ.equals("ranking_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingSettlementCountdownConfig.rankingThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1095131793:
                        if (strLJJJJ.equals("rank_settlement_countdown_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingSettlementCountdownConfig.rankSettlementCountdownList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -775588976:
                        if (strLJJJJ.equals("scenario")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingSettlementCountdownConfig.scenario = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -641681555:
                        if (strLJJJJ.equals("rank_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingSettlementCountdownConfig.rankType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 71730056:
                        if (strLJJJJ.equals("rank_animation_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingSettlementCountdownConfig.countdownAnimationType = c09cu.LJJIZ();
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
        return rankingSettlementCountdownConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRankingEntranceSettlementCountdownConfig.RankingSettlementCountdownConfig rankingSettlementCountdownConfig) {
        LiveRankingEntranceSettlementCountdownConfig.RankingSettlementCountdownConfig rankingSettlementCountdownConfig2 = rankingSettlementCountdownConfig;
        if (rankingSettlementCountdownConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("rank_type");
        c09dl.LJJJJ(Integer.valueOf(rankingSettlementCountdownConfig2.rankType));
        c09dl.LJIILLIIL("scenario");
        c09dl.LJJJJ(Integer.valueOf(rankingSettlementCountdownConfig2.scenario));
        c09dl.LJIILLIIL("rank_settlement_countdown_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, rankingSettlementCountdownConfig2.rankSettlementCountdownList, Integer.TYPE);
        c09dl.LJIILLIIL("rank_settlement_countdown_duration");
        c09dl.LJJJJ(Integer.valueOf(rankingSettlementCountdownConfig2.rankSettlementCountdownDuration));
        c09dl.LJIILLIIL("rank_animation_type");
        c09dl.LJJJJ(Integer.valueOf(rankingSettlementCountdownConfig2.countdownAnimationType));
        c09dl.LJIILLIIL("ranking_threshold");
        c09dl.LJJJJ(Integer.valueOf(rankingSettlementCountdownConfig2.rankingThreshold));
        c09dl.LJII();
    }
}
