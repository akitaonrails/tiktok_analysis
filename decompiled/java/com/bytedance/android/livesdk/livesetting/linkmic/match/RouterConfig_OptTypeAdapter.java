package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class RouterConfig_OptTypeAdapter extends TypeAdapter<RouterConfig> {
    public final Gson LIZ;

    public RouterConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final RouterConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RouterConfig routerConfig = new RouterConfig(null, 1, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            if (Intrinsics.LJFF(c09cu.LJJJJ(), "enter_from_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    routerConfig.enterFromList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return routerConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RouterConfig routerConfig) {
        RouterConfig routerConfig2 = routerConfig;
        if (routerConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enter_from_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, routerConfig2.enterFromList, String.class);
        c09dl.LJII();
    }
}
