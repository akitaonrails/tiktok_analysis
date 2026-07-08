package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePreCreateNextRoomByDeviceExpConfig_OptTypeAdapter extends TypeAdapter<LivePreCreateNextRoomByDeviceExpConfig> {
    public final Gson LIZ;

    public LivePreCreateNextRoomByDeviceExpConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePreCreateNextRoomByDeviceExpConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePreCreateNextRoomByDeviceExpConfig livePreCreateNextRoomByDeviceExpConfig = new LivePreCreateNextRoomByDeviceExpConfig(false, 0, null, 7, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1298848381) {
                    if (iHashCode != 297361121) {
                        if (iHashCode == 713914912 && strLJJJJ.equals("default_delay_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePreCreateNextRoomByDeviceExpConfig.setDefaultDelayMs(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("score_intervals")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            livePreCreateNextRoomByDeviceExpConfig.setScoreIntervals(C473040Igo.LIZ(this.LIZ, c09cu, PerformanceScoreIntervalConfig.class));
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePreCreateNextRoomByDeviceExpConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return livePreCreateNextRoomByDeviceExpConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePreCreateNextRoomByDeviceExpConfig livePreCreateNextRoomByDeviceExpConfig) throws IOException {
        LivePreCreateNextRoomByDeviceExpConfig livePreCreateNextRoomByDeviceExpConfig2 = livePreCreateNextRoomByDeviceExpConfig;
        if (livePreCreateNextRoomByDeviceExpConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(livePreCreateNextRoomByDeviceExpConfig2.getEnable());
        c09dl.LJIILLIIL("default_delay_ms");
        c09dl.LJJJJ(Integer.valueOf(livePreCreateNextRoomByDeviceExpConfig2.getDefaultDelayMs()));
        c09dl.LJIILLIIL("score_intervals");
        C473040Igo.LIZLLL(this.LIZ, c09dl, livePreCreateNextRoomByDeviceExpConfig2.getScoreIntervals(), PerformanceScoreIntervalConfig.class);
        c09dl.LJII();
    }
}
