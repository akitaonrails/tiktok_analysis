package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerSettings;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class TTLHVideoQualityStrategyManagerSettings_SettingsGearSelectStageConfig_OptTypeAdapter extends TypeAdapter<TTLHVideoQualityStrategyManagerSettings.SettingsGearSelectStageConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TTLHVideoQualityStrategyManagerSettings.SettingsGearSelectStageConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TTLHVideoQualityStrategyManagerSettings.SettingsGearSelectStageConfig settingsGearSelectStageConfig = new TTLHVideoQualityStrategyManagerSettings.SettingsGearSelectStageConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1814573427:
                        if (strLJJJJ.equals("BottomLine480pBwe")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectStageConfig.setBottomLine480pBwe(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1165461084:
                        if (strLJJJJ.equals("priority")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectStageConfig.setPriority(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1041586350:
                        if (strLJJJJ.equals("BottomLine540pBwe")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectStageConfig.setBottomLine540pBwe(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -239238877:
                        if (strLJJJJ.equals("BottomLine480p")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectStageConfig.setBottomLine480p(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -239212930:
                        if (strLJJJJ.equals("BottomLine540p")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectStageConfig.setBottomLine540p(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -239155270:
                        if (strLJJJJ.equals("BottomLine720p")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectStageConfig.setBottomLine720p(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 310488022:
                        if (strLJJJJ.equals("BottomLine1080pBwe")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectStageConfig.setBottomLine1080pBwe(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 487975102:
                        if (strLJJJJ.equals("BWProbeBottomLevel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectStageConfig.setBWProbeBottomLevel(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 676162710:
                        if (strLJJJJ.equals("BottomLine720pBwe")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectStageConfig.setBottomLine720pBwe(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1170526330:
                        if (strLJJJJ.equals("BottomLine1080p")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectStageConfig.setBottomLine1080p(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1178520250:
                        if (strLJJJJ.equals("BWProbeAimLevel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectStageConfig.setBwProbeAimLevel(c09cu.LJJIZ());
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
        return settingsGearSelectStageConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TTLHVideoQualityStrategyManagerSettings.SettingsGearSelectStageConfig settingsGearSelectStageConfig) throws IOException {
        TTLHVideoQualityStrategyManagerSettings.SettingsGearSelectStageConfig settingsGearSelectStageConfig2 = settingsGearSelectStageConfig;
        if (settingsGearSelectStageConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("BottomLine480pBwe");
        c09dl.LJJIZ(settingsGearSelectStageConfig2.getBottomLine480pBwe());
        c09dl.LJIILLIIL("BottomLine540pBwe");
        c09dl.LJJIZ(settingsGearSelectStageConfig2.getBottomLine540pBwe());
        c09dl.LJIILLIIL("BottomLine720pBwe");
        c09dl.LJJIZ(settingsGearSelectStageConfig2.getBottomLine720pBwe());
        c09dl.LJIILLIIL("BottomLine1080pBwe");
        c09dl.LJJIZ(settingsGearSelectStageConfig2.getBottomLine1080pBwe());
        c09dl.LJIILLIIL("BottomLine480p");
        c09dl.LJJIZ(settingsGearSelectStageConfig2.getBottomLine480p());
        c09dl.LJIILLIIL("BottomLine540p");
        c09dl.LJJIZ(settingsGearSelectStageConfig2.getBottomLine540p());
        c09dl.LJIILLIIL("BottomLine720p");
        c09dl.LJJIZ(settingsGearSelectStageConfig2.getBottomLine720p());
        c09dl.LJIILLIIL("BottomLine1080p");
        c09dl.LJJIZ(settingsGearSelectStageConfig2.getBottomLine1080p());
        c09dl.LJIILLIIL("BWProbeAimLevel");
        c09dl.LJJJJ(Integer.valueOf(settingsGearSelectStageConfig2.getBwProbeAimLevel()));
        c09dl.LJIILLIIL("BWProbeBottomLevel");
        c09dl.LJJJJ(Integer.valueOf(settingsGearSelectStageConfig2.getBWProbeBottomLevel()));
        c09dl.LJIILLIIL("priority");
        c09dl.LJJJJ(Integer.valueOf(settingsGearSelectStageConfig2.getPriority()));
        c09dl.LJII();
    }
}
