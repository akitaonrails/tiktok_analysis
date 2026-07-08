package com.bytedance.android.livesdk.rank.api;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.rank.api.LiveRankingEntranceLoopRuleConfig;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRankingEntranceLoopRuleConfig_RankingLoopOffsetConfig_OptTypeAdapter extends TypeAdapter<LiveRankingEntranceLoopRuleConfig.RankingLoopOffsetConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveRankingEntranceLoopRuleConfig.RankingLoopOffsetConfig read(C09CU c09cu) {
        LiveRankingEntranceLoopRuleConfig.RankingLoopOffsetConfig rankingLoopOffsetConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            rankingLoopOffsetConfig = new LiveRankingEntranceLoopRuleConfig.RankingLoopOffsetConfig(-1, 0);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "rank_type")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        rankingLoopOffsetConfig.rankType = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "offset")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        rankingLoopOffsetConfig.offset = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return rankingLoopOffsetConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRankingEntranceLoopRuleConfig.RankingLoopOffsetConfig rankingLoopOffsetConfig) {
        LiveRankingEntranceLoopRuleConfig.RankingLoopOffsetConfig rankingLoopOffsetConfig2 = rankingLoopOffsetConfig;
        if (rankingLoopOffsetConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("rank_type");
        c09dl.LJJJJ(Integer.valueOf(rankingLoopOffsetConfig2.rankType));
        c09dl.LJIILLIIL("offset");
        c09dl.LJJJJ(Integer.valueOf(rankingLoopOffsetConfig2.offset));
        c09dl.LJII();
    }
}
