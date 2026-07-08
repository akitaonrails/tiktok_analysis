package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.LyraxSceneStrategySettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LyraxSceneStrategySettings_SceneStrategySettings_OptTypeAdapter extends TypeAdapter<LyraxSceneStrategySettings.SceneStrategySettings> {
    public final Gson LIZ;

    public LyraxSceneStrategySettings_SceneStrategySettings_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LyraxSceneStrategySettings.SceneStrategySettings read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LyraxSceneStrategySettings.SceneStrategySettings sceneStrategySettings = new LyraxSceneStrategySettings.SceneStrategySettings(false, false, false, 30000);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -723830623:
                        if (strLJJJJ.equals("enable_battery_strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sceneStrategySettings.enableBatteryStrategy = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 37755584:
                        if (strLJJJJ.equals("enable_ec_live_status")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sceneStrategySettings.enableECLiveStatus = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 49272618:
                        if (strLJJJJ.equals("har_detect_interval_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sceneStrategySettings.harDetectIntervalMs = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 735826757:
                        if (strLJJJJ.equals("enable_har_detect")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                sceneStrategySettings.enableHarDetect = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return sceneStrategySettings;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LyraxSceneStrategySettings.SceneStrategySettings sceneStrategySettings) throws IOException {
        LyraxSceneStrategySettings.SceneStrategySettings sceneStrategySettings2 = sceneStrategySettings;
        if (sceneStrategySettings2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_battery_strategy");
        c09dl.LJJJJJL(sceneStrategySettings2.enableBatteryStrategy);
        c09dl.LJIILLIIL("enable_har_detect");
        c09dl.LJJJJJL(sceneStrategySettings2.enableHarDetect);
        c09dl.LJIILLIIL("enable_ec_live_status");
        c09dl.LJJJJJL(sceneStrategySettings2.enableECLiveStatus);
        c09dl.LJIILLIIL("har_detect_interval_ms");
        c09dl.LJJJJ(Integer.valueOf(sceneStrategySettings2.harDetectIntervalMs));
        c09dl.LJII();
    }
}
