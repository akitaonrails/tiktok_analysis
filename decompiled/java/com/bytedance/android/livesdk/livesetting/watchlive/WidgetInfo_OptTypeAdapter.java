package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WidgetInfo_OptTypeAdapter extends TypeAdapter<WidgetInfo> {
    public final Gson LIZ;

    public WidgetInfo_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final WidgetInfo read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        WidgetInfo widgetInfo = new WidgetInfo(null, null, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "group")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    widgetInfo.group = c09cu.LJJJZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "widgets_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    widgetInfo.widgetsList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return widgetInfo;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, WidgetInfo widgetInfo) {
        WidgetInfo widgetInfo2 = widgetInfo;
        if (widgetInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("group");
        c09dl.LJJJJJ(widgetInfo2.group);
        c09dl.LJIILLIIL("widgets_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, widgetInfo2.widgetsList, String.class);
        c09dl.LJII();
    }
}
