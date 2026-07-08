package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerSettings;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class TTLHVideoQualityStrategyManagerSettings_SettingsBitrateConfig_OptTypeAdapter extends TypeAdapter<TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig settingsBitrateConfig = new TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1221029593:
                        if (strLJJJJ.equals("height")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsBitrateConfig.setHeight(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -751301445:
                        if (strLJJJJ.equals("minBitrate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsBitrateConfig.setMinBitrate(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 101609:
                        if (strLJJJJ.equals("fps")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsBitrateConfig.setFps(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 3530753:
                        if (strLJJJJ.equals("size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsBitrateConfig.setLevel(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 113126854:
                        if (strLJJJJ.equals("width")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsBitrateConfig.setWidth(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1071666537:
                        if (strLJJJJ.equals("maxBitrate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsBitrateConfig.setMaxBitrate(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1901847020:
                        if (strLJJJJ.equals("defaultBitrate")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsBitrateConfig.setDefaultBitrate(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1948376282:
                        if (strLJJJJ.equals("sdk_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsBitrateConfig.setSdkKey(c09cu.LJJJZ());
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
        return settingsBitrateConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig settingsBitrateConfig) throws IOException {
        TTLHVideoQualityStrategyManagerSettings.SettingsBitrateConfig settingsBitrateConfig2 = settingsBitrateConfig;
        if (settingsBitrateConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("defaultBitrate");
        c09dl.LJJIZ(settingsBitrateConfig2.getDefaultBitrate());
        c09dl.LJIILLIIL("maxBitrate");
        c09dl.LJJIZ(settingsBitrateConfig2.getMaxBitrate());
        c09dl.LJIILLIIL("minBitrate");
        c09dl.LJJIZ(settingsBitrateConfig2.getMinBitrate());
        c09dl.LJIILLIIL("width");
        c09dl.LJJJJ(Integer.valueOf(settingsBitrateConfig2.getWidth()));
        c09dl.LJIILLIIL("height");
        c09dl.LJJJJ(Integer.valueOf(settingsBitrateConfig2.getHeight()));
        c09dl.LJIILLIIL("size");
        c09dl.LJJJJJ(settingsBitrateConfig2.getLevel());
        c09dl.LJIILLIIL("fps");
        c09dl.LJJJJ(Integer.valueOf(settingsBitrateConfig2.getFps()));
        c09dl.LJIILLIIL("sdk_key");
        c09dl.LJJJJJ(settingsBitrateConfig2.getSdkKey());
        c09dl.LJII();
    }
}
