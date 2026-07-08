package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMatchDropOffConfig_OptTypeAdapter extends TypeAdapter<LiveMatchDropOffConfig> {
    public final Gson LIZ;

    public LiveMatchDropOffConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMatchDropOffConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchDropOffConfig liveMatchDropOffConfig = new LiveMatchDropOffConfig(true, true, 1000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != -1052879484) {
                        if (iHashCode == 1839582071 && strLJJJJ.equals("battle_finish_disabled_for_others")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchDropOffConfig.battleFinishDisabledForOthers = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("toast_delay_time_ms")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveMatchDropOffConfig.toastDelayMs = c09cu.LJJJ();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMatchDropOffConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveMatchDropOffConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchDropOffConfig liveMatchDropOffConfig) throws IOException {
        LiveMatchDropOffConfig liveMatchDropOffConfig2 = liveMatchDropOffConfig;
        if (liveMatchDropOffConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveMatchDropOffConfig2.enable);
        c09dl.LJIILLIIL("battle_finish_disabled_for_others");
        c09dl.LJJJJJL(liveMatchDropOffConfig2.battleFinishDisabledForOthers);
        c09dl.LJIILLIIL("toast_delay_time_ms");
        c09dl.LJJIZ(liveMatchDropOffConfig2.toastDelayMs);
        c09dl.LJII();
    }
}
