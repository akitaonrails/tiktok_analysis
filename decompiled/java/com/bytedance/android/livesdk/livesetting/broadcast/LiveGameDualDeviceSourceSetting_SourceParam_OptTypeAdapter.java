package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameDualDeviceSourceSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGameDualDeviceSourceSetting_SourceParam_OptTypeAdapter extends TypeAdapter<LiveGameDualDeviceSourceSetting.SourceParam> {
    public final Gson LIZ;

    public LiveGameDualDeviceSourceSetting_SourceParam_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveGameDualDeviceSourceSetting.SourceParam read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGameDualDeviceSourceSetting.SourceParam sourceParam = new LiveGameDualDeviceSourceSetting.SourceParam(true, 500L, 30, 4);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2062966467:
                        if (strLJJJJ.equals("live_game_dual_device_camera_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sourceParam.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1229463052:
                        if (strLJJJJ.equals("live_game_dual_device_camera_bit_rate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sourceParam.bitRate = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1766013807:
                        if (strLJJJJ.equals("live_game_dual_device_camera_fps")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sourceParam.cameraFPS = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1789647895:
                        if (strLJJJJ.equals("live_game_dual_device_camera_retry_duration_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sourceParam.retryDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return sourceParam;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGameDualDeviceSourceSetting.SourceParam sourceParam) throws IOException {
        LiveGameDualDeviceSourceSetting.SourceParam sourceParam2 = sourceParam;
        if (sourceParam2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("live_game_dual_device_camera_enable");
        c09dl.LJJJJJL(sourceParam2.enable);
        c09dl.LJIILLIIL("live_game_dual_device_camera_retry_duration_sec");
        c09dl.LJJIZ(sourceParam2.retryDuration);
        c09dl.LJIILLIIL("live_game_dual_device_camera_fps");
        c09dl.LJJJJ(Integer.valueOf(sourceParam2.cameraFPS));
        c09dl.LJIILLIIL("live_game_dual_device_camera_bit_rate");
        c09dl.LJJJJ(Integer.valueOf(sourceParam2.bitRate));
        c09dl.LJII();
    }
}
