package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerSettings;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes35.dex */
public final class TTLHVideoQualityStrategyManagerSettings_SettingsPortraitsConfig_OptTypeAdapter extends TypeAdapter<TTLHVideoQualityStrategyManagerSettings.SettingsPortraitsConfig> {
    @Override // com.google.gson.TypeAdapter
    public final TTLHVideoQualityStrategyManagerSettings.SettingsPortraitsConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TTLHVideoQualityStrategyManagerSettings.SettingsPortraitsConfig settingsPortraitsConfig = new TTLHVideoQualityStrategyManagerSettings.SettingsPortraitsConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -2092197394) {
                    if (iHashCode != -1658618366) {
                        if (iHashCode == 627743020 && strLJJJJ.equals("rule_data_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsPortraitsConfig.setRuleDataType(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("portraits_source")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            settingsPortraitsConfig.setPortraitsSource(c09cu.LJJJZ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("rule_name")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        settingsPortraitsConfig.setRuleName(c09cu.LJJJZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return settingsPortraitsConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TTLHVideoQualityStrategyManagerSettings.SettingsPortraitsConfig settingsPortraitsConfig) {
        TTLHVideoQualityStrategyManagerSettings.SettingsPortraitsConfig settingsPortraitsConfig2 = settingsPortraitsConfig;
        if (settingsPortraitsConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("rule_name");
        c09dl.LJJJJJ(settingsPortraitsConfig2.getRuleName());
        c09dl.LJIILLIIL("rule_data_type");
        c09dl.LJJJJJ(settingsPortraitsConfig2.getRuleDataType());
        c09dl.LJIILLIIL("portraits_source");
        c09dl.LJJJJJ(settingsPortraitsConfig2.getPortraitsSource());
        c09dl.LJII();
    }
}
