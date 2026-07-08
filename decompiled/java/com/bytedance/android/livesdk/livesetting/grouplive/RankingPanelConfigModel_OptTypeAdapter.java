package com.bytedance.android.livesdk.livesetting.grouplive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class RankingPanelConfigModel_OptTypeAdapter extends TypeAdapter<RankingPanelConfigModel> {
    @Override // com.google.gson.TypeAdapter
    public final RankingPanelConfigModel read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RankingPanelConfigModel rankingPanelConfigModel = new RankingPanelConfigModel(3, -1L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "max_visible_members")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    rankingPanelConfigModel.maxVisibleMembers = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "throttle_interval_duration")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    rankingPanelConfigModel.throttleIntervalDuration = c09cu.LJJJ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return rankingPanelConfigModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RankingPanelConfigModel rankingPanelConfigModel) throws IOException {
        RankingPanelConfigModel rankingPanelConfigModel2 = rankingPanelConfigModel;
        if (rankingPanelConfigModel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("max_visible_members");
        c09dl.LJJJJ(Integer.valueOf(rankingPanelConfigModel2.maxVisibleMembers));
        c09dl.LJIILLIIL("throttle_interval_duration");
        c09dl.LJJIZ(rankingPanelConfigModel2.throttleIntervalDuration);
        c09dl.LJII();
    }
}
