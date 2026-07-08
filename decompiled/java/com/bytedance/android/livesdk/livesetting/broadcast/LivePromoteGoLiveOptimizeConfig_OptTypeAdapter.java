package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePromoteGoLiveOptimizeConfig_OptTypeAdapter extends TypeAdapter<LivePromoteGoLiveOptimizeConfig> {
    public final Gson LIZ;

    public LivePromoteGoLiveOptimizeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LivePromoteGoLiveOptimizeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePromoteGoLiveOptimizeConfig livePromoteGoLiveOptimizeConfig = new LivePromoteGoLiveOptimizeConfig(false, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -1939965243) {
                    if (iHashCode != 87272794) {
                        if (iHashCode == 639601734 && strLJJJJ.equals("optimize_show_cards_records")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePromoteGoLiveOptimizeConfig.setOptimizeShowCardsRecord(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("video_first_frame")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            livePromoteGoLiveOptimizeConfig.setVideoFirstFrame(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("preload_video")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        livePromoteGoLiveOptimizeConfig.setEnablePreloadVideo(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return livePromoteGoLiveOptimizeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePromoteGoLiveOptimizeConfig livePromoteGoLiveOptimizeConfig) throws IOException {
        LivePromoteGoLiveOptimizeConfig livePromoteGoLiveOptimizeConfig2 = livePromoteGoLiveOptimizeConfig;
        if (livePromoteGoLiveOptimizeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("video_first_frame");
        c09dl.LJJJJJL(livePromoteGoLiveOptimizeConfig2.getVideoFirstFrame());
        c09dl.LJIILLIIL("preload_video");
        c09dl.LJJJJJL(livePromoteGoLiveOptimizeConfig2.getEnablePreloadVideo());
        c09dl.LJIILLIIL("optimize_show_cards_records");
        c09dl.LJJJJJL(livePromoteGoLiveOptimizeConfig2.getOptimizeShowCardsRecord());
        c09dl.LJII();
    }
}
