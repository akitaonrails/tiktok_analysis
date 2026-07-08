package com.bytedance.android.livesdk.livesetting.subscription;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveSubathonConfig_OptTypeAdapter extends TypeAdapter<LiveSubathonConfig> {
    public final Gson LIZ;

    public LiveSubathonConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveSubathonConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveSubathonConfig liveSubathonConfig = new LiveSubathonConfig(false, false, 10L, 120L, 300L, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1982396586:
                        if (strLJJJJ.equals("anchor_timer_auto_start")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubathonConfig.setAnchorTimerAutoStart(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1937171982:
                        if (strLJJJJ.equals("enable_entrance")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubathonConfig.setEnableEntrance(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1274317793:
                        if (strLJJJJ.equals("enable_edit_title")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubathonConfig.setEnableEditTitle(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -478471055:
                        if (strLJJJJ.equals("time_align_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubathonConfig.setTimeAlignInterval(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -436325297:
                        if (strLJJJJ.equals("time_align_max_gap")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubathonConfig.setTimeAlignMaxGap(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -216527299:
                        if (strLJJJJ.equals("time_align_min_gap")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubathonConfig.setTimeAlignMinGap(c09cu.LJJJ());
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
        return liveSubathonConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSubathonConfig liveSubathonConfig) throws IOException {
        LiveSubathonConfig liveSubathonConfig2 = liveSubathonConfig;
        if (liveSubathonConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_entrance");
        c09dl.LJJJJJL(liveSubathonConfig2.getEnableEntrance());
        c09dl.LJIILLIIL("enable_edit_title");
        c09dl.LJJJJJL(liveSubathonConfig2.getEnableEditTitle());
        c09dl.LJIILLIIL("time_align_min_gap");
        c09dl.LJJIZ(liveSubathonConfig2.getTimeAlignMinGap());
        c09dl.LJIILLIIL("time_align_max_gap");
        c09dl.LJJIZ(liveSubathonConfig2.getTimeAlignMaxGap());
        c09dl.LJIILLIIL("time_align_interval");
        c09dl.LJJIZ(liveSubathonConfig2.getTimeAlignInterval());
        c09dl.LJIILLIIL("anchor_timer_auto_start");
        c09dl.LJJJJJL(liveSubathonConfig2.getAnchorTimerAutoStart());
        c09dl.LJII();
    }
}
