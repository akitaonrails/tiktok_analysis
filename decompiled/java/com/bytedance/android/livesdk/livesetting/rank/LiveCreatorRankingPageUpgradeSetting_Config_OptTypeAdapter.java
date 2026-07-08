package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorRankingPageUpgradeSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveCreatorRankingPageUpgradeSetting_Config_OptTypeAdapter extends TypeAdapter<LiveCreatorRankingPageUpgradeSetting.Config> {
    public final Gson LIZ;

    public LiveCreatorRankingPageUpgradeSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveCreatorRankingPageUpgradeSetting.Config read(C09CU c09cu) {
        LiveCreatorRankingPageUpgradeSetting.Config config = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            config = new LiveCreatorRankingPageUpgradeSetting.Config(true, C1697810uHb.LJIILJJIL(34));
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "overall_opt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.overallOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "available_rank_type_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.availableRankTypeList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
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
    public final void write(C09DL c09dl, LiveCreatorRankingPageUpgradeSetting.Config config) throws IOException {
        LiveCreatorRankingPageUpgradeSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("overall_opt");
        c09dl.LJJJJJL(config2.overallOpt);
        c09dl.LJIILLIIL("available_rank_type_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, config2.availableRankTypeList, Integer.TYPE);
        c09dl.LJII();
    }
}
