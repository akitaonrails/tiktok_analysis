package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.RankEntranceLoopInterval;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class RankEntranceLoopInterval_Config_OptTypeAdapter extends TypeAdapter<RankEntranceLoopInterval.Config> {
    @Override // com.google.gson.TypeAdapter
    public final RankEntranceLoopInterval.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RankEntranceLoopInterval.Config config = new RankEntranceLoopInterval.Config(Mp4ScreenVideoLoadTimeout.CONTROL, 15000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "rank_loop_interval")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    config.rankLoopInterval = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "rank_loop_time_limit")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    config.rankLoopTimeLimit = c09cu.LJJJ();
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
    public final void write(C09DL c09dl, RankEntranceLoopInterval.Config config) throws IOException {
        RankEntranceLoopInterval.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("rank_loop_interval");
        c09dl.LJJIZ(config2.rankLoopInterval);
        c09dl.LJIILLIIL("rank_loop_time_limit");
        c09dl.LJJIZ(config2.rankLoopTimeLimit);
        c09dl.LJII();
    }
}
