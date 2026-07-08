package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorRankingMiddaySprintConfig;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveCreatorRankingMiddaySprintConfig_Config_OptTypeAdapter extends TypeAdapter<LiveCreatorRankingMiddaySprintConfig.Config> {
    @Override // com.google.gson.TypeAdapter
    public final LiveCreatorRankingMiddaySprintConfig.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCreatorRankingMiddaySprintConfig.Config config = new LiveCreatorRankingMiddaySprintConfig.Config(-1, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "rank_type")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    config.rankType = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "midday_sprint_duration_in_seconds")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    config.middaySprintDurationInSeconds = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCreatorRankingMiddaySprintConfig.Config config) throws IOException {
        LiveCreatorRankingMiddaySprintConfig.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("rank_type");
        c09dl.LJJJJ(Integer.valueOf(config2.rankType));
        c09dl.LJIILLIIL("midday_sprint_duration_in_seconds");
        c09dl.LJJIZ(config2.middaySprintDurationInSeconds);
        c09dl.LJII();
    }
}
