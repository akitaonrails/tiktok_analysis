package com.bytedance.android.livesdk.rank.api;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.rank.api.LiveRankingEntranceLoopRuleConfig;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRankingEntranceLoopRuleConfig_RankingLoopPriorityConfig_OptTypeAdapter extends TypeAdapter<LiveRankingEntranceLoopRuleConfig.RankingLoopPriorityConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveRankingEntranceLoopRuleConfig.RankingLoopPriorityConfig read(C09CU c09cu) {
        LiveRankingEntranceLoopRuleConfig.RankingLoopPriorityConfig rankingLoopPriorityConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            rankingLoopPriorityConfig = new LiveRankingEntranceLoopRuleConfig.RankingLoopPriorityConfig(-1, Integer.MAX_VALUE);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "rank_type")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        rankingLoopPriorityConfig.rankType = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "priority")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        rankingLoopPriorityConfig.priority = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return rankingLoopPriorityConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRankingEntranceLoopRuleConfig.RankingLoopPriorityConfig rankingLoopPriorityConfig) {
        LiveRankingEntranceLoopRuleConfig.RankingLoopPriorityConfig rankingLoopPriorityConfig2 = rankingLoopPriorityConfig;
        if (rankingLoopPriorityConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("rank_type");
        c09dl.LJJJJ(Integer.valueOf(rankingLoopPriorityConfig2.rankType));
        c09dl.LJIILLIIL("priority");
        c09dl.LJJJJ(Integer.valueOf(rankingLoopPriorityConfig2.priority));
        c09dl.LJII();
    }
}
