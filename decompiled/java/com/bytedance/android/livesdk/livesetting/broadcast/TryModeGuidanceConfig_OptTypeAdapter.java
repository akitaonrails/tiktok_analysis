package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class TryModeGuidanceConfig_OptTypeAdapter extends TypeAdapter<TryModeGuidanceConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TryModeGuidanceConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TryModeGuidanceConfig tryModeGuidanceConfig = new TryModeGuidanceConfig(100, 6, 500L, 33L, 3, 3, 3000L, Mp4ScreenVideoLoadTimeout.CONTROL, 15000L, Mp4ScreenVideoLoadTimeout.CONTROL, 3000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1965871738:
                        if (strLJJJJ.equals("volume_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tryModeGuidanceConfig.setVolumeThreshold(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1528784899:
                        if (strLJJJJ.equals("brightness_detect_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tryModeGuidanceConfig.setBrightnessDetectThreshold(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1303961353:
                        if (strLJJJJ.equals("brightness_detect_number")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tryModeGuidanceConfig.setBrightnessDetectNumber(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -819022865:
                        if (strLJJJJ.equals("guidance_show_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tryModeGuidanceConfig.setGuidanceShowDuration(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -814516493:
                        if (strLJJJJ.equals("brightness_detect_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tryModeGuidanceConfig.setBrightnessDetectInterval(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -439826432:
                        if (strLJJJJ.equals("volume_detect_number")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tryModeGuidanceConfig.setVolumeDetectNumber(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 555128830:
                        if (strLJJJJ.equals("face_guidance_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tryModeGuidanceConfig.setFaceGuidanceDelay(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 690454460:
                        if (strLJJJJ.equals("volume_detect_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tryModeGuidanceConfig.setVolumeDetectInterval(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1007869497:
                        if (strLJJJJ.equals("enhanced_bubble_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tryModeGuidanceConfig.setEnhancedBubbleDelay(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1234164106:
                        if (strLJJJJ.equals("face_detect_delay_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tryModeGuidanceConfig.setFaceDetectDelayDuration(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1819176396:
                        if (strLJJJJ.equals("guidance_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                tryModeGuidanceConfig.setGuidanceInterval(c09cu.LJJJ());
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
        return tryModeGuidanceConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TryModeGuidanceConfig tryModeGuidanceConfig) throws IOException {
        TryModeGuidanceConfig tryModeGuidanceConfig2 = tryModeGuidanceConfig;
        if (tryModeGuidanceConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("face_detect_delay_duration");
        c09dl.LJJJJ(Integer.valueOf(tryModeGuidanceConfig2.getFaceDetectDelayDuration()));
        c09dl.LJIILLIIL("brightness_detect_number");
        c09dl.LJJJJ(Integer.valueOf(tryModeGuidanceConfig2.getBrightnessDetectNumber()));
        c09dl.LJIILLIIL("brightness_detect_interval");
        c09dl.LJJIZ(tryModeGuidanceConfig2.getBrightnessDetectInterval());
        c09dl.LJIILLIIL("brightness_detect_threshold");
        c09dl.LJJIZ(tryModeGuidanceConfig2.getBrightnessDetectThreshold());
        c09dl.LJIILLIIL("volume_threshold");
        c09dl.LJJJJ(Integer.valueOf(tryModeGuidanceConfig2.getVolumeThreshold()));
        c09dl.LJIILLIIL("volume_detect_number");
        c09dl.LJJJJ(Integer.valueOf(tryModeGuidanceConfig2.getVolumeDetectNumber()));
        c09dl.LJIILLIIL("volume_detect_interval");
        c09dl.LJJIZ(tryModeGuidanceConfig2.getVolumeDetectInterval());
        c09dl.LJIILLIIL("face_guidance_delay");
        c09dl.LJJIZ(tryModeGuidanceConfig2.getFaceGuidanceDelay());
        c09dl.LJIILLIIL("guidance_interval");
        c09dl.LJJIZ(tryModeGuidanceConfig2.getGuidanceInterval());
        c09dl.LJIILLIIL("guidance_show_duration");
        c09dl.LJJIZ(tryModeGuidanceConfig2.getGuidanceShowDuration());
        c09dl.LJIILLIIL("enhanced_bubble_delay");
        c09dl.LJJIZ(tryModeGuidanceConfig2.getEnhancedBubbleDelay());
        c09dl.LJII();
    }
}
