package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2097608Jq;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WidgetsLoadConfig_OptTypeAdapter extends TypeAdapter<WidgetsLoadConfig> {
    public final Gson LIZ;

    public WidgetsLoadConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final WidgetsLoadConfig read(C09CU c09cu) {
        WidgetsLoadConfig widgetsLoadConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            widgetsLoadConfig = new WidgetsLoadConfig(C2097608Jq.LJ(), false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "strategies")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        widgetsLoadConfig.strategies = C473040Igo.LIZIZ(this.LIZ, c09cu, WidgetLoadStrategy.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        widgetsLoadConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return widgetsLoadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, WidgetsLoadConfig widgetsLoadConfig) throws IOException {
        WidgetsLoadConfig widgetsLoadConfig2 = widgetsLoadConfig;
        if (widgetsLoadConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("strategies");
        C473040Igo.LJ(this.LIZ, c09dl, widgetsLoadConfig2.strategies, WidgetLoadStrategy.class);
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(widgetsLoadConfig2.enable);
        c09dl.LJII();
    }
}
