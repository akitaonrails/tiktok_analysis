package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMatchScoreTrackConfig_OptTypeAdapter extends TypeAdapter<LiveMatchScoreTrackConfig> {
    public final Gson LIZ;

    public LiveMatchScoreTrackConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LiveMatchScoreTrackConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveMatchScoreTrackConfig liveMatchScoreTrackConfig = new LiveMatchScoreTrackConfig(true, false, 30.0f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1946001513) {
                    if (iHashCode != -1343616113) {
                        if (iHashCode == -487569344 && strLJJJJ.equals("periodic_check_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveMatchScoreTrackConfig.periodic_check_interval = (float) c09cu.LJJIL();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("enable_track")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveMatchScoreTrackConfig.enable_track = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("enable_track_normal")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveMatchScoreTrackConfig.enable_track_normal = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveMatchScoreTrackConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveMatchScoreTrackConfig liveMatchScoreTrackConfig) throws IOException {
        LiveMatchScoreTrackConfig liveMatchScoreTrackConfig2 = liveMatchScoreTrackConfig;
        if (liveMatchScoreTrackConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_track");
        c09dl.LJJJJJL(liveMatchScoreTrackConfig2.enable_track);
        c09dl.LJIILLIIL("enable_track_normal");
        c09dl.LJJJJJL(liveMatchScoreTrackConfig2.enable_track_normal);
        c09dl.LJIILLIIL("periodic_check_interval");
        c09dl.LJJJJ(Float.valueOf(liveMatchScoreTrackConfig2.periodic_check_interval));
        c09dl.LJII();
    }
}
