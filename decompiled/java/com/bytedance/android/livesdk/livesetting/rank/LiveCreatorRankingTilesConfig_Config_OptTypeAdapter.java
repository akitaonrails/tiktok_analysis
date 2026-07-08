package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorRankingTilesConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveCreatorRankingTilesConfig_Config_OptTypeAdapter extends TypeAdapter<LiveCreatorRankingTilesConfig.Config> {
    public final Gson LIZ;

    public LiveCreatorRankingTilesConfig_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveCreatorRankingTilesConfig.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveCreatorRankingTilesConfig.Config config = new LiveCreatorRankingTilesConfig.Config(false, new ArrayList(), "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1300351026) {
                    if (iHashCode != -1276113983) {
                        if (iHashCode == 1538532966 && strLJJJJ.equals("available_rank_type_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.availableRankTypeList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("overall_opt")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            config.overallOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("ranking_tiles_page_schema")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.rankingTilesPageSchema = c09cu.LJJJZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveCreatorRankingTilesConfig.Config config) throws IOException {
        LiveCreatorRankingTilesConfig.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("overall_opt");
        c09dl.LJJJJJL(config2.overallOpt);
        c09dl.LJIILLIIL("available_rank_type_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, config2.availableRankTypeList, Integer.TYPE);
        c09dl.LJIILLIIL("ranking_tiles_page_schema");
        c09dl.LJJJJJ(config2.rankingTilesPageSchema);
        c09dl.LJII();
    }
}
