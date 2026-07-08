package com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PreloadSceneConfig_OptTypeAdapter extends TypeAdapter<PreloadSceneConfig> {
    public final Gson LIZ;

    public PreloadSceneConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final PreloadSceneConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PreloadSceneConfig preloadSceneConfig = new PreloadSceneConfig(null, null, null, 0, 15, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1970829680:
                        if (strLJJJJ.equals("strategy_map")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadSceneConfig.strategyMap = C473040Igo.LIZIZ(this.LIZ, c09cu, PreloadStrategyConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -188207537:
                        if (strLJJJJ.equals("event_trigger_config_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadSceneConfig.configList = C473040Igo.LIZ(this.LIZ, c09cu, PreloadSceneEventTrigger.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 746261101:
                        if (strLJJJJ.equals("report_sampling_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadSceneConfig.reportSamplingRate = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1729675308:
                        if (strLJJJJ.equals("scene_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadSceneConfig.sceneKey = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return preloadSceneConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PreloadSceneConfig preloadSceneConfig) {
        PreloadSceneConfig preloadSceneConfig2 = preloadSceneConfig;
        if (preloadSceneConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("scene_key");
        c09dl.LJJJJJ(preloadSceneConfig2.sceneKey);
        c09dl.LJIILLIIL("strategy_map");
        C473040Igo.LJ(this.LIZ, c09dl, preloadSceneConfig2.strategyMap, PreloadStrategyConfig.class);
        c09dl.LJIILLIIL("event_trigger_config_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, preloadSceneConfig2.configList, PreloadSceneEventTrigger.class);
        c09dl.LJIILLIIL("report_sampling_rate");
        c09dl.LJJJJ(Integer.valueOf(preloadSceneConfig2.reportSamplingRate));
        c09dl.LJII();
    }
}
