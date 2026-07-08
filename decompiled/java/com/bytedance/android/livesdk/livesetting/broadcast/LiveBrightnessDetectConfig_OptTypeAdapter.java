package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public final class LiveBrightnessDetectConfig_OptTypeAdapter extends TypeAdapter<LiveBrightnessDetectConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveBrightnessDetectConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveBrightnessDetectConfig liveBrightnessDetectConfig = new LiveBrightnessDetectConfig(0, 500L, 6, 33L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1087154737:
                        if (strLJJJJ.equals("detect_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBrightnessDetectConfig.detectThreshold = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -174812439:
                        if (strLJJJJ.equals("detect_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBrightnessDetectConfig.detectTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 655171504:
                        if (strLJJJJ.equals("detect_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBrightnessDetectConfig.detectDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 968532218:
                        if (strLJJJJ.equals("dark_scene_toast_fluency")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveBrightnessDetectConfig.darkSceneToastFluency = c09cu.LJJIZ();
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
        return liveBrightnessDetectConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveBrightnessDetectConfig liveBrightnessDetectConfig) throws IOException {
        LiveBrightnessDetectConfig liveBrightnessDetectConfig2 = liveBrightnessDetectConfig;
        if (liveBrightnessDetectConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("dark_scene_toast_fluency");
        c09dl.LJJJJ(Integer.valueOf(liveBrightnessDetectConfig2.darkSceneToastFluency));
        c09dl.LJIILLIIL("detect_duration");
        c09dl.LJJIZ(liveBrightnessDetectConfig2.detectDuration);
        c09dl.LJIILLIIL("detect_time");
        c09dl.LJJJJ(Integer.valueOf(liveBrightnessDetectConfig2.detectTime));
        c09dl.LJIILLIIL("detect_threshold");
        c09dl.LJJIZ(liveBrightnessDetectConfig2.detectThreshold);
        c09dl.LJII();
    }
}
