package com.bytedance.android.livesdk.rank.api;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.rank.api.RankingIconSetting;
import com.bytedance.scene.Scene;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes28.dex */
public final class RankingIconSetting_RankingIconConfig_OptTypeAdapter extends TypeAdapter<RankingIconSetting.RankingIconConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final RankingIconSetting.RankingIconConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RankingIconSetting.RankingIconConfig rankingIconConfig = new RankingIconSetting.RankingIconConfig(-1, -1, -1, "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1655945086:
                        if (strLJJJJ.equals("gecko_resource_channel_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingIconConfig.geckoResourceChannelName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -644120851:
                        if (strLJJJJ.equals("rank_group_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingIconConfig.rankGroupType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -641681555:
                        if (strLJJJJ.equals("rank_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingIconConfig.rankType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -581974765:
                        if (strLJJJJ.equals("gecko_resource_file_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingIconConfig.geckoResourceFileName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 109254796:
                        if (strLJJJJ.equals(Scene.SCENE_SERVICE)) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                rankingIconConfig.scene = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return rankingIconConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RankingIconSetting.RankingIconConfig rankingIconConfig) {
        RankingIconSetting.RankingIconConfig rankingIconConfig2 = rankingIconConfig;
        if (rankingIconConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("rank_group_type");
        c09dl.LJJJJ(Integer.valueOf(rankingIconConfig2.rankGroupType));
        c09dl.LJIILLIIL("rank_type");
        c09dl.LJJJJ(Integer.valueOf(rankingIconConfig2.rankType));
        c09dl.LJIILLIIL(Scene.SCENE_SERVICE);
        c09dl.LJJJJ(Integer.valueOf(rankingIconConfig2.scene));
        c09dl.LJIILLIIL("gecko_resource_channel_name");
        c09dl.LJJJJJ(rankingIconConfig2.geckoResourceChannelName);
        c09dl.LJIILLIIL("gecko_resource_file_name");
        c09dl.LJJJJJ(rankingIconConfig2.geckoResourceFileName);
        c09dl.LJII();
    }
}
