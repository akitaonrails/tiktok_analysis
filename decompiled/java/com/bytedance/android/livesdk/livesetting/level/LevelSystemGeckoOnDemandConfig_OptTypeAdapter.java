package com.bytedance.android.livesdk.livesetting.level;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LevelSystemGeckoOnDemandConfig_OptTypeAdapter extends TypeAdapter<LevelSystemGeckoOnDemandConfig> {
    public final Gson LIZ;

    public LevelSystemGeckoOnDemandConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LevelSystemGeckoOnDemandConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LevelSystemGeckoOnDemandConfig levelSystemGeckoOnDemandConfig = new LevelSystemGeckoOnDemandConfig(0, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "delay_time")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    levelSystemGeckoOnDemandConfig.delayTime = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "channel_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    levelSystemGeckoOnDemandConfig.onDemandChannelList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return levelSystemGeckoOnDemandConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LevelSystemGeckoOnDemandConfig levelSystemGeckoOnDemandConfig) {
        LevelSystemGeckoOnDemandConfig levelSystemGeckoOnDemandConfig2 = levelSystemGeckoOnDemandConfig;
        if (levelSystemGeckoOnDemandConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("delay_time");
        c09dl.LJJJJ(Integer.valueOf(levelSystemGeckoOnDemandConfig2.delayTime));
        c09dl.LJIILLIIL("channel_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, levelSystemGeckoOnDemandConfig2.onDemandChannelList, String.class);
        c09dl.LJII();
    }
}
