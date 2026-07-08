package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameDualDeviceQRCodeParamsSetting;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class LiveGameDualDeviceQRCodeParamsSetting_SourceParam_OptTypeAdapter extends TypeAdapter<LiveGameDualDeviceQRCodeParamsSetting.SourceParam> {
    @Override // com.google.gson.TypeAdapter
    public final LiveGameDualDeviceQRCodeParamsSetting.SourceParam read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGameDualDeviceQRCodeParamsSetting.SourceParam sourceParam = new LiveGameDualDeviceQRCodeParamsSetting.SourceParam(null, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "live_game_dual_device_qr_code_fps")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    sourceParam.cameraFPS = Integer.valueOf(c09cu.LJJIZ());
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "live_game_dual_device_qr_code_bit_rate_scale")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    sourceParam.bitRateScale = Float.valueOf((float) c09cu.LJJIL());
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return sourceParam;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGameDualDeviceQRCodeParamsSetting.SourceParam sourceParam) {
        LiveGameDualDeviceQRCodeParamsSetting.SourceParam sourceParam2 = sourceParam;
        if (sourceParam2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_game_dual_device_qr_code_fps");
        c09dl.LJJJJ(sourceParam2.cameraFPS);
        c09dl.LJIILLIIL("live_game_dual_device_qr_code_bit_rate_scale");
        c09dl.LJJJJ(sourceParam2.bitRateScale);
        c09dl.LJII();
    }
}
