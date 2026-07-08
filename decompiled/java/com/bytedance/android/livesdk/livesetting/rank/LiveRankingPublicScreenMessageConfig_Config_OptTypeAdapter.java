package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankingPublicScreenMessageConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveRankingPublicScreenMessageConfig_Config_OptTypeAdapter extends TypeAdapter<LiveRankingPublicScreenMessageConfig.Config> {
    public final Gson LIZ;

    public LiveRankingPublicScreenMessageConfig_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveRankingPublicScreenMessageConfig.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRankingPublicScreenMessageConfig.Config config = new LiveRankingPublicScreenMessageConfig.Config(new ArrayList(), 600, new ArrayList());
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -2067771250) {
                    if (iHashCode != 396253270) {
                        if (iHashCode == 1559534102 && strLJJJJ.equals("music_spotlight_scene_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.musicSpotlightSceneList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("frequency_control_scene_list")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            config.frequencyControlSceneList = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("frequency_control_limit_in_seconds")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        config.frequencyControlLimitInSeconds = c09cu.LJJIZ();
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
    public final void write(C09DL c09dl, LiveRankingPublicScreenMessageConfig.Config config) {
        LiveRankingPublicScreenMessageConfig.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("frequency_control_scene_list");
        Gson gson = this.LIZ;
        List<Integer> list = config2.frequencyControlSceneList;
        Class cls = Integer.TYPE;
        C473040Igo.LIZLLL(gson, c09dl, list, cls);
        c09dl.LJIILLIIL("frequency_control_limit_in_seconds");
        c09dl.LJJJJ(Integer.valueOf(config2.frequencyControlLimitInSeconds));
        c09dl.LJIILLIIL("music_spotlight_scene_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, config2.musicSpotlightSceneList, cls);
        c09dl.LJII();
    }
}
