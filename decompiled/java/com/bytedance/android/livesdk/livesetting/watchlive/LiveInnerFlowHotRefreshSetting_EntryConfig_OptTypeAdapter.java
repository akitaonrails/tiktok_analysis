package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFlowHotRefreshSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveInnerFlowHotRefreshSetting_EntryConfig_OptTypeAdapter extends TypeAdapter<LiveInnerFlowHotRefreshSetting.EntryConfig> {
    public final Gson LIZ;

    public LiveInnerFlowHotRefreshSetting_EntryConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveInnerFlowHotRefreshSetting.EntryConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveInnerFlowHotRefreshSetting.EntryConfig entryConfig = new LiveInnerFlowHotRefreshSetting.EntryConfig(false, "", 0L, 0L, 0L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                entryConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -473246791:
                        if (strLJJJJ.equals("expired_time_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                entryConfig.setExpiredTimeSec(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -413545813:
                        if (strLJJJJ.equals("req_from")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                entryConfig.setReqFrom(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -168091348:
                        if (strLJJJJ.equals("background_threshold_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                entryConfig.setBackgroundThresholdSec(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 206161700:
                        if (strLJJJJ.equals("recent_feed_protect_sec")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                entryConfig.setRecentFeedProtectSec(c09cu.LJJJ());
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
        return entryConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveInnerFlowHotRefreshSetting.EntryConfig entryConfig) throws IOException {
        LiveInnerFlowHotRefreshSetting.EntryConfig entryConfig2 = entryConfig;
        if (entryConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(entryConfig2.getEnable());
        c09dl.LJIILLIIL("req_from");
        c09dl.LJJJJJ(entryConfig2.getReqFrom());
        c09dl.LJIILLIIL("expired_time_sec");
        c09dl.LJJIZ(entryConfig2.getExpiredTimeSec());
        c09dl.LJIILLIIL("background_threshold_sec");
        c09dl.LJJIZ(entryConfig2.getBackgroundThresholdSec());
        c09dl.LJIILLIIL("recent_feed_protect_sec");
        c09dl.LJJIZ(entryConfig2.getRecentFeedProtectSec());
        c09dl.LJII();
    }
}
