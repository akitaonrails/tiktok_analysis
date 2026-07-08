package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankingGeckoDrawableLoadingSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRankingGeckoDrawableLoadingSetting_Config_OptTypeAdapter extends TypeAdapter<LiveRankingGeckoDrawableLoadingSetting.Config> {
    public final Gson LIZ;

    public LiveRankingGeckoDrawableLoadingSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRankingGeckoDrawableLoadingSetting.Config read(C09CU c09cu) {
        LiveRankingGeckoDrawableLoadingSetting.Config config = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            config = new LiveRankingGeckoDrawableLoadingSetting.Config(true, true);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "async_loading_opt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.asyncLoadingOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "handle_null_drawable_opt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.handleNullDrawableOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
    public final void write(C09DL c09dl, LiveRankingGeckoDrawableLoadingSetting.Config config) throws IOException {
        LiveRankingGeckoDrawableLoadingSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("async_loading_opt");
        c09dl.LJJJJJL(config2.asyncLoadingOpt);
        c09dl.LJIILLIIL("handle_null_drawable_opt");
        c09dl.LJJJJJL(config2.handleNullDrawableOpt);
        c09dl.LJII();
    }
}
