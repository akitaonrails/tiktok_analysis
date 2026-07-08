package com.bytedance.android.livesdk.rank.api;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.EnumC1811400xEo;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class RankTypeV2_OptTypeAdapter extends TypeAdapter<RankTypeV2> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final RankTypeV2 read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RankTypeV2 rankTypeV2 = new RankTypeV2(-1, EnumC1811400xEo.DEFAULT.getType(), "unknown", 0, 0, -1, 0, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1826906930:
                        if (strLJJJJ.equals("rank_settlement_countdown")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankTypeV2.rankSettlementCountdown = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1644795419:
                        if (strLJJJJ.equals("rank_settlement_countdown_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankTypeV2.rankSettlementCountdownDuration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -641883458:
                        if (strLJJJJ.equals("rank_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankTypeV2.rankName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -641681555:
                        if (strLJJJJ.equals("rank_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankTypeV2.type = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1282509050:
                        if (strLJJJJ.equals("group_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankTypeV2.group_type = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1405486176:
                        if (strLJJJJ.equals("show_rank_keep_up_tip")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankTypeV2.showRankKeepUpTip = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1578493864:
                        if (strLJJJJ.equals("rank_phase")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankTypeV2.rankPhase = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1581644766:
                        if (strLJJJJ.equals("rank_style")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankTypeV2.style = c09cu.LJJIZ();
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
        return rankTypeV2;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RankTypeV2 rankTypeV2) {
        RankTypeV2 rankTypeV22 = rankTypeV2;
        if (rankTypeV22 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("rank_type");
        c09dl.LJJJJ(Integer.valueOf(rankTypeV22.type));
        c09dl.LJIILLIIL("group_type");
        c09dl.LJJJJ(Integer.valueOf(rankTypeV22.group_type));
        c09dl.LJIILLIIL("rank_name");
        c09dl.LJJJJJ(rankTypeV22.rankName);
        c09dl.LJIILLIIL("rank_style");
        c09dl.LJJJJ(Integer.valueOf(rankTypeV22.style));
        c09dl.LJIILLIIL("rank_phase");
        c09dl.LJJJJ(Integer.valueOf(rankTypeV22.rankPhase));
        c09dl.LJIILLIIL("rank_settlement_countdown");
        c09dl.LJJJJ(Integer.valueOf(rankTypeV22.rankSettlementCountdown));
        c09dl.LJIILLIIL("rank_settlement_countdown_duration");
        c09dl.LJJJJ(Integer.valueOf(rankTypeV22.rankSettlementCountdownDuration));
        c09dl.LJIILLIIL("show_rank_keep_up_tip");
        c09dl.LJJJJ(Integer.valueOf(rankTypeV22.showRankKeepUpTip));
        c09dl.LJII();
    }
}
