package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.game.SmartPreviewGameMomentAiConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class SmartPreviewGameMomentAiConfigSetting_SmartPreviewGameMomentAIConfig_OptTypeAdapter extends TypeAdapter<SmartPreviewGameMomentAiConfigSetting.SmartPreviewGameMomentAIConfig> {
    public final Gson LIZ;

    public SmartPreviewGameMomentAiConfigSetting_SmartPreviewGameMomentAIConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final SmartPreviewGameMomentAiConfigSetting.SmartPreviewGameMomentAIConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SmartPreviewGameMomentAiConfigSetting.SmartPreviewGameMomentAIConfig smartPreviewGameMomentAIConfig = new SmartPreviewGameMomentAiConfigSetting.SmartPreviewGameMomentAIConfig(false, false, true, 5, 0.6f, 1);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1903736198:
                        if (strLJJJJ.equals("show_freq")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                smartPreviewGameMomentAIConfig.showFreq = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1751216386:
                        if (strLJJJJ.equals("score_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                smartPreviewGameMomentAIConfig.scoreThreshold = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1453819822:
                        if (strLJJJJ.equals("feature_collect_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                smartPreviewGameMomentAIConfig.featureCollectSwitch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -889473228:
                        if (strLJJJJ.equals("switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                smartPreviewGameMomentAIConfig.f30switch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 122833210:
                        if (strLJJJJ.equals("history_data_show_num_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                smartPreviewGameMomentAIConfig.historyDataShowNumThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 946177310:
                        if (strLJJJJ.equals("data_collect_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                smartPreviewGameMomentAIConfig.dataCollectSwitch = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return smartPreviewGameMomentAIConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SmartPreviewGameMomentAiConfigSetting.SmartPreviewGameMomentAIConfig smartPreviewGameMomentAIConfig) throws IOException {
        SmartPreviewGameMomentAiConfigSetting.SmartPreviewGameMomentAIConfig smartPreviewGameMomentAIConfig2 = smartPreviewGameMomentAIConfig;
        if (smartPreviewGameMomentAIConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("switch");
        c09dl.LJJJJJL(smartPreviewGameMomentAIConfig2.f30switch);
        c09dl.LJIILLIIL("feature_collect_switch");
        c09dl.LJJJJJL(smartPreviewGameMomentAIConfig2.featureCollectSwitch);
        c09dl.LJIILLIIL("data_collect_switch");
        c09dl.LJJJJJL(smartPreviewGameMomentAIConfig2.dataCollectSwitch);
        c09dl.LJIILLIIL("history_data_show_num_threshold");
        c09dl.LJJJJ(Integer.valueOf(smartPreviewGameMomentAIConfig2.historyDataShowNumThreshold));
        c09dl.LJIILLIIL("score_threshold");
        c09dl.LJJJJ(Float.valueOf(smartPreviewGameMomentAIConfig2.scoreThreshold));
        c09dl.LJIILLIIL("show_freq");
        c09dl.LJJJJ(Integer.valueOf(smartPreviewGameMomentAIConfig2.showFreq));
        c09dl.LJII();
    }
}
