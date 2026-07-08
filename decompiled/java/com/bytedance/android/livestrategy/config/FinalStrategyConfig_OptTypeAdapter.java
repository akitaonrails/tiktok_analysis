package com.bytedance.android.livestrategy.config;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class FinalStrategyConfig_OptTypeAdapter extends TypeAdapter<FinalStrategyConfig> {
    public final Gson LIZ;

    public FinalStrategyConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final FinalStrategyConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        FinalStrategyConfig finalStrategyConfig = new FinalStrategyConfig("", "", null, null, null, null, null, 1L, 30L, 0L, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2092197394:
                        if (strLJJJJ.equals("rule_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                finalStrategyConfig.setRuleName(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1474213160:
                        if (strLJJJJ.equals("output_feature_group_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                finalStrategyConfig.setOutputFeatureGroup((Map) this.LIZ.LJIIIZ(new TypeToken<Map<String, Map<String, List<? extends String>>>>() { // from class: X.02xP
                                }).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -966148137:
                        if (strLJJJJ.equals("strategy_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                finalStrategyConfig.setStrategyName(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -847859781:
                        if (strLJJJJ.equals("input_params_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                finalStrategyConfig.setInputParamsKey((Map) this.LIZ.LJIIIZ(new TypeToken<Map<String, Map<String, List<? extends String>>>>() { // from class: X.02xO
                                }).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -648808775:
                        if (strLJJJJ.equals("pending_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                finalStrategyConfig.setPendingTimeout(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -467705625:
                        if (strLJJJJ.equals("strategy_input_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                finalStrategyConfig.setStrategyInputParams(C473040Igo.LIZIZ(this.LIZ, c09cu, Object.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -70199087:
                        if (strLJJJJ.equals("notify_input_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                finalStrategyConfig.setNotifyInputParams((Map) this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends List<? extends String>>>() { // from class: X.00Vm
                                }).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 3575610:
                        if (strLJJJJ.equals("type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                finalStrategyConfig.setType(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 93127292:
                        if (strLJJJJ.equals("async")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                finalStrategyConfig.setAsync(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 662766760:
                        if (strLJJJJ.equals("cel_exp")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                finalStrategyConfig.setCelExp(c09cu.LJJJZ());
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
        return finalStrategyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, FinalStrategyConfig finalStrategyConfig) throws IOException {
        FinalStrategyConfig finalStrategyConfig2 = finalStrategyConfig;
        if (finalStrategyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("strategy_name");
        c09dl.LJJJJJ(finalStrategyConfig2.getStrategyName());
        c09dl.LJIILLIIL("rule_name");
        c09dl.LJJJJJ(finalStrategyConfig2.getRuleName());
        c09dl.LJIILLIIL("cel_exp");
        c09dl.LJJJJJ(finalStrategyConfig2.getCelExp());
        c09dl.LJIILLIIL("input_params_key");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, Map<String, List<? extends String>>>>() { // from class: X.02xQ
        }).write(c09dl, finalStrategyConfig2.getInputParamsKey());
        c09dl.LJIILLIIL("strategy_input_params");
        C473040Igo.LJ(this.LIZ, c09dl, finalStrategyConfig2.getStrategyInputParams(), Object.class);
        c09dl.LJIILLIIL("notify_input_params");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends List<? extends String>>>() { // from class: X.00Vn
        }).write(c09dl, finalStrategyConfig2.getNotifyInputParams());
        c09dl.LJIILLIIL("output_feature_group_key");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, Map<String, List<? extends String>>>>() { // from class: X.02xR
        }).write(c09dl, finalStrategyConfig2.getOutputFeatureGroup());
        c09dl.LJIILLIIL("async");
        c09dl.LJJIZ(finalStrategyConfig2.getAsync());
        c09dl.LJIILLIIL("pending_timeout");
        c09dl.LJJIZ(finalStrategyConfig2.getPendingTimeout());
        c09dl.LJIILLIIL("type");
        c09dl.LJJIZ(finalStrategyConfig2.getType());
        c09dl.LJII();
    }
}
