package com.bytedance.android.livesdk.chatroom.ui.widgetload.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WidgetLoadOptConfig_OptTypeAdapter extends TypeAdapter<WidgetLoadOptConfig> {
    public final Gson LIZ;

    public WidgetLoadOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final WidgetLoadOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        WidgetLoadOptConfig widgetLoadOptConfig = new WidgetLoadOptConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "config")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    widgetLoadOptConfig.phaseConfig = C473040Igo.LIZIZ(this.LIZ, c09cu, WidgetPhaseInfo.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return widgetLoadOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, WidgetLoadOptConfig widgetLoadOptConfig) {
        WidgetLoadOptConfig widgetLoadOptConfig2 = widgetLoadOptConfig;
        if (widgetLoadOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("config");
        C473040Igo.LJ(this.LIZ, c09dl, widgetLoadOptConfig2.phaseConfig, WidgetPhaseInfo.class);
        c09dl.LJII();
    }
}
