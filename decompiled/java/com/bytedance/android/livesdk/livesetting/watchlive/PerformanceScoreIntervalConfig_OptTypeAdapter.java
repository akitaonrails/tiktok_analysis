package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PerformanceScoreIntervalConfig_OptTypeAdapter extends TypeAdapter<PerformanceScoreIntervalConfig> {
    @Override // com.google.gson.TypeAdapter
    public final PerformanceScoreIntervalConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PerformanceScoreIntervalConfig performanceScoreIntervalConfig = new PerformanceScoreIntervalConfig(0.0f, Float.MAX_VALUE, 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -416596580) {
                    if (iHashCode != -234837001) {
                        if (iHashCode == 537641573 && strLJJJJ.equals("min_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                performanceScoreIntervalConfig.setMinScore((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("max_score")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            performanceScoreIntervalConfig.setMaxScore((float) c09cu.LJJIL());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("delay_time_ms")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        performanceScoreIntervalConfig.setDelayTimeMs(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return performanceScoreIntervalConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PerformanceScoreIntervalConfig performanceScoreIntervalConfig) {
        PerformanceScoreIntervalConfig performanceScoreIntervalConfig2 = performanceScoreIntervalConfig;
        if (performanceScoreIntervalConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("min_score");
        c09dl.LJJJJ(Float.valueOf(performanceScoreIntervalConfig2.getMinScore()));
        c09dl.LJIILLIIL("max_score");
        c09dl.LJJJJ(Float.valueOf(performanceScoreIntervalConfig2.getMaxScore()));
        c09dl.LJIILLIIL("delay_time_ms");
        c09dl.LJJJJ(Integer.valueOf(performanceScoreIntervalConfig2.getDelayTimeMs()));
        c09dl.LJII();
    }
}
