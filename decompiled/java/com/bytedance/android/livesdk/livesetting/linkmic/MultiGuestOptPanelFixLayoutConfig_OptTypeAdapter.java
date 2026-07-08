package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiGuestOptPanelFixLayoutConfig_OptTypeAdapter extends TypeAdapter<MultiGuestOptPanelFixLayoutConfig> {
    public final Gson LIZ;

    public MultiGuestOptPanelFixLayoutConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final MultiGuestOptPanelFixLayoutConfig read(C09CU c09cu) {
        MultiGuestOptPanelFixLayoutConfig multiGuestOptPanelFixLayoutConfig = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            multiGuestOptPanelFixLayoutConfig = new MultiGuestOptPanelFixLayoutConfig(7, true);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "version")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiGuestOptPanelFixLayoutConfig.version = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "enable_layout_loading_change")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        multiGuestOptPanelFixLayoutConfig.enableLayoutLoadingChange = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return multiGuestOptPanelFixLayoutConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MultiGuestOptPanelFixLayoutConfig multiGuestOptPanelFixLayoutConfig) throws IOException {
        MultiGuestOptPanelFixLayoutConfig multiGuestOptPanelFixLayoutConfig2 = multiGuestOptPanelFixLayoutConfig;
        if (multiGuestOptPanelFixLayoutConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("version");
        c09dl.LJJJJ(Integer.valueOf(multiGuestOptPanelFixLayoutConfig2.version));
        c09dl.LJIILLIIL("enable_layout_loading_change");
        c09dl.LJJJJJL(multiGuestOptPanelFixLayoutConfig2.enableLayoutLoadingChange);
        c09dl.LJII();
    }
}
