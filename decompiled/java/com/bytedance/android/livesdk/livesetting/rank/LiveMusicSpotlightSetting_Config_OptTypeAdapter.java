package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.LiveMusicSpotlightSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMusicSpotlightSetting_Config_OptTypeAdapter extends TypeAdapter<LiveMusicSpotlightSetting.Config> {
    public final Gson LIZ;

    public LiveMusicSpotlightSetting_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMusicSpotlightSetting.Config read(C09CU c09cu) {
        LiveMusicSpotlightSetting.Config config = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            config = new LiveMusicSpotlightSetting.Config(false, 3);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "is_music_spotlight_enabled")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.isMusicSpotlightEnabled = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "available_rankings_upper_limit")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.availableRankingsUpperLimit = c09cu.LJJIZ();
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
    public final void write(C09DL c09dl, LiveMusicSpotlightSetting.Config config) throws IOException {
        LiveMusicSpotlightSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_music_spotlight_enabled");
        c09dl.LJJJJJL(config2.isMusicSpotlightEnabled);
        c09dl.LJIILLIIL("available_rankings_upper_limit");
        c09dl.LJJJJ(Integer.valueOf(config2.availableRankingsUpperLimit));
        c09dl.LJII();
    }
}
