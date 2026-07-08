package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveHostAutoAdaptiveParamsConfig_OptTypeAdapter extends TypeAdapter<LiveHostAutoAdaptiveParamsConfig> {
    @Override // com.google.gson.TypeAdapter
    public final LiveHostAutoAdaptiveParamsConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveHostAutoAdaptiveParamsConfig liveHostAutoAdaptiveParamsConfig = new LiveHostAutoAdaptiveParamsConfig(100, 2000, 2L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                int iHashCode = strLJJJJ.hashCode();
                if (iHashCode != -443971034) {
                    if (iHashCode != -143908531) {
                        if (iHashCode == 15296255 && strLJJJJ.equals("online_audience_rank_refresh_interval_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostAutoAdaptiveParamsConfig.setOnlineAudienceRankRefreshIntervalTime(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                    } else if (strLJJJJ.equals("detect_face_interval_ime")) {
                        if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                            liveHostAutoAdaptiveParamsConfig.setDetectFaceIntervalTime(c09cu.LJJIZ());
                        } else {
                            c09cu.LJJJJJL();
                        }
                    }
                } else if (strLJJJJ.equals("public_screen_refresh_interval_time")) {
                    if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                        liveHostAutoAdaptiveParamsConfig.setPublicScreenRefreshIntervalTime(c09cu.LJJIZ());
                    } else {
                        c09cu.LJJJJJL();
                    }
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return liveHostAutoAdaptiveParamsConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveHostAutoAdaptiveParamsConfig liveHostAutoAdaptiveParamsConfig) throws IOException {
        LiveHostAutoAdaptiveParamsConfig liveHostAutoAdaptiveParamsConfig2 = liveHostAutoAdaptiveParamsConfig;
        if (liveHostAutoAdaptiveParamsConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("detect_face_interval_ime");
        c09dl.LJJJJ(Integer.valueOf(liveHostAutoAdaptiveParamsConfig2.getDetectFaceIntervalTime()));
        c09dl.LJIILLIIL("public_screen_refresh_interval_time");
        c09dl.LJJJJ(Integer.valueOf(liveHostAutoAdaptiveParamsConfig2.getPublicScreenRefreshIntervalTime()));
        c09dl.LJIILLIIL("online_audience_rank_refresh_interval_time");
        c09dl.LJJIZ(liveHostAutoAdaptiveParamsConfig2.getOnlineAudienceRankRefreshIntervalTime());
        c09dl.LJII();
    }
}
