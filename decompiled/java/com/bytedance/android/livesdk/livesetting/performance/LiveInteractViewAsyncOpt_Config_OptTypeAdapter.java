package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.performance.LiveInteractViewAsyncOpt;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveInteractViewAsyncOpt_Config_OptTypeAdapter extends TypeAdapter<LiveInteractViewAsyncOpt.Config> {
    public final Gson LIZ;

    public LiveInteractViewAsyncOpt_Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveInteractViewAsyncOpt.Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveInteractViewAsyncOpt.Config config = new LiveInteractViewAsyncOpt.Config(false, false, null, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1975974067:
                        if (strLJJJJ.equals("enable_preload")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enablePreload = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -724796875:
                        if (strLJJJJ.equals("reuse_thread")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.reuseThread = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1346029625:
                        if (strLJJJJ.equals("thread_priority")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.threadPriority = Integer.valueOf(c09cu.LJJIZ());
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
    public final void write(C09DL c09dl, LiveInteractViewAsyncOpt.Config config) throws IOException {
        LiveInteractViewAsyncOpt.Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(config2.enable);
        c09dl.LJIILLIIL("reuse_thread");
        c09dl.LJJJJJL(config2.reuseThread);
        c09dl.LJIILLIIL("thread_priority");
        c09dl.LJJJJ(config2.threadPriority);
        c09dl.LJIILLIIL("enable_preload");
        c09dl.LJJJJJL(config2.enablePreload);
        c09dl.LJII();
    }
}
