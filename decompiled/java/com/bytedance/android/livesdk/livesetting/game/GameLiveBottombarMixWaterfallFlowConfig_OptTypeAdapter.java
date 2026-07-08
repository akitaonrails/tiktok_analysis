package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GameLiveBottombarMixWaterfallFlowConfig_OptTypeAdapter extends TypeAdapter<GameLiveBottombarMixWaterfallFlowConfig> {
    public final Gson LIZ;

    public GameLiveBottombarMixWaterfallFlowConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final GameLiveBottombarMixWaterfallFlowConfig read(C09CU c09cu) {
        GameLiveBottombarMixWaterfallFlowConfig gameLiveBottombarMixWaterfallFlowConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            gameLiveBottombarMixWaterfallFlowConfig = new GameLiveBottombarMixWaterfallFlowConfig(180, true);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "refresh_interval")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gameLiveBottombarMixWaterfallFlowConfig.refreshInterval = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "auto_play")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        gameLiveBottombarMixWaterfallFlowConfig.autoPlay = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return gameLiveBottombarMixWaterfallFlowConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameLiveBottombarMixWaterfallFlowConfig gameLiveBottombarMixWaterfallFlowConfig) throws IOException {
        GameLiveBottombarMixWaterfallFlowConfig gameLiveBottombarMixWaterfallFlowConfig2 = gameLiveBottombarMixWaterfallFlowConfig;
        if (gameLiveBottombarMixWaterfallFlowConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("refresh_interval");
        c09dl.LJJJJ(Integer.valueOf(gameLiveBottombarMixWaterfallFlowConfig2.refreshInterval));
        c09dl.LJIILLIIL("auto_play");
        c09dl.LJJJJJL(gameLiveBottombarMixWaterfallFlowConfig2.autoPlay);
        c09dl.LJII();
    }
}
