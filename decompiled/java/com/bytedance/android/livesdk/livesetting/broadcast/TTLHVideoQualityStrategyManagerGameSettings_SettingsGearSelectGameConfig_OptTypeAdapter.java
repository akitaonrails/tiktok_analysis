package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerGameSettings;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class TTLHVideoQualityStrategyManagerGameSettings_SettingsGearSelectGameConfig_OptTypeAdapter extends TypeAdapter<TTLHVideoQualityStrategyManagerGameSettings.SettingsGearSelectGameConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TTLHVideoQualityStrategyManagerGameSettings.SettingsGearSelectGameConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TTLHVideoQualityStrategyManagerGameSettings.SettingsGearSelectGameConfig settingsGearSelectGameConfig = new TTLHVideoQualityStrategyManagerGameSettings.SettingsGearSelectGameConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1165461084:
                        if (strLJJJJ.equals("priority")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectGameConfig.setPriority(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -405626793:
                        if (strLJJJJ.equals("BottomLine1080p30")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectGameConfig.setBottomLine1080p30(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -405626700:
                        if (strLJJJJ.equals("BottomLine1080p60")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectGameConfig.setBottomLine1080p60(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -253874769:
                        if (strLJJJJ.equals("BottomLine540p25Bwe")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectGameConfig.setBottomLine540p25Bwe(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -65113558:
                        if (strLJJJJ.equals("BottomLine480p25Bwe")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectGameConfig.setBottomLine480p25Bwe(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 487975102:
                        if (strLJJJJ.equals("BWProbeBottomLevel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectGameConfig.setBWProbeBottomLevel(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1178520250:
                        if (strLJJJJ.equals("BWProbeAimLevel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectGameConfig.setBwProbeAimLevel(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1236304793:
                        if (strLJJJJ.equals("BottomLine720p30Bwe")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectGameConfig.setBottomLine720p30Bwe(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1239075356:
                        if (strLJJJJ.equals("BottomLine720p60Bwe")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectGameConfig.setBottomLine720p60Bwe(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2010247897:
                        if (strLJJJJ.equals("BottomLine1080p30Bwe")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectGameConfig.setBottomLine1080p30Bwe(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2013018460:
                        if (strLJJJJ.equals("BottomLine1080p60Bwe")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectGameConfig.setBottomLine1080p60Bwe(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2019674790:
                        if (strLJJJJ.equals("BottomLine480p25")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectGameConfig.setBottomLine480p25(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2044609857:
                        if (strLJJJJ.equals("BottomLine540p25")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectGameConfig.setBottomLine540p25(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2100021143:
                        if (strLJJJJ.equals("BottomLine720p30")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectGameConfig.setBottomLine720p30(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2100021236:
                        if (strLJJJJ.equals("BottomLine720p60")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsGearSelectGameConfig.setBottomLine720p60(c09cu.LJJJ());
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
        return settingsGearSelectGameConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TTLHVideoQualityStrategyManagerGameSettings.SettingsGearSelectGameConfig settingsGearSelectGameConfig) throws IOException {
        TTLHVideoQualityStrategyManagerGameSettings.SettingsGearSelectGameConfig settingsGearSelectGameConfig2 = settingsGearSelectGameConfig;
        if (settingsGearSelectGameConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("BottomLine480p25Bwe");
        c09dl.LJJIZ(settingsGearSelectGameConfig2.getBottomLine480p25Bwe());
        c09dl.LJIILLIIL("BottomLine540p25Bwe");
        c09dl.LJJIZ(settingsGearSelectGameConfig2.getBottomLine540p25Bwe());
        c09dl.LJIILLIIL("BottomLine720p30Bwe");
        c09dl.LJJIZ(settingsGearSelectGameConfig2.getBottomLine720p30Bwe());
        c09dl.LJIILLIIL("BottomLine720p60Bwe");
        c09dl.LJJIZ(settingsGearSelectGameConfig2.getBottomLine720p60Bwe());
        c09dl.LJIILLIIL("BottomLine1080p30Bwe");
        c09dl.LJJIZ(settingsGearSelectGameConfig2.getBottomLine1080p30Bwe());
        c09dl.LJIILLIIL("BottomLine1080p60Bwe");
        c09dl.LJJIZ(settingsGearSelectGameConfig2.getBottomLine1080p60Bwe());
        c09dl.LJIILLIIL("BottomLine480p25");
        c09dl.LJJIZ(settingsGearSelectGameConfig2.getBottomLine480p25());
        c09dl.LJIILLIIL("BottomLine540p25");
        c09dl.LJJIZ(settingsGearSelectGameConfig2.getBottomLine540p25());
        c09dl.LJIILLIIL("BottomLine720p30");
        c09dl.LJJIZ(settingsGearSelectGameConfig2.getBottomLine720p30());
        c09dl.LJIILLIIL("BottomLine720p60");
        c09dl.LJJIZ(settingsGearSelectGameConfig2.getBottomLine720p60());
        c09dl.LJIILLIIL("BottomLine1080p30");
        c09dl.LJJIZ(settingsGearSelectGameConfig2.getBottomLine1080p30());
        c09dl.LJIILLIIL("BottomLine1080p60");
        c09dl.LJJIZ(settingsGearSelectGameConfig2.getBottomLine1080p60());
        c09dl.LJIILLIIL("BWProbeAimLevel");
        c09dl.LJJJJ(Integer.valueOf(settingsGearSelectGameConfig2.getBwProbeAimLevel()));
        c09dl.LJIILLIIL("BWProbeBottomLevel");
        c09dl.LJJJJ(Integer.valueOf(settingsGearSelectGameConfig2.getBWProbeBottomLevel()));
        c09dl.LJIILLIIL("priority");
        c09dl.LJJJJ(Integer.valueOf(settingsGearSelectGameConfig2.getPriority()));
        c09dl.LJII();
    }
}
