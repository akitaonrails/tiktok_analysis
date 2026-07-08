package com.bytedance.android.livesdk.livesetting.feed;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class Config_OptTypeAdapter extends TypeAdapter<Config> {
    public final Gson LIZ;

    public Config_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final Config read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        Config config = new Config(false, true, true, false, 180000);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1218135838:
                        if (strLJJJJ.equals("cache_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.cacheInterval = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1126798330:
                        if (strLJJJJ.equals("back_smooth")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.backSmooth = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -755364609:
                        if (strLJJJJ.equals("enable_dragging_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enableDraggingOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 481894502:
                        if (strLJJJJ.equals("enable_sliding_opt")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.enableSlidingOpt = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
    public final void write(C09DL c09dl, Config config) throws IOException {
        Config config2 = config;
        if (config2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJJJL(config2.enable);
        c09dl.LJIILLIIL("enable_dragging_opt");
        c09dl.LJJJJJL(config2.enableDraggingOpt);
        c09dl.LJIILLIIL("enable_sliding_opt");
        c09dl.LJJJJJL(config2.enableSlidingOpt);
        c09dl.LJIILLIIL("back_smooth");
        c09dl.LJJJJJL(config2.backSmooth);
        c09dl.LJIILLIIL("cache_interval");
        c09dl.LJJJJ(Integer.valueOf(config2.cacheInterval));
        c09dl.LJII();
    }
}
