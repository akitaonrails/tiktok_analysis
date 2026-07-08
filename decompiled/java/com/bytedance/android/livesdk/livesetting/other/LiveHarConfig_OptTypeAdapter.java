package com.bytedance.android.livesdk.livesetting.other;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveHarConfig_OptTypeAdapter extends TypeAdapter<LiveHarConfig> {
    public final Gson LIZ;

    public LiveHarConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveHarConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveHarConfig liveHarConfig = new LiveHarConfig(false, false, 60000L, 15000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1639267804:
                        if (strLJJJJ.equals("timer_trigger_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHarConfig.timerTriggerEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHarConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -155132634:
                        if (strLJJJJ.equals("timer_trigger_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHarConfig.timerTriggerInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1005121221:
                        if (strLJJJJ.equals("manual_trigger_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHarConfig.minTriggerInterval = c09cu.LJJJ();
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
        return liveHarConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveHarConfig liveHarConfig) throws IOException {
        LiveHarConfig liveHarConfig2 = liveHarConfig;
        if (liveHarConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveHarConfig2.enable);
        c09dl.LJIILLIIL("timer_trigger_enable");
        c09dl.LJJJJJL(liveHarConfig2.timerTriggerEnable);
        c09dl.LJIILLIIL("timer_trigger_interval");
        c09dl.LJJIZ(liveHarConfig2.timerTriggerInterval);
        c09dl.LJIILLIIL("manual_trigger_interval");
        c09dl.LJJIZ(liveHarConfig2.minTriggerInterval);
        c09dl.LJII();
    }
}
