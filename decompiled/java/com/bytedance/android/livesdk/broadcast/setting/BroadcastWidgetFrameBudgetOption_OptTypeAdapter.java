package com.bytedance.android.livesdk.broadcast.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class BroadcastWidgetFrameBudgetOption_OptTypeAdapter extends TypeAdapter<BroadcastWidgetFrameBudgetOption> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final BroadcastWidgetFrameBudgetOption read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        BroadcastWidgetFrameBudgetOption broadcastWidgetFrameBudgetOption = new BroadcastWidgetFrameBudgetOption();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1608122177:
                        if (strLJJJJ.equals("low_end_device_budget")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                broadcastWidgetFrameBudgetOption.setLowEndDeviceBudget(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -693861491:
                        if (strLJJJJ.equals("high_end_device_budget")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                broadcastWidgetFrameBudgetOption.setHighEndDeviceBudget(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -34175328:
                        if (strLJJJJ.equals("medium_end_device_budget")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                broadcastWidgetFrameBudgetOption.setMediumEndDeviceBudget(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1764414936:
                        if (strLJJJJ.equals("low_end_device_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                broadcastWidgetFrameBudgetOption.setLowEndDeviceScore((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1815187415:
                        if (strLJJJJ.equals("medium_end_device_score")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                broadcastWidgetFrameBudgetOption.setMediumEndDeviceScore((float) c09cu.LJJIL());
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
        return broadcastWidgetFrameBudgetOption;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, BroadcastWidgetFrameBudgetOption broadcastWidgetFrameBudgetOption) throws IOException {
        BroadcastWidgetFrameBudgetOption broadcastWidgetFrameBudgetOption2 = broadcastWidgetFrameBudgetOption;
        if (broadcastWidgetFrameBudgetOption2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("low_end_device_score");
        c09dl.LJJJJ(Float.valueOf(broadcastWidgetFrameBudgetOption2.getLowEndDeviceScore()));
        c09dl.LJIILLIIL("low_end_device_budget");
        c09dl.LJJIZ(broadcastWidgetFrameBudgetOption2.getLowEndDeviceBudget());
        c09dl.LJIILLIIL("medium_end_device_score");
        c09dl.LJJJJ(Float.valueOf(broadcastWidgetFrameBudgetOption2.getMediumEndDeviceScore()));
        c09dl.LJIILLIIL("medium_end_device_budget");
        c09dl.LJJIZ(broadcastWidgetFrameBudgetOption2.getMediumEndDeviceBudget());
        c09dl.LJIILLIIL("high_end_device_budget");
        c09dl.LJJIZ(broadcastWidgetFrameBudgetOption2.getHighEndDeviceBudget());
        c09dl.LJII();
    }
}
