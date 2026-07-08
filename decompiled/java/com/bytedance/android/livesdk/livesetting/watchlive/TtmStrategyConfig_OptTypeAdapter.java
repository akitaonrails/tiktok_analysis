package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class TtmStrategyConfig_OptTypeAdapter extends TypeAdapter<TtmStrategyConfig> {
    public final Gson LIZ;

    public TtmStrategyConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final TtmStrategyConfig read(C09CU c09cu) {
        TtmStrategyConfig ttmStrategyConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            ttmStrategyConfig = new TtmStrategyConfig(false, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        ttmStrategyConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "cold_start_single_request")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        ttmStrategyConfig.coldStartSingleRequest = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return ttmStrategyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TtmStrategyConfig ttmStrategyConfig) throws IOException {
        TtmStrategyConfig ttmStrategyConfig2 = ttmStrategyConfig;
        if (ttmStrategyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(ttmStrategyConfig2.enable);
        c09dl.LJIILLIIL("cold_start_single_request");
        c09dl.LJJJJJL(ttmStrategyConfig2.coldStartSingleRequest);
        c09dl.LJII();
    }
}
