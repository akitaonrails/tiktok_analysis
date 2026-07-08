package com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PreloadSceneEventTrigger_OptTypeAdapter extends TypeAdapter<PreloadSceneEventTrigger> {
    public final Gson LIZ;

    public PreloadSceneEventTrigger_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PreloadSceneEventTrigger read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        PreloadSceneEventTrigger preloadSceneEventTrigger = new PreloadSceneEventTrigger(null, null, null, 7, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1449808438) {
                    if (iHashCode != 984174864) {
                        if (iHashCode == 1331390314 && strLJJJJ.equals("param_filter")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                preloadSceneEventTrigger.filterParam = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("event_name")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            preloadSceneEventTrigger.eventName = c09cu.LJJJZ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("strategy_key_list")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        preloadSceneEventTrigger.strategyKeyList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return preloadSceneEventTrigger;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PreloadSceneEventTrigger preloadSceneEventTrigger) {
        PreloadSceneEventTrigger preloadSceneEventTrigger2 = preloadSceneEventTrigger;
        if (preloadSceneEventTrigger2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("event_name");
        c09dl.LJJJJJ(preloadSceneEventTrigger2.eventName);
        c09dl.LJIILLIIL("param_filter");
        C473040Igo.LJ(this.LIZ, c09dl, preloadSceneEventTrigger2.filterParam, String.class);
        c09dl.LJIILLIIL("strategy_key_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, preloadSceneEventTrigger2.strategyKeyList, String.class);
        c09dl.LJII();
    }
}
