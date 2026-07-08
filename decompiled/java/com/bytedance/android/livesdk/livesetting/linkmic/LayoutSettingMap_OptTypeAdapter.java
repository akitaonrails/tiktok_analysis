package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2097608Jq;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class LayoutSettingMap_OptTypeAdapter extends TypeAdapter<LayoutSettingMap> {
    public final Gson LIZ;

    public LayoutSettingMap_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LayoutSettingMap read(C09CU c09cu) {
        LayoutSettingMap layoutSettingMap = null;
        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
            layoutSettingMap = new LayoutSettingMap(C2097608Jq.LJ());
            c09cu.LIZIZ();
            while (c09cu.LJIIZILJ()) {
                if (Intrinsics.LJFF(c09cu.LJJJJ(), "setting_map")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        layoutSettingMap.map = C473040Igo.LIZIZ(this.LIZ, c09cu, VoiceLayoutParam.class);
                    } else {
                        c09cu.LJJJJJL();
                    }
                } else {
                    c09cu.LJJZ();
                }
            }
            c09cu.LJII();
        }
        return layoutSettingMap;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LayoutSettingMap layoutSettingMap) {
        LayoutSettingMap layoutSettingMap2 = layoutSettingMap;
        if (layoutSettingMap2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("setting_map");
        C473040Igo.LJ(this.LIZ, c09dl, layoutSettingMap2.map, VoiceLayoutParam.class);
        c09dl.LJII();
    }
}
