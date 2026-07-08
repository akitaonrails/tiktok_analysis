package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.gift.GiftDevicePerformanceScoreSettings;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftDevicePerformanceScoreSettings_ScoreParams_OptTypeAdapter extends TypeAdapter<GiftDevicePerformanceScoreSettings.ScoreParams> {
    @Override // com.google.gson.TypeAdapter
    public final GiftDevicePerformanceScoreSettings.ScoreParams read(C09CU c09cu) {
        GiftDevicePerformanceScoreSettings.ScoreParams scoreParams = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            scoreParams = new GiftDevicePerformanceScoreSettings.ScoreParams(8.0f, 5.5f);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "high_end_lowest_score")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        scoreParams.highEndLowestScore = (float) c09cu.LJJIL();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "low_end_highest_score")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        scoreParams.lowEndHighestScore = (float) c09cu.LJJIL();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return scoreParams;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GiftDevicePerformanceScoreSettings.ScoreParams scoreParams) {
        GiftDevicePerformanceScoreSettings.ScoreParams scoreParams2 = scoreParams;
        if (scoreParams2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("high_end_lowest_score");
        c09dl.LJJJJ(Float.valueOf(scoreParams2.highEndLowestScore));
        c09dl.LJIILLIIL("low_end_highest_score");
        c09dl.LJJJJ(Float.valueOf(scoreParams2.lowEndHighestScore));
        c09dl.LJII();
    }
}
