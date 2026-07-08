package com.bytedance.android.livesdk.performancetune.strategy.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.bytedance.android.livesdk.performancetune.feature.FeatureFetchInputParams;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public final class CommonDecisionConfig_OptTypeAdapter extends TypeAdapter<CommonDecisionConfig> {
    public final Gson LIZ;

    public CommonDecisionConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final CommonDecisionConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        CommonDecisionConfig commonDecisionConfig = new CommonDecisionConfig(1, "", "", "", "", new ArrayList(), new ArrayList());
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1971145395:
                        if (strLJJJJ.equals("strategyType")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                commonDecisionConfig.setStrategyType(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1388630964:
                        if (strLJJJJ.equals("bizKey")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                commonDecisionConfig.setBizKey(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1219868225:
                        if (strLJJJJ.equals("ttmStrategyKey")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                commonDecisionConfig.setTtmStrategyKey(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1116594208:
                        if (strLJJJJ.equals("inputFeatureKeys")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                commonDecisionConfig.setInputFeatureKeys(C473040Igo.LIZ(this.LIZ, c09cu, FeatureFetchInputParams.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -868644353:
                        if (strLJJJJ.equals("inputABKeys")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                commonDecisionConfig.setInputABKeys(C473040Igo.LIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 531405632:
                        if (strLJJJJ.equals("ttmSceneKey")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                commonDecisionConfig.setTtmSceneKey(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2062163285:
                        if (strLJJJJ.equals("nativeStrategyKey")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                commonDecisionConfig.setNativeStrategyKey(c09cu.LJJJZ());
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
        return commonDecisionConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, CommonDecisionConfig commonDecisionConfig) {
        CommonDecisionConfig commonDecisionConfig2 = commonDecisionConfig;
        if (commonDecisionConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("strategyType");
        c09dl.LJJJJ(Integer.valueOf(commonDecisionConfig2.getStrategyType()));
        c09dl.LJIILLIIL("bizKey");
        c09dl.LJJJJJ(commonDecisionConfig2.getBizKey());
        c09dl.LJIILLIIL("nativeStrategyKey");
        c09dl.LJJJJJ(commonDecisionConfig2.getNativeStrategyKey());
        c09dl.LJIILLIIL("ttmSceneKey");
        c09dl.LJJJJJ(commonDecisionConfig2.getTtmSceneKey());
        c09dl.LJIILLIIL("ttmStrategyKey");
        c09dl.LJJJJJ(commonDecisionConfig2.getTtmStrategyKey());
        c09dl.LJIILLIIL("inputABKeys");
        C473040Igo.LIZLLL(this.LIZ, c09dl, commonDecisionConfig2.getInputABKeys(), String.class);
        c09dl.LJIILLIIL("inputFeatureKeys");
        C473040Igo.LIZLLL(this.LIZ, c09dl, commonDecisionConfig2.getInputFeatureKeys(), FeatureFetchInputParams.class);
        c09dl.LJII();
    }
}
