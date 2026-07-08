package com.bytedance.android.livesdk.config;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveGameFloatMsgPanelConfig_OptTypeAdapter extends TypeAdapter<LiveGameFloatMsgPanelConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveGameFloatMsgPanelConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveGameFloatMsgPanelConfig liveGameFloatMsgPanelConfig = new LiveGameFloatMsgPanelConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2146691842:
                        if (strLJJJJ.equals("show_max_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGameFloatMsgPanelConfig.showMaxSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -838788974:
                        if (strLJJJJ.equals("duplicated_check_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGameFloatMsgPanelConfig.duplicatedCheckCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 130195102:
                        if (strLJJJJ.equals("duplicated_check_period")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGameFloatMsgPanelConfig.duplicatedCheckPeriod = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 224703761:
                        if (strLJJJJ.equals("freq_limit_unhot_room")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGameFloatMsgPanelConfig.freqLimitUnHotRoom = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1388957240:
                        if (strLJJJJ.equals("freq_limit_hot_room")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveGameFloatMsgPanelConfig.freqLimitHotRoom = c09cu.LJJIZ();
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
        return liveGameFloatMsgPanelConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveGameFloatMsgPanelConfig liveGameFloatMsgPanelConfig) throws IOException {
        LiveGameFloatMsgPanelConfig liveGameFloatMsgPanelConfig2 = liveGameFloatMsgPanelConfig;
        if (liveGameFloatMsgPanelConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("show_max_size");
        c09dl.LJJJJ(Integer.valueOf(liveGameFloatMsgPanelConfig2.showMaxSize));
        c09dl.LJIILLIIL("freq_limit_hot_room");
        c09dl.LJJJJ(Integer.valueOf(liveGameFloatMsgPanelConfig2.freqLimitHotRoom));
        c09dl.LJIILLIIL("freq_limit_unhot_room");
        c09dl.LJJJJ(Integer.valueOf(liveGameFloatMsgPanelConfig2.freqLimitUnHotRoom));
        c09dl.LJIILLIIL("duplicated_check_period");
        c09dl.LJJIZ(liveGameFloatMsgPanelConfig2.duplicatedCheckPeriod);
        c09dl.LJIILLIIL("duplicated_check_count");
        c09dl.LJJJJ(Integer.valueOf(liveGameFloatMsgPanelConfig2.duplicatedCheckCount));
        c09dl.LJII();
    }
}
