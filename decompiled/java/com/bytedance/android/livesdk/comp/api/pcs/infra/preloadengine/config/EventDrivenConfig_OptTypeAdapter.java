package com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2097608Jq;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes18.dex */
public final class EventDrivenConfig_OptTypeAdapter extends TypeAdapter<EventDrivenConfig> {
    public final Gson LIZ;

    public EventDrivenConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final EventDrivenConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        EventDrivenConfig eventDrivenConfig = new EventDrivenConfig("", false, "", 0, null, C2097608Jq.LJ(), new LinkedHashMap());
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1354792126:
                        if (strLJJJJ.equals("config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                eventDrivenConfig.config = (PreloadActionConfig) this.LIZ.LJIIJ(PreloadActionConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -861311717:
                        if (strLJJJJ.equals("condition")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                eventDrivenConfig.condition = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -188130180:
                        if (strLJJJJ.equals("preload_params")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                eventDrivenConfig.preloadParams = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -16459455:
                        if (strLJJJJ.equals("is_custom_event")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                eventDrivenConfig.isCustomEvent = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 96891546:
                        if (strLJJJJ.equals("event")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                eventDrivenConfig.event = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1599944624:
                        if (strLJJJJ.equals("preload_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                eventDrivenConfig.preloadType = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1787798387:
                        if (strLJJJJ.equals("strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                eventDrivenConfig.strategy = c09cu.LJJJZ();
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
        return eventDrivenConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, EventDrivenConfig eventDrivenConfig) throws IOException {
        EventDrivenConfig eventDrivenConfig2 = eventDrivenConfig;
        if (eventDrivenConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("event");
        c09dl.LJJJJJ(eventDrivenConfig2.event);
        c09dl.LJIILLIIL("is_custom_event");
        c09dl.LJJJJJL(eventDrivenConfig2.isCustomEvent);
        c09dl.LJIILLIIL("strategy");
        c09dl.LJJJJJ(eventDrivenConfig2.strategy);
        c09dl.LJIILLIIL("preload_type");
        c09dl.LJJJJ(Integer.valueOf(eventDrivenConfig2.preloadType));
        c09dl.LJIILLIIL("config");
        this.LIZ.LJIIJ(PreloadActionConfig.class).write(c09dl, eventDrivenConfig2.config);
        c09dl.LJIILLIIL("condition");
        C473040Igo.LJ(this.LIZ, c09dl, eventDrivenConfig2.condition, String.class);
        c09dl.LJIILLIIL("preload_params");
        C473040Igo.LJ(this.LIZ, c09dl, eventDrivenConfig2.preloadParams, String.class);
        c09dl.LJII();
    }
}
