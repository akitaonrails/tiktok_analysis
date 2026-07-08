package com.bytedance.android.livesdk.rank.api;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.rank.api.LiveRankingEntranceLoopRuleConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRankingEntranceLoopRuleConfig_LoopRuleConfig_OptTypeAdapter extends TypeAdapter<LiveRankingEntranceLoopRuleConfig.LoopRuleConfig> {
    public final Gson LIZ;

    public LiveRankingEntranceLoopRuleConfig_LoopRuleConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveRankingEntranceLoopRuleConfig.LoopRuleConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRankingEntranceLoopRuleConfig.LoopRuleConfig loopRuleConfig = new LiveRankingEntranceLoopRuleConfig.LoopRuleConfig(-1, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case 135754305:
                        if (strLJJJJ.equals("ranking_offset_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loopRuleConfig.rankingOffsetList = C473040Igo.LIZ(this.LIZ, c09cu, LiveRankingEntranceLoopRuleConfig.RankingLoopOffsetConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 363945488:
                        if (strLJJJJ.equals("ranking_priority_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loopRuleConfig.rankingLoopPriorityList = C473040Igo.LIZ(this.LIZ, c09cu, LiveRankingEntranceLoopRuleConfig.RankingLoopPriorityConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1056247658:
                        if (strLJJJJ.equals("ranking_interval_config_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loopRuleConfig.rankingIntervalConfigList = C473040Igo.LIZ(this.LIZ, c09cu, LiveRankingEntranceLoopRuleConfig.RankingLoopIntervalConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1493529282:
                        if (strLJJJJ.equals("loop_rule_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loopRuleConfig.loopRuleType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1708783828:
                        if (strLJJJJ.equals("mandatory_ranking_type_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                loopRuleConfig.mandatoryRankingTypeList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
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
        return loopRuleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRankingEntranceLoopRuleConfig.LoopRuleConfig loopRuleConfig) {
        LiveRankingEntranceLoopRuleConfig.LoopRuleConfig loopRuleConfig2 = loopRuleConfig;
        if (loopRuleConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("loop_rule_type");
        c09dl.LJJJJ(Integer.valueOf(loopRuleConfig2.loopRuleType));
        c09dl.LJIILLIIL("mandatory_ranking_type_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, loopRuleConfig2.mandatoryRankingTypeList, Integer.TYPE);
        c09dl.LJIILLIIL("ranking_priority_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, loopRuleConfig2.rankingLoopPriorityList, LiveRankingEntranceLoopRuleConfig.RankingLoopPriorityConfig.class);
        c09dl.LJIILLIIL("ranking_interval_config_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, loopRuleConfig2.rankingIntervalConfigList, LiveRankingEntranceLoopRuleConfig.RankingLoopIntervalConfig.class);
        c09dl.LJIILLIIL("ranking_offset_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, loopRuleConfig2.rankingOffsetList, LiveRankingEntranceLoopRuleConfig.RankingLoopOffsetConfig.class);
        c09dl.LJII();
    }
}
