package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C1697810uHb;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
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
        Config config = new Config(false, "live_gift_guide_optimize_strategy", 1, LSPassThroughRecordSizeConfig.DEFAULT, 10, C1697810uHb.LJIIJJI("gift_guide_ug_task_show_popup", "gift_guide_heartme_task_show_popup", "gift_guide_ug_task_gift_popup"));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2094259758:
                        if (strLJJJJ.equals("default_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.defaultDuration = c09cu.LJJIZ();
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
                    case -485160624:
                        if (strLJJJJ.equals("algo_package_name")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.packageName = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -154234712:
                        if (strLJJJJ.equals("execute_time_point")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.executeMode = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 578660109:
                        if (strLJJJJ.equals("timeout_threshold")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.timeoutThreshold = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1286305040:
                        if (strLJJJJ.equals("block_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                config.blockList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
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
        c09dl.LJIILLIIL("algo_package_name");
        c09dl.LJJJJJ(config2.packageName);
        c09dl.LJIILLIIL("execute_time_point");
        c09dl.LJJJJ(Integer.valueOf(config2.executeMode));
        c09dl.LJIILLIIL("timeout_threshold");
        c09dl.LJJJJ(Integer.valueOf(config2.timeoutThreshold));
        c09dl.LJIILLIIL("default_duration");
        c09dl.LJJJJ(Integer.valueOf(config2.defaultDuration));
        c09dl.LJIILLIIL("block_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, config2.blockList, String.class);
        c09dl.LJII();
    }
}
