package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class PanelStyle_OptTypeAdapter extends TypeAdapter<PanelStyle> {
    public final Gson LIZ;

    public PanelStyle_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final PanelStyle read(C09CU c09cu) {
        PanelStyle panelStyle = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            panelStyle = new PanelStyle(0, false);
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                String strLJJJJ = c09cu.LJJJJ();
                if (Intrinsics.LJFF(strLJJJJ, "panel_type")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        panelStyle.panelType = c09cu.LJJIZ();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else if (Intrinsics.LJFF(strLJJJJ, "show_view_more")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        panelStyle.showViewMore = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return panelStyle;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, PanelStyle panelStyle) throws IOException {
        PanelStyle panelStyle2 = panelStyle;
        if (panelStyle2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("panel_type");
        c09dl.LJJJJ(Integer.valueOf(panelStyle2.panelType));
        c09dl.LJIILLIIL("show_view_more");
        c09dl.LJJJJJL(panelStyle2.showViewMore);
        c09dl.LJII();
    }
}
