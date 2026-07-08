package com.bytedance.android.livesdk.livesetting.grouplive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class GroupLiveConfigModel_OptTypeAdapter extends TypeAdapter<GroupLiveConfigModel> {
    public final Gson LIZ;

    public GroupLiveConfigModel_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GroupLiveConfigModel read(C09CU c09cu) {
        GroupLiveConfigModel groupLiveConfigModel = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            groupLiveConfigModel = new GroupLiveConfigModel(new TimedCompetitionConfigModel(10, 2, 5, 2), new RankingPanelConfigModel(3, -1L));
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "match_config")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        groupLiveConfigModel.matchConfig = (TimedCompetitionConfigModel) this.LIZ.LJIIJ(TimedCompetitionConfigModel.class).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "ranking_panel_config")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        groupLiveConfigModel.rankingPanelConfig = (RankingPanelConfigModel) this.LIZ.LJIIJ(RankingPanelConfigModel.class).read(c09cu);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return groupLiveConfigModel;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GroupLiveConfigModel groupLiveConfigModel) {
        GroupLiveConfigModel groupLiveConfigModel2 = groupLiveConfigModel;
        if (groupLiveConfigModel2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("match_config");
        this.LIZ.LJIIJ(TimedCompetitionConfigModel.class).write(c09dl, groupLiveConfigModel2.matchConfig);
        c09dl.LJIILLIIL("ranking_panel_config");
        this.LIZ.LJIIJ(RankingPanelConfigModel.class).write(c09dl, groupLiveConfigModel2.rankingPanelConfig);
        c09dl.LJII();
    }
}
