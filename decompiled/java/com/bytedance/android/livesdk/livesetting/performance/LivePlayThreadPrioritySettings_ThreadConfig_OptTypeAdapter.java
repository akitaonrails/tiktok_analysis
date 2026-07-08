package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayThreadPrioritySettings;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes35.dex */
public final class LivePlayThreadPrioritySettings_ThreadConfig_OptTypeAdapter extends TypeAdapter<LivePlayThreadPrioritySettings.ThreadConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePlayThreadPrioritySettings.ThreadConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePlayThreadPrioritySettings.ThreadConfig threadConfig = new LivePlayThreadPrioritySettings.ThreadConfig(0, -1, 19, 19, 19);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1507860403:
                        if (strLJJJJ.equals("upgrade_live_play_conrol_thread_nice_value")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadConfig.upgradeNice = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -671520167:
                        if (strLJJJJ.equals("enable_live_play_thread_priority_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadConfig.enable = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -670643457:
                        if (strLJJJJ.equals("downgrade_logger_thread_nice_value")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadConfig.downgradeLoggerNice = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 489145088:
                        if (strLJJJJ.equals("downgrade_3rd_thread_nice_value")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadConfig.downgrade3rdNice = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 600248491:
                        if (strLJJJJ.equals("downgrade_tea_thread_nice_value")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadConfig.downgradeTeaNice = c09cu.LJJIZ();
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
        return threadConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePlayThreadPrioritySettings.ThreadConfig threadConfig) {
        LivePlayThreadPrioritySettings.ThreadConfig threadConfig2 = threadConfig;
        if (threadConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_live_play_thread_priority_opt");
        c09dl.LJJJJ(Integer.valueOf(threadConfig2.enable));
        c09dl.LJIILLIIL("upgrade_live_play_conrol_thread_nice_value");
        c09dl.LJJJJ(Integer.valueOf(threadConfig2.upgradeNice));
        c09dl.LJIILLIIL("downgrade_logger_thread_nice_value");
        c09dl.LJJJJ(Integer.valueOf(threadConfig2.downgradeLoggerNice));
        c09dl.LJIILLIIL("downgrade_tea_thread_nice_value");
        c09dl.LJJJJ(Integer.valueOf(threadConfig2.downgradeTeaNice));
        c09dl.LJIILLIIL("downgrade_3rd_thread_nice_value");
        c09dl.LJJJJ(Integer.valueOf(threadConfig2.downgrade3rdNice));
        c09dl.LJII();
    }
}
