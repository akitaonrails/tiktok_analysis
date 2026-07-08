package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveHostChargeConfig_OptTypeAdapter extends TypeAdapter<LiveHostChargeConfig> {
    public final Gson LIZ;

    public LiveHostChargeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveHostChargeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveHostChargeConfig liveHostChargeConfig = new LiveHostChargeConfig(false, C1697810uHb.LJIIJJI(10, 20), 60, 60L, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1454330221:
                        if (strLJJJJ.equals("check_charge_interval_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostChargeConfig.checkChargeIntervalTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1320498467:
                        if (strLJJJJ.equals("block_charge_check_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostChargeConfig.blockChargeCheckTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostChargeConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -19474752:
                        if (strLJJJJ.equals("predicted_live_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostChargeConfig.predictedLiveDuration = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2065378056:
                        if (strLJJJJ.equals("skip_check_battery_value")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostChargeConfig.skipCheckBattery = C473040Igo.LIZ(this.LIZ, c09cu, Integer.TYPE);
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
        return liveHostChargeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveHostChargeConfig liveHostChargeConfig) throws IOException {
        LiveHostChargeConfig liveHostChargeConfig2 = liveHostChargeConfig;
        if (liveHostChargeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveHostChargeConfig2.enable);
        c09dl.LJIILLIIL("skip_check_battery_value");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveHostChargeConfig2.skipCheckBattery, Integer.TYPE);
        c09dl.LJIILLIIL("predicted_live_duration");
        c09dl.LJJJJ(Integer.valueOf(liveHostChargeConfig2.predictedLiveDuration));
        c09dl.LJIILLIIL("check_charge_interval_time");
        c09dl.LJJIZ(liveHostChargeConfig2.checkChargeIntervalTime);
        c09dl.LJIILLIIL("block_charge_check_time");
        c09dl.LJJJJ(Integer.valueOf(liveHostChargeConfig2.blockChargeCheckTime));
        c09dl.LJII();
    }
}
