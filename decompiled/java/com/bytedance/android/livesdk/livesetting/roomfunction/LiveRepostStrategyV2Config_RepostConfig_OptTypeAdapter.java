package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostStrategyV2Config;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRepostStrategyV2Config_RepostConfig_OptTypeAdapter extends TypeAdapter<LiveRepostStrategyV2Config.RepostConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveRepostStrategyV2Config.RepostConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRepostStrategyV2Config.RepostConfig repostConfig = new LiveRepostStrategyV2Config.RepostConfig(10000L, 10000L, 5, 2, 3);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2070091506:
                        if (strLJJJJ.equals("max_daily_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                repostConfig.maxDailyCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1636288496:
                        if (strLJJJJ.equals("bubble_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                repostConfig.bubbleDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1599854617:
                        if (strLJJJJ.equals("bubble_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                repostConfig.bubbleDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -249250188:
                        if (strLJJJJ.equals("max_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                repostConfig.maxCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 31047547:
                        if (strLJJJJ.equals("no_repost_return_day")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                repostConfig.noRepostReturnDay = c09cu.LJJIZ();
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
        return repostConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRepostStrategyV2Config.RepostConfig repostConfig) throws IOException {
        LiveRepostStrategyV2Config.RepostConfig repostConfig2 = repostConfig;
        if (repostConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("bubble_duration");
        c09dl.LJJIZ(repostConfig2.bubbleDuration);
        c09dl.LJIILLIIL("bubble_delay");
        c09dl.LJJIZ(repostConfig2.bubbleDelay);
        c09dl.LJIILLIIL("max_count");
        c09dl.LJJJJ(Integer.valueOf(repostConfig2.maxCount));
        c09dl.LJIILLIIL("max_daily_count");
        c09dl.LJJJJ(Integer.valueOf(repostConfig2.maxDailyCount));
        c09dl.LJIILLIIL("no_repost_return_day");
        c09dl.LJJJJ(Integer.valueOf(repostConfig2.noRepostReturnDay));
        c09dl.LJII();
    }
}
