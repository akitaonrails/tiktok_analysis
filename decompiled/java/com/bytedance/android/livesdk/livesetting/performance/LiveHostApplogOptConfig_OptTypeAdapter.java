package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveHostApplogOptConfig_OptTypeAdapter extends TypeAdapter<LiveHostApplogOptConfig> {
    public final Gson LIZ;

    public LiveHostApplogOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveHostApplogOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveHostApplogOptConfig liveHostApplogOptConfig = new LiveHostApplogOptConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -892481550:
                        if (strLJJJJ.equals(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostApplogOptConfig.status = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -249250188:
                        if (strLJJJJ.equals("max_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostApplogOptConfig.maxCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -88107815:
                        if (strLJJJJ.equals("opt_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostApplogOptConfig.optTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 258330356:
                        if (strLJJJJ.equals("white_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostApplogOptConfig.whiteList = (String[]) this.LIZ.LJIIJ(String[].class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1528643904:
                        if (strLJJJJ.equals("max_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveHostApplogOptConfig.maxInterval = c09cu.LJJIZ();
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
        return liveHostApplogOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveHostApplogOptConfig liveHostApplogOptConfig) throws IOException {
        LiveHostApplogOptConfig liveHostApplogOptConfig2 = liveHostApplogOptConfig;
        if (liveHostApplogOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c09dl.LJJJJ(Integer.valueOf(liveHostApplogOptConfig2.status));
        c09dl.LJIILLIIL("opt_time");
        c09dl.LJJIZ(liveHostApplogOptConfig2.optTime);
        c09dl.LJIILLIIL("white_list");
        this.LIZ.LJIIJ(String[].class).write(c09dl, liveHostApplogOptConfig2.whiteList);
        c09dl.LJIILLIIL("max_count");
        c09dl.LJJJJ(Integer.valueOf(liveHostApplogOptConfig2.maxCount));
        c09dl.LJIILLIIL("max_interval");
        c09dl.LJJJJ(Integer.valueOf(liveHostApplogOptConfig2.maxInterval));
        c09dl.LJII();
    }
}
