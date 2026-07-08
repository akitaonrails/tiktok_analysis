package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.GameDualDeviceParamsSetting;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class GameDualDeviceParamsSetting_DualDeviceParamSetting_OptTypeAdapter extends TypeAdapter<GameDualDeviceParamsSetting.DualDeviceParamSetting> {
    @Override // com.google.gson.TypeAdapter
    public final GameDualDeviceParamsSetting.DualDeviceParamSetting read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        GameDualDeviceParamsSetting.DualDeviceParamSetting dualDeviceParamSetting = new GameDualDeviceParamsSetting.DualDeviceParamSetting();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "width")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    dualDeviceParamSetting.width = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "height")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    dualDeviceParamSetting.height = c09cu.LJJIZ();
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return dualDeviceParamSetting;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GameDualDeviceParamsSetting.DualDeviceParamSetting dualDeviceParamSetting) {
        GameDualDeviceParamsSetting.DualDeviceParamSetting dualDeviceParamSetting2 = dualDeviceParamSetting;
        if (dualDeviceParamSetting2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("width");
        c09dl.LJJJJ(Integer.valueOf(dualDeviceParamSetting2.width));
        c09dl.LJIILLIIL("height");
        c09dl.LJJJJ(Integer.valueOf(dualDeviceParamSetting2.height));
        c09dl.LJII();
    }
}
