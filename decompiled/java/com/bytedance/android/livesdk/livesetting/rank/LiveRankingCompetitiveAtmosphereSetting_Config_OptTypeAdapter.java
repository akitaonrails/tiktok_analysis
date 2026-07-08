package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankingCompetitiveAtmosphereSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRankingCompetitiveAtmosphereSetting_Config_OptTypeAdapter extends TypeAdapter<LiveRankingCompetitiveAtmosphereSetting.Config> {
    public final Gson LIZ;

    public LiveRankingCompetitiveAtmosphereSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRankingCompetitiveAtmosphereSetting.Config read(C09CU c09cu) {
        LiveRankingCompetitiveAtmosphereSetting.Config config = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            config = new LiveRankingCompetitiveAtmosphereSetting.Config(false, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "overall_opt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.overallOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "ranking_entrance_position_opt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.rankingEntrancePositionOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
    public final void write(C09DL c09dl, LiveRankingCompetitiveAtmosphereSetting.Config config) throws IOException {
        LiveRankingCompetitiveAtmosphereSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("overall_opt");
        c09dl.LJJJJJL(config2.overallOpt);
        c09dl.LJIILLIIL("ranking_entrance_position_opt");
        c09dl.LJJJJJL(config2.rankingEntrancePositionOpt);
        c09dl.LJII();
    }
}
