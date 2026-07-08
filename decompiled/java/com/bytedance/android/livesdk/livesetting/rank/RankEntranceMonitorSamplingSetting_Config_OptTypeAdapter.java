package com.bytedance.android.livesdk.livesetting.rank;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.rank.RankEntranceMonitorSamplingSetting;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes28.dex */
public final class RankEntranceMonitorSamplingSetting_Config_OptTypeAdapter extends TypeAdapter<RankEntranceMonitorSamplingSetting.Config> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final RankEntranceMonitorSamplingSetting.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        RankEntranceMonitorSamplingSetting.Config config = new RankEntranceMonitorSamplingSetting.Config(1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L, 1L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1669073294:
                        if (strLJJJJ.equals("loop_shut_down")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.loopShutDownSamplingRate = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1348388076:
                        if (strLJJJJ.equals("unexpected_shift")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.unexpectedShiftSamplingRate = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1065088345:
                        if (strLJJJJ.equals("unexpected_tab")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.unexpectedTabSamplingRate = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -282909989:
                        if (strLJJJJ.equals("miss_enter_rank_animation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.missEnterRankAnimationSamplingRate = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -122540400:
                        if (strLJJJJ.equals("bad_updates")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.badUpdatesSamplingRate = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -100980997:
                        if (strLJJJJ.equals("duplicated_msg")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.duplicatedMsgSamplingRate = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 345987109:
                        if (strLJJJJ.equals("rank_unavailable_toast")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.rankUnavailableToastSamplingRate = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1341940570:
                        if (strLJJJJ.equals("unexpected_rank")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.unexpectedRankSamplingRate = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1490531515:
                        if (strLJJJJ.equals("low_end_device_downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.lowEndDeviceDowngradeSamplingRate = c09cu.LJJJ();
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
        return config;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, RankEntranceMonitorSamplingSetting.Config config) throws IOException {
        RankEntranceMonitorSamplingSetting.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("duplicated_msg");
        c09dl.LJJIZ(config2.duplicatedMsgSamplingRate);
        c09dl.LJIILLIIL("unexpected_shift");
        c09dl.LJJIZ(config2.unexpectedShiftSamplingRate);
        c09dl.LJIILLIIL("unexpected_tab");
        c09dl.LJJIZ(config2.unexpectedTabSamplingRate);
        c09dl.LJIILLIIL("unexpected_rank");
        c09dl.LJJIZ(config2.unexpectedRankSamplingRate);
        c09dl.LJIILLIIL("bad_updates");
        c09dl.LJJIZ(config2.badUpdatesSamplingRate);
        c09dl.LJIILLIIL("loop_shut_down");
        c09dl.LJJIZ(config2.loopShutDownSamplingRate);
        c09dl.LJIILLIIL("miss_enter_rank_animation");
        c09dl.LJJIZ(config2.missEnterRankAnimationSamplingRate);
        c09dl.LJIILLIIL("rank_unavailable_toast");
        c09dl.LJJIZ(config2.rankUnavailableToastSamplingRate);
        c09dl.LJIILLIIL("low_end_device_downgrade");
        c09dl.LJJIZ(config2.lowEndDeviceDowngradeSamplingRate);
        c09dl.LJII();
    }
}
