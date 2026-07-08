package com.bytedance.android.livesdk.chatroom.ui.widgetload.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class WidgetFunctionInfo_OptTypeAdapter extends TypeAdapter<WidgetFunctionInfo> {
    public final Gson LIZ;

    public WidgetFunctionInfo_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final WidgetFunctionInfo read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        WidgetFunctionInfo widgetFunctionInfo = new WidgetFunctionInfo("", null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "function")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    widgetFunctionInfo.funcName = c09cu.LJJJZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "banned_scene")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    widgetFunctionInfo.bannedScene = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return widgetFunctionInfo;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, WidgetFunctionInfo widgetFunctionInfo) {
        WidgetFunctionInfo widgetFunctionInfo2 = widgetFunctionInfo;
        if (widgetFunctionInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("function");
        c09dl.LJJJJJ(widgetFunctionInfo2.funcName);
        c09dl.LJIILLIIL("banned_scene");
        C473040Igo.LIZLLL(this.LIZ, c09dl, widgetFunctionInfo2.bannedScene, String.class);
        c09dl.LJII();
    }
}
