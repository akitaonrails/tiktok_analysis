package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveHostChargeTest_OptTypeAdapter extends TypeAdapter<LiveHostChargeTest> {
    public final Gson LIZ;

    public LiveHostChargeTest_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveHostChargeTest read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveHostChargeTest liveHostChargeTest = new LiveHostChargeTest(false, true, 100, 100);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostChargeTest.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 317112541:
                        if (strLJJJJ.equals("mock_battery_level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostChargeTest.batteryLevel = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 323497635:
                        if (strLJJJJ.equals("mock_battery_scale")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostChargeTest.batteryScale = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1028202228:
                        if (strLJJJJ.equals("mock_is_charge")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostChargeTest.isCharge = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveHostChargeTest;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveHostChargeTest liveHostChargeTest) throws IOException {
        LiveHostChargeTest liveHostChargeTest2 = liveHostChargeTest;
        if (liveHostChargeTest2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveHostChargeTest2.enable);
        c09dl.LJIILLIIL("mock_is_charge");
        c09dl.LJJJJJL(liveHostChargeTest2.isCharge);
        c09dl.LJIILLIIL("mock_battery_level");
        c09dl.LJJJJ(Integer.valueOf(liveHostChargeTest2.batteryLevel));
        c09dl.LJIILLIIL("mock_battery_scale");
        c09dl.LJJJJ(Integer.valueOf(liveHostChargeTest2.batteryScale));
        c09dl.LJII();
    }
}
