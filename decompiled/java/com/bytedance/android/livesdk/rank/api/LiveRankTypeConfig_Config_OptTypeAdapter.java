package com.bytedance.android.livesdk.rank.api;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.rank.api.LiveRankTypeConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRankTypeConfig_Config_OptTypeAdapter extends TypeAdapter<LiveRankTypeConfig.Config> {
    public final Gson LIZ;

    public LiveRankTypeConfig_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRankTypeConfig.Config read(C09CU c09cu) {
        LiveRankTypeConfig.Config config = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            config = new LiveRankTypeConfig.Config(new ArrayList());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "rank_types")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.rankTypeList = C473040Igo.LIZ(this.LIZ, c09cu, RankTypeV2.class);
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
    public final void write(C09DL c09dl, LiveRankTypeConfig.Config config) {
        LiveRankTypeConfig.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("rank_types");
        C473040Igo.LIZLLL(this.LIZ, c09dl, config2.rankTypeList, RankTypeV2.class);
        c09dl.LJII();
    }
}
