package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.RoomScreenStatusObserveNewSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class RoomScreenStatusObserveNewSetting_ObserveConfig_OptTypeAdapter extends TypeAdapter<RoomScreenStatusObserveNewSetting.ObserveConfig> {
    public final Gson LIZ;

    public RoomScreenStatusObserveNewSetting_ObserveConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final RoomScreenStatusObserveNewSetting.ObserveConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RoomScreenStatusObserveNewSetting.ObserveConfig observeConfig = new RoomScreenStatusObserveNewSetting.ObserveConfig(Boolean.FALSE, 30000L, Long.valueOf(TimeUnit.MINUTES.toMillis(15L)), false, false, 30L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1729782809:
                        if (strLJJJJ.equals("enableRemove")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                observeConfig.enableRemove = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                observeConfig.enable = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -370954616:
                        if (strLJJJJ.equals("blackDurThresholdSec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                observeConfig.blackDurThreshold = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 51479271:
                        if (strLJJJJ.equals("timeoutMs")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                observeConfig.timeoutMs = Long.valueOf(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 461723553:
                        if (strLJJJJ.equals("enableQuickSlideCheck")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                observeConfig.enableQuickSlideCheck = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 844110417:
                        if (strLJJJJ.equals("maxTime")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                observeConfig.maxBlackTimeMs = Long.valueOf(c09cu.LJJJ());
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
        return observeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RoomScreenStatusObserveNewSetting.ObserveConfig observeConfig) throws IOException {
        RoomScreenStatusObserveNewSetting.ObserveConfig observeConfig2 = observeConfig;
        if (observeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJ(observeConfig2.enable);
        c09dl.LJIILLIIL("timeoutMs");
        c09dl.LJJJJ(observeConfig2.timeoutMs);
        c09dl.LJIILLIIL("maxTime");
        c09dl.LJJJJ(observeConfig2.maxBlackTimeMs);
        c09dl.LJIILLIIL("enableRemove");
        c09dl.LJJJJJL(observeConfig2.enableRemove);
        c09dl.LJIILLIIL("enableQuickSlideCheck");
        c09dl.LJJJJJL(observeConfig2.enableQuickSlideCheck);
        c09dl.LJIILLIIL("blackDurThresholdSec");
        c09dl.LJJIZ(observeConfig2.blackDurThreshold);
        c09dl.LJII();
    }
}
