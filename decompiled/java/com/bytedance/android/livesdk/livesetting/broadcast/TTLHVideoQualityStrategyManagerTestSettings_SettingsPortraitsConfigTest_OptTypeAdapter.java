package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerTestSettings;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class TTLHVideoQualityStrategyManagerTestSettings_SettingsPortraitsConfigTest_OptTypeAdapter extends TypeAdapter<TTLHVideoQualityStrategyManagerTestSettings.SettingsPortraitsConfigTest> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final TTLHVideoQualityStrategyManagerTestSettings.SettingsPortraitsConfigTest read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TTLHVideoQualityStrategyManagerTestSettings.SettingsPortraitsConfigTest settingsPortraitsConfigTest = new TTLHVideoQualityStrategyManagerTestSettings.SettingsPortraitsConfigTest();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2092197394:
                        if (strLJJJJ.equals("rule_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsPortraitsConfigTest.setRuleName(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1658618366:
                        if (strLJJJJ.equals("portraits_source")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsPortraitsConfigTest.setPortraitsSource(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 627743020:
                        if (strLJJJJ.equals("rule_data_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsPortraitsConfigTest.setRuleDataType(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1557058879:
                        if (strLJJJJ.equals("mock_data")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                settingsPortraitsConfigTest.setMockData(c09cu.LJJJZ());
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
        return settingsPortraitsConfigTest;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TTLHVideoQualityStrategyManagerTestSettings.SettingsPortraitsConfigTest settingsPortraitsConfigTest) {
        TTLHVideoQualityStrategyManagerTestSettings.SettingsPortraitsConfigTest settingsPortraitsConfigTest2 = settingsPortraitsConfigTest;
        if (settingsPortraitsConfigTest2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("rule_name");
        c09dl.LJJJJJ(settingsPortraitsConfigTest2.getRuleName());
        c09dl.LJIILLIIL("rule_data_type");
        c09dl.LJJJJJ(settingsPortraitsConfigTest2.getRuleDataType());
        c09dl.LJIILLIIL("portraits_source");
        c09dl.LJJJJJ(settingsPortraitsConfigTest2.getPortraitsSource());
        c09dl.LJIILLIIL("mock_data");
        c09dl.LJJJJJ(settingsPortraitsConfigTest2.getMockData());
        c09dl.LJII();
    }
}
