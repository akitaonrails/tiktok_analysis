package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerSettings;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class TTLHVideoQualityStrategyManagerSettings_SettingsStrategyConfig_OptTypeAdapter extends TypeAdapter<TTLHVideoQualityStrategyManagerSettings.SettingsStrategyConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TTLHVideoQualityStrategyManagerSettings.SettingsStrategyConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TTLHVideoQualityStrategyManagerSettings.SettingsStrategyConfig settingsStrategyConfig = new TTLHVideoQualityStrategyManagerSettings.SettingsStrategyConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1520871576:
                        if (strLJJJJ.equals("gearshift_rule")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsStrategyConfig.setGearShiftRule(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1520808026:
                        if (strLJJJJ.equals("gearshift_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsStrategyConfig.setGearShiftType(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1165461084:
                        if (strLJJJJ.equals("priority")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsStrategyConfig.setPriority(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1309564934:
                        if (strLJJJJ.equals("default_level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsStrategyConfig.setDefaultLevel(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1753004401:
                        if (strLJJJJ.equals("resolution_list_key")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsStrategyConfig.setBitrateConfigListIndex(c09cu.LJJJZ());
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
        return settingsStrategyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TTLHVideoQualityStrategyManagerSettings.SettingsStrategyConfig settingsStrategyConfig) {
        TTLHVideoQualityStrategyManagerSettings.SettingsStrategyConfig settingsStrategyConfig2 = settingsStrategyConfig;
        if (settingsStrategyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("priority");
        c09dl.LJJJJ(Integer.valueOf(settingsStrategyConfig2.getPriority()));
        c09dl.LJIILLIIL("resolution_list_key");
        c09dl.LJJJJJ(settingsStrategyConfig2.getBitrateConfigListIndex());
        c09dl.LJIILLIIL("default_level");
        c09dl.LJJJJ(Integer.valueOf(settingsStrategyConfig2.getDefaultLevel()));
        c09dl.LJIILLIIL("gearshift_rule");
        c09dl.LJJJJJ(settingsStrategyConfig2.getGearShiftRule());
        c09dl.LJIILLIIL("gearshift_type");
        c09dl.LJJJJ(Integer.valueOf(settingsStrategyConfig2.getGearShiftType()));
        c09dl.LJII();
    }
}
