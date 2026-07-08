package com.bytedance.android.livesdk.rank.api;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.rank.api.LiveRankingEntranceLoopRuleConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRankingEntranceLoopRuleConfig_RankingLoopIntervalConfig_OptTypeAdapter extends TypeAdapter<LiveRankingEntranceLoopRuleConfig.RankingLoopIntervalConfig> {
    public final Gson LIZ;

    public LiveRankingEntranceLoopRuleConfig_RankingLoopIntervalConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRankingEntranceLoopRuleConfig.RankingLoopIntervalConfig read(C09CU c09cu) {
        LiveRankingEntranceLoopRuleConfig.RankingLoopIntervalConfig rankingLoopIntervalConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            rankingLoopIntervalConfig = new LiveRankingEntranceLoopRuleConfig.RankingLoopIntervalConfig(-1, new ArrayList());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "rank_type")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        rankingLoopIntervalConfig.rankType = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "node_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        rankingLoopIntervalConfig.nodeList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return rankingLoopIntervalConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRankingEntranceLoopRuleConfig.RankingLoopIntervalConfig rankingLoopIntervalConfig) {
        LiveRankingEntranceLoopRuleConfig.RankingLoopIntervalConfig rankingLoopIntervalConfig2 = rankingLoopIntervalConfig;
        if (rankingLoopIntervalConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("rank_type");
        c09dl.LJJJJ(Integer.valueOf(rankingLoopIntervalConfig2.rankType));
        c09dl.LJIILLIIL("node_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, rankingLoopIntervalConfig2.nodeList, Integer.TYPE);
        c09dl.LJII();
    }
}
