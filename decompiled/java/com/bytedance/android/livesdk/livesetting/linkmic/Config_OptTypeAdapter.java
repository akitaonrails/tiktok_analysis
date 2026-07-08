package com.bytedance.android.livesdk.livesetting.linkmic;

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
        Config config = new Config(false, 0, 0, 0, false, false, false, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1672536883:
                        if (strLJJJJ.equals("align_online")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.alignOnline = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
                    case -228391983:
                        if (strLJJJJ.equals("opt_save_room")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.optSaveRoom = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -66366656:
                        if (strLJJJJ.equals("preload_timing")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.preloadTiming = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 461702728:
                        if (strLJJJJ.equals("for_test")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.forTest = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 661267019:
                        if (strLJJJJ.equals("measure_timing")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.measureTiming = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 810057733:
                        if (strLJJJJ.equals("opt_card_cpu")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.optCardCpu = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1089185119:
                        if (strLJJJJ.equals("opt_online")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.optOnline = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1599944624:
                        if (strLJJJJ.equals("preload_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.preloadType = c09cu.LJJIZ();
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
        c09dl.LJIILLIIL("preload_timing");
        c09dl.LJJJJ(Integer.valueOf(config2.preloadTiming));
        c09dl.LJIILLIIL("preload_type");
        c09dl.LJJJJ(Integer.valueOf(config2.preloadType));
        c09dl.LJIILLIIL("measure_timing");
        c09dl.LJJJJ(Integer.valueOf(config2.measureTiming));
        c09dl.LJIILLIIL("for_test");
        c09dl.LJJJJJL(config2.forTest);
        c09dl.LJIILLIIL("align_online");
        c09dl.LJJJJJL(config2.alignOnline);
        c09dl.LJIILLIIL("opt_online");
        c09dl.LJJJJJL(config2.optOnline);
        c09dl.LJIILLIIL("opt_save_room");
        c09dl.LJJJJJL(config2.optSaveRoom);
        c09dl.LJIILLIIL("opt_card_cpu");
        c09dl.LJJJJJL(config2.optCardCpu);
        c09dl.LJII();
    }
}
