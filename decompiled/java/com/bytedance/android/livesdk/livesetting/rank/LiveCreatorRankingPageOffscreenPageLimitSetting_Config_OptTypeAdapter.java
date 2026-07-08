package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorRankingPageOffscreenPageLimitSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveCreatorRankingPageOffscreenPageLimitSetting_Config_OptTypeAdapter extends TypeAdapter<LiveCreatorRankingPageOffscreenPageLimitSetting.Config> {
    public final Gson LIZ;

    public LiveCreatorRankingPageOffscreenPageLimitSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveCreatorRankingPageOffscreenPageLimitSetting.Config read(C09CU c09cu) {
        LiveCreatorRankingPageOffscreenPageLimitSetting.Config config = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            config = new LiveCreatorRankingPageOffscreenPageLimitSetting.Config(true, 3);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "offscreen_page_limit_opt")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.offscreenPageLimitOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "offscreen_page_limit_config")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.offscreenPageLimitConfig = c09cu.LJJIZ();
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
    public final void write(C09DL c09dl, LiveCreatorRankingPageOffscreenPageLimitSetting.Config config) throws IOException {
        LiveCreatorRankingPageOffscreenPageLimitSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("offscreen_page_limit_opt");
        c09dl.LJJJJJL(config2.offscreenPageLimitOpt);
        c09dl.LJIILLIIL("offscreen_page_limit_config");
        c09dl.LJJJJ(Integer.valueOf(config2.offscreenPageLimitConfig));
        c09dl.LJII();
    }
}
