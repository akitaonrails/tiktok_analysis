package com.bytedance.android.livesdk.livesetting.game;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.game.SmartGameAnchorAiStrategyControlConfigSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class SmartGameAnchorAiStrategyControlConfigSetting_AnchorStrategyConfig_OptTypeAdapter extends TypeAdapter<SmartGameAnchorAiStrategyControlConfigSetting.AnchorStrategyConfig> {
    public final Gson LIZ;

    public SmartGameAnchorAiStrategyControlConfigSetting_AnchorStrategyConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final SmartGameAnchorAiStrategyControlConfigSetting.AnchorStrategyConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        SmartGameAnchorAiStrategyControlConfigSetting.AnchorStrategyConfig anchorStrategyConfig = new SmartGameAnchorAiStrategyControlConfigSetting.AnchorStrategyConfig(false, false, false, "", 0.0f, 0.0f, 5, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1751216386:
                        if (strLJJJJ.equals("score_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                anchorStrategyConfig.scoreThreshold = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1398780193:
                        if (strLJJJJ.equals("require_server_features")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                anchorStrategyConfig.requireServerFeatures = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1353889134:
                        if (strLJJJJ.equals("enable_infer")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                anchorStrategyConfig.enableInfer = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -852599790:
                        if (strLJJJJ.equals("preload_trigger_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                anchorStrategyConfig.preloadTriggerCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 490028753:
                        if (strLJJJJ.equals("enable_data_collect")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                anchorStrategyConfig.enableDataCollect = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1540255905:
                        if (strLJJJJ.equals("enable_infer_gip")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                anchorStrategyConfig.enableInferGIP = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2010095373:
                        if (strLJJJJ.equals("score_threshold_gip")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                anchorStrategyConfig.scoreThresholdGIP = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2129294130:
                        if (strLJJJJ.equals("score_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                anchorStrategyConfig.scoreKey = c09cu.LJJJZ();
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
        return anchorStrategyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, SmartGameAnchorAiStrategyControlConfigSetting.AnchorStrategyConfig anchorStrategyConfig) throws IOException {
        SmartGameAnchorAiStrategyControlConfigSetting.AnchorStrategyConfig anchorStrategyConfig2 = anchorStrategyConfig;
        if (anchorStrategyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_infer");
        c09dl.LJJJJJL(anchorStrategyConfig2.enableInfer);
        c09dl.LJIILLIIL("enable_infer_gip");
        c09dl.LJJJJJL(anchorStrategyConfig2.enableInferGIP);
        c09dl.LJIILLIIL("enable_data_collect");
        c09dl.LJJJJJL(anchorStrategyConfig2.enableDataCollect);
        c09dl.LJIILLIIL("score_key");
        c09dl.LJJJJJ(anchorStrategyConfig2.scoreKey);
        c09dl.LJIILLIIL("score_threshold");
        c09dl.LJJJJ(Float.valueOf(anchorStrategyConfig2.scoreThreshold));
        c09dl.LJIILLIIL("score_threshold_gip");
        c09dl.LJJJJ(Float.valueOf(anchorStrategyConfig2.scoreThresholdGIP));
        c09dl.LJIILLIIL("preload_trigger_count");
        c09dl.LJJJJ(Integer.valueOf(anchorStrategyConfig2.preloadTriggerCount));
        c09dl.LJIILLIIL("require_server_features");
        c09dl.LJJJJJL(anchorStrategyConfig2.requireServerFeatures);
        c09dl.LJII();
    }
}
