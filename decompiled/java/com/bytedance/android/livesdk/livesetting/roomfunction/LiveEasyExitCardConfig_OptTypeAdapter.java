package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveEasyExitCardConfig_OptTypeAdapter extends TypeAdapter<LiveEasyExitCardConfig> {
    public final Gson LIZ;

    public LiveEasyExitCardConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveEasyExitCardConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveEasyExitCardConfig liveEasyExitCardConfig = new LiveEasyExitCardConfig(false, -1, -1, 0, new LiveEasyExitCardDepthConfig(false, 0, 0, 0), false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1928562930:
                        if (strLJJJJ.equals("enable_swipe_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEasyExitCardConfig.enableSwipeCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1323324660:
                        if (strLJJJJ.equals("reuse_extra_card_container")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEasyExitCardConfig.reuseExtraCardContainer = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEasyExitCardConfig.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -645875428:
                        if (strLJJJJ.equals("strategy_control_swipe_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEasyExitCardConfig.strategyControlSwipeCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -25876785:
                        if (strLJJJJ.equals("exit_when_watch_depth")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEasyExitCardConfig.depthConfig = (LiveEasyExitCardDepthConfig) this.LIZ.LJIIJ(LiveEasyExitCardDepthConfig.class).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 111297162:
                        if (strLJJJJ.equals("exit_when_under_performance_level")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEasyExitCardConfig.performanceLevel = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 744614916:
                        if (strLJJJJ.equals("load_extra_card_on_demand")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveEasyExitCardConfig.loadExtraCardOnDemand = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveEasyExitCardConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveEasyExitCardConfig liveEasyExitCardConfig) throws IOException {
        LiveEasyExitCardConfig liveEasyExitCardConfig2 = liveEasyExitCardConfig;
        if (liveEasyExitCardConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(liveEasyExitCardConfig2.enable);
        c09dl.LJIILLIIL("strategy_control_swipe_count");
        c09dl.LJJJJ(Integer.valueOf(liveEasyExitCardConfig2.strategyControlSwipeCount));
        c09dl.LJIILLIIL("enable_swipe_count");
        c09dl.LJJJJ(Integer.valueOf(liveEasyExitCardConfig2.enableSwipeCount));
        c09dl.LJIILLIIL("exit_when_under_performance_level");
        c09dl.LJJJJ(Integer.valueOf(liveEasyExitCardConfig2.performanceLevel));
        c09dl.LJIILLIIL("exit_when_watch_depth");
        this.LIZ.LJIIJ(LiveEasyExitCardDepthConfig.class).write(c09dl, liveEasyExitCardConfig2.depthConfig);
        c09dl.LJIILLIIL("load_extra_card_on_demand");
        c09dl.LJJJJJL(liveEasyExitCardConfig2.loadExtraCardOnDemand);
        c09dl.LJIILLIIL("reuse_extra_card_container");
        c09dl.LJJJJJL(liveEasyExitCardConfig2.reuseExtraCardContainer);
        c09dl.LJII();
    }
}
