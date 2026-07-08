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
public final class TriggerStrategyConfig_OptTypeAdapter extends TypeAdapter<TriggerStrategyConfig> {
    public final Gson LIZ;

    public TriggerStrategyConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TriggerStrategyConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TriggerStrategyConfig triggerStrategyConfig = new TriggerStrategyConfig("", "", 1L, 0L, null, null, null, null, null, null, null, null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2092197394:
                        if (strLJJJJ.equals("rule_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                triggerStrategyConfig.setRuleName(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1474213160:
                        if (strLJJJJ.equals("output_feature_group_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                triggerStrategyConfig.setOutputFeatureGroup((Map) this.LIZ.LJIIIZ(new TypeToken<Map<String, Map<String, List<? extends String>>>>() { // from class: X.02xT
                                }).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1422950858:
                        if (strLJJJJ.equals("action")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                triggerStrategyConfig.setAction(C473040Igo.LIZIZ(this.LIZ, c09cu, Object.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1248001709:
                        if (strLJJJJ.equals("trigger_event")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                triggerStrategyConfig.setTriggerEvent(C473040Igo.LIZIZ(this.LIZ, c09cu, Object.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -966148137:
                        if (strLJJJJ.equals("strategy_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                triggerStrategyConfig.setStrategyName(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -847859781:
                        if (strLJJJJ.equals("input_params_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                triggerStrategyConfig.setInputParamsKey((Map) this.LIZ.LJIIIZ(new TypeToken<Map<String, Map<String, List<? extends String>>>>() { // from class: X.02xS
                                }).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -636469393:
                        if (strLJJJJ.equals("trigger_feature")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                triggerStrategyConfig.setTriggerFeature((Map) this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends List<? extends String>>>() { // from class: X.00Vo
                                }).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -70199087:
                        if (strLJJJJ.equals("notify_input_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                triggerStrategyConfig.setNotifyInputParams((Map) this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends List<? extends String>>>() { // from class: X.00Vp
                                }).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 115181:
                        if (strLJJJJ.equals("ttm")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                triggerStrategyConfig.setTtm(C473040Igo.LIZIZ(this.LIZ, c09cu, String.class));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 3575610:
                        if (strLJJJJ.equals("type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                triggerStrategyConfig.setType(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 93127292:
                        if (strLJJJJ.equals("async")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                triggerStrategyConfig.setAsync(c09cu.LJJJ());
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
        return triggerStrategyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TriggerStrategyConfig triggerStrategyConfig) throws IOException {
        TriggerStrategyConfig triggerStrategyConfig2 = triggerStrategyConfig;
        if (triggerStrategyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("strategy_name");
        c09dl.LJJJJJ(triggerStrategyConfig2.getStrategyName());
        c09dl.LJIILLIIL("rule_name");
        c09dl.LJJJJJ(triggerStrategyConfig2.getRuleName());
        c09dl.LJIILLIIL("async");
        c09dl.LJJIZ(triggerStrategyConfig2.getAsync());
        c09dl.LJIILLIIL("type");
        c09dl.LJJIZ(triggerStrategyConfig2.getType());
        c09dl.LJIILLIIL("input_params_key");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, Map<String, List<? extends String>>>>() { // from class: X.02xU
        }).write(c09dl, triggerStrategyConfig2.getInputParamsKey());
        c09dl.LJIILLIIL("trigger_feature");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends List<? extends String>>>() { // from class: X.00Vq
        }).write(c09dl, triggerStrategyConfig2.getTriggerFeature());
        c09dl.LJIILLIIL("notify_input_params");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends List<? extends String>>>() { // from class: X.00Vr
        }).write(c09dl, triggerStrategyConfig2.getNotifyInputParams());
        c09dl.LJIILLIIL("output_feature_group_key");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, Map<String, List<? extends String>>>>() { // from class: X.02xV
        }).write(c09dl, triggerStrategyConfig2.getOutputFeatureGroup());
        c09dl.LJIILLIIL("ttm");
        C473040Igo.LJ(this.LIZ, c09dl, triggerStrategyConfig2.getTtm(), String.class);
        c09dl.LJIILLIIL("action");
        C473040Igo.LJ(this.LIZ, c09dl, triggerStrategyConfig2.getAction(), Object.class);
        c09dl.LJIILLIIL("trigger_event");
        C473040Igo.LJ(this.LIZ, c09dl, triggerStrategyConfig2.getTriggerEvent(), Object.class);
        c09dl.LJII();
    }
}
