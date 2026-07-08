package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import X.EnumC2184841Af4;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveRunnableBlockConfigs_OptTypeAdapter extends TypeAdapter<LiveRunnableBlockConfigs> {
    public final Gson LIZ;

    public LiveRunnableBlockConfigs_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveRunnableBlockConfigs read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveRunnableBlockConfigs liveRunnableBlockConfigs = new LiveRunnableBlockConfigs(false, 0, new ArrayList(), 1500L, 0L, 0L, EnumC2184841Af4.NONE.ordinal(), "", 0);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1385111011:
                        if (strLJJJJ.equals("runnable_block_configs")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfigs.blockConfigs = C473040Igo.LIZ(this.LIZ, c09cu, LiveRunnableBlockConfig.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -911865594:
                        if (strLJJJJ.equals("enter_opt_bitmask")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfigs.enterOptBitmask = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -641487830:
                        if (strLJJJJ.equals("max_queue_size")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfigs.maxQueueSize = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -620899161:
                        if (strLJJJJ.equals("task_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfigs.taskTimeOut = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -340019288:
                        if (strLJJJJ.equals("split_mode")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfigs.splitMode = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -227519172:
                        if (strLJJJJ.equals("split_timeout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfigs.splitTimeout = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -111159222:
                        if (strLJJJJ.equals("split_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfigs.splitInterval = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 83508846:
                        if (strLJJJJ.equals("distinct_str")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfigs.distinctStr = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1944990383:
                        if (strLJJJJ.equals("enable_strategy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveRunnableBlockConfigs.enableStrategy = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveRunnableBlockConfigs;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveRunnableBlockConfigs liveRunnableBlockConfigs) throws IOException {
        LiveRunnableBlockConfigs liveRunnableBlockConfigs2 = liveRunnableBlockConfigs;
        if (liveRunnableBlockConfigs2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_strategy");
        c09dl.LJJJJJL(liveRunnableBlockConfigs2.enableStrategy);
        c09dl.LJIILLIIL("max_queue_size");
        c09dl.LJJJJ(Integer.valueOf(liveRunnableBlockConfigs2.maxQueueSize));
        c09dl.LJIILLIIL("runnable_block_configs");
        C473040Igo.LIZLLL(this.LIZ, c09dl, liveRunnableBlockConfigs2.blockConfigs, LiveRunnableBlockConfig.class);
        c09dl.LJIILLIIL("task_timeout");
        c09dl.LJJIZ(liveRunnableBlockConfigs2.taskTimeOut);
        c09dl.LJIILLIIL("split_interval");
        c09dl.LJJIZ(liveRunnableBlockConfigs2.splitInterval);
        c09dl.LJIILLIIL("split_timeout");
        c09dl.LJJIZ(liveRunnableBlockConfigs2.splitTimeout);
        c09dl.LJIILLIIL("split_mode");
        c09dl.LJJJJ(Integer.valueOf(liveRunnableBlockConfigs2.splitMode));
        c09dl.LJIILLIIL("distinct_str");
        c09dl.LJJJJJ(liveRunnableBlockConfigs2.distinctStr);
        c09dl.LJIILLIIL("enter_opt_bitmask");
        c09dl.LJJJJ(Integer.valueOf(liveRunnableBlockConfigs2.enterOptBitmask));
        c09dl.LJII();
    }
}
