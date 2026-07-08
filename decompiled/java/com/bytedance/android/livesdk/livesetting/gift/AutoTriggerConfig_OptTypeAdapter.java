package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class AutoTriggerConfig_OptTypeAdapter extends TypeAdapter<AutoTriggerConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final AutoTriggerConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        AutoTriggerConfig autoTriggerConfig = new AutoTriggerConfig(0, 1, 0, "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2124259664:
                        if (strLJJJJ.equals("delay_second")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                autoTriggerConfig.delaySecond = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -957038910:
                        if (strLJJJJ.equals("ignore_pitaya_package")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                autoTriggerConfig.ignorePitayaPackage = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -524622785:
                        if (strLJJJJ.equals("is_same_room")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                autoTriggerConfig.isSameRoom = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1940600304:
                        if (strLJJJJ.equals("default_trigger_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                autoTriggerConfig.defaultTriggerName = c09cu.LJJJZ();
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
        return autoTriggerConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, AutoTriggerConfig autoTriggerConfig) {
        AutoTriggerConfig autoTriggerConfig2 = autoTriggerConfig;
        if (autoTriggerConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("delay_second");
        c09dl.LJJJJ(Integer.valueOf(autoTriggerConfig2.delaySecond));
        c09dl.LJIILLIIL("is_same_room");
        c09dl.LJJJJ(Integer.valueOf(autoTriggerConfig2.isSameRoom));
        c09dl.LJIILLIIL("ignore_pitaya_package");
        c09dl.LJJJJ(Integer.valueOf(autoTriggerConfig2.ignorePitayaPackage));
        c09dl.LJIILLIIL("default_trigger_name");
        c09dl.LJJJJJ(autoTriggerConfig2.defaultTriggerName);
        c09dl.LJII();
    }
}
