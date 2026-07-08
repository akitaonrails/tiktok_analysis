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
public final class LiveRankingEntranceRiseAndFallAnimationConfig_Config_OptTypeAdapter extends TypeAdapter<LiveRankingEntranceRiseAndFallAnimationConfig.Config> {
    public final Gson LIZ;

    public LiveRankingEntranceRiseAndFallAnimationConfig_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRankingEntranceRiseAndFallAnimationConfig.Config read(C09CU c09cu) {
        LiveRankingEntranceRiseAndFallAnimationConfig.Config config = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            config = new LiveRankingEntranceRiseAndFallAnimationConfig.Config(new ArrayList());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "ranking_rise_and_fall_config_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.rankingRiseAndFallAnimationConfigList = C473040Igo.LIZ(this.LIZ, c09cu, LiveRankingEntranceRiseAndFallAnimationConfig.RankingRiseAndFallAnimationConfig.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRankingEntranceRiseAndFallAnimationConfig.Config config) {
        LiveRankingEntranceRiseAndFallAnimationConfig.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("ranking_rise_and_fall_config_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, config2.rankingRiseAndFallAnimationConfigList, LiveRankingEntranceRiseAndFallAnimationConfig.RankingRiseAndFallAnimationConfig.class);
        c09dl.LJII();
    }
}
