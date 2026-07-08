package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchItemUseGuideStrategySetting;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class MatchItemUseGuideStrategySetting_MatchItemGuideConfig_OptTypeAdapter extends TypeAdapter<MatchItemUseGuideStrategySetting.MatchItemGuideConfig> {
    @Override // com.google.gson.TypeAdapter
    public final MatchItemUseGuideStrategySetting.MatchItemGuideConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MatchItemUseGuideStrategySetting.MatchItemGuideConfig matchItemGuideConfig = new MatchItemUseGuideStrategySetting.MatchItemGuideConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "group")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    matchItemGuideConfig.group = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "minimum_display_interval")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    matchItemGuideConfig.minDisplayInterval = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return matchItemGuideConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MatchItemUseGuideStrategySetting.MatchItemGuideConfig matchItemGuideConfig) throws IOException {
        MatchItemUseGuideStrategySetting.MatchItemGuideConfig matchItemGuideConfig2 = matchItemGuideConfig;
        if (matchItemGuideConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("group");
        c09dl.LJJJJ(Integer.valueOf(matchItemGuideConfig2.group));
        c09dl.LJIILLIIL("minimum_display_interval");
        c09dl.LJJIZ(matchItemGuideConfig2.minDisplayInterval);
        c09dl.LJII();
    }
}
