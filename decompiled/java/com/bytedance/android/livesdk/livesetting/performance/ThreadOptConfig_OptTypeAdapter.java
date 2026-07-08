package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes19.dex */
public final class ThreadOptConfig_OptTypeAdapter extends TypeAdapter<ThreadOptConfig> {
    public final Gson LIZ;

    public ThreadOptConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ThreadOptConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ThreadOptConfig threadOptConfig = new ThreadOptConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1164551694:
                        if (strLJJJJ.equals("target_thread_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadOptConfig.targetThreadNamePrefix = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -611001837:
                        if (strLJJJJ.equals("slow_down_ops")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadOptConfig.slowDownOps = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -416596580:
                        if (strLJJJJ.equals("delay_time_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadOptConfig.delayTimeMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 683557603:
                        if (strLJJJJ.equals("slow_down_priority")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadOptConfig.slowDownPriority = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1565233381:
                        if (strLJJJJ.equals("opt_value")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                threadOptConfig.optValue = c09cu.LJJIZ();
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
        return threadOptConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ThreadOptConfig threadOptConfig) throws IOException {
        ThreadOptConfig threadOptConfig2 = threadOptConfig;
        if (threadOptConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("opt_value");
        c09dl.LJJJJ(Integer.valueOf(threadOptConfig2.optValue));
        c09dl.LJIILLIIL("delay_time_ms");
        c09dl.LJJIZ(threadOptConfig2.delayTimeMs);
        c09dl.LJIILLIIL("target_thread_name");
        C473040Igo.LIZLLL(this.LIZ, c09dl, threadOptConfig2.targetThreadNamePrefix, String.class);
        c09dl.LJIILLIIL("slow_down_priority");
        c09dl.LJJJJ(Integer.valueOf(threadOptConfig2.slowDownPriority));
        c09dl.LJIILLIIL("slow_down_ops");
        c09dl.LJJJJ(Integer.valueOf(threadOptConfig2.slowDownOps));
        c09dl.LJII();
    }
}
