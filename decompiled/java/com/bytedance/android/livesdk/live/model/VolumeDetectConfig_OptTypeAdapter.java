package com.bytedance.android.livesdk.live.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class VolumeDetectConfig_OptTypeAdapter extends TypeAdapter<VolumeDetectConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final VolumeDetectConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        VolumeDetectConfig volumeDetectConfig = new VolumeDetectConfig(3, 3, 3, 3, 3);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1965871738:
                        if (strLJJJJ.equals("volume_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                volumeDetectConfig.setVolumeThreshold(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1847532698:
                        if (strLJJJJ.equals("pause_prompt_duration_minutes")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                volumeDetectConfig.setPausePromptDurationMinutes(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1040225989:
                        if (strLJJJJ.equals("count_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                volumeDetectConfig.setCountThreshold(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1615038194:
                        if (strLJJJJ.equals("first_count_down_duration_minutes")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                volumeDetectConfig.setFirstCountDownDurationMinutes(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1893021473:
                        if (strLJJJJ.equals("detect_interval_seconds")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                volumeDetectConfig.setDetectIntervalSeconds(c09cu.LJJIZ());
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
        return volumeDetectConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, VolumeDetectConfig volumeDetectConfig) {
        VolumeDetectConfig volumeDetectConfig2 = volumeDetectConfig;
        if (volumeDetectConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("first_count_down_duration_minutes");
        c09dl.LJJJJ(Integer.valueOf(volumeDetectConfig2.getFirstCountDownDurationMinutes()));
        c09dl.LJIILLIIL("detect_interval_seconds");
        c09dl.LJJJJ(Integer.valueOf(volumeDetectConfig2.getDetectIntervalSeconds()));
        c09dl.LJIILLIIL("volume_threshold");
        c09dl.LJJJJ(Integer.valueOf(volumeDetectConfig2.getVolumeThreshold()));
        c09dl.LJIILLIIL("count_threshold");
        c09dl.LJJJJ(Integer.valueOf(volumeDetectConfig2.getCountThreshold()));
        c09dl.LJIILLIIL("pause_prompt_duration_minutes");
        c09dl.LJJJJ(Integer.valueOf(volumeDetectConfig2.getPausePromptDurationMinutes()));
        c09dl.LJII();
    }
}
