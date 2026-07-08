package com.bytedance.android.livesdk.rank.api;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.rank.api.LiveRankingEntranceRiseAndFallAnimationConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRankingEntranceRiseAndFallAnimationConfig_RankingRiseAndFallAnimationConfig_OptTypeAdapter extends TypeAdapter<LiveRankingEntranceRiseAndFallAnimationConfig.RankingRiseAndFallAnimationConfig> {
    public final Gson LIZ;

    public LiveRankingEntranceRiseAndFallAnimationConfig_RankingRiseAndFallAnimationConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRankingEntranceRiseAndFallAnimationConfig.RankingRiseAndFallAnimationConfig read(C09CU c09cu) {
        LiveRankingEntranceRiseAndFallAnimationConfig.RankingRiseAndFallAnimationConfig rankingRiseAndFallAnimationConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            rankingRiseAndFallAnimationConfig = new LiveRankingEntranceRiseAndFallAnimationConfig.RankingRiseAndFallAnimationConfig(-1, new ArrayList());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "rank_type")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        rankingRiseAndFallAnimationConfig.rankType = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "rise_animation_ranking_milestone_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        rankingRiseAndFallAnimationConfig.riseAnimationRankingMilestoneList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return rankingRiseAndFallAnimationConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRankingEntranceRiseAndFallAnimationConfig.RankingRiseAndFallAnimationConfig rankingRiseAndFallAnimationConfig) {
        LiveRankingEntranceRiseAndFallAnimationConfig.RankingRiseAndFallAnimationConfig rankingRiseAndFallAnimationConfig2 = rankingRiseAndFallAnimationConfig;
        if (rankingRiseAndFallAnimationConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("rank_type");
        c09dl.LJJJJ(Integer.valueOf(rankingRiseAndFallAnimationConfig2.rankType));
        c09dl.LJIILLIIL("rise_animation_ranking_milestone_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, rankingRiseAndFallAnimationConfig2.riseAnimationRankingMilestoneList, Integer.TYPE);
        c09dl.LJII();
    }
}
