package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ShortTouchWidgetRecycleConfig_OptTypeAdapter extends TypeAdapter<ShortTouchWidgetRecycleConfig> {
    public final Gson LIZ;

    public ShortTouchWidgetRecycleConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final ShortTouchWidgetRecycleConfig read(C09CU c09cu) {
        ShortTouchWidgetRecycleConfig shortTouchWidgetRecycleConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            shortTouchWidgetRecycleConfig = new ShortTouchWidgetRecycleConfig(true, true);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "view_widget")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        shortTouchWidgetRecycleConfig.viewWidgetRecycle = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "preview_widget")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        shortTouchWidgetRecycleConfig.previewWidgetRecycle = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return shortTouchWidgetRecycleConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ShortTouchWidgetRecycleConfig shortTouchWidgetRecycleConfig) throws IOException {
        ShortTouchWidgetRecycleConfig shortTouchWidgetRecycleConfig2 = shortTouchWidgetRecycleConfig;
        if (shortTouchWidgetRecycleConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("view_widget");
        c09dl.LJJJJJL(shortTouchWidgetRecycleConfig2.viewWidgetRecycle);
        c09dl.LJIILLIIL("preview_widget");
        c09dl.LJJJJJL(shortTouchWidgetRecycleConfig2.previewWidgetRecycle);
        c09dl.LJII();
    }
}
