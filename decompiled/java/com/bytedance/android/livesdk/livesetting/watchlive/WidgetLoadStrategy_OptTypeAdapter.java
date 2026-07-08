package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2097608Jq;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class WidgetLoadStrategy_OptTypeAdapter extends TypeAdapter<WidgetLoadStrategy> {
    public final Gson LIZ;

    public WidgetLoadStrategy_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final WidgetLoadStrategy read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        WidgetLoadStrategy widgetLoadStrategy = new WidgetLoadStrategy(C2097608Jq.LJ(), false, C2097608Jq.LJ(), C2097608Jq.LJ());
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1979981933:
                        if (strLJJJJ.equals("interval_between_priorities")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetLoadStrategy.intervalBetweenPriorities = C473040Igo.LIZIZ(this.LIZ, c09cu, Long.TYPE);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1609694147:
                        if (strLJJJJ.equals("load_core_directly")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetLoadStrategy.loadCoreDirectly = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -905848835:
                        if (strLJJJJ.equals("widgetsInfo")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetLoadStrategy.widgetsInfo = (Map) this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends List<? extends WidgetInfo>>>() { // from class: X.04Zq
                                }).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 285930456:
                        if (strLJJJJ.equals("load_until_pre_done")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                widgetLoadStrategy.loadUntilPreDone = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
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
        return widgetLoadStrategy;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, WidgetLoadStrategy widgetLoadStrategy) throws IOException {
        WidgetLoadStrategy widgetLoadStrategy2 = widgetLoadStrategy;
        if (widgetLoadStrategy2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("widgetsInfo");
        this.LIZ.LJIIIZ(new TypeToken<Map<String, ? extends List<? extends WidgetInfo>>>() { // from class: X.04Zr
        }).write(c09dl, widgetLoadStrategy2.widgetsInfo);
        c09dl.LJIILLIIL("load_core_directly");
        c09dl.LJJJJJL(widgetLoadStrategy2.loadCoreDirectly);
        c09dl.LJIILLIIL("interval_between_priorities");
        C473040Igo.LJ(this.LIZ, c09dl, widgetLoadStrategy2.intervalBetweenPriorities, Long.TYPE);
        c09dl.LJIILLIIL("load_until_pre_done");
        C473040Igo.LJ(this.LIZ, c09dl, widgetLoadStrategy2.loadUntilPreDone, String.class);
        c09dl.LJII();
    }
}
